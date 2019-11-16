/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.champtech;

import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author natan_maia
 */
public class Produtos extends javax.swing.JFrame {

    private CardLayout cardLayoutGeral;

    /**
     * Creates new form Produtos
     */
    public Produtos() {
        initComponents();
        
        ImageIcon AddF = new ImageIcon("imgFunc.png");
        AddF.setImage(AddF.getImage().getScaledInstance(btAddF.getWidth(), btAddF.getHeight(), Image.SCALE_SMOOTH));
        btAddF.setIcon(AddF);
        
        ImageIcon Addi = new ImageIcon("Add.png");
        Addi.setImage(Addi.getImage().getScaledInstance(btAdd.getWidth(), btAdd.getHeight(), Image.SCALE_SMOOTH));
        btAdd.setIcon(Addi);
        
        ImageIcon BuscaF = new ImageIcon("btBuscaimg.png");
        BuscaF.setImage(BuscaF.getImage().getScaledInstance(btBuscaF.getWidth(), btBuscaF.getHeight(), Image.SCALE_SMOOTH));
        btBuscaF.setIcon(BuscaF); 
        
        ImageIcon Busca = new ImageIcon("btBuscaimg.png");
        Busca.setImage(Busca.getImage().getScaledInstance(btBusca.getWidth(), btBusca.getHeight(), Image.SCALE_SMOOTH));
        btBusca.setIcon(Busca);      

        ImageIcon logo = new ImageIcon("images/logo.png");
        logo.setImage(logo.getImage().getScaledInstance(logoLabel.getWidth(), logoLabel.getHeight(), Image.SCALE_SMOOTH));
        logoLabel.setIcon(logo);



        this.cardLayoutGeral = (CardLayout) PAI.getLayout();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBarPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        menuBarPanel1 = new javax.swing.JPanel();
        logoLabel1 = new javax.swing.JLabel();
        btHistorico = new javax.swing.JButton();
        btProdutos = new javax.swing.JButton();
        btFuncionario = new javax.swing.JButton();
        btAviso = new javax.swing.JButton();
        btConfiguracao = new javax.swing.JButton();
        windowBarPanel = new javax.swing.JPanel();
        windowCloseButton = new javax.swing.JButton();
        windowMinimizeButton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        PainelAcao = new javax.swing.JScrollPane();
        PAI = new javax.swing.JPanel();
        Avisos = new javax.swing.JPanel();
        txtAviso = new javax.swing.JLabel();
        Azul = new javax.swing.JPanel();
        Amarelo = new javax.swing.JPanel();
        Verde = new javax.swing.JPanel();
        Vermelho = new javax.swing.JPanel();
        Produtos = new javax.swing.JPanel();
        txtProdutos = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        ScrollPaneProdutos = new javax.swing.JScrollPane();
        TabelaProdutos = new javax.swing.JTable();
        btBusca = new javax.swing.JLabel();
        btAdd = new javax.swing.JLabel();
        Funcionarios = new javax.swing.JPanel();
        txtfuncionarios = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        btBuscaF = new javax.swing.JLabel();
        btAddF = new javax.swing.JLabel();
        Configuracoes = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Historico = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuBarPanel.setBackground(new java.awt.Color(51, 51, 51));
        menuBarPanel.setMinimumSize(new java.awt.Dimension(800, 80));
        menuBarPanel.setPreferredSize(new java.awt.Dimension(800, 80));
        menuBarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoLabel.setBackground(new java.awt.Color(255, 255, 255));
        menuBarPanel.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, 40));

        menuBarPanel1.setBackground(new java.awt.Color(51, 51, 51));
        menuBarPanel1.setMinimumSize(new java.awt.Dimension(800, 80));
        menuBarPanel1.setPreferredSize(new java.awt.Dimension(800, 80));
        menuBarPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoLabel1.setBackground(new java.awt.Color(255, 255, 255));
        menuBarPanel1.add(logoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, 40));

        btHistorico.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btHistorico.setForeground(new java.awt.Color(255, 255, 255));
        btHistorico.setText("Histórico");
        btHistorico.setBorder(null);
        btHistorico.setContentAreaFilled(false);
        btHistorico.setFocusPainted(false);
        btHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHistoricoActionPerformed(evt);
            }
        });
        menuBarPanel1.add(btHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 180, 40));

        btProdutos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btProdutos.setForeground(new java.awt.Color(255, 255, 255));
        btProdutos.setText("Produtos");
        btProdutos.setBorder(null);
        btProdutos.setContentAreaFilled(false);
        btProdutos.setFocusPainted(false);
        btProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProdutosActionPerformed(evt);
            }
        });
        menuBarPanel1.add(btProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 180, 40));

        btFuncionario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btFuncionario.setText("Funcionários");
        btFuncionario.setBorder(null);
        btFuncionario.setContentAreaFilled(false);
        btFuncionario.setFocusPainted(false);
        btFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncionarioActionPerformed(evt);
            }
        });
        menuBarPanel1.add(btFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 180, 40));

        btAviso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btAviso.setForeground(new java.awt.Color(255, 255, 255));
        btAviso.setText("Avisos");
        btAviso.setBorder(null);
        btAviso.setContentAreaFilled(false);
        btAviso.setFocusPainted(false);
        btAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAvisoActionPerformed(evt);
            }
        });
        menuBarPanel1.add(btAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 180, 40));

        btConfiguracao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btConfiguracao.setForeground(new java.awt.Color(255, 255, 255));
        btConfiguracao.setText("Configurações");
        btConfiguracao.setBorder(null);
        btConfiguracao.setContentAreaFilled(false);
        btConfiguracao.setFocusPainted(false);
        btConfiguracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfiguracaoActionPerformed(evt);
            }
        });
        menuBarPanel1.add(btConfiguracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 180, 40));

        menuBarPanel.add(menuBarPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 22, 230, 580));

        getContentPane().add(menuBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 22, 230, 580));

        windowBarPanel.setBackground(new java.awt.Color(0, 0, 0));
        windowBarPanel.setMinimumSize(new java.awt.Dimension(800, 22));
        windowBarPanel.setPreferredSize(new java.awt.Dimension(800, 22));
        windowBarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        windowCloseButton.setBackground(new java.awt.Color(204, 51, 0));
        windowCloseButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        windowCloseButton.setForeground(new java.awt.Color(255, 255, 255));
        windowCloseButton.setText("X");
        windowCloseButton.setBorder(null);
        windowCloseButton.setBorderPainted(false);
        windowCloseButton.setFocusPainted(false);
        windowCloseButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        windowCloseButton.setPreferredSize(new java.awt.Dimension(15, 13));
        windowCloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                windowCloseButtonMouseClicked(evt);
            }
        });
        windowBarPanel.add(windowCloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 5, -1, -1));

        windowMinimizeButton.setBackground(new java.awt.Color(255, 153, 0));
        windowMinimizeButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        windowMinimizeButton.setForeground(new java.awt.Color(255, 255, 255));
        windowMinimizeButton.setText("-");
        windowMinimizeButton.setBorder(null);
        windowMinimizeButton.setBorderPainted(false);
        windowMinimizeButton.setFocusPainted(false);
        windowMinimizeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        windowMinimizeButton.setPreferredSize(new java.awt.Dimension(15, 13));
        windowMinimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                windowMinimizeButtonMouseClicked(evt);
            }
        });
        windowMinimizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                windowMinimizeButtonActionPerformed(evt);
            }
        });
        windowBarPanel.add(windowMinimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 5, -1, -1));

        getContentPane().add(windowBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.setBackground(new java.awt.Color(102, 102, 102));
        mainPanel.setFocusable(false);
        mainPanel.setMaximumSize(new java.awt.Dimension(800, 600));
        mainPanel.setMinimumSize(new java.awt.Dimension(800, 600));
        mainPanel.setRequestFocusEnabled(false);
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelAcao.setBackground(new java.awt.Color(102, 102, 102));
        PainelAcao.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        PAI.setBackground(new java.awt.Color(153, 153, 153));
        PAI.setLayout(new java.awt.CardLayout());

        Avisos.setBackground(new java.awt.Color(255, 255, 255));
        Avisos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAviso.setFont(new java.awt.Font("Bookman Old Style", 1, 48)); // NOI18N
        txtAviso.setText("Avisos");
        txtAviso.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(51, 51, 51)));
        Avisos.add(txtAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        Azul.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout AzulLayout = new javax.swing.GroupLayout(Azul);
        Azul.setLayout(AzulLayout);
        AzulLayout.setHorizontalGroup(
            AzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        AzulLayout.setVerticalGroup(
            AzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        Avisos.add(Azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 244, -1));

        Amarelo.setBackground(new java.awt.Color(153, 153, 0));
        Amarelo.setPreferredSize(new java.awt.Dimension(230, 130));

        javax.swing.GroupLayout AmareloLayout = new javax.swing.GroupLayout(Amarelo);
        Amarelo.setLayout(AmareloLayout);
        AmareloLayout.setHorizontalGroup(
            AmareloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        AmareloLayout.setVerticalGroup(
            AmareloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        Avisos.add(Amarelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 300, 252, -1));

        Verde.setBackground(new java.awt.Color(0, 204, 0));
        Verde.setPreferredSize(new java.awt.Dimension(230, 130));

        javax.swing.GroupLayout VerdeLayout = new javax.swing.GroupLayout(Verde);
        Verde.setLayout(VerdeLayout);
        VerdeLayout.setHorizontalGroup(
            VerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );
        VerdeLayout.setVerticalGroup(
            VerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        Avisos.add(Verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 150, 252, -1));

        Vermelho.setBackground(new java.awt.Color(204, 0, 0));
        Vermelho.setPreferredSize(new java.awt.Dimension(230, 130));

        javax.swing.GroupLayout VermelhoLayout = new javax.swing.GroupLayout(Vermelho);
        Vermelho.setLayout(VermelhoLayout);
        VermelhoLayout.setHorizontalGroup(
            VermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );
        VermelhoLayout.setVerticalGroup(
            VermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        Avisos.add(Vermelho, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 244, -1));

        PAI.add(Avisos, "avisosCard");

        Produtos.setBackground(new java.awt.Color(255, 255, 255));
        Produtos.setPreferredSize(new java.awt.Dimension(566, 500));
        Produtos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtProdutos.setFont(new java.awt.Font("Vrinda", 0, 36)); // NOI18N
        txtProdutos.setText(" Produtos ");
        txtProdutos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Produtos.add(txtProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 11, 570, 31));

        txtBusca.setBackground(new java.awt.Color(204, 204, 204));
        Produtos.add(txtBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 260, -1));

        TabelaProdutos.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        TabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"AMD Ryzen 5 3600", "--",  new Double(500.0),  new Double(3.0)},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Ficha", "Preço R$", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TabelaProdutos.setGridColor(new java.awt.Color(204, 204, 204));
        ScrollPaneProdutos.setViewportView(TabelaProdutos);

        Produtos.add(ScrollPaneProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        btBusca.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btBuscaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBuscaMouseClicked(evt);
            }
        });
        Produtos.add(btBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 30, 30));

        btAdd.setText(" ");
        Produtos.add(btAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 30, 30));

        PAI.add(Produtos, "produtosCard");

        Funcionarios.setBackground(new java.awt.Color(255, 255, 255));
        Funcionarios.setPreferredSize(new java.awt.Dimension(566, 500));
        Funcionarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtfuncionarios.setFont(new java.awt.Font("Vrinda", 0, 36)); // NOI18N
        txtfuncionarios.setText(" Funcionários ");
        txtfuncionarios.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Funcionarios.add(txtfuncionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 570, 31));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        Funcionarios.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        Funcionarios.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 260, -1));

        btBuscaF.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btBuscaFAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btBuscaF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBuscaFMouseClicked(evt);
            }
        });
        Funcionarios.add(btBuscaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 30, 30));

        btAddF.setText(" ");
        Funcionarios.add(btAddF, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 30, 30));

        PAI.add(Funcionarios, "funcionariosCard");

        Configuracoes.setBackground(new java.awt.Color(255, 255, 255));
        Configuracoes.setPreferredSize(new java.awt.Dimension(566, 500));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Configuracoes");

        javax.swing.GroupLayout ConfiguracoesLayout = new javax.swing.GroupLayout(Configuracoes);
        Configuracoes.setLayout(ConfiguracoesLayout);
        ConfiguracoesLayout.setHorizontalGroup(
            ConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfiguracoesLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel3)
                .addContainerGap(217, Short.MAX_VALUE))
        );
        ConfiguracoesLayout.setVerticalGroup(
            ConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfiguracoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(530, Short.MAX_VALUE))
        );

        PAI.add(Configuracoes, "configCard");

        Historico.setBackground(new java.awt.Color(255, 255, 255));
        Historico.setPreferredSize(new java.awt.Dimension(566, 500));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Historico");

        javax.swing.GroupLayout HistoricoLayout = new javax.swing.GroupLayout(Historico);
        Historico.setLayout(HistoricoLayout);
        HistoricoLayout.setHorizontalGroup(
            HistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoricoLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );
        HistoricoLayout.setVerticalGroup(
            HistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoricoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(535, Short.MAX_VALUE))
        );

        PAI.add(Historico, "histCard");

        PainelAcao.setViewportView(PAI);

        mainPanel.add(PainelAcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 580));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 570, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void windowCloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowCloseButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_windowCloseButtonMouseClicked

    private void windowMinimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowMinimizeButtonMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_windowMinimizeButtonMouseClicked

    private void windowMinimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_windowMinimizeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_windowMinimizeButtonActionPerformed

    private void btAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvisoActionPerformed
        cardLayoutGeral.show(PAI, "avisosCard");
    }//GEN-LAST:event_btAvisoActionPerformed

    private void btFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncionarioActionPerformed
        cardLayoutGeral.show(PAI, "funcionariosCard");
    }//GEN-LAST:event_btFuncionarioActionPerformed

    private void btProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProdutosActionPerformed
        cardLayoutGeral.show(PAI, "produtosCard");
    }//GEN-LAST:event_btProdutosActionPerformed

    private void btConfiguracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfiguracaoActionPerformed
         cardLayoutGeral.show(PAI, "configCard");

    }//GEN-LAST:event_btConfiguracaoActionPerformed

    private void btHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHistoricoActionPerformed
         cardLayoutGeral.show(PAI, "histCard");
        
    }//GEN-LAST:event_btHistoricoActionPerformed

    private void btBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscaMouseClicked
       
    }//GEN-LAST:event_btBuscaMouseClicked

    private void btBuscaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btBuscaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btBuscaAncestorAdded

    private void btBuscaFAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btBuscaFAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btBuscaFAncestorAdded

    private void btBuscaFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscaFMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btBuscaFMouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produtos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Amarelo;
    private javax.swing.JPanel Avisos;
    private javax.swing.JPanel Azul;
    private javax.swing.JPanel Configuracoes;
    private javax.swing.JPanel Funcionarios;
    private javax.swing.JPanel Historico;
    private javax.swing.JPanel PAI;
    private javax.swing.JScrollPane PainelAcao;
    private javax.swing.JPanel Produtos;
    private javax.swing.JScrollPane ScrollPaneProdutos;
    private javax.swing.JTable TabelaProdutos;
    private javax.swing.JPanel Verde;
    private javax.swing.JPanel Vermelho;
    private javax.swing.JLabel btAdd;
    private javax.swing.JLabel btAddF;
    private javax.swing.JButton btAviso;
    private javax.swing.JLabel btBusca;
    private javax.swing.JLabel btBuscaF;
    private javax.swing.JButton btConfiguracao;
    private javax.swing.JButton btFuncionario;
    private javax.swing.JButton btHistorico;
    private javax.swing.JButton btProdutos;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel logoLabel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuBarPanel;
    private javax.swing.JPanel menuBarPanel1;
    private javax.swing.JLabel txtAviso;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JLabel txtProdutos;
    private javax.swing.JLabel txtfuncionarios;
    private javax.swing.JPanel windowBarPanel;
    private javax.swing.JButton windowCloseButton;
    private javax.swing.JButton windowMinimizeButton;
    // End of variables declaration//GEN-END:variables
}