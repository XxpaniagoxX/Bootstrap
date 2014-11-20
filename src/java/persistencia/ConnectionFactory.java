/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alunos
 */
public class ConnectionFactory {

    private static Connection conexao;
    private static String URL_CONEXAO = "jdbc:mysql://150.164.102.160/daw-aluno10";
    private static String USUARIO = "daw-aluno10";
    private static String SENHA = "daw10";

    /**
     * Obtém a conexão ativa.
     * @return conexao.
     */
    public static Connection getConnection() {

        // Se não há uma conexão, então cria uma
        if (conexao == null) {
            try {
                try {
                    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                } catch (SQLException ex) {
                    Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
                }
                conexao = DriverManager.getConnection(URL_CONEXAO, USUARIO, SENHA);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
        // Retorna a conexão existente
        return conexao;
    }
}