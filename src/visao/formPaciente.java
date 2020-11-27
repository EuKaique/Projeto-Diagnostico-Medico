//Autor do software Kaique Oliveira
package visao;

import ModeloBeans.modeloTable;
import ModeloBeans.pacienteBeans;
import ModeloConecta.conexaoPG;
import ModeloDao.pacienteDao;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


public class formPaciente extends javax.swing.JFrame {

    conexaoPG conec = new conexaoPG();
    pacienteBeans paci = new pacienteBeans();
    pacienteDao dao = new pacienteDao();
    int flag=0;
    int resposta=0;
    
    public formPaciente() {
        initComponents();
        PreencherEstado();
        PreencherTabela("select p.codigo,p.nome,p.rg,p.telefone,e.nome from paciente p inner join estado e on p.cod_estado = e.codigo order by p.nome");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NomeP = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        RG = new javax.swing.JLabel();
        Telefone = new javax.swing.JLabel();
        Endereco = new javax.swing.JLabel();
        CampoRG = new javax.swing.JFormattedTextField();
        CampoEnd = new javax.swing.JFormattedTextField();
        Celular = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Paciente = new javax.swing.JTable();
        TituloTabP = new javax.swing.JLabel();
        DataNasc = new javax.swing.JLabel();
        CampoTelefone = new javax.swing.JFormattedTextField();
        CampoCelular = new javax.swing.JFormattedTextField();
        CampoDN = new javax.swing.JFormattedTextField();
        CEP = new javax.swing.JLabel();
        Estado = new javax.swing.JLabel();
        Complemento = new javax.swing.JLabel();
        ComboBoxEstado = new javax.swing.JComboBox<>();
        CampoCEP = new javax.swing.JFormattedTextField();
        CampoComplemento = new javax.swing.JTextField();
        BotaoAdicionar = new javax.swing.JButton();
        BotaoGuardar = new javax.swing.JButton();
        BotaoAlterar = new javax.swing.JButton();
        BotaoDeletar = new javax.swing.JButton();
        BotaoBuscar = new javax.swing.JButton();
        CampoBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        CampoIDPaci = new javax.swing.JTextField();
        TituloCadP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        NomeP.setText("Nome:");

        CampoNome.setEnabled(false);
        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });

        RG.setText("RG:");

        Telefone.setText("Telefone:");

        Endereco.setText("Endereço:");

        try {
            CampoRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoRG.setEnabled(false);

        CampoEnd.setEnabled(false);
        CampoEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEndActionPerformed(evt);
            }
        });

        Celular.setText("Celular:");

        Paciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Paciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Paciente);

        TituloTabP.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        TituloTabP.setForeground(new java.awt.Color(0, 102, 255));
        TituloTabP.setText("Pacientes Cadastrados");

        DataNasc.setText("Data de Nascimento:");

        try {
            CampoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoTelefone.setEnabled(false);

        try {
            CampoCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoCelular.setEnabled(false);
        CampoCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCelularActionPerformed(evt);
            }
        });

        try {
            CampoDN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoDN.setEnabled(false);

        CEP.setText("CEP:");

        Estado.setText("Estado:");

        Complemento.setText("Complemento:");

        ComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "São Paulo\t", "Rio de Janeiro", "Minas Gerais", "Rio Grande do Sul", "Paraná", "Santa Catarina", "Espirito Santo", "Bahia", "Alagoas", "Acre", "Mato Grosso", "Mato Grosso do Sul", "Pernambuco", "Maranhão", "Amazonas", "Goiás", "Pará", "Rondônia", "Roraima", "Rio Grande do Norte", "Tocantins", "Paraíba", "Sergipe" }));
        ComboBoxEstado.setEnabled(false);
        ComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxEstadoActionPerformed(evt);
            }
        });

        try {
            CampoCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoCEP.setEnabled(false);

        CampoComplemento.setEnabled(false);

        BotaoAdicionar.setText("Adicionar");
        BotaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAdicionarActionPerformed(evt);
            }
        });

        BotaoGuardar.setText("Guardar");
        BotaoGuardar.setEnabled(false);
        BotaoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGuardarActionPerformed(evt);
            }
        });

        BotaoAlterar.setText("Alterar");
        BotaoAlterar.setEnabled(false);
        BotaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarActionPerformed(evt);
            }
        });

        BotaoDeletar.setText("Deletar");
        BotaoDeletar.setEnabled(false);
        BotaoDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDeletarActionPerformed(evt);
            }
        });

        BotaoBuscar.setText("Buscar");
        BotaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        CampoIDPaci.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DataNasc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoDN, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CEP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Estado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Complemento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Endereco)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(CampoEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Telefone)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Celular)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(CampoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(BotaoDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BotaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(CampoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BotaoBuscar))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(BotaoAdicionar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BotaoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RG)
                                .addGap(76, 76, 76)
                                .addComponent(CampoRG))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NomeP)
                                .addGap(63, 63, 63)
                                .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoIDPaci, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TituloTabP)
                                .addGap(221, 221, 221))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeP)
                    .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(CampoIDPaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(RG)
                        .addGap(6, 6, 6)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataNasc)
                    .addComponent(CampoDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CEP)
                    .addComponent(CampoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Estado)
                    .addComponent(ComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Complemento)
                    .addComponent(CampoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Endereco)
                    .addComponent(CampoEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefone)
                    .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Celular)
                    .addComponent(CampoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoBuscar)
                    .addComponent(CampoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoAdicionar)
                    .addComponent(BotaoGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoDeletar)
                    .addComponent(BotaoAlterar))
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(TituloTabP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        TituloCadP.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        TituloCadP.setForeground(new java.awt.Color(51, 102, 255));
        TituloCadP.setText("Formulário dos Pacientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(363, 363, 363)
                .addComponent(TituloCadP, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloCadP)
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(972, 574));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    
    //Método para o preenchimento do Campo Estado.
    public void PreencherEstado(){
 
    conec.conexao();
    conec.executaSql("select * from estado order by estado_nome");
        try {
            conec.rs.first();
            ComboBoxEstado.removeAllItems();
            do{
                ComboBoxEstado.addItem(conec.rs.getString("estado_nome"));
            }while(conec.rs.next());
            
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao preencher Estados" +ex);
        }
    
    conec.desconectar();
    
} 
    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
    }                                         

    private void CampoEndActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }                                        

    private void CampoCelularActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
    }                                            

    private void BotaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        flag=2;
        
        CampoNome.setEnabled(true);
        CampoDN.setEnabled(true);
        CampoRG.setEnabled(true);
        CampoEnd.setEnabled(true);
        CampoCEP.setEnabled(true);
        CampoTelefone.setEnabled(true);
        CampoCelular.setEnabled(true);
        ComboBoxEstado.setEnabled(true);
        CampoComplemento.setEnabled(true);
        
        BotaoGuardar.setEnabled(true);
        BotaoAdicionar.setEnabled(false);
        BotaoAlterar.setEnabled(false);
        BotaoDeletar.setEnabled(false);
        
    }                                            

    private void BotaoGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                             
      if(CampoNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o Nome para salvar");
            CampoNome.requestFocus();
            }else if (CampoRG.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha seu RG para continuar");
            CampoRG.requestFocus(); 
            }else if (CampoDN.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha a data de nascimento para continuar");
            CampoDN.requestFocus();   
            }else if (CampoCEP.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o CEP para continuar");
            CampoCEP.requestFocus();
            }else if (CampoComplemento.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o Complemento para continuar");
            CampoComplemento.requestFocus();
            }else if (CampoEnd.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o Endereço para continuar");
            CampoEnd.requestFocus();
            }else if (CampoTelefone.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o número de Telefone para continuar");
            CampoTelefone.requestFocus();
            }else if (CampoCelular.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o número do celular para continuar");
            CampoCelular.requestFocus();       
       
        
        }else    
            
        if(flag==1){
        
      paci.setCEP(CampoCEP.getText());
      paci.setEndereço(CampoEnd.getText());
      paci.setEstadoNome((String) ComboBoxEstado.getSelectedItem());
      paci.setPaData(CampoDN.getText());
      paci.setPaNome(CampoNome.getText());
      paci.setRG(CampoRG.getText());
      paci.setTelefone(CampoTelefone.getText());
      dao.Guardar(paci);
      
      PreencherTabela("select p.codigo,p.nome,p.rg,p.telefone,e.nome from paciente p inner join estado e on p.cod_estado = e.codigo order by p.nome");
        
        
        CampoNome.setEnabled(!true);
        CampoDN.setEnabled(!true);
        CampoRG.setEnabled(!true);
        CampoEnd.setEnabled(!true);
        CampoCEP.setEnabled(!true);
        CampoTelefone.setEnabled(!true);
        CampoCelular.setEnabled(!true);
        ComboBoxEstado.setEnabled(!true);
        CampoComplemento.setEnabled(!true);
        
        BotaoGuardar.setEnabled(!true);
        BotaoAdicionar.setEnabled(!false);
        BotaoAlterar.setEnabled(false);
        BotaoDeletar.setEnabled(false);
        
        
        CampoNome.setText("");
        CampoRG.setText("");
        CampoDN.setText("");
        CampoEnd.setText("");
        CampoCEP.setText("");
        CampoTelefone.setText("");
        CampoCelular.setText("");
        ComboBoxEstado.setSelectedItem("");
        CampoComplemento.setText("");
      
      
        
    }else{
      paci.setCEP(CampoCEP.getText());
      paci.setEndereço(CampoEnd.getText());
      paci.setEstadoNome((String) ComboBoxEstado.getSelectedItem());
      paci.setPaData(CampoDN.getText());
      paci.setPaNome(CampoNome.getText());
      paci.setRG(CampoRG.getText());
      paci.setTelefone(CampoTelefone.getText());
      paci.setPaCod(Integer.parseInt(CampoIDPaci.getText()));
      dao.Alterar(paci);
      
      PreencherTabela("select p.codigo,e.nome,p.rg,p.telefone,e.nome from paciente p inner join estado e on p.cod_estado = e.codigo order by p.nome");
      
        
        CampoNome.setEnabled(!true);
        CampoDN.setEnabled(!true);
        CampoRG.setEnabled(!true);
        CampoEnd.setEnabled(!true);
        CampoCEP.setEnabled(!true);
        CampoTelefone.setEnabled(!true);
        CampoCelular.setEnabled(!true);
        ComboBoxEstado.setEnabled(!true);
        CampoComplemento.setEnabled(!true);
        
        BotaoGuardar.setEnabled(!true);
        BotaoAdicionar.setEnabled(!false);
        BotaoAlterar.setEnabled(false);
        BotaoDeletar.setEnabled(false);
        
        // Limpa os campos do formulário
        CampoNome.setText("");
        CampoRG.setText("");
        CampoDN.setText("");
        CampoEnd.setText("");
        CampoCEP.setText("");
        CampoTelefone.setText("");
        CampoCelular.setText("");
        ComboBoxEstado.setSelectedItem("");
        CampoComplemento.setText("");  
        
        
        
        }
    }                                            

    private void BotaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {                                               
        flag=1;
        //mostra ou não os campos se estiver verdadeiro ou falso.
        CampoNome.setEnabled(true);
        CampoDN.setEnabled(true);
        CampoRG.setEnabled(true);
        CampoEnd.setEnabled(true);
        CampoCEP.setEnabled(true);
        CampoTelefone.setEnabled(true);
        CampoCelular.setEnabled(true);
        ComboBoxEstado.setEnabled(true);
        CampoComplemento.setEnabled(true);
        
        BotaoGuardar.setEnabled(true);
        BotaoAdicionar.setEnabled(false);
        BotaoAlterar.setEnabled(false);
        BotaoDeletar.setEnabled(false);
    }                                              

    private void BotaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        paci.setBuscar(CampoBuscar.getText());
        pacienteBeans pac = dao.buscaPaciente(paci);
        
        CampoNome.setText(pac.getPaNome());
        CampoIDPaci.setText(String.valueOf(pac.getPaCod()));
        CampoRG.setText(pac.getRG());
        CampoDN.setText(pac.getPaData());
        CampoTelefone.setText(pac.getTelefone());
        CampoCEP.setText(pac.getCEP());
        CampoEnd.setText(pac.getEndereço());
        ComboBoxEstado.setSelectedItem(pac.getEstadoNome());
        
        
        CampoNome.setEnabled(!true);
        CampoDN.setEnabled(!true);
        CampoRG.setEnabled(!true);
        CampoEnd.setEnabled(!true);
        CampoCEP.setEnabled(!true);
        CampoTelefone.setEnabled(!true);
        CampoCelular.setEnabled(!true);
        ComboBoxEstado.setEnabled(!true);
        CampoComplemento.setEnabled(!true);
        
        BotaoGuardar.setEnabled(!true);
        BotaoAdicionar.setEnabled(false);
        BotaoAlterar.setEnabled(!false);
        BotaoDeletar.setEnabled(!false);
        
        
        
    }                                           

    private void ComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
    }                                              

    private void BotaoDeletarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja realmente excluir o Paciente?");
        if(resposta==JOptionPane.YES_OPTION){
        paci.setPaCod(Integer.parseInt(CampoIDPaci.getText()));
        dao.Deletar(paci);   
        
        PreencherTabela("select codigo,nome,rg,telefone,e.nome from paciente p inner join estado e on p.cod_estado = e.codigo order by p.nome");
        
       
        CampoNome.setEnabled(!true);
        CampoDN.setEnabled(!true);
        CampoRG.setEnabled(!true);
        CampoEnd.setEnabled(!true);
        CampoCEP.setEnabled(!true);
        CampoTelefone.setEnabled(!true);
        CampoCelular.setEnabled(!true);
        ComboBoxEstado.setEnabled(!true);
        CampoComplemento.setEnabled(!true);
        
        BotaoGuardar.setEnabled(true);
        BotaoAdicionar.setEnabled(!false);
        BotaoAlterar.setEnabled(false);
        BotaoDeletar.setEnabled(false);
        
        
        CampoNome.setText("");
        CampoRG.setText("");
        CampoDN.setText("");
        CampoEnd.setText("");
        CampoCEP.setText("");
        CampoTelefone.setText("");
        CampoCelular.setText("");
        ComboBoxEstado.setSelectedItem("");
        CampoComplemento.setText("");
        
        }
    }
        //Método que preenche a tabela e a mostra no Software
    public void PreencherTabela(String Sql){
        ArrayList Dados = new ArrayList();
        String [] coluna = new String []{"ID","Nome","RG","Telefone","Estado"};
        conec.conexao();
        conec.executaSql(Sql);
        try{
            conec.rs.first();
            do{
            Dados.add(new Object[]{conec.rs.getInt("codigo"),conec.rs.getString("nome"),conec.rs.getString("rg"),conec.rs.getString("telefone"),conec.rs.getString("nome")});
            
            }while(conec.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane,"Busque novamente por um outro nome"+ex);
            
        }
        modeloTable tab = new modeloTable(Dados,coluna);
        
        Paciente.setModel(tab);
        Paciente.getColumnModel().getColumn(0).setPreferredWidth(40);
        Paciente.getColumnModel().getColumn(0).setResizable(false);
        Paciente.getColumnModel().getColumn(1).setPreferredWidth(140);
        Paciente.getColumnModel().getColumn(1).setResizable(false);
        Paciente.getColumnModel().getColumn(2).setPreferredWidth(80);
        Paciente.getColumnModel().getColumn(2).setResizable(false);
        Paciente.getColumnModel().getColumn(3).setPreferredWidth(100);
        Paciente.getColumnModel().getColumn(3).setResizable(false);
        Paciente.getColumnModel().getColumn(4).setPreferredWidth(132);
        Paciente.getColumnModel().getColumn(4).setResizable(false);
        Paciente.getTableHeader().setReorderingAllowed(false);
        Paciente.setAutoResizeMode(Paciente.AUTO_RESIZE_OFF);
        Paciente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        conec.desconectar();
    
        
    }                                            
