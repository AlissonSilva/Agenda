/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.dao;

import br.com.agenda.model.Contatos;
import br.com.agenda.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Alisson
 */
public class ContatoDao implements ContatoDaoInterface{
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction t = session.beginTransaction();
    
    @Override
    public void save(Contatos contato) {
        try{
            session.save(contato);
            t.commit();
        }catch(Exception e){
            System.out.println(" Erro ao salvar "+e.getMessage());
        }
    }

    @Override
    public Contatos getContato(int id) {
        try {
            System.out.println("O id "+id);
            System.out.println("O id "+session.load(Contatos.class, id));
            return (Contatos) session.load(Contatos.class, id);
        } catch (Exception e) {
            System.out.println("Erro ao carregar o contato "+e.getMessage());
            return null;
        }
    }

    @Override
    public void remove(Contatos contato) {
        try {
            session.delete(contato);
            t.commit();
        } catch (Exception e) {
            System.out.println("Erro ao remover "+e.getMessage());
        }
    }

    @Override
    public void update(Contatos contato) {
        try {
            session.update(contato);
            t.commit();
            session.close();
        } catch (Exception e) {
            System.out.println("Erro ao atualizar o contato "+e.getMessage());
        }
    }

    @Override
    public List<Contatos> listContato() {
        List lista = session.createQuery("from contatos order by nome asc").list();
        return lista;
    }
    
}
