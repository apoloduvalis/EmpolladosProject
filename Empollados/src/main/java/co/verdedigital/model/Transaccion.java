package co.verdedigital.model;

import java.math.BigDecimal;

/**
 * Created by apoloduvalis on 5/16/13.
 */
public class Transaccion
{
    public BigDecimal id;
    public String fecha;
    public String tipo;
    public BigDecimal puntos;
    public BigDecimal creditos;
    public String descripcion;
    public Usuario usuario;


    public Transaccion(BigDecimal pId, String pFecha, String pTipo, Usuario pUsuario)
    {
        this.id = pId;
        this.fecha = pFecha;
        this.tipo = pTipo;
        this.usuario = pUsuario;
    }
}
