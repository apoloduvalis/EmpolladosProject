package co.verdedigital.model;

/**
 * Created by apoloduvalis on 5/16/13.
 */
public class Equipo
{
    public String id;
    public String nombre;
    public int escudoId;

    /**
     * @param pId			ID del equipo
     * @param pNombre		Nombre del equipo
     * @param pEscudoId		Resource ID de la imagen del escudo
     */
    public Equipo (String pId, String pNombre, int pEscudoId)
    {
        this.nombre = pNombre;
        this.escudoId = pEscudoId;
    }
}
