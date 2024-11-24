/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.PreparedStatement;
import model.Cliente;

/**
 *
 * @author LuiF
 */
public class ClienteDAO {
    public void save(Cliente c) throws Exception {
        try {
        String sql = "INSERT INTO cliente(id_cliente,id_usuario) values(null,?)";
        try (Connection conn = Conection)
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }  
    }
}
