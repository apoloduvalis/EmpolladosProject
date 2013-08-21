package co.verdedigital.model;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by apoloduvalis on 5/16/13.
 */
public class Torneo implements Serializable
{
    public Integer id;
    public String titulo;
    int logoResourceId;
    HashMap<Integer,Fase> fases;

    /**
     * @param pId			ID del torneo
     * @param pTitulo		Título del torneo
     */
    public Torneo (Integer pId, String pTitulo)
    {
        this.id = pId;
        this.titulo = pTitulo;
        this.logoResourceId = android.R.drawable.ic_menu_gallery;
        this.fases = new HashMap<Integer,Fase>();
    }

    public void setFase(Fase pFase)
    {
        this.fases.put(pFase.id, pFase);
    }

    public Fase getFase(Integer pIdFase)
    {
        return this.fases.get(pIdFase);
    }

    public int getLogoResourceId()
    {
        return logoResourceId;
    }

    public void setLogoResourceId(int pLogoResourceId)
    {
        this.logoResourceId = pLogoResourceId;
    }

}
