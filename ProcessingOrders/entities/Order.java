package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
 private Date moment;
 private OrderStatus status;
 private List<OrderItem> items = new ArrayList<>();
 private Client client;

 private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

 // Construtor para pedidos com múltiplos itens
 public Order(Date moment, OrderStatus status, Client client) {
  this.moment = moment;
  this.status = status;
  this.client = client;
 }

 // Construtor para pedidos com um único item
 public Order(Date moment, OrderStatus status, OrderItem item, Client client) {
  this(moment, status, client); //
  addItem(item); // Adiciona o item à lista
 }

 public Date getMoment() {
  return moment;
 }

 public void setMoment(Date moment) {
  this.moment = moment;
 }

 public OrderStatus getStatus() {
  return status;
 }

 public void setStatus(OrderStatus status) {
  this.status = status;
 }

 public List<OrderItem> getItems() {
  return items;
 }

 public Client getClient() {
  return client;
 }

 public void setClient(Client client) {
  this.client = client;
 }

 public void addItem(OrderItem item) {
  items.add(item);
 }

 public void removeItem(OrderItem item) {
  if (items.isEmpty()) {
   System.out.println("Ops, você não tem nenhum item na sua lista.");
  } else {
   items.remove(item);
  }
 }

 public double total() {
  double sum = 0.0;
  for (OrderItem item : items) {
   sum += item.subTotal();
  }
  return sum;
 }

 @Override
 public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("Data do pedido: ");
  sb.append(sdf.format(moment)).append("\n");
  sb.append("Status do pedido: ").append(status).append("\n");
  sb.append("Cliente: ").append(client).append("\n");
  sb.append("Itens do pedido: ").append("\n");
  for (OrderItem it : items) {
   sb.append(it).append("\n");
  }
  sb.append("Preço total: $").append(String.format("%.2f", total()));
  return sb.toString();
 }
}