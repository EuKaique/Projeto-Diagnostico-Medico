//Autor do software Kaique Oliveira
package ModeloDao;

import ModeloConecta.conexaoPG;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import ModeloBeans.medicoBeans;


public class medicoDao {

    conexaoPG conec = new conexaoPG();
    medicoBeans model = new medicoBeans();
    
    public void Salvar(medicoBeans model){
        
        conec.conexao();
        
        try {
            PreparedStatement PSt = conec.con.prepareStatement("insert into medicos(nome,crm,especialidade)values(?,?,?)");
            PSt.setString(1,model.getNome());
            PSt.setInt(2,model.getCRM());
            PSt.setString(3,model.getEspecialista());
            PSt.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na inserção de dados:\n"+ex.getMessage());
        }
        
        
        conec.desconectar();
    }
    
        public void Editar(medicoBeans model){
            conec.conexao();
        try {
            PreparedStatement PSt = conec.con.prepareStatement("update medicos set nome=?, crm=?, especialidade=? where codigo=?");
            PSt.setString(1,model.getNome());
            PSt.setInt(2,model.getCRM());
            PSt.setInt(3,model.getCodigo());
            PSt.setString(4,model.getEspecialista());
            PSt.execute();
            JOptionPane.showMessageDialog(null,"Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na alteração dos Dados/nErro:"+ex);
        }
            
            conec.desconectar();
            
        }
        
        public void Excluir(medicoBeans model){
            
            conec.conexao();
        try {
            PreparedStatement PSt = conec.con.prepareStatement("delete from medicos where codigo=?");
            PSt.setInt(1,model.getCodigo());
            PSt.execute();
            JOptionPane.showMessageDialog(null,"Dados excluídos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Excluir os Dados/nErro:"+ex);
        }
            
            conec.desconectar();
        }
        public medicoBeans BuscarMedico(medicoBeans model){
            conec.conexao();
            conec.executaSql("select * from medicos where nome like'%"+model.getPesquisa()+"%'");
        try {
            conec.rs.first();
            model.setNome(conec.rs.getString("nome"));
            model.setCRM(conec.rs.getInt("crm"));
            model.setCodigo(conec.rs.getInt("codigo"));
            model.setEspecialista(conec.rs.getString("especialidade"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Médico não cadastrado.");
        }
            
            conec.desconectar();
        return model;
        }
    }

