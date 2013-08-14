package co.verdedigital.model;

/**
 * Created by apoloduvalis on 5/16/13.
 */
public class Participante
{
    public String tipo;
    public Polla polla;
    public Usuario usuario;

    public Participante(String pTipo, Polla pPolla, Usuario pUsuario)
    {
        this.tipo = pTipo;
        this.polla = pPolla;
        this.usuario = pUsuario;
    }
}
