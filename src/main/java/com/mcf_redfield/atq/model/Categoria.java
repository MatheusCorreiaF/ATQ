/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcf_redfield.atq.model;

/**
 *
 * @author Usuario
 */
public class Categoria
{

    private int idCat;
    private String categoria;
    private int qtdeQ;

    public Categoria(int idCat, String categoria)
    {
        this.qtdeQ = 0;
        this.idCat = idCat;
        this.categoria = categoria;
    }

    public Categoria()
    {
        this.qtdeQ = 0;
        this.idCat = 0;
        this.categoria = null;
    }

    public int getIdCat()
    {
        return idCat;
    }

    public void setIdCat(int idCat)
    {
        this.idCat = idCat;
    }

    public String getCategoria()
    {
        return categoria;
    }

    public void setCategoria(String categoria)
    {
        this.categoria = categoria;
    }

    public int getQtdeQ()
    {
        return qtdeQ;
    }

    public void setQtdeQ(int qtdeQ)
    {
        this.qtdeQ = qtdeQ;
    }

}
