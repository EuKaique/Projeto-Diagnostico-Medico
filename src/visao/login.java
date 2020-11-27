//Autores do Software Kaique Oliveira Santos e Wallace Antunes.
package visao;

import ModeloConecta.conexaoPG;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//Criação da Tela Login onde ela está herdando os componentes JFrame.
//estamos fazendo também a importação com o Banco de Dados através da classe ConexaoPG.
public class login extends javax.swing.JFrame {
    conexaoPG conec = new conexaoPG();

    //Criação do método Login para instalação dos componentes.
    public login() {
        initComponents();
        conec.conexao();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Entrar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        Usuario = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        CampoUsuario = new javax.swing.JTextField();
        CampoSenha = new javax.swing.JPasswordField();
        Logo = new javax.swing.JLabel();
        FundoLogin = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Entrar.setText("Entrar");
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });
        getContentPane().add(Entrar);
        Entrar.setBounds(50, 180, 80, 30);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        getContentPane().add(Sair);
        Sair.setBounds(130, 180, 90, 30);

        Usuario.setText("Usuário:");
        getContentPane().add(Usuario);
        Usuario.setBounds(50, 90, 70, 30);

        Senha.setText("Senha:");
        getContentPane().add(Senha);
        Senha.setBounds(50, 130, 60, 30);

        CampoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(CampoUsuario);
        CampoUsuario.setBounds(100, 90, 120, 30);
        getContentPane().add(CampoSenha);
        CampoSenha.setBounds(100, 130, 120, 30);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogoSoftware.PNG"))); // NOI18N
        getContentPane().add(Logo);
        Logo.setBounds(400, 0, 197, 140);

        FundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo Principal.jpg"))); // NOI18N
        getContentPane().add(FundoLogin);
        FundoLogin.setBounds(0, 0, 600, 253);

        setSize(new java.awt.Dimension(616, 291));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void CampoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
    }                                            

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {                                       
        //Codicão para acesso do médico ao sistema, o médico só irá conseguir fazer Login no Sistema principal do software se ele estiver cadastrado no banco de dados.
        
        try {
            conec.executaSql("select * from medicos where nome_med='"+CampoUsuario.getText()+"'");
            conec.rs.first();
            if(conec.rs.getString("crm_medico").equals(CampoSenha.getText())){
        //Se o medico estiver cadastrado no banco ele vai para a nossa tela principal        
                acesso tela = new acesso();
                tela.setVisible(true);
                dispose();
                
            }else{
                JOptionPane.showMessageDialog(rootPane,"Usuário ou senha incorreto.");
            }
        } catch (SQLException ex) {
            //O "ex" mostra onde está o Erro ao exibir a Mensagem 
               JOptionPane.showMessageDialog(rootPane,"Usuário ou senha incorreto."+ex);
        }
    }                                      

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {                                     
        System.exit(0);
    }                                    

    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    public javax.swing.JPasswordField CampoSenha;
    public javax.swing.JTextField CampoUsuario;
    public javax.swing.JButton Entrar;
    public javax.swing.JLabel FundoLogin;
    public javax.swing.JLabel Logo;
    public javax.swing.JButton Sair;
    public javax.swing.JLabel Senha;
    public javax.swing.JLabel Usuario;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
