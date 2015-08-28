/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gesteduc.professor;

import br.com.gesteduc.endereco.Endereco;
import br.com.gesteduc.pessoa.PessoaFisica;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Johnatan
 */

@Entity
@Table(name="professor")
public class Professor extends PessoaFisica{
    
    @Id
    @GeneratedValue
    private long idProfessor;
    @Column(nullable = false)
    private int codigoDocente;
    @Column(nullable = true, length = 20)
    private String grauAcademico;
    @Column(nullable = true, length = 20)
    private String formacaoAcademica;

    public Professor(String rg, String cpf, Date dataNascinmento, String nome, Endereco endereco) {
        super(rg, cpf, dataNascinmento, nome, endereco);
    }

    public Professor(long idProfessor, int codigoDocente, String grauAcademico, String formacaoAcademica, String rg, String cpf, Date dataNascinmento, String nome, Endereco endereco) {
        super(rg, cpf, dataNascinmento, nome, endereco);
        this.idProfessor = idProfessor;
        this.codigoDocente = codigoDocente;
        this.grauAcademico = grauAcademico;
        this.formacaoAcademica = formacaoAcademica;
    }

    /**
     * @return the idProfessor
     */
    public long getIdProfessor() {
        return idProfessor;
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

    /**
     * @return the grauAcademico
     */
    public String getGrauAcademico() {
        return grauAcademico;
    }

    /**
     * @param grauAcademico the grauAcademico to set
     */
    public void setGrauAcademico(String grauAcademico) {
        this.grauAcademico = grauAcademico;
    }

    /**
     * @return the formacaoAcademica
     */
    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    /**
     * @param formacaoAcademica the formacaoAcademica to set
     */
    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }
   
}
