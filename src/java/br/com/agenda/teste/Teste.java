/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.teste;

import br.com.agenda.dao.ContatoDao;
import br.com.agenda.model.Contatos;
import java.util.List;

/**
 *
 * @author User
 */
public class Teste {
    
    public static void main(String[]args){
        Contatos contato = new Contatos();
        /*contato.setId(2);
        contato.setNome("Arles da Silva");
        contato.setEmail("arels@hotmail.com");
        contato.setCelular("(62)99999-5555");
        contato.setTelefone("(62) 99999999");
        ContatoDao dao = new ContatoDao();
        dao.update(contato);*/
        ContatoDao dao = new ContatoDao();
        
        Contatos lista = dao.getContato(2);
        
            System.out.println(lista.getNome());
        
    }
}
