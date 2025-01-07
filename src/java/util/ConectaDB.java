/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.*;

/*
select * from projetoploomes.usuario;

create database projetoPloomes;
use projetoPloomes;

create table usuario(
	id int auto_increment primary key,
    nome varchar(45) not null,
    empresa varchar(120) not null,
    telefone varchar(20) not null,
    segmento varchar(30) not null,
    email varchar(80) not null,
    senha varchar(30) not null
);
*/


/**
 *
 * @author Lucca e Arthur
 */
public class ConectaDB {
    //Sem atributos
    
    //Métodos
    public static Connection conectar() throws ClassNotFoundException{
        Connection conexao = null; //definindo a conexão como null
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3307/projetoploomes","root",""); //realizando conexão
            return conexao;
        }catch(SQLException ex){ 
            System.out.println("Error: " + ex);
        }                  
        return conexao;//Se a conexão der errado ficará como NULL, caso contrário retorna o resultado.     
    }
}
