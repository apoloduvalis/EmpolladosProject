package co.verdedigital.model;

import java.math.BigDecimal;

/**
 * Created by apoloduvalis on 5/16/13.
 */
public class Categoria
{
    public String id;
    public String titulo;
    public String descripcion;
    public BigDecimal creditosMinimos;

    public Categoria(String pId, String pTitulo)
    {
        this.id = pId;
        this.titulo = pTitulo;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String pDescripcion)
    {
        this.descripcion = pDescripcion;
    }

    public BigDecimal getCreditosMinimos()
    {
        return creditosMinimos;
    }

    public void setCreditosMinimos(BigDecimal pCreditosMinimos)
    {
        this.creditosMinimos = pCreditosMinimos;
    }


}
