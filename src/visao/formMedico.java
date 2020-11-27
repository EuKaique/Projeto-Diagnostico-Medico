//Autor do software Kaique Oliveira
package visao;

import ModeloConecta.conexaoPG;
import ModeloDao.medicoDao;
import ModeloBeans.medicoBeans;
import ModeloBeans.modeloTable;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


public class formMedico extends javax.swing.JFrame {

    medicoBeans model = new medicoBeans();
    medicoDao control = new medicoDao();
    conexaoPG conec = new conexaoPG();
    int flag =0;
    
    public formMedico() {
        initComponents();
        PreencherTab("select * from medicos order by nome");
    }

    //aqui são gerados todos os atributos visíveis do código
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        NomeMed = new javax.swing.JLabel();
        CRM = new javax.swing.JLabel();
        Especialista = new javax.swing.JLabel();
        ComboBoxEspecialista = new javax.swing.JComboBox<>();
        FormattedNomeMed = new javax.swing.JFormattedTextField();
        FormattedCRM = new javax.swing.JFormattedTextField();
        BotaoSalvar = new javax.swing.JButton();
        BotaoCancelar = new javax.swing.JButton();
        BotaoEditar = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Medicos = new javax.swing.JTable();
        Pesquisa = new javax.swing.JTextField();
        BotaoPesquisar = new javax.swing.JButton();
        MedicoID = new javax.swing.JLabel();
        CampoMedicoID = new javax.swing.JTextField();
        BotaoNovo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        NomeMed.setText("Nome:");

        CRM.setText("CRM:");

        Especialista.setText("Especialista:");

