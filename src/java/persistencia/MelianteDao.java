/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import Negocios.Meliante;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alunos
 */
public class MelianteDao {

    private static Connection connection= new ConnectionFactory().getConnection();
    public static void adcionaMeliante(Meliante meliante) {
        String sql = "insert into Meliantes " + "(Nome,CPF,Endereco,Delito,Data,Hora,Local,Estado,Foto)" + " values (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, meliante.getNome());
            stmt.setString(2, meliante.getCpf());
            stmt.setString(3, meliante.getEndereco());
            stmt.setString(4, meliante.getDelito());
            stmt.setDate(5, new Date(meliante.getData().getTimeInMillis()));
            stmt.setString(6, meliante.getHora());
            stmt.setString(7, meliante.getLocal());
            stmt.setString(8, meliante.getEstado());
            stmt.setString(9, meliante.getFoto());
            // executa
            stmt.execute();
            stmt.close();
            meliante.setId(getMaxIDMeliante());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static int getMaxIDMeliante()
    {
        try {
            PreparedStatement stmt = connection.prepareStatement("SELECT MAX(ID) as MAX FROM `Meliantes`");
            ResultSet rs = stmt.executeQuery();
            int id=0;
            while (rs.next()) {
                id=rs.getInt("MAX");
            }
            rs.close(); 
            stmt.close();
            return id;
        } catch (SQLException e) {
            throw new RuntimeException(e); 
        }
    }
    public static void altera(Meliante meliante)
    {
        String sql = "update Meliantes set Nome = ?,Endereco=?, Delito = ?,Data=?,Hora=?,Local=?,Estado=?,Foto=? where id = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, meliante.getNome());
            stmt.setString(2, meliante.getEndereco());
            stmt.setString(3, meliante.getDelito());
            stmt.setDate(4, new Date(meliante.getData().getTimeInMillis()));
            stmt.setString(5, meliante.getHora());
            stmt.setString(6, meliante.getLocal());
            stmt.setString(7, meliante.getEstado());
            stmt.setString(8, meliante.getFoto());
            stmt.setLong(9, meliante.getId());
            // executa
            stmt.execute();
            stmt.close();
            meliante.setId(getMaxIDMeliante());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Meliante> getListaOrderByDelito() 
    {
        try {
            PreparedStatement stmt = connection.prepareStatement("select * from Meliantes order by delito,nome");
            ResultSet rs = stmt.executeQuery();
            List <Meliante > meliantes = new ArrayList <Meliante >();
            while (rs.next()) {
                // criando o objeto Meliante
                Meliante meliante = new Meliante(); 
                meliante.setId(rs.getLong("id"));
                meliante.setNome(rs.getString("Nome"));
                meliante.setCpf(rs.getString("CPF")); 
                meliante.setEndereco(rs.getString("Endereco"));
                meliante.setDelito(rs.getString("Delito"));
                // montando a data através do Calendar
                Calendar data = Calendar.getInstance(); 
                data.setTime(rs.getDate("Data")); 
                meliante.setData(data);            
                meliante.setHora(rs.getString("Hora"));
                meliante.setLocal(rs.getString("Local"));
                meliante.setEstado(rs.getString("Estado"));
                meliante.setFoto(rs.getString("Foto"));
                // adicionando o objeto à lista
                meliantes.add(meliante); 
            }
            rs.close(); 
            stmt.close();
            return meliantes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Meliante> getListaOrderByNome()
    {
        try {
            PreparedStatement stmt = connection.prepareStatement("select * from Meliantes order by nome");
            ResultSet rs = stmt.executeQuery();
            List <Meliante > meliantes = new ArrayList <Meliante >();
            while (rs.next()) {
                // criando o objeto Meliante
                Meliante meliante = new Meliante(); 
                meliante.setId(rs.getLong("id"));
                meliante.setNome(rs.getString("Nome"));
                meliante.setCpf(rs.getString("CPF")); 
                meliante.setEndereco(rs.getString("Endereco"));
                meliante.setDelito(rs.getString("Delito"));
                // montando a data através do Calendar
                Calendar data = Calendar.getInstance(); 
                data.setTime(rs.getDate("Data")); 
                meliante.setData(data);            
                meliante.setHora(rs.getString("Hora"));
                meliante.setLocal(rs.getString("Local"));
                meliante.setEstado(rs.getString("Estado"));
                meliante.setFoto(rs.getString("Foto"));
                // adicionando o objeto à lista
                meliantes.add(meliante); 
            }
            rs.close(); 
            stmt.close();
            return meliantes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Meliante> getListaOrderByForagidos()
    {
        try {
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM `Meliantes` WHERE Estado=\"foragido\" order by nome");
            ResultSet rs = stmt.executeQuery();
            List <Meliante > meliantes = new ArrayList <Meliante >();
            while (rs.next()) {
                // criando o objeto Meliante
                Meliante meliante = new Meliante(); 
                meliante.setId(rs.getLong("id"));
                meliante.setNome(rs.getString("Nome"));
                meliante.setCpf(rs.getString("CPF")); 
                meliante.setEndereco(rs.getString("Endereco"));
                meliante.setDelito(rs.getString("Delito"));
                // montando a data através do Calendar
                Calendar data = Calendar.getInstance(); 
                data.setTime(rs.getDate("Data")); 
                meliante.setData(data);            
                meliante.setHora(rs.getString("Hora"));
                meliante.setLocal(rs.getString("Local"));
                meliante.setEstado(rs.getString("Estado"));
                meliante.setFoto(rs.getString("Foto"));
                // adicionando o objeto à lista
                meliantes.add(meliante); 
            }
            rs.close(); 
            stmt.close();
            return meliantes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void removeMeliante ( Meliante meliante ) 
    {
        PreparedStatement stmt;
        try {
            stmt = connection . prepareStatement ("delete from Meliantes where id = ?");
            stmt.setLong (1 , meliante.getId());
            stmt.execute () ;
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(MelianteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}