//Autor do software Kaique Oliveira
package ModeloConecta;
        
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class conexaoPG {
    
    public Statement smt;
    public ResultSet rs;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/DB_diagnostico";
    private String usuario = "postgres";
    private String senha = "system";
    public Connection con;
   
    public void conexao(){
        System.setProperty("jdbc.Drivers", driver);
        try {
            con = DriverManager.getConnection(caminho,usuario,senha);
            
        } catch (SQLException ex) {
            
        }
    }
    
    public void executaSql(String sql){
        try {
            smt = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = smt.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na execução SQL\n" +ex.getMessage());
        }
    }
    
    public void desconectar(){
        try {
            con.close();
            
        } catch (SQLException ex) {
            
        }
    }

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public ResultSet executeQuery(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
