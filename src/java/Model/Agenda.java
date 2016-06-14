/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Alisson
 */
@Entity
public class Agenda implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String email;
    private String telefone;
    private String celular;
   

    public Agenda() {
    }

    public Agenda(long id, String nome, String email, String telefone, String celular) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
