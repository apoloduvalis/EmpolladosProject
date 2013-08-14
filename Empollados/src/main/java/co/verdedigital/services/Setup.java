package co.verdedigital.services;


import java.util.List;

import co.verdedigital.model.Polla;
import co.verdedigital.persistence.PollasDAO;

/**
 * Created by apoloduvalis on 5/23/13.
 */
public class Setup
{
    public static List<Polla> loadConfiguration(String pUsuario)
    {
        List<Polla> pollas = PollasDAO.getPollas(pUsuario);
        return pollas;
    }


}
