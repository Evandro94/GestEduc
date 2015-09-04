/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gesteduc.pessoa;

import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Johnatan
 */
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass
public abstract class PessoaJuridica extends Pessoa {

    @Column(nullable = false, unique = true, length = 18)
    private String cnpj;
    

    public PessoaJuridica(String nome) {
        super(nome);
    }

    public PessoaJuridica(String cnpj, String nome) {
         super(nome);
        this.cnpj = cnpj;
    }
    
    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
}

