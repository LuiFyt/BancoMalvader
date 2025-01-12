package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://localhost:3306/bancomalvader";
    private static final String USUARIO = "root";
    private static final String SENHA = "Vectorimp82@";

    public static Connection conectar() {
        try {
            System.out.println("Conectado ao banco de dados");
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            return null;
        }
    }

    public static void desconectar(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Conexão com o banco encerrada.");
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar do banco: " + e.getMessage());
            }
        }
    }
}
