package co.verdedigital.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Created by apoloduvalis on 5/16/13.
 */
public class Polla implements Serializable
{
    public BigDecimal id;
    public String titulo;
    public Boolean abierta;
    public Categoria categoria;
    HashMap<Integer, Fase> fases;
    public int logoTorneoResourceId;

    public Polla(BigDecimal pId, String pTitulo, Boolean pAbierta, Categoria pCategoria, int pLogoTorneo) {
        this.id = pId;
        this.titulo = pTitulo;
        this.abierta = pAbierta;
        this.categoria = pCategoria;
        this.fases = new HashMap<Integer, Fase>();
        this.logoTorneoResourceId = pLogoTorneo;
    }

    public Fase getFase(Integer pFaseId)
    {
        return fases.get(pFaseId);
    }

    public void setFase(Fase pFase)
    {
        this.fases.put(pFase.id,pFase);
    }
}
