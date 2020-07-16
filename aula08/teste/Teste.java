package aula08.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Teste {

    // define se o driver ja foi iniciado
    static boolean driverIniciado = false;

    public static void main(String[] args) {
        try {
            Connection conexao = iniciarConexaoBanco();
            System.out.println("Conexão aberta com sucesso");
            executarQuey(conexao, "select * from city limit 10");
            conexao.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Inicia uma nova conexão com o banco de dados
     * @return conexão aberta
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection iniciarConexaoBanco() throws ClassNotFoundException, SQLException {
        // define as configurações para o banco
        String driverMySQL = "com.mysql.cj.jdbc.Driver";   
        String servidor = "localhost";
        String banco = "world";
        String usuario = "root";
        String senha = "teste";
        // inicia o driver do banco
        if (!driverIniciado) {
            Class.forName(driverMySQL); 
            driverIniciado = true;
        }
        // monta a url para conexão com o banco
        String url = String.format("jdbc:mysql://%s/%s?serverTimezone=UTC", servidor, banco);
        // inicia a conexão
        return DriverManager.getConnection(url, usuario, senha);
    }

    /**
     * Executa uma consulta na tabela country do banco de dados
     * @param connection conexão usada para ser feita a consulta
     * @param query consulta que deve ser executada
     * @throws SQLException
     */
    static void executarQuey(Connection connection, String query) throws SQLException {
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String country = rs.getString("countrycode");
            String district = rs.getString("district");
            int population = rs.getInt("population");
            System.out.printf("ID: %d\n", id);
            System.out.printf("Nome: %s\n", name);
            System.out.printf("País: %s\n", country);
            System.out.printf("Distrito: %s\n", district);
            System.out.printf("Populacao: %d\n\n", population);
        }
        rs.close();
        st.close();
    }
}