/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Funcionario;

/**
 *
 * @author LuiF
 */
public class FuncionarioDAO {
    public void save(Funcionario f) throws Exception {
        String sql = "INSERT INTO funcionario(id_funcionario,codigo_funcionario,cargo) values(null,?,?)";
        try (Connection conn = ConnectionFactory.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, f.getCodigoFuncionario());
            stmt.setString(2, f.getCargo());
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }  
    }
}
