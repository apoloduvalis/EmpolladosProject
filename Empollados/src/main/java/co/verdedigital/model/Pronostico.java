package co.verdedigital.model;

/**
 * Created by apoloduvalis on 5/16/13.
 */
public class Pronostico
{
    public Integer puntosGanados;
    public Integer golesLocal;
    public Integer golesVisitante;

    /**
     *
     * @param pPuntosGanados    Número de puntos ganados en la polla gracias a este pronóstico
     * @param pGolesLocal       Goles del pronóstico para el equipo local
     * @param pGolesVisitante   Goles del pronóstico para el equipo visitante
     */
    public Pronostico(Integer pPuntosGanados, Integer pGolesLocal, Integer pGolesVisitante)
    {
        this.puntosGanados = pPuntosGanados;
        this.golesLocal = pGolesLocal;
        this.golesVisitante = pGolesVisitante;
    }
}
