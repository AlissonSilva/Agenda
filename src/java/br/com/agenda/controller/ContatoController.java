/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.controller;

import br.com.agenda.dao.ContatoDao;
import br.com.agenda.model.Contatos;
import java.io.Serializable;
import java.util.List;
import org.apache.logging.log4j.Logger;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Alisson
 */

@ManagedBean
@SessionScoped
public class ContatoController implements Serializable {
    
    private Contatos contato;
    private DataModel listaAgenda;

    public Contatos getContato() {
        if(this.contato == null){
            this.contato = new Contatos();
        }
        return contato;
    }
    
    
    public void setContato(Contatos contato) {
        this.contato = contato;
    }
    

    public DataModel getListaAgenda() {
        List<Contatos> lista = new ContatoDao().listContato();
        listaAgenda = new ListDataModel(lista);
        return listaAgenda;
    }
    
    public void adicionar(ActionEvent actionEvent ){
        ContatoDao dao = new ContatoDao();
        dao.save(contato);
        contato = new Contatos();
    }
    
    public String excluir(ActionEvent actionEvent){
        Contatos contatoTemp = (Contatos) (listaAgenda.getRowData());
        ContatoDao dao = new ContatoDao();
        dao.remove(contatoTemp);
        return "index";
    }
    
    public void prepararAdicionarContato(ActionEvent actionEvent){
        contato = new Contatos();
    }
    
    public Contatos prepararAlterarContato(Contatos ct) {
        System.out.println(ct);
        return contato = ct;
    }

    
}
