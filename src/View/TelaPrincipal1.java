
package View;

import Util.Desktop;
import java.awt.Color;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class TelaPrincipal1 extends javax.swing.JFrame {
    
    TelaEntrada telaEntrada = new TelaEntrada();
    TelaEstoque telaEstoque = new TelaEstoque();
    TelaSaida telaSaida;
    TelaEscola escola = new TelaEscola();
    TelaFornecedor fornecedor = new TelaFornecedor();
       
    
    public TelaPrincipal1() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        
        redimensionarFundo();       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnEstoque = new javax.swing.JLabel();
        btnEntrada = new javax.swing.JLabel();
        btnSaida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnFornecedor = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        paineldesktop = new javax.swing.JDesktopPane();
        lblImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(41, 61, 89));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setPreferredSize(new java.awt.Dimension(120, 736));

        jPanel2.setBackground(new java.awt.Color(41, 61, 89));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setMaximumSize(new java.awt.Dimension(100, 700));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 700));
        jPanel2.setLayout(new java.awt.GridLayout(6, 0));

        btnEstoque.setBackground(new java.awt.Color(41, 61, 89));
        btnEstoque.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnEstoque.setForeground(new java.awt.Color(255, 255, 255));
        btnEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/15623847411557740325-48.png"))); // NOI18N
        btnEstoque.setText("Estoque");
        btnEstoque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEstoque.setMaximumSize(new java.awt.Dimension(90, 115));
        btnEstoque.setMinimumSize(new java.awt.Dimension(90, 115));
        btnEstoque.setOpaque(true);
        btnEstoque.setPreferredSize(new java.awt.Dimension(90, 115));
        btnEstoque.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstoqueMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEstoqueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEstoqueMouseExited(evt);
            }
        });
        jPanel2.add(btnEstoque);

        btnEntrada.setBackground(new java.awt.Color(41, 61, 89));
        btnEntrada.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnEntrada.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/15307684721557740328-48.png"))); // NOI18N
        btnEntrada.setText("Entrada");
        btnEntrada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEntrada.setMaximumSize(new java.awt.Dimension(90, 115));
        btnEntrada.setMinimumSize(new java.awt.Dimension(90, 115));
        btnEntrada.setOpaque(true);
        btnEntrada.setPreferredSize(new java.awt.Dimension(90, 115));
        btnEntrada.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntradaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntradaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntradaMouseExited(evt);
            }
        });
        jPanel2.add(btnEntrada);

        btnSaida.setBackground(new java.awt.Color(41, 61, 89));
        btnSaida.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnSaida.setForeground(new java.awt.Color(255, 255, 255));
        btnSaida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/4615327601557740327-48.png"))); // NOI18N
        btnSaida.setText("Saida");
        btnSaida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSaida.setMaximumSize(new java.awt.Dimension(90, 115));
        btnSaida.setMinimumSize(new java.awt.Dimension(90, 115));
        btnSaida.setOpaque(true);
        btnSaida.setPreferredSize(new java.awt.Dimension(90, 115));
        btnSaida.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSaida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaidaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaidaMouseExited(evt);
            }
        });
        jPanel2.add(btnSaida);

        jLabel1.setBackground(new java.awt.Color(41, 61, 89));
        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/7717712361579605848-48.png"))); // NOI18N
        jLabel1.setText("ESCOLA");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setFocusCycleRoot(true);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(90, 115));
        jLabel1.setMinimumSize(new java.awt.Dimension(90, 115));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(90, 115));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel2.add(jLabel1);

        btnFornecedor.setBackground(new java.awt.Color(41, 61, 89));
        btnFornecedor.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        btnFornecedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-fabrico-48.png"))); // NOI18N
        btnFornecedor.setText("Fornecedor");
        btnFornecedor.setToolTipText("");
        btnFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFornecedor.setFocusCycleRoot(true);
        btnFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFornecedor.setMaximumSize(new java.awt.Dimension(90, 115));
        btnFornecedor.setMinimumSize(new java.awt.Dimension(90, 115));
        btnFornecedor.setOpaque(true);
        btnFornecedor.setPreferredSize(new java.awt.Dimension(90, 115));
        btnFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFornecedorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFornecedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFornecedorMouseExited(evt);
            }
        });
        jPanel2.add(btnFornecedor);

        jLabel4.setBackground(new java.awt.Color(41, 61, 89));
        jLabel4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/8284960741601550873-48.png"))); // NOI18N
        jLabel4.setText("Relat??rio");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setMaximumSize(new java.awt.Dimension(90, 115));
        jLabel4.setMinimumSize(new java.awt.Dimension(90, 115));
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(90, 115));
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel2.add(jLabel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 764, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(41, 61, 89));
        jPanel5.setPreferredSize(new java.awt.Dimension(1300, 10));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(41, 61, 89));
        jPanel6.setPreferredSize(new java.awt.Dimension(5, 526));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6, java.awt.BorderLayout.LINE_START);

        jPanel7.setBackground(new java.awt.Color(41, 61, 89));
        jPanel7.setPreferredSize(new java.awt.Dimension(1300, 30));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel8.setBackground(new java.awt.Color(41, 61, 89));
        jPanel8.setPreferredSize(new java.awt.Dimension(20, 666));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel8, java.awt.BorderLayout.LINE_END);

        lblImagem.setMaximumSize(new java.awt.Dimension(1912, 1200));
        lblImagem.setMinimumSize(new java.awt.Dimension(1912, 1200));
        lblImagem.setPreferredSize(new java.awt.Dimension(1200, 700));

        paineldesktop.setLayer(lblImagem, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout paineldesktopLayout = new javax.swing.GroupLayout(paineldesktop);
        paineldesktop.setLayout(paineldesktopLayout);
        paineldesktopLayout.setHorizontalGroup(
            paineldesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineldesktopLayout.createSequentialGroup()
                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 1261, Short.MAX_VALUE)
                .addContainerGap())
        );
        paineldesktopLayout.setVerticalGroup(
            paineldesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineldesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(paineldesktop, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (!escola.isVisible()) {
            paineldesktop.add(escola);
            escola.setVisible(true);
        }else{
            //paineldesktop.remove(escola);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFornecedorMouseClicked
        if (!fornecedor.isVisible()) {
            paineldesktop.add(fornecedor);
            fornecedor.setVisible(true);
        }
    }//GEN-LAST:event_btnFornecedorMouseClicked

    private void btnFornecedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFornecedorMouseEntered
        mouseHover(btnFornecedor);
    }//GEN-LAST:event_btnFornecedorMouseEntered

    private void btnFornecedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFornecedorMouseExited
        mouseNoHover(btnFornecedor);
    }//GEN-LAST:event_btnFornecedorMouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        mouseHover(jLabel1);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        mouseNoHover(jLabel1);
    }//GEN-LAST:event_jLabel1MouseExited

    
    private void btnEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntradaMouseClicked
        
        if (!telaEntrada.isVisible()) {
            paineldesktop.add(telaEntrada);
            telaEntrada.setVisible(true);
        }
        

    }//GEN-LAST:event_btnEntradaMouseClicked

    private void btnEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstoqueMouseClicked
        
        if (!telaEstoque.isVisible()) {
            paineldesktop.add(telaEstoque);
            telaEstoque.setVisible(true);
        }
    }//GEN-LAST:event_btnEstoqueMouseClicked

    private void btnSaidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaidaMouseClicked
        telaSaida = new TelaSaida();
        if (!telaSaida.isVisible()) {
            paineldesktop.add(telaSaida);
            telaSaida.setVisible(true);
        }else{
            telaSaida = null;
        }
    }//GEN-LAST:event_btnSaidaMouseClicked

    private void btnEstoqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstoqueMouseEntered
         mouseHover(btnEstoque);
    }//GEN-LAST:event_btnEstoqueMouseEntered

    private void btnEstoqueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstoqueMouseExited
        mouseNoHover(btnEstoque);
    }//GEN-LAST:event_btnEstoqueMouseExited

    private void btnEntradaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntradaMouseEntered
        mouseHover(btnEntrada);
    }//GEN-LAST:event_btnEntradaMouseEntered

    private void btnEntradaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntradaMouseExited
        mouseNoHover(btnEntrada);
    }//GEN-LAST:event_btnEntradaMouseExited

    private void btnSaidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaidaMouseEntered
        mouseHover(btnSaida);
    }//GEN-LAST:event_btnSaidaMouseEntered

    private void btnSaidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaidaMouseExited
        mouseNoHover(btnSaida);
    }//GEN-LAST:event_btnSaidaMouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        mouseHover(jLabel4);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        mouseNoHover(jLabel4);
    }//GEN-LAST:event_jLabel4MouseExited

    
    private void mouseHover(JLabel label){
        label.setBackground(new Color(107,122,161));
        
    }
    private void mouseNoHover(JLabel label){
        label.setBackground(new Color(41,61,89));
        
    }
    private void redimensionarFundo(){
        ImageIcon image = new ImageIcon("src/Imagens/logodegrade.png");
        image.setImage(image.getImage().getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(), 1));
        lblImagem.setIcon(image);
    }
    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEntrada;
    private javax.swing.JLabel btnEstoque;
    private javax.swing.JLabel btnFornecedor;
    private javax.swing.JLabel btnSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JDesktopPane paineldesktop;
    // End of variables declaration//GEN-END:variables
}
