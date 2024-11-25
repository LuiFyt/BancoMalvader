/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.ClienteDAO;
import DAO.UsuarioDAO;
import model.Cliente;
import model.Usuario;

/**
 *
 * @author LuiF
 */
public class ClienteController {
    
    private ClienteDAO c = new ClienteDAO();
    private UsuarioDAO u = new UsuarioDAO();
    
    public void CadastrarCliente(Cliente cl) throws Exception {
        u.save(cl);
        Usuario usuario = u.findByCpf(cl.getCpf());
        cl.setId(usuario.getId());
        c.save(cl);
    }
}
