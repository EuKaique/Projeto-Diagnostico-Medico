//Autor do software Kaique Oliveira
package visao;

import ModeloBeans.doencaBeans;
import ModeloBeans.modeloTable;
import ModeloConecta.conexaoPG;
import ModeloDao.doencaDao;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

//A classe herda os recursos do JFrame, através do "extends"
public class formDoenca extends javax.swing.JFrame {
    
    conexaoPG conec = new conexaoPG();
    doencaBeans bea = new doencaBeans();
    doencaDao dao = new doencaDao();
    int flag=0;
    int Resposta=0;
    public formDoenca() {
        initComponents();
        PreencherTabela("select * from doencas order by nome");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        TituloDoenca = new javax.swing.JLabel();
        BotaoSalvarDoe = new javax.swing.JButton();
        BotaoExcluirDo = new javax.swing.JButton();
        NomeDoe = new javax.swing.JLabel();
        CampoNomeDoe = new javax.swing.JTextField();
        CodigoDoe = new javax.swing.JLabel();
        CampoCodigoDoe = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Doencas = new javax.swing.JTable();
        Informacoes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaInfo = new javax.swing.JTextArea();
        CampoProcurar = new javax.swing.JTextField();
        BotaoProcurar = new javax.swing.JButton();
        BotaoEdiDoenca = new javax.swing.JButton();
        BotaoNova = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TituloDoenca.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        TituloDoenca.setForeground(new java.awt.Color(0, 102, 255));
        TituloDoenca.setText("Cadastro das Doenças CID10");

        BotaoSalvarDoe.setText("Salvar");
        BotaoSalvarDoe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarDoeActionPerformed(evt);
            }
        });

        BotaoExcluirDo.setText("Excluir");
        BotaoExcluirDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirDoActionPerformed(evt);
            }
        });

        NomeDoe.setText("Nome:");

        CampoNomeDoe.setEnabled(false);

        CodigoDoe.setText("Código:");

        CampoCodigoDoe.setEnabled(false);

        Doencas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Doencas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoencasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Doencas);

        Informacoes.setText("Informações:");

        AreaInfo.setColumns(20);
        AreaInfo.setRows(5);
        AreaInfo.setEnabled(false);
        jScrollPane2.setViewportView(AreaInfo);

        BotaoProcurar.setText("Procurar");
        BotaoProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProcurarActionPerformed(evt);
            }
        });

        BotaoEdiDoenca.setText("Editar");
        BotaoEdiDoenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEdiDoencaActionPerformed(evt);
            }
        });

        BotaoNova.setText("Nova");
        BotaoNova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CampoProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoProcurar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(BotaoNova, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotaoSalvarDoe)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotaoExcluirDo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotaoEdiDoenca)
                                        .addGap(184, 184, 184))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(TituloDoenca)
                                        .addGap(179, 179, 179))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Informacoes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jScrollPane2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NomeDoe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoNomeDoe, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(CodigoDoe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoCodigoDoe, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(TituloDoenca)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeDoe)
                    .addComponent(CampoNomeDoe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodigoDoe)
                    .addComponent(CampoCodigoDoe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Informacoes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoProcurar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoSalvarDoe)
                    .addComponent(BotaoExcluirDo)
                    .addComponent(BotaoEdiDoenca)
                    .addComponent(BotaoNova))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(721, 687));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void BotaoProcurarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        //Ação do Botão Procurar, com todos os seus parâmetros
        bea.setProcurar(CampoProcurar.getText());
        doencaBeans doe = dao.procurarDoenca(bea);
        
        CampoCodigoDoe.setText(String.valueOf(doe.getCodigo()));
        CampoNomeDoe.setText(doe.getNome());
        AreaInfo.setText(doe.getInformacoes());
       //Query que busca no banco o método invocado
        PreencherTabela("select * from doencas where nome like'%"+bea.getProcurar()+"%'"); 
        
        CampoNomeDoe.setEnabled(!true);
        AreaInfo.setEnabled(!true);
        
        BotaoSalvarDoe.setEnabled(!true);
        BotaoNova.setEnabled(false);
        BotaoEdiDoenca.setEnabled(!false);
        BotaoExcluirDo.setEnabled(!false);
        
        
    }                                             

    private void BotaoSalvarDoeActionPerformed(java.awt.event.ActionEvent evt) {                                               
        if(CampoNomeDoe.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o Nome para salvar");
            CampoNomeDoe.requestFocus();
        }else if (AreaInfo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"escreva informações para salvar");
            AreaInfo.requestFocus();
        }else
            
        
        if(flag==1){
        bea.setNome(CampoNomeDoe.getText());
        bea.setInformacoes(AreaInfo.getText());
        bea.setCodigo(Integer.parseInt(CampoCodigoDoe.getText()));
        dao.Salvar(bea);
        
        PreencherTabela("select * from doencas order by nome");
        
        //CampoCodigoDoe.setEnabled(false);
        CampoNomeDoe.setEnabled(false);
        AreaInfo.setEnabled(!false);
        
        BotaoSalvarDoe.setEnabled(false);
        BotaoNova.setEnabled(true);
        BotaoEdiDoenca.setEnabled(true);
        BotaoExcluirDo.setEnabled(true);
       
        CampoNomeDoe.setText("");
        //AreaInfo.setText("");
        //CampoCodigoDoe.setText("");
        
        }else{
            bea.setNome(CampoNomeDoe.getText());
            bea.setInformacoes(AreaInfo.getText());
            bea.setCodigo(Integer.parseInt(CampoCodigoDoe.getText()));
            dao.Editar(bea);
            
            PreencherTabela("select * from doencas order by nome");
            
            CampoNomeDoe.setEnabled(false);
            AreaInfo.setEnabled(true);
            
            BotaoEdiDoenca.setEnabled(false);
            BotaoExcluirDo.setEnabled(false);
            BotaoNova.setEnabled(false);
            BotaoSalvarDoe.setEnabled(true);
            dao.Editar(bea);
            
            CampoNomeDoe.setText("");
            //AreaInfo.setText("");
            
        }
        
        
    }                                              

    private void BotaoEdiDoencaActionPerformed(java.awt.event.ActionEvent evt) {                                               
        flag=2;
        
        CampoNomeDoe.setEnabled(true);
        AreaInfo.setEnabled(true);
        CampoCodigoDoe.setEnabled(true);
        
        BotaoSalvarDoe.setEnabled(true);
        BotaoNova.setEnabled(false);
        BotaoExcluirDo.setEnabled(false);
        BotaoEdiDoenca.setEnabled(false);
        
        
    }                                              

    private void BotaoNovaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        flag=1;
        
        CampoNomeDoe.setEnabled(true);
        AreaInfo.setEnabled(true);
        BotaoSalvarDoe.setEnabled(true);
        CampoCodigoDoe.setEnabled(true);
        //AreaInfo.setText("");
        //CampoNomeDoe.setText("");
        BotaoEdiDoenca.setEnabled(false);
        BotaoExcluirDo.setEnabled(false);
        CampoProcurar.setEnabled(false);
        BotaoProcurar.setEnabled(false);
        //CampoNomeDoe.setText("");
        AreaInfo.setText("");
        //CampoCodigoDoe.setText("");
        //CampoProcurar.setText("");
        
    }                                         

    private void BotaoExcluirDoActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
        Resposta = JOptionPane.showConfirmDialog(rootPane,"Tem Certeza que quer excluir os dados?");
        if(Resposta ==JOptionPane.YES_OPTION){
            bea.setCodigo(Integer.parseInt(CampoCodigoDoe.getText()));
            dao.Excluir(bea); 
            
        PreencherTabela("select * from doencas order by nome");
        
        
        
        CampoNomeDoe.setEnabled(!true);
        AreaInfo.setEnabled(!true);
        
        BotaoSalvarDoe.setEnabled(true);
        BotaoNova.setEnabled(!false);
        BotaoEdiDoenca.setEnabled(false);
        BotaoExcluirDo.setEnabled(false);
        
        CampoNomeDoe.setText("");
        AreaInfo.setText("");
        
        }
    }                                              

    private void DoencasMouseClicked(java.awt.event.MouseEvent evt) {                                     
        String nome = ""+Doencas.getValueAt(Doencas.getSelectedRow(), 0);
        conec.conexao();
        conec.executaSql("select *from doencas where nome='"+nome+"'");
        try {
            conec.rs.first();
            CampoNomeDoe.setText(conec.rs.getString("nome"));
            CampoCodigoDoe.setText(String.valueOf(conec.rs.getInt("codigo")));
            AreaInfo.setText(conec.rs.getString("informacoes"));
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao mostrar Dados"+ex);
        }
        conec.desconectar();
        BotaoEdiDoenca.setEnabled(true);
        BotaoExcluirDo.setEnabled(true);
    }                                    

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formDoenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formDoenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formDoenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formDoenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formDoenca().setVisible(true);
            }
        });
    }
