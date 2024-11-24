/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Conta;

/**
 *
 * @author LuiF
 */
public class ContaDAO {
    public void save(Conta c) throws Exception {
        String sql = "INSERT INTO conta(id_conta,numero_conta,agencia,saldo) values(null,?,?,?)";
        try (Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, c.getNumero());
            stmt.setString(2, c.getAgencia());
            stmt.setDouble(3, c.getSaldo());
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }  
    }
    
        public void update(Conta c) throws Exception {
        String sql = "update conta set numero_conta=?,agencia=?,saldo=? WHERE id_conta=?";
        try (Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, c.getNumero());
            stmt.setString(2, c.getAgencia());
            stmt.setDouble(3, c.getSaldo());
            //stmt.setInt(4, );
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
    
    public void delete(Conta c) throws Exception {
	String sql = "delete from conta where id_conta=?";
        try (Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            //stmt.setInt(1, );
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
    
    public void findById(Conta c) throws Exception {
        String sql = "Select from conta where id_conta=?";
        try (Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            //stmt.setInt(1, );
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
}
