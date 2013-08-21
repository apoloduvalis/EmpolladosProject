package co.verdedigital.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
/**
 * Created by apoloduvalis on 5/16/13.
 */
public class Fase implements Serializable
{
    public Integer id;
    public String nombre;
    public Boolean activa;
    HashMap<Integer,Encuentro> encuentros;
    HashMap<BigDecimal, Polla> pollas;
    Torneo torneo;

    /**
     *
     * @param pNombre   Nombre de la fase
     * @param pActiva   True si la fase todavía tiene encuentros disponibles para apostar; false en caso contrario
     * @param pOrden    Secuencia de la fase en la lista de fases del torneo
     * @param pTorneo   Torneo al que pertenece la fase
     */
    public Fase (String pNombre, Boolean pActiva, int pOrden, Torneo pTorneo)
    {
        this.nombre = pNombre;
        this.activa = pActiva;
        this.id = pOrden;
        this.torneo = pTorneo;
        this.encuentros = new HashMap<Integer,Encuentro>();
        this.pollas = new HashMap<BigDecimal, Polla>();
    }

    public Encuentro getEncuentro(Integer idEncuentro)
    {
        return this.encuentros.get(idEncuentro);
    }

    public void setEncuentro(Encuentro pEncuentro)
    {
        this.encuentros.put(pEncuentro.id, pEncuentro);
    }

    public void setFase(Polla pPolla)
    {
        this.pollas.put(pPolla.id, pPolla);
    }

    public Polla getFase(BigDecimal pIdPolla)
    {
        return this.pollas.get(pIdPolla);
    }

    public Torneo getTorneo()
    {
        return torneo;
    }
}
