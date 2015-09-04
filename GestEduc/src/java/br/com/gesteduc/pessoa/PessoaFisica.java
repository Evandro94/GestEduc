/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gesteduc.pessoa;

import br.com.gesteduc.endereco.Endereco;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;

/**
 *
 * @author Johnatan
 */

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass
public abstract class PessoaFisica extends Pessoa{
    
    @Column(nullable = false, unique = true, length = 20)
    private String rg;
    @Column(nullable = false, unique = true, length = 14)
    private String cpf;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "data_nascimento", nullable = false)
    private Date dataNascinmento;

    public PessoaFisica(String rg, String cpf, Date dataNascinmento, String nome, Endereco endereco) {
        super(nome,endereco);
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascinmento = dataNascinmento;
    }

    public PessoaFisica() {
    }
    
    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the dataNascinmento
     */
    public Date getDataNascinmento() {
        return dataNascinmento;
    }

    /**
     * @param dataNascinmento the dataNascinmento to set
     */
    public void setDataNascinmento(Date dataNascinmento) {
        this.dataNascinmento = dataNascinmento;
    }
    
    
    
}
