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
public class Questao/*add comentário*/
{

    private int idQuestao;
    private String questao;
    private Categoria categoria;
    private String level;
    private String serie;

    public Questao(int idQuestao, String questao, Categoria categoria, String level, String serie)
    {
        this.idQuestao = idQuestao;
        this.questao = questao;
        this.categoria = categoria;
        this.level = level;
        this.serie = serie;
    }

    public int getIdQuestao()
    {
        return idQuestao;
    }

    public void setIdQuestao(int idQuestao)
    {
        this.idQuestao = idQuestao;
    }

    public String getQuestao()
    {
        return questao;
    }

    public void setQuestao(String questao)
    {
        this.questao = questao;
    }

    public Categoria getCategoria()
    {
        return categoria;
    }

    public void setCategoria(Categoria categoria)
    {
        this.categoria = categoria;
    }

    public String getLevel()
    {
        return level;
    }

    public void setLevel(String level)
    {
        this.level = level;
    }

    public String getSerie()
    {
        return serie;
    }

    public void setSerie(String serie)
    {
        this.serie = serie;
    }

}
