/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gesteduc.endereco;

import java.io.Serializable;
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
@Table(name="endereco")
public class Endereco implements Serializable {
    
    @Id
    @GeneratedValue
    private int idEndereco;
    @Column(nullable = false, length = 70)
    private String cidade;
    @Column(nullable = false, length = 5)
    private short numero;
    @Column(nullable = true, length = 50)
    private String bairro;
    @Column(nullable = true, length = 50)
    private String logradouro;
    @Column(nullable = false)
    private int cep;
    @Column(length = 20)
    private String estado;

    public Endereco() {
    }

    public Endereco(String cidade, short numero, String bairro, String logradouro, int cep, String estado) {
        this.cidade = cidade;
        this.numero = numero;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.cep = cep;
        this.estado = estado;
    }
    
    /**
     * @return the idEndereco
     */
    public int getIdEndereco() {
        return idEndereco;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the numero
     */
    public short getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(short numero) {
        this.numero = numero;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * @return the cep
     */
    public int getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(int cep) {
        this.cep = cep;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
