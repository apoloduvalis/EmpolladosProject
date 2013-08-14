package co.verdedigital.persistence;

import java.util.ArrayList;
import java.util.List;

import co.verdedigital.empollados.R;
import co.verdedigital.model.Fase;
import co.verdedigital.model.Torneo;

/**
 * Created by apoloduvalis on 5/23/13.
 */
public class TorneosDAO
{
    public static List<Torneo> getTorneos(String pUsuario)
    {
        List<Torneo> torneos = new ArrayList<Torneo>();

        Torneo lp = new Torneo(100,"Liga PostobOn");
        lp.setLogoResourceId(R.drawable.liga_postobon);
        lp.setFase(new Fase("Eliminatorias",true,1,lp));
        lp.setFase(new Fase("Octavos de final",true,2,lp));
        lp.setFase(new Fase("Cuartos de final",true,3,lp));
        lp.setFase(new Fase("Final",true,4,lp));
        torneos.add(lp);

        Torneo cl = new Torneo(200,"Copa Libertadores de AmErica");
        cl.setLogoResourceId(R.drawable.copa_libertadores);
        cl.setFase(new Fase("Eliminatorias",true,1,cl));
        cl.setFase(new Fase("Semifinal",true,2,cl));
        cl.setFase(new Fase("Final",true,3,cl));
        torneos.add(cl);

        return torneos;
    }
}
