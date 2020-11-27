
package visao;

import ModeloConecta.conexaoPG;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.*;

//Criação da classe Acesso herdando o JFrame.
public class acesso extends javax.swing.JFrame {
//Criação dos métodos ConexaoPG e FormMedico para a tela de Acesso.
    conexaoPG conecta = new conexaoPG();
    formMedico telaMed = new formMedico();
    formPaciente telaPac = new formPaciente();
    formDoenca telaDoe = new formDoenca();
//A classe Acesso está conectada ao BD.    
    public acesso() {
        initComponents();
        conecta.conexao();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        Cad = new javax.swing.JLabel();
        TituloBemVindo = new javax.swing.JLabel();
        InternalFrameBemVindo = new javax.swing.JPanel();
        BotaoCadDoenca = new javax.swing.JButton();
        BotaoCadMed = new javax.swing.JButton();
        BotaoCadPac = new javax.swing.JButton();
        Diagnostico = new javax.swing.JLabel();
        BotaoDiag = new javax.swing.JButton();
        FecharBemVindo = new javax.swing.JButton();
        FundoBemVindo = new javax.swing.JLabel();
        FundoAcesso = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cadastros = new javax.swing.JMenu();
        CadMedico = new javax.swing.JMenuItem();
        Paciente = new javax.swing.JMenuItem();
        CadDoenca = new javax.swing.JMenuItem();
        Diagnósticos = new javax.swing.JMenu();
        DiaMedico = new javax.swing.JMenuItem();
        Ferramentas = new javax.swing.JMenu();
        BemVindo = new javax.swing.JMenuItem();
        MenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrame1.setTitle("Bem-Vindo");
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(null);

        Cad.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        Cad.setText("Cadastro");
        jInternalFrame1.getContentPane().add(Cad);
        Cad.setBounds(30, 40, 60, 20);

        TituloBemVindo.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        TituloBemVindo.setForeground(new java.awt.Color(0, 102, 255));
        TituloBemVindo.setText("MedicHelp Diagnóstics ");
        jInternalFrame1.getContentPane().add(TituloBemVindo);
        TituloBemVindo.setBounds(200, 0, 200, 24);

        InternalFrameBemVindo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        InternalFrameBemVindo.setLayout(null);

        BotaoCadDoenca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Medical_bag_Icon_72.png"))); // NOI18N
        BotaoCadDoenca.setToolTipText("Doenças");
        BotaoCadDoenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadDoencaActionPerformed(evt);
            }
        });
        InternalFrameBemVindo.add(BotaoCadDoenca);
        BotaoCadDoenca.setBounds(10, 240, 80, 80);

        BotaoCadMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Doutor Icon 72.png"))); // NOI18N
        BotaoCadMed.setToolTipText("Médico");
        BotaoCadMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadMedActionPerformed(evt);
            }
        });
        InternalFrameBemVindo.add(BotaoCadMed);
        BotaoCadMed.setBounds(10, 60, 80, 80);

        BotaoCadPac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Age-Child-Male-Light-icon.png"))); // NOI18N
        BotaoCadPac.setToolTipText("Paciente");
        BotaoCadPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadPacActionPerformed(evt);
            }
        });
        InternalFrameBemVindo.add(BotaoCadPac);
        BotaoCadPac.setBounds(10, 150, 80, 80);

        Diagnostico.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        Diagnostico.setText("Diagnóstico");
        InternalFrameBemVindo.add(Diagnostico);
        Diagnostico.setBounds(180, 70, 70, 17);

        BotaoDiag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Diagnóstico.png"))); // NOI18N
        BotaoDiag.setToolTipText("Diagnóstico");
        BotaoDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDiagActionPerformed(evt);
            }
        });
        InternalFrameBemVindo.add(BotaoDiag);
        BotaoDiag.setBounds(160, 90, 100, 130);

        FecharBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Windows_Close_Program_Icon_32.png"))); // NOI18N
        FecharBemVindo.setToolTipText("Fechar Tela Bem-vindo");
        FecharBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharBemVindoActionPerformed(evt);
            }
        });
        InternalFrameBemVindo.add(FecharBemVindo);
        FecharBemVindo.setBounds(520, 0, 30, 30);

        FundoBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo BemVindo.jpg"))); // NOI18N
        InternalFrameBemVindo.add(FundoBemVindo);
        FundoBemVindo.setBounds(-20, 0, 626, 417);

        jInternalFrame1.getContentPane().add(InternalFrameBemVindo);
        InternalFrameBemVindo.setBounds(10, 0, 560, 350);

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(10, 10, 580, 380);

        FundoAcesso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo Principal.jpg"))); // NOI18N
        getContentPane().add(FundoAcesso);
        FundoAcesso.setBounds(0, -10, 600, 420);

        Cadastros.setText("Cadastros");

        CadMedico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        CadMedico.setText("Médico");
        CadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadMedicoActionPerformed(evt);
            }
        });
        Cadastros.add(CadMedico);

        Paciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        Paciente.setText("Paciente");
        Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PacienteActionPerformed(evt);
            }
        });
        Cadastros.add(Paciente);

        CadDoenca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        CadDoenca.setText("Doenças");
        CadDoenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadDoencaActionPerformed(evt);
            }
        });
        Cadastros.add(CadDoenca);

        jMenuBar1.add(Cadastros);

        Diagnósticos.setText("Diagnóstico");

        DiaMedico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        DiaMedico.setText("Médico");
        DiaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaMedicoActionPerformed(evt);
            }
        });
        Diagnósticos.add(DiaMedico);

        jMenuBar1.add(Diagnósticos);

        Ferramentas.setText("Ferramentas");

        BemVindo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        BemVindo.setText("Bem-Vindo");
        BemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BemVindoActionPerformed(evt);
            }
        });
        Ferramentas.add(BemVindo);

        jMenuBar1.add(Ferramentas);

        MenuSair.setText("Sair");
        MenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(618, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>                        
//Ação do botão cadastro de médicos
    private void BotaoCadMedActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if(telaMed==null){
            telaMed = new formMedico();
            telaMed.setVisible(true);
            telaMed.setResizable(false);
            
        }else{
            telaMed.setVisible(true);
            telaMed.setResizable(false);
            
        }


    }                                           
