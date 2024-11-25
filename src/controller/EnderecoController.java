/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.EnderecoDAO;
import model.Endereco;

/**
 *
 * @author LuiF
 */
public class EnderecoController {
    
    private EnderecoDAO e = new EnderecoDAO();
    
    public void CadastrarEndereco(Endereco endereco) throws Exception {
        e.save(endereco);
    }
}