public void PreencherTabela(String Sql){
        ArrayList Dados = new ArrayList();
        String [] coluna = new String []{"Nome","ID","Descrição"};
        conec.conexao();
        conec.executaSql(Sql);
        try{
            conec.rs.first();
            do{
            Dados.add(new Object[]{conec.rs.getString("nome"),conec.rs.getInt("codigo"),conec.rs.getString("informacoes")});
            
            }while(conec.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane,"Busque novamente por um outra Doença"+ex);
            
        }
        modeloTable tab = new modeloTable(Dados,coluna);
        
        Doencas.setModel(tab);
        Doencas.getColumnModel().getColumn(0).setPreferredWidth(200);
        Doencas.getColumnModel().getColumn(0).setResizable(false);
        Doencas.getColumnModel().getColumn(1).setPreferredWidth(45);
        Doencas.getColumnModel().getColumn(1).setResizable(false);
        Doencas.getColumnModel().getColumn(2).setPreferredWidth(343);
        Doencas.getColumnModel().getColumn(2).setResizable(false);
        Doencas.getTableHeader().setReorderingAllowed(false);
        Doencas.setAutoResizeMode(Doencas.AUTO_RESIZE_OFF);
        Doencas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        conec.desconectar();
    }
    
    // Variables declaration - do not modify                     
    public javax.swing.JTextArea AreaInfo;
    public javax.swing.JButton BotaoEdiDoenca;
    public javax.swing.JButton BotaoExcluirDo;
    public javax.swing.JButton BotaoNova;
    public javax.swing.JButton BotaoProcurar;
    public javax.swing.JButton BotaoSalvarDoe;
    public javax.swing.JTextField CampoCodigoDoe;
    public javax.swing.JTextField CampoNomeDoe;
    public javax.swing.JTextField CampoProcurar;
    public javax.swing.JLabel CodigoDoe;
    public javax.swing.JTable Doencas;
    public javax.swing.JLabel Informacoes;
    public javax.swing.JLabel NomeDoe;
    public javax.swing.JLabel TituloDoenca;
    public javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JFrame jFrame1;
    public javax.swing.JMenu jMenu1;
    public javax.swing.JMenuItem jMenuItem1;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration                   
}