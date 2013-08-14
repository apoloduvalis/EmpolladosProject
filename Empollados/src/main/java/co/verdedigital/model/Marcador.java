package co.verdedigital.model;

/**
 * Created by apoloduvalis on 5/16/13.
 */
public class Marcador
{
    public String tipo;
    public Integer golesLocal;
    public Integer golesVisitante;

    /**
     *
     * @param pTipo             Tipo de marcador: Tiempo Reglamentario (TR), Tiempo Suplementario (TS), Penalties (PE)
     * @param pGolesLocal       Goles del equipo local para el tipo de marcador
     * @param pGolesVisitante   Goles del equipo visitante para el tipo de marcador
     */
    public Marcador(String pTipo, Integer pGolesLocal, Integer pGolesVisitante)
    {
        this.tipo = pTipo;
        this.golesLocal = pGolesLocal;
        this.golesVisitante = pGolesVisitante;
    }
}
