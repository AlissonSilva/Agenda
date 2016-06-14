/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.AgendaDao;
import Dao.AgendaDaoImp;
import Model.Agenda;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Alisson
 */
@ManagedBean
@SessionScoped
public class AgendaController implements Serializable {

    private Agenda agenda;
    private DataModel listaAgenda;
    private String senha;

//    EntityManager manager = (EntityManager) HibernateUtil.getSessionFactory();
    List<Agenda> lista;


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public DataModel getListarAgenda() {
        List<Agenda> lista = new AgendaDaoImp().list();
        listaAgenda = new ListDataModel(lista);
        return listaAgenda;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public void prepararAdicionarAgenda(ActionEvent actionEvent) {
        agenda = new Agenda();
    }

    public void prepararAlterarAgenda(ActionEvent actionEvent) {
        agenda = (Agenda) (listaAgenda.getRowData());
    }

    public void adicionarAgenda(ActionEvent actionEvent) {
        AgendaDao dao = new AgendaDaoImp();
        dao.save(agenda);
    }

    public void alterarAgenda(ActionEvent actionEvent) {
        AgendaDao dao = new AgendaDaoImp();
        dao.update(agenda);
    }

    public String excluirContato() {
        Agenda agendaTemp = (Agenda) (listaAgenda.getRowData());
        AgendaDao dao = new AgendaDaoImp();
        dao.remove(agendaTemp);
        return "index";
    }

    public void login(ActionEvent actionEvent){
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage msg = null;
        boolean autorizacao = false;

        if(senha != null && senha.equals("123")){
            autorizacao = true;
            excluirContato();
        }else{
            autorizacao = false;
            msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Erro.: ","Usuário não autorizado");
        }

        FacesContext.getCurrentInstance().addMessage(null, msg);
        context.addCallbackParam("autorizacao", autorizacao);
    }
}
