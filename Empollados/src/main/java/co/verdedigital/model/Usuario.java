package co.verdedigital.model;

import java.math.BigDecimal;

/**
 * Created by apoloduvalis on 5/16/13.
 */
public class Usuario
{
    public String id;
    public String nombre;
    public BigDecimal puntos;
    public BigDecimal creditos;

    public Usuario(String pId, String pNombre, BigDecimal pPuntos, BigDecimal pCreditos)
    {
        this.id = pId;
        this.nombre = pNombre;
        this.puntos = pPuntos;
        this.creditos = pCreditos;
    }
}
