package br.com.champtech.view.cliente;

import br.com.champtech.CustomIcon;
import br.com.champtech.db.ConnectionFactory;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

/*
 * @author denis_stiehler
 */
public final class Home extends JPanel implements CustomIcon {

    private static final String bannerFileName = "images/natal.png";
    private static final String bordaFileName = "images/natalino.png";

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setVisible(false);
    }

    @Override
    public void loadIcons() {

        ImageIcon banner = new ImageIcon(bannerFileName);
        bannerLbl.setIcon(banner);

        // carrega a borda dos produtos.
        ImageIcon bordaIcon = new ImageIcon(bordaFileName);
        bordaIcon.setImage(bordaIcon.getImage().getScaledInstance(bordaLbl1.getWidth(), Home.bordaLbl1.getHeight(), 4));
        bordaLbl1.setIcon(bordaIcon);
        bordaLbl2.setIcon(bordaIcon);
        bordaLbl3.setIcon(bordaIcon);
        /*
        // AINDA ESTÁTICO, FUTURAMENTE CARREGARÁ DO BANCO!
        // carrega a imagem dos produtos de forma "assíncrona"
        CompletableFuture.runAsync(() -> {

            ImageIcon p1 = new ImageIcon("images/p1.jpg");
            p1.setImage(p1.getImage().getScaledInstance(imgProdLbl1.getWidth(), Home.imgProdLbl1.getHeight(), 4));
            imgProdLbl1.setIcon(p1);
            imgProdLbl2.setIcon(p1);
            imgProdLbl3.setIcon(p1);

            ImageIcon p2 = new ImageIcon("images/r7.png");
            p2.setImage(p2.getImage().getScaledInstance(imgProdLbl1.getWidth(), Home.imgProdLbl1.getHeight(), 4));
            imgProdLbl2.setIcon(p2);

            ImageIcon p3 = new ImageIcon("images/pm.png");
            p3.setImage(p3.getImage().getScaledInstance(imgProdLbl1.getWidth(), Home.imgProdLbl1.getHeight(), 4));
            imgProdLbl3.setIcon(p3);

        });
         */
    }

    private int lastId = 0;

    @Override
    public void setVisible(boolean bool) {

        if (bool) {
            CompletableFuture.runAsync(() -> {

                Statement statement = ConnectionFactory.getStatement();

                try {
                    
                    String txt = "SELECT * FROM tb_produto WHERE id_produto > '%s' ORDER BY id_categoria LIMIT 3";
                    String cmd = String.format(txt, this.lastId);
                    ResultSet result = statement.executeQuery(cmd);

                    int pos = 1;
                    while (result.next()) {

                        File directory = new File(result.getString("image_path"));

                        if (directory.exists() && directory.isDirectory()) {

                            for (File listFile : directory.listFiles()) {

                                ImageIcon icon = new ImageIcon(listFile.getPath());
                                icon.setImage(icon.getImage().getScaledInstance(imgProdLbl1.getWidth(), Home.imgProdLbl1.getHeight(), 4));

                                String nome = result.getString("nome");
                                String preco = result.getString("preco");

                                switch (pos) {
                                    case 1:
                                        imgProdLbl1.setIcon(icon);
                                        nomeProdLbl1.setText(nome);
                                        precoLbl1.setText(preco);
                                        break;
                                    case 2:
                                        imgProdLbl2.setIcon(icon);
                                        nomeProdLbl2.setText(nome);
                                        precoLbl2.setText(preco);
                                        break;
                                    case 3:
                                        imgProdLbl3.setIcon(icon);
                                        nomeProdLbl3.setText(nome);
                                        precoLbl3.setText(preco);
                                        break;

                                }

                                break;
                            }
                            if (pos >= 3) {
                                pos = 1;
                                this.lastId = result.getInt("id_produto");
                            } else {
                                pos++;
                            }
                        }
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }

            });
        }

        super.setVisible(bool);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bannerLbl = new javax.swing.JLabel();
        viewScroll = new javax.swing.JScrollPane();
        view = new javax.swing.JPanel();
        proButton = new javax.swing.JButton();
        antButton = new javax.swing.JButton();
        produtoPanel1 = new javax.swing.JPanel();
        bordaLbl1 = new javax.swing.JLabel();
        imgProdLbl1 = new javax.swing.JLabel();
        catProdLbl1 = new javax.swing.JLabel();
        nomeProdLbl1 = new javax.swing.JLabel();
        precoAntLbl1 = new javax.swing.JLabel();
        precoLbl1 = new javax.swing.JLabel();
        produtoPanel2 = new javax.swing.JPanel();
        bordaLbl2 = new javax.swing.JLabel();
        imgProdLbl2 = new javax.swing.JLabel();
        catProdLbl2 = new javax.swing.JLabel();
        nomeProdLbl2 = new javax.swing.JLabel();
        precoAntLbl2 = new javax.swing.JLabel();
        precoLbl2 = new javax.swing.JLabel();
        produtoPanel3 = new javax.swing.JPanel();
        bordaLbl3 = new javax.swing.JLabel();
        imgProdLbl3 = new javax.swing.JLabel();
        catProdLbl3 = new javax.swing.JLabel();
        nomeProdLbl3 = new javax.swing.JLabel();
        precoAntLbl3 = new javax.swing.JLabel();
        precoLbl3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 498));
        setMinimumSize(new java.awt.Dimension(800, 498));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bannerLbl.setMaximumSize(new java.awt.Dimension(800, 150));
        bannerLbl.setMinimumSize(new java.awt.Dimension(800, 150));
        bannerLbl.setOpaque(true);
        bannerLbl.setPreferredSize(new java.awt.Dimension(800, 150));
        add(bannerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        viewScroll.setBackground(new java.awt.Color(255, 255, 255));
        viewScroll.setBorder(null);
        viewScroll.setMaximumSize(new java.awt.Dimension(800, 348));
        viewScroll.setMinimumSize(new java.awt.Dimension(800, 348));
        viewScroll.setPreferredSize(new java.awt.Dimension(800, 348));

        view.setBackground(new java.awt.Color(255, 255, 255));
        view.setMaximumSize(new java.awt.Dimension(800, 348));
        view.setMinimumSize(new java.awt.Dimension(800, 348));
        view.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        proButton.setBackground(new java.awt.Color(255, 0, 0));
        proButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        proButton.setForeground(new java.awt.Color(255, 255, 255));
        proButton.setText(">");
        proButton.setBorder(null);
        proButton.setFocusPainted(false);
        proButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        proButton.setPreferredSize(new java.awt.Dimension(25, 25));
        view.add(proButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 158, -1, -1));

        antButton.setBackground(new java.awt.Color(255, 0, 0));
        antButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        antButton.setForeground(new java.awt.Color(255, 255, 255));
        antButton.setText("<");
        antButton.setBorder(null);
        antButton.setFocusPainted(false);
        antButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        antButton.setPreferredSize(new java.awt.Dimension(25, 25));
        view.add(antButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 158, -1, -1));

        produtoPanel1.setBackground(new java.awt.Color(255, 255, 255));
        produtoPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bordaLbl1.setPreferredSize(new java.awt.Dimension(180, 290));
        produtoPanel1.add(bordaLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        produtoPanel1.add(imgProdLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 140));

        catProdLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        catProdLbl1.setText("Placa de Vídeo");
        produtoPanel1.add(catProdLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 90, 30));

        nomeProdLbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nomeProdLbl1.setForeground(new java.awt.Color(255, 153, 0));
        nomeProdLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeProdLbl1.setText("Ryzen 5 3600");
        produtoPanel1.add(nomeProdLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, 30));

        precoAntLbl1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        precoAntLbl1.setForeground(new java.awt.Color(255, 0, 51));
        precoAntLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precoAntLbl1.setText(" ̶R̶$̶ ̶1̶.̶1̶2̶0̶,̶0̶0̶");
        precoAntLbl1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        produtoPanel1.add(precoAntLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 215, 130, 20));

        precoLbl1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        precoLbl1.setForeground(new java.awt.Color(0, 204, 0));
        precoLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precoLbl1.setText("R$ 900,00");
        precoLbl1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        produtoPanel1.add(precoLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 238, 130, 20));

        view.add(produtoPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 180, 290));

        produtoPanel2.setBackground(new java.awt.Color(255, 255, 255));
        produtoPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bordaLbl2.setPreferredSize(new java.awt.Dimension(180, 290));
        produtoPanel2.add(bordaLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        produtoPanel2.add(imgProdLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 140));

        catProdLbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        catProdLbl2.setText("Processador");
        produtoPanel2.add(catProdLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 90, 30));

        nomeProdLbl2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nomeProdLbl2.setForeground(new java.awt.Color(255, 153, 0));
        nomeProdLbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeProdLbl2.setText("Ryzen 5 3600");
        produtoPanel2.add(nomeProdLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, 30));

        precoAntLbl2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        precoAntLbl2.setForeground(new java.awt.Color(255, 0, 51));
        precoAntLbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precoAntLbl2.setText(" ̶R̶$̶ ̶1̶.̶1̶2̶0̶,̶0̶0̶");
        precoAntLbl2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        produtoPanel2.add(precoAntLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 215, 130, 20));

        precoLbl2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        precoLbl2.setForeground(new java.awt.Color(0, 204, 0));
        precoLbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precoLbl2.setText("R$ 900,00");
        precoLbl2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        produtoPanel2.add(precoLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 238, 130, 20));

        view.add(produtoPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 180, 290));

        produtoPanel3.setBackground(new java.awt.Color(255, 255, 255));
        produtoPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bordaLbl3.setPreferredSize(new java.awt.Dimension(180, 290));
        produtoPanel3.add(bordaLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        produtoPanel3.add(imgProdLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 140));

        catProdLbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        catProdLbl3.setText("Placa Mãe");
        produtoPanel3.add(catProdLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 90, 30));

        nomeProdLbl3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nomeProdLbl3.setForeground(new java.awt.Color(255, 153, 0));
        nomeProdLbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeProdLbl3.setText("Ryzen 5 3600");
        produtoPanel3.add(nomeProdLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, 30));

        precoAntLbl3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        precoAntLbl3.setForeground(new java.awt.Color(255, 0, 51));
        precoAntLbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precoAntLbl3.setText(" ̶R̶$̶ ̶1̶.̶1̶2̶0̶,̶0̶0̶");
        precoAntLbl3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        produtoPanel3.add(precoAntLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 215, 130, 20));

        precoLbl3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        precoLbl3.setForeground(new java.awt.Color(0, 204, 0));
        precoLbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precoLbl3.setText("R$ 900,00");
        precoLbl3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        produtoPanel3.add(precoLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 238, 130, 20));

        view.add(produtoPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 180, 290));

        viewScroll.setViewportView(view);

        add(viewScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton antButton;
    public static javax.swing.JLabel bannerLbl;
    public static javax.swing.JLabel bordaLbl1;
    public static javax.swing.JLabel bordaLbl2;
    public static javax.swing.JLabel bordaLbl3;
    private javax.swing.JLabel catProdLbl1;
    private javax.swing.JLabel catProdLbl2;
    private javax.swing.JLabel catProdLbl3;
    public static javax.swing.JLabel imgProdLbl1;
    public static javax.swing.JLabel imgProdLbl2;
    public static javax.swing.JLabel imgProdLbl3;
    private javax.swing.JLabel nomeProdLbl1;
    private javax.swing.JLabel nomeProdLbl2;
    private javax.swing.JLabel nomeProdLbl3;
    private javax.swing.JLabel precoAntLbl1;
    private javax.swing.JLabel precoAntLbl2;
    private javax.swing.JLabel precoAntLbl3;
    private javax.swing.JLabel precoLbl1;
    private javax.swing.JLabel precoLbl2;
    private javax.swing.JLabel precoLbl3;
    private javax.swing.JButton proButton;
    public static javax.swing.JPanel produtoPanel1;
    private javax.swing.JPanel produtoPanel2;
    private javax.swing.JPanel produtoPanel3;
    private javax.swing.JPanel view;
    private javax.swing.JScrollPane viewScroll;
    // End of variables declaration//GEN-END:variables
}