//Acção do mouse que, quando um paciente é clicado os seus dados são mostrados no formulário
    private void PacienteMouseClicked(java.awt.event.MouseEvent evt) {                                      
        String nome = ""+Paciente.getValueAt(Paciente.getSelectedRow(), 1);
        conec.conexao();
        conec.executaSql("select *from pacientes where paciente_nome='"+nome+"'");
        try {
            conec.rs.first();
            CampoIDPaci.setText(String.valueOf(conec.rs.getInt("codigo")));
            CampoNome.setText(conec.rs.getString("nome"));
            CampoRG.setText(conec.rs.getString("rg"));
            CampoTelefone.setText(conec.rs.getString("telefone"));
            CampoDN.setText(conec.rs.getString("data_nasc"));
            CampoCEP.setText(conec.rs.getString("cep"));
            CampoEnd.setText(conec.rs.getString("endereco"));
            
            conexaoPG conectaBusca = new conexaoPG();
            conectaBusca.conexao();
            conectaBusca.executaSql("select * from estado where cod_estado="+conec.rs.getInt("cod_estado"));
            conectaBusca.rs.first();
            ComboBoxEstado.setSelectedItem(conectaBusca.rs.getString("nome"));
            conectaBusca.desconectar();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao mostrar Dados");
        }
        conec.desconectar();
        BotaoAlterar.setEnabled(true);
        BotaoDeletar.setEnabled(true);
        
        
    }                                     

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    public javax.swing.JButton BotaoAdicionar;
    public javax.swing.JButton BotaoAlterar;
    public javax.swing.JButton BotaoBuscar;
    public javax.swing.JButton BotaoDeletar;
    public javax.swing.JButton BotaoGuardar;
    public javax.swing.JLabel CEP;
    public javax.swing.JTextField CampoBuscar;
    public javax.swing.JFormattedTextField CampoCEP;
    public javax.swing.JFormattedTextField CampoCelular;
    public javax.swing.JTextField CampoComplemento;
    public javax.swing.JFormattedTextField CampoDN;
    public javax.swing.JFormattedTextField CampoEnd;
    public javax.swing.JTextField CampoIDPaci;
    public javax.swing.JTextField CampoNome;
    public javax.swing.JFormattedTextField CampoRG;
    public javax.swing.JFormattedTextField CampoTelefone;
    public javax.swing.JLabel Celular;
    public javax.swing.JComboBox<String> ComboBoxEstado;
    public javax.swing.JLabel Complemento;
    public javax.swing.JLabel DataNasc;
    public javax.swing.JLabel Endereco;
    public javax.swing.JLabel Estado;
    public javax.swing.JLabel NomeP;
    public javax.swing.JTable Paciente;
    public javax.swing.JLabel RG;
    public javax.swing.JLabel Telefone;
    public javax.swing.JLabel TituloCadP;
    public javax.swing.JLabel TituloTabP;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
