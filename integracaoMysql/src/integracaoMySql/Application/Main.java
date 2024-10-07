package integracaoMySql.Application;

import integracaoMySql.Entities.AgendaDeContato;
import integracaoMySql.Entities.ConexaoMySQL;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conexao = ConexaoMySQL.getConexao();

        //criando um novo contato
        AgendaDeContato contato = new AgendaDeContato();
        contato.setNome("elicê");
        contato.setEndereco("dicaxias");
        contato.setTelefone("9998877");
        contato.setCelular("989435531");
        //contato.inserirContato(conexao);


        AgendaDeContato contato2 = new AgendaDeContato();
        contato.setNome("Dudu");
        contato.setEndereco("Caju");
        contato.setTelefone("3334567");
        contato.setCelular("98876973");
        contato.inserirContato(conexao);


        AgendaDeContato contato3 = new AgendaDeContato();
        contato.setNome("juuju");
        contato.setEndereco("Copacabana");
        contato.setTelefone("5667435");
        contato.setCelular("987998212");
        contato.inserirContato(conexao);


        //buscando um contato
        //AgendaDeContato contatoBuscado = AgendaDeContato.buscarContato(conexao ,1 );
        //if (contatoBuscado != null) {
        //    System.out.println("Contato encontrado: " + contatoBuscado.getNome());
       // }


        //Alterando um contato
       // contatoBuscado.setEndereco("Rua B, 444");
        //contatoBuscado.alterarContato(conexao);


        //
       AgendaDeContato.excluirContato(conexao, 1);


    }
}
