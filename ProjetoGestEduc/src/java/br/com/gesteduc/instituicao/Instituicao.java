/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gesteduc.instituicao;

import br.com.gesteduc.endereco.Endereco;
import br.com.gesteduc.pessoa.PessoaJuridica;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Johnatan
 */

@Entity
@Table(name="instituicao")
public class Instituicao extends PessoaJuridica{
    
    @Id
    @GeneratedValue
    private long idInstituicao;

    public Instituicao(String nome, Endereco endereco) {
        super(nome, endereco);
    }

    public Instituicao(long idInstituicao, String nome, Endereco endereco) {
        super(nome, endereco);
        this.idInstituicao = idInstituicao;
    }

    public Instituicao(long idInstituicao, String cnpj, String nome, Endereco endereco) {
        super(cnpj, nome, endereco);
        this.idInstituicao = idInstituicao;
    }

    /**
     * @return the idInstituicao
     */
    public long getIdInstituicao() {
        return idInstituicao;
    }
    
    
}
