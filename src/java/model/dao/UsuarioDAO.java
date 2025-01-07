/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.*;
import model.Usuario;
import util.ConectaDB;
/**
 *
 * @author Lucca e Arthur
 */
public class UsuarioDAO {
    //Atributos
    // Sem atributos

    //Métodos
        public boolean insUsu(Usuario p_usuario) throws ClassNotFoundException {
        //Connectar
        Connection conexao = null;
        try{
            conexao = ConectaDB.conectar(); // Abre a conexão
            Statement stmt = conexao.createStatement();
                        //INSERT INTO usuario (nome, empresa, telefone, segmento, email, senha) VALUES ("Lucca", "Ploomes", "11945700705", "CRM", "email@email.com", "12345")            
            String sql = "INSERT INTO usuario (nome, empresa, telefone, segmento, email, senha) VALUES ('" + p_usuario.getNome() +
                                                                                    "','" + p_usuario.getEmpresa() +
                                                                                    "', '" + p_usuario.getTelefone() + 
                                                                                    "','" + p_usuario.getSegmento() +
                                                                                    "', '" + p_usuario.getEmail() + 
                                                                                    "','" + p_usuario.getSenha() + "')";
                         
            stmt.executeUpdate(sql); // Executa o SQL: Insert / Delete ou Update
                        
            conexao.close();
            return true;
        }catch(SQLException ex){
            System.out.println(" Exception: " + ex.toString());
            return false;
        }                 
    }   
}
