/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gesteduc.administrador;

import br.com.gesteduc.endereco.Endereco;
import br.com.gesteduc.pessoa.PessoaFisica;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Johnatan
 */
@Entity
@Table(name="administrador")
public class Administrador extends PessoaFisica implements Serializable{
    
    @Id
    @GeneratedValue
    private long idAdministrador;
    @Column(nullable = false, length = 24)
    private String senha;

    public Administrador() {
    }

    public Administrador(String rg, String cpf, Date dataNascinmento, String nome, Endereco endereco) {
        super(rg, cpf, dataNascinmento, nome, endereco);
    }

    public Administrador(long idAdministrador, String senha, String rg, String cpf, Date dataNascinmento, String nome, Endereco endereco) {
        super(rg, cpf, dataNascinmento, nome,endereco);
        this.idAdministrador = idAdministrador;
        this.senha = senha;
    }
    
    /**
     * @return the idAdministrador
     */
    public long getIdAdministrador() {
        return idAdministrador;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    
    
    
    
    
}
