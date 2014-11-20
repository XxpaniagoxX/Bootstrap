/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Negocios.Meliante;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.MelianteDao;

/**
 *
 * @author alunos
 */
public class AdicionaMelianteLogic implements Logica{

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        String Nome = req.getParameter("Nome");
        String CPF = req.getParameter("CPF");
        String Endereco = req.getParameter("Endereco");
        String Delito = req.getParameter("Delito");
        String dataEmTexto = req.getParameter("Data");
        String Hora = req.getParameter("Hora");
        String Local = req.getParameter("Local");
        String Estado= req.getParameter("Estado");
        String Foto=req.getParameter("Foto");
        Calendar Data = null;
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
            Data = Calendar.getInstance();
            Data.setTime(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        Meliante meliante=new Meliante();
        meliante.setNome(Nome);
        meliante.setCpf(CPF);
        meliante.setEndereco(Endereco);
        meliante.setDelito(Delito);
        meliante.setData(Data);
        meliante.setHora(Hora);
        meliante.setLocal(Local);
        meliante.setEstado(Estado);
        meliante.setFoto(Foto);
        MelianteDao.adcionaMeliante(meliante);
        System.out.println("Adicionando Meliante... ");
        return "mvc?logica=ListaMeliantesByDelitoLogic";   
    }
    
}