        ComboBoxEspecialista.setBackground(new java.awt.Color(0, 153, 255));
        ComboBoxEspecialista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiologia\t\t", "Pediatria\t", "Radioterapia", "Cirurgia Geral" }));
        ComboBoxEspecialista.setEnabled(false);
        ComboBoxEspecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxEspecialistaActionPerformed(evt);
            }
        });

        FormattedNomeMed.setEnabled(false);

        FormattedCRM.setEnabled(false);

        BotaoSalvar.setBackground(new java.awt.Color(0, 153, 255));
        BotaoSalvar.setText("Salvar");
        BotaoSalvar.setEnabled(false);
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });

        BotaoCancelar.setBackground(new java.awt.Color(0, 153, 255));
        BotaoCancelar.setText("Cancelar");
        BotaoCancelar.setEnabled(false);
        BotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarActionPerformed(evt);
            }
        });

        BotaoEditar.setBackground(new java.awt.Color(0, 153, 255));
        BotaoEditar.setText("Editar");
        BotaoEditar.setEnabled(false);
        BotaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEditarActionPerformed(evt);
            }
        });

        BotaoExcluir.setBackground(new java.awt.Color(0, 153, 255));
        BotaoExcluir.setText("Excluir");
        BotaoExcluir.setEnabled(false);
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        Medicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Medicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MedicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Medicos);

        Pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisaActionPerformed(evt);
            }
        });

        BotaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        BotaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPesquisarActionPerformed(evt);
            }
        });

        MedicoID.setText("ID:");

        CampoMedicoID.setEnabled(false);
        CampoMedicoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoMedicoIDActionPerformed(evt);
            }
        });

        BotaoNovo.setBackground(new java.awt.Color(0, 153, 255));
        BotaoNovo.setText("Novo");
        BotaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BotaoCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(BotaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CRM)
                                    .addComponent(BotaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Pesquisa)
                                    .addComponent(FormattedCRM, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(NomeMed)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(MedicoID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FormattedNomeMed, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CampoMedicoID, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(Especialista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxEspecialista, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NomeMed)
                            .addComponent(FormattedNomeMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxEspecialista, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Especialista)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotaoNovo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MedicoID)
                            .addComponent(CampoMedicoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CRM)
                            .addComponent(FormattedCRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotaoSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoExcluir)
                        .addContainerGap(372, Short.MAX_VALUE))))
        );

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Cadastro dos Médicos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(242, 242, 242))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(757, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                             
        int Responder=0;
        Responder = JOptionPane.showConfirmDialog(rootPane,"Tem Certeza que quer excluir os dados?");
        if(Responder ==JOptionPane.YES_OPTION){
            model.setCodigo(Integer.parseInt(CampoMedicoID.getText()));
            control.Excluir(model);
        FormattedNomeMed.setText("");
        FormattedCRM.setText("");
        CampoMedicoID.setText("");
        FormattedNomeMed.setEnabled(false);
        FormattedCRM.setEnabled(false);
        ComboBoxEspecialista.setEnabled(false);
        BotaoSalvar.setEnabled(false);
        BotaoCancelar.setEnabled(false);
        CampoMedicoID.setEnabled(false);
        PreencherTab("select * from medicos order by nome");
        }
    }                                            

    private void BotaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {                                               
        model.setPesquisa(Pesquisa.getText());
        medicoBeans med = control.BuscarMedico(model);
        CampoMedicoID.setText(String.valueOf(med.getCodigo()));
        FormattedNomeMed.setText(med.getNome());
        FormattedCRM.setText(String.valueOf(med.getCRM()));
        ComboBoxEspecialista.setSelectedItem(med.getEspecialista());
       
        PreencherTab("select * from medicos where nome like'%"+model.getPesquisa()+"%'");
    }                                              

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if(FormattedNomeMed.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o Nome para salvar");
            FormattedNomeMed.requestFocus();
        }else if (FormattedCRM.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o CRM para salvar");
            FormattedCRM.requestFocus();
        }else
            
        
        if(flag==1){
        model.setNome(FormattedNomeMed.getText());
        model.setEspecialista((String) ComboBoxEspecialista.getSelectedItem());
        model.setCRM(Integer.parseInt(FormattedCRM.getText()));
        control.Salvar(model);
        FormattedNomeMed.setText("");
        FormattedCRM.setText("");
        CampoMedicoID.setText("");
        FormattedNomeMed.setEnabled(false);
        FormattedCRM.setEnabled(false);
        CampoMedicoID.setEnabled(false);
        ComboBoxEspecialista.setEnabled(false);
        BotaoSalvar.setEnabled(false);
        BotaoCancelar.setEnabled(true);
        BotaoNovo.setEnabled(true);
        BotaoCancelar.setEnabled(true);
        BotaoEditar.setEnabled(true);
        BotaoExcluir.setEnabled(true);
        
        PreencherTab("select * from medicos order by nome");
        }else{
            model.setCodigo((Integer.parseInt(CampoMedicoID.getText())));
            model.setNome(FormattedNomeMed.getText());
            model.setEspecialista((String)ComboBoxEspecialista.getSelectedItem());
            model.setCRM(Integer.parseInt(FormattedCRM.getText()));
            control.Editar(model);
            FormattedNomeMed.setText("");
            CampoMedicoID.setText("");
            FormattedCRM.setText("");
            FormattedNomeMed.setEnabled(false);
            FormattedCRM.setEnabled(false);
            ComboBoxEspecialista.setEnabled(false);
            BotaoCancelar.setEnabled(false);
            BotaoSalvar.setEnabled(false);
            PreencherTab("select * from medicos order by nome");
        }
        
    }                                           

    private void ComboBoxEspecialistaActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void BotaoEditarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        flag=2;
        FormattedNomeMed.setEnabled(true);
        FormattedCRM.setEnabled(true);
        CampoMedicoID.setEnabled(true);
        ComboBoxEspecialista.setEnabled(true);
        BotaoSalvar.setEnabled(true);
        BotaoCancelar.setEnabled(true);
        BotaoNovo.setEnabled(false);
        BotaoExcluir.setEnabled(false);
        BotaoEditar.setEnabled(false);
        PreencherTab("select * from medicos order by nome");
        
    }                                           

    private void CampoMedicoIDActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void PesquisaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }                                        

    private void BotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        FormattedNomeMed.setEnabled(!true);
        FormattedCRM.setEnabled(!true);
        ComboBoxEspecialista.setEnabled(!true);
        BotaoNovo.setEnabled(true);
        BotaoSalvar.setEnabled(false);
        BotaoEditar.setEnabled(false);
        BotaoExcluir.setEnabled(false);
        BotaoCancelar.setEnabled(false);
        Pesquisa.setEnabled(true);
        CampoMedicoID.setText("");
        FormattedNomeMed.setText("");
        FormattedCRM.setText("");
        Pesquisa.setEnabled(true);
        BotaoPesquisar.setEnabled(true);
        
    }                                             

    private void BotaoNovoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        flag=1;
        FormattedNomeMed.setEnabled(true);
        FormattedCRM.setEnabled(true);
        ComboBoxEspecialista.setEnabled(true);
        BotaoSalvar.setEnabled(true);
        BotaoCancelar.setEnabled(true);
        CampoMedicoID.setText("");
        FormattedNomeMed.setText("");
        FormattedCRM.setText("");
        BotaoEditar.setEnabled(false);
        BotaoExcluir.setEnabled(false);
        Pesquisa.setEnabled(false);
        BotaoPesquisar.setEnabled(false);
        CampoMedicoID.setText("");
        FormattedNomeMed.setText("");
        FormattedCRM.setText("");
        Pesquisa.setText("");
        
    }                                         

    private void MedicosMouseClicked(java.awt.event.MouseEvent evt) {                                     
        String nome = ""+Medicos.getValueAt(Medicos.getSelectedRow(), 0);
        conec.conexao();
        conec.executaSql("select *from medicos where nome='"+nome+"'");
        try {
            conec.rs.first();
            CampoMedicoID.setText(String.valueOf(conec.rs.getInt("codigo")));
            FormattedNomeMed.setText(conec.rs.getString("nome_med"));
            ComboBoxEspecialista.setSelectedItem(conec.rs.getString("especialidade"));
            FormattedCRM.setText(conec.rs.getString("crm"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao selecionar os Dados");
        }
        conec.desconectar();
        BotaoEditar.setEnabled(true);
        BotaoExcluir.setEnabled(true);
        
    }                                    

    public void PreencherTab(String Sql){
        ArrayList Dados = new ArrayList();
        String [] coluna = new String []{"Nome","CRM","ID","Especialista"};
        conec.conexao();
        conec.executaSql(Sql);
        try{
            conec.rs.first();
            do{
            Dados.add(new Object[]{conec.rs.getString("nome"),conec.rs.getInt("crm"),conec.rs.getInt("codigo"),conec.rs.getString("especialidade")});
            
            }while(conec.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane,"Busque novamente por um outro nome");
            
        }
        modeloTable tab = new modeloTable(Dados,coluna);
        
        Medicos.setModel(tab);
        Medicos.getColumnModel().getColumn(0).setPreferredWidth(220);
        Medicos.getColumnModel().getColumn(0).setResizable(false);
        Medicos.getColumnModel().getColumn(2).setPreferredWidth(60);
        Medicos.getColumnModel().getColumn(2).setResizable(false);
        Medicos.getColumnModel().getColumn(1).setPreferredWidth(60);
        Medicos.getColumnModel().getColumn(1).setResizable(false);
        Medicos.getColumnModel().getColumn(3).setPreferredWidth(110);
        Medicos.getColumnModel().getColumn(3).setResizable(false);
        Medicos.getTableHeader().setReorderingAllowed(false);
        Medicos.setAutoResizeMode(Medicos.AUTO_RESIZE_OFF);
        Medicos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        conec.desconectar();
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    public javax.swing.JButton BotaoCancelar;
    public javax.swing.JButton BotaoEditar;
    public javax.swing.JButton BotaoExcluir;
    public javax.swing.JButton BotaoNovo;
    public javax.swing.JButton BotaoPesquisar;
    public javax.swing.JButton BotaoSalvar;
    public javax.swing.JLabel CRM;
    public javax.swing.JTextField CampoMedicoID;
    public javax.swing.JComboBox<String> ComboBoxEspecialista;
    public javax.swing.JLabel Especialista;
    public javax.swing.JFormattedTextField FormattedCRM;
    public javax.swing.JFormattedTextField FormattedNomeMed;
    public javax.swing.JLabel MedicoID;
    public javax.swing.JTable Medicos;
    public javax.swing.JLabel NomeMed;
    public javax.swing.JTextField Pesquisa;
    public javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