// Ação do botão Diagnóstico, ele traz o dianóstico na tela
    private void BotaoDiagActionPerformed(java.awt.event.ActionEvent evt) {                                          
try{
        conecta.executaSql("select * from medicos order by nome");
        JRResultSetDataSource diaResult = new JRResultSetDataSource(conecta.rs);
        JasperPrint JPrint = JasperFillManager.fillReport("controle.Ireport\\Diagnóstico Medico.jasper", new HashMap(), diaResult);
        JasperViewer JV = new JasperViewer(JPrint,false);
        JV.setVisible(true);
        JV.toFront();
 }
 catch(JRException ex){
     JOptionPane.showMessageDialog(null,"Erro ao chamar Relatório" +ex);
 }           
        
        
    }                                         

    private void FecharBemVindoActionPerformed(java.awt.event.ActionEvent evt) {                                               
        jInternalFrame1.dispose();
    }                                              

    private void BemVindoActionPerformed(java.awt.event.ActionEvent evt) {                                         
       jInternalFrame1.setVisible(true);
    }                                        

    private void CadMedicoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if(telaMed==null){
            telaMed = new formMedico();
            telaMed.setVisible(true);
            telaMed.setResizable(false);
            
        }else{
            telaMed.setVisible(true);
            telaMed.setResizable(false);
            
        } 


    }                                         

    private void MenuSairMouseClicked(java.awt.event.MouseEvent evt) {                                      
    System.exit(0);
    }                                     

    private void BotaoCadPacActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if(telaPac==null){
            telaPac = new formPaciente();
            telaPac.setVisible(true);
            telaPac.setResizable(false);
            
        }else{
            telaPac.setVisible(true);
            telaPac.setResizable(false);
            
        }

    }                                           

    private void PacienteActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(telaPac==null){
            telaPac = new formPaciente();
            telaPac.setVisible(true);
            telaPac.setResizable(false);
            
        }else{
            telaPac.setVisible(true);
            telaPac.setResizable(false);
            
        }
    }                                        

    private void BotaoCadDoencaActionPerformed(java.awt.event.ActionEvent evt) {                                               
        if(telaDoe==null){
            telaDoe = new formDoenca();
            telaDoe.setVisible(true);
            telaDoe.setResizable(false);
            
        }else{
            telaDoe.setVisible(true);
            telaDoe.setResizable(false);
            
        }
    }                                              

    private void CadDoencaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if(telaDoe==null){
            telaDoe = new formDoenca();
            telaDoe.setVisible(true);
            telaDoe.setResizable(false);
            
        }else{
            telaDoe.setVisible(true);
            telaDoe.setResizable(false);
            
        }
    }                                         

    private void DiaMedicoActionPerformed(java.awt.event.ActionEvent evt) {                                          
 try{
        conecta.executaSql("select * from medicos order by nome");
        JRResultSetDataSource diaResult = new JRResultSetDataSource(conecta.rs);
        JasperPrint JPrint = JasperFillManager.fillReport("C:\\Users\\Cliente\\Documents\\NetBeansProjects\\projetoDiagnostico\\src", new HashMap(), diaResult);
        JasperViewer JV = new JasperViewer(JPrint,false);
        JV.setVisible(true);
        JV.toFront();
 }
 catch(JRException ex){
     JOptionPane.showMessageDialog(null,"Erro ao chamar Relatório" +ex);
 }   
    }                                         

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new acesso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    public javax.swing.JMenuItem BemVindo;
    public javax.swing.JButton BotaoCadDoenca;
    public javax.swing.JButton BotaoCadMed;
    public javax.swing.JButton BotaoCadPac;
    public javax.swing.JButton BotaoDiag;
    public javax.swing.JLabel Cad;
    public javax.swing.JMenuItem CadDoenca;
    public javax.swing.JMenuItem CadMedico;
    public javax.swing.JMenu Cadastros;
    public javax.swing.JMenuItem DiaMedico;
    public javax.swing.JLabel Diagnostico;
    public javax.swing.JMenu Diagnósticos;
    public javax.swing.JButton FecharBemVindo;
    public javax.swing.JMenu Ferramentas;
    public javax.swing.JLabel FundoAcesso;
    public javax.swing.JLabel FundoBemVindo;
    public javax.swing.JPanel InternalFrameBemVindo;
    public javax.swing.JMenu MenuSair;
    public javax.swing.JMenuItem Paciente;
    public javax.swing.JLabel TituloBemVindo;
    public javax.swing.JInternalFrame jInternalFrame1;
    public javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration                   
}
