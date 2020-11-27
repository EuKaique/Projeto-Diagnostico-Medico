//Autor do software Kaique Oliveira
package ModeloDao;
// importação do que estamos usando nessa classe
import ModeloBeans.doencaBeans;
import ModeloConecta.conexaoPG;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class doencaDao {
//métodos a serem usados    
    conexaoPG conec = new conexaoPG();
    doencaBeans doe = new doencaBeans();
    
//criação do método de Salvar    
public void Salvar(doencaBeans doe){
    ProcurarDoencaCod(doe.getNome()); 
    
    conec.conexao();
        try {
            PreparedStatement PS = conec.con.prepareStatement("insert into doencas(nome,codigo,informacoes)values(?,?,?)");
            PS.setString(1,doe.getNome());
            PS.setInt(2,doe.getCodigo());
            PS.setString(3,doe.getInformacoes());
            PS.execute();
            
            
           JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir Doença"+ex);
        }
    
    
    conec.desconectar();
}
//Criação do método de Editar
 public void Editar(doencaBeans doe){
   conec.conexao();
       try {
           PreparedStatement PS = conec.con.prepareStatement("update doencas set nome=?,informacoes=? where codigo=?");
            PS.setString(1,doe.getNome());
            PS.setString(2,doe.getInformacoes());
            PS.setInt(3,doe.getCodigo());
            PS.execute();
           JOptionPane.showMessageDialog(null,"Doença editada com sucesso");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao editar Doença"+ex);
       }
   
   
   
   conec.desconectar();
     
   }
 //Criação do método de Excluir 
 public void Excluir(doencaBeans doe){
   conec.conexao();
       try {
           PreparedStatement PS = conec.con.prepareStatement("delete from doencas where codigo=?");
            PS.setInt(1,doe.getCodigo());
            PS.execute();
           JOptionPane.showMessageDialog(null,"Doença deletada no Sistema");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao excluir Doença"+ex);
       }
   
   
   
   conec.desconectar();
     
   }
// Criação do método ProcurarDoencaCod, procura a doença pelo código
 public void ProcurarDoencaCod(String nome){
  conec.conexao();
  conec.executaSql("select * from doencas where nome='"+nome+"'");
  
       try {
           conec.rs.first();
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao procurar Doença"+ex);
       }
  
  
  conec.desconectar();
  }
 // Criação do método procurarDoenca, através de umas String que esteja no BD
 public doencaBeans procurarDoenca(doencaBeans doe){
    conec.conexao();
    
       try {
           conec.executaSql("select * from doencas where nome like'%"+doe.getProcurar()+"%'");
           conec.rs.first();
           doe.setCodigo(conec.rs.getInt("codigo"));
           doe.setNome(conec.rs.getString("nome"));
           doe.setInformacoes(conec.rs.getString("informacoes"));
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao procurar Doença"+ex);
       }
    
    conec.desconectar();
     return doe;
     
 }
 
}
