package integracaoMySql.Entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {


        private static String URL = "jdbc:mysql://localhost:3306/agenda";
        private static String USUARIO = "root";
        private static String SENHA = "";

        public static Connection getConexao() {

            try {
                return DriverManager.getConnection(URL, USUARIO, SENHA);
            } catch (SQLException e) {
                throw new RuntimeException("erro ao conectar com o banco de dados");
            }

        }
    }


