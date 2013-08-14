package co.verdedigital.model;

import java.util.HashMap;

/**
 * Created by apoloduvalis on 5/16/13.
 */
public class Encuentro
{
    public Integer id;
    public String fecha;
    public Boolean abierto;
    public String horaInicio;
    public String horaFin;
    public Equipo local;
    public Equipo visitante;
    public Fase faseTorneo;
    HashMap<String, Marcador> marcadores;

    /**
     *
     * @param pId           ID del encuentro
     * @param pLocal        Equipo local
     * @param pVisitante    Equipo visitante
     * @param pFecha        Fecha del encuentro
     * @param pHoraInicio   Hora de inicio del encuentro
     * @param pFaseTorneo   Fase del torneo a la que corresponde el encuentro
     */
    public Encuentro(int pId, Equipo pLocal, Equipo pVisitante, String pFecha, String pHoraInicio, Fase pFaseTorneo)
    {
        this.id = pId;
        this.local = pLocal;
        this.visitante = pVisitante;
        this.fecha = pFecha;
        this.horaInicio = pHoraInicio;
        this.faseTorneo = pFaseTorneo;
        this.abierto = false;
        this.horaFin = null;
    }

    public void setMarcador(Marcador pMarcador)
    {
        this.marcadores.put(pMarcador.tipo, pMarcador);
    }

    public Marcador getMarcador(String pTipoMarcador)
    {
        return this.marcadores.get(pTipoMarcador);
    }
}
