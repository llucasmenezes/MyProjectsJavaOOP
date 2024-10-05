package application;

import entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        //Product p = new Product("TV", 1000.0);

       // OrderItem oi1 = new OrderItem(1, 1000.0, p);

       // Client oi1 = new Client("Maria", "maria@gmail.com", sdf.parse("02/08/2005"));

       // System.out.println(oi1);

        System.out.println("Insira a data do cliente");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Data dd aniversario (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(scanner.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Entre com os dados do pedido");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scanner.next());

        Order order = new Order(new Date(), status, client);

        System.out.println("Quantos itens o pedido vai ter?");
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("Insira #" + (i+1) + " os dados do item" );
            System.out.print("Nome do produto: ");
            scanner.nextLine();
            String nameProduct = scanner.nextLine();
            System.out.print("Preco do produto: ");
            double precoProduct = scanner.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();

            Product product = new Product(nameProduct, precoProduct);

            OrderItem orderItem = new OrderItem(quantidade, precoProduct,nameProduct);

            order.addItem(orderItem);

        }


        System.out.println();
        System.out.println(order);

    }
}
