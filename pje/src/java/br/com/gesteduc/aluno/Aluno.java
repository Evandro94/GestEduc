/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gesteduc.aluno;

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
@Table(name = "aluno")
public class Aluno extends PessoaFisica implements Serializable {

    @Id
    @GeneratedValue
    private long idAluno;
    @Column(nullable = false)
    private int codigoDocente;

    

    public Aluno() {
    }

    public Aluno(int codigoDocente) {
        this.codigoDocente = codigoDocente;
    }
    
    

    /**
     * @return the idAluno
     */
    public long getIdAluno() {
        return idAluno;
    }

    /**
     * @return the codigoDocente
     */
    public int getCodigoDocente() {
        return codigoDocente;
    }

    /**
     * @param codigoDocente the codigoDocente to set
     */
    public void setCodigoDocente(int codigoDocente) {
        this.codigoDocente = codigoDocente;
    }
    
    
}
