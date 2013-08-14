package co.verdedigital.model;

/**
 * Created by apoloduvalis on 5/16/13.
 */
public class Mecanismo
{
    public String id;
    public String titulo;
    public String descripcion;

    /**
     *
     * @param pId           ID del mecanismo
     * @param pTitulo       Título del mecanismo
     * @param pDescripcion  Descripción del mecanismo
     */
    public Mecanismo(String pId, String pTitulo, String pDescripcion) {
        this.id = pId;
        this.titulo = pTitulo;
        this.descripcion = pDescripcion;
    }
}
