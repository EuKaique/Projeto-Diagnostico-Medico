//Autor do software Kaique Oliveira
package ModeloDao;

import ModeloBeans.pacienteBeans;
import ModeloConecta.conexaoPG;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import javax.swing.JOptionPane;


public class pacienteDao {

   
   conexaoPG conec = new conexaoPG();
   conexaoPG conecEstado = new conexaoPG();
   String nomeEstado;
   int codEstado; 
   
   
public void Guardar(pacienteBeans paci){
     BuscarEstadoCod(paci.getEstadoNome()); 
     
     conec.conexao();
       try {
           PreparedStatement PS = conec.con.prepareStatement("insert into paciente (nome,rg,telefone,endereco,cep,data_nasc,cod_estado)values (?,?,?,?,?,?,?,?)");
           
           PS.setString(1,paci.getPaNome());
           PS.setString(2,paci.getRG());
           PS.setString(3,paci.getTelefone());
           PS.setString(4,paci.getEndereço());
           PS.setString(5,paci.getCEP());
           PS.setInt(7,codEstado);
           PS.setString(9,paci.getPaData());
           PS.execute();
           JOptionPane.showMessageDialog(null,"Paciente Salvo no Sistema");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao salvar paciente"+ex);
       }
     
     conec.desconectar();
}   

  public void Alterar(pacienteBeans paci){
     BuscarEstadoCod(paci.getEstadoNome()); 
     
     conec.conexao();
       try {
           PreparedStatement PS = conec.con.prepareStatement("update paciente set nome=? ,rg=? ,telefone=? ,endereco=? ,cep=?,data_nasc=?,cod_estado=? where codigo=?");
           
           PS.setString(1,paci.getPaNome());
           PS.setString(2,paci.getRG());
           PS.setString(3,paci.getTelefone());
           PS.setString(4,paci.getEndereço());
           PS.setString(5,paci.getCEP());
           PS.setInt(7,codEstado);
           PS.setString(9,paci.getPaData());
           PS.setInt(10,paci.getPaCod());
           PS.execute();
           JOptionPane.showMessageDialog(null,"Paciente Editado no Sistema");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Alterar dados do paciente"+ex);
       }
     
     conec.desconectar();
} 
public void BuscarEstadoCod(String nome){
  conec.conexao();
  conec.executaSql("select * from estado where nome='"+nome+"'");
  
       try {
           conec.rs.first();
           codEstado = conec.rs.getInt("codigo");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao buscar Estado"+ex);
       }
  
  
  conec.desconectar();
  }   


 public pacienteBeans buscaPaciente(pacienteBeans paci){
    conec.conexao();
    
       try {
           conec.executaSql("select * from paciente where nome like'%"+paci.getBuscar()+"%'");
           conec.rs.first();
           BuscarEstadoNome(conec.rs.getInt("nome"));
           paci.setPaNome(conec.rs.getString("nome"));
           paci.setCEP(conec.rs.getString("cep"));
           paci.setEndereço(conec.rs.getString("endereco"));
           paci.setPaCod(conec.rs.getInt("codigo"));
           paci.setPaData(conec.rs.getString("data_nasc"));
           paci.setRG(conec.rs.getString("rg"));
           paci.setTelefone(conec.rs.getString("telefone"));
           paci.setEstadoNome(nomeEstado);
           
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao procurar o paciente"+ex);
       }
    
    conec.desconectar();
     return paci;
     
 }

 public void BuscarEstadoNome(int cod){
   conecEstado.conexao();
   
       try {
           conecEstado.executaSql("select * from estado where codigo="+cod);
           conecEstado.rs.first();
           
           nomeEstado=conecEstado.rs.getString("nome");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao pesquisar o nome do Estado"+ex);
       }
   
   conecEstado.desconectar();
     
     
  }  
 
 public void Deletar(pacienteBeans paci){
   conec.conexao();
       try {
           PreparedStatement PS = conec.con.prepareStatement("delete from paciente where codigo =?");
           PS.setInt(1, paci.getPaCod());
           PS.execute();
           JOptionPane.showMessageDialog(null,"Paciente deletado do Sistema");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao deletar paciente"+ex);
       }
   conec.desconectar();
     
   }
 
}
