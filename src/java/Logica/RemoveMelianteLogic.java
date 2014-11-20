/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Negocios.Meliante;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.MelianteDao;

/**
 *
 * @author alunos
 */
public class RemoveMelianteLogic implements Logica {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        long id = Long.parseLong(req.getParameter("id"));
        Meliante meliante = new Meliante();
        meliante.setId(id);
        MelianteDao.removeMeliante(meliante);
        System.out.println("Excluindo meliante... ");
        return "mvc?logica=ListaMeliantesByDelitoLogic";   
    }
    
}
