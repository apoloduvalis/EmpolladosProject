package co.verdedigital.persistence;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import co.verdedigital.model.Categoria;
import co.verdedigital.model.Fase;
import co.verdedigital.model.Polla;
import co.verdedigital.model.Torneo;

/**
 * Created by apoloduvalis on 6/9/13.
 */
public class PollasDAO
{
    public static List<Polla> getPollas(String pUsuario)
    {
        List<Polla> pollas = new ArrayList<Polla>();
        Categoria catAB1 = new Categoria("CPAB1","Abierta Nivel 1");
        Categoria catPR2 = new Categoria("CPPR2","Privada Nivel 2");

        List<Torneo> torneos = TorneosDAO.getTorneos(pUsuario);
        Torneo lp = torneos.get(0);

        Fase f1P1 = new Fase("Todos contra todos",false,1,lp);
        Fase f2P1 = new Fase("Octagonal",false,2,lp);
        Fase f3P1 = new Fase("Cuadrangular",false,3,lp);

        Polla p1 = new Polla(BigDecimal.valueOf(100),"Liga PostobOn abierta 1",true,catAB1,lp.getLogoResourceId());
        p1.setFase(f1P1);
        p1.setFase(f2P1);
        p1.setFase(f3P1);
        pollas.add(p1);

        Torneo cl = torneos.get(1);

        Fase f1P2 = new Fase("ClasificaciOn",false,1,cl);
        Fase f2P2 = new Fase("Fase de Grupos",false,2,cl);
        Fase f3P2 = new Fase("Octavos de Final",false,3,cl);
        Fase f4P2 = new Fase("Cuartos de Final",false,4,cl);
        Fase f5P2 = new Fase("Semifinal",false,5,cl);
        Fase f6P2 = new Fase("Final",false,6,cl);

        Polla p2 = new Polla(BigDecimal.valueOf(500),"Copa Libertadores privada 2",true,catPR2,cl.getLogoResourceId());
        p2.setFase(f1P2);
        p2.setFase(f2P2);
        p2.setFase(f3P2);
        p2.setFase(f4P2);
        p2.setFase(f5P2);
        p2.setFase(f6P2);

        pollas.add(p2);

        return pollas;
    }
}
