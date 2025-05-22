package br.fatec;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private String host = "localhost";
    private String port = "5432";
    private String db = "20251_fatec_ipi_poo_pessoas_sudan";
    private String user = "postgres";
    private String password = "123456";
    
    //https://google.com:80/search
    public Connection obterConexao() throws Exception{

        //string de conexão
        var s = String.format(
            "jdbc:postgresql://%s:%s/%s",
            host, port, db
        );
        //cláusula catch or declare
        //exceção verificada pelo compilador
        Connection c = DriverManager.getConnection(
            s, user, password
        );
        return c;
    }    

    public static void main(String[] args) throws Exception{
        var cf = new ConnectionFactory();
        var c = cf.obterConexao(); 
        System.out.println("Conectou");
    }
}
