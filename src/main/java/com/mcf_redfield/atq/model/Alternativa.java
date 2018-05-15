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
public class Alternativa
{

    private int idAlt;
    private String alternativa;
    private Questao questao;
    private String certoErrado;

    public Alternativa(int idAlt, String alternativa, Questao questao, String certoErrado)
    {
        this.idAlt = idAlt;
        this.alternativa = alternativa;
        this.questao = questao;
        this.certoErrado = certoErrado;
    }

    public int getIdAlt()
    {
        return idAlt;
    }

    public void setIdAlt(int idAlt)
    {
        this.idAlt = idAlt;
    }

    public String getAlternativa()
    {
        return alternativa;
    }

    public void setAlternativa(String alternativa)
    {
        this.alternativa = alternativa;
    }

    public Questao getQuestao()
    {
        return questao;
    }

    public void setQuestao(Questao questao)
    {
        this.questao = questao;
    }

    public String getCertoErrado()
    {
        return certoErrado;
    }

    public void setCertoErrado(String certoErrado)
    {
        this.certoErrado = certoErrado;
    }

}
