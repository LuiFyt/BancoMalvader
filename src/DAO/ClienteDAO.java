/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Cliente;
import model.Conta;

/**
 *
 * @author LuiF
 */
public class ClienteDAO {
    public void save(Cliente c) throws Exception {
        String sql = "INSERT INTO conta(id_cliente,id_usuario) values(null,?)";
        try (Connection conn = ConnectionFactory.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, c.getId());
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
}
