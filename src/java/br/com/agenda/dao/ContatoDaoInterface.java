/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.dao;

import br.com.agenda.model.Contatos;
import java.util.List;

/**
 *
 * @author Alisson
 */
public interface ContatoDaoInterface {
    
    public void save(Contatos contato);
    public Contatos getContato(int id);
    public void remove(Contatos contato);
    public void update(Contatos contato);
    public List<Contatos> listContato();
    
}
