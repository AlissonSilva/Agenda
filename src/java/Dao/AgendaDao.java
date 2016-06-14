/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Model.Agenda;
import java.util.List;

/**
 *
 * @author Alisson
 */

public interface AgendaDao {

    public void save(Agenda agenda);
    public Agenda getAgenda(long id);
    public List<Agenda> list();
    public void remove(Agenda agenda);
    public void update(Agenda agenda);
    //public List<Senha> listSenha();
    //public List consult(Agenda agenda);

}
