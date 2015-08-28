/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gesteduc.administrador;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;

/**
 *
 * @author Johnatan
 */
@ManagedBean
@SessionScoped
public class AdministradorBean {

    private Administrador administrador;
    private DataModel administradores;

    public String adicionarAdministrador() {
        setAdministrador(new Administrador());
        AdministradorDao dao = new AdministradorDao();
        dao.salvar(getAdministrador());
        return "index";
    }

    /**
     * @return the administrador
     */
    public Administrador getAdministrador() {
        return administrador;
    }

    /**
     * @param administrador the administrador to set
     */
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    /**
     * @return the administradores
     */
    public DataModel getAdministradores() {
        return administradores;
    }

    /**
     * @param administradores the administradores to set
     */
    public void setAdministradores(DataModel administradores) {
        this.administradores = administradores;
    }

}
