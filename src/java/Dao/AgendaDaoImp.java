/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Model.Agenda;
import Utils.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Alisson
 */


public class AgendaDaoImp implements AgendaDao {

    public void save(Agenda agenda) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(agenda);
        t.commit();
    }

    public Agenda getAgenda(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Agenda) session.load(Agenda.class, id);
    }

    public List<Agenda> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Agenda order by nome asc").list();
        t.commit();
        return lista;
    }


    public void remove(Agenda agenda) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(agenda);
        t.commit();
    }
    public void update(Agenda agenda) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(agenda);
        t.commit();
    }
}
