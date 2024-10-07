package integracaoMySql.Entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AgendaDeContato {
    private int idContato;
    private String nome;
    private String endereco;
    private String telefone;
    private String celular;

    // Getters e Setters
    public int getIdContato() {
        return idContato;
    }
    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }

    // Método para inserir contato
    public void inserirContato(Connection conexao) {
        String sql = "INSERT INTO contatos (nome, endereco, telefone, celular) VALUES (?,?,?,?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, this.nome);
            stmt.setString(2, this.endereco);  // Correção aqui
            stmt.setString(3, this.telefone);
            stmt.setString(4, this.celular);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para buscar contato
    public static AgendaDeContato buscarContato(Connection conexao, int idContato) {
        String sql = "SELECT * FROM contatos WHERE idContato = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, idContato);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                AgendaDeContato contato = new AgendaDeContato();
                contato.setIdContato(rs.getInt("idContato"));
                contato.setNome(rs.getString("nome"));
                contato.setEndereco(rs.getString("endereco"));
                contato.setTelefone(rs.getString("telefone"));
                contato.setCelular(rs.getString("celular"));
                return contato;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Método para alterar contato
    public void alterarContato(Connection conexao) {
        String sql = "UPDATE contatos SET nome = ?, endereco = ?, telefone = ?, celular = ? WHERE idContato = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, this.nome);
            stmt.setString(2, this.endereco);
            stmt.setString(3, this.telefone);
            stmt.setString(4, this.celular);
            stmt.setInt(5, this.idContato);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para excluir contato
    public static void excluirContato(Connection conexao, int idContato) {
        String sql = "DELETE FROM contatos WHERE idContato = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, idContato);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
