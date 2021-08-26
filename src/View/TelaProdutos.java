/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controler.Entidades.ProdutoController;
import Model.Entidades.Estoque;
import Model.Entidades.Produto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaProdutos extends javax.swing.JFrame {

    ProdutoController controleProduto = new ProdutoController();
    TelaEntrada entrada;
    TelaSaida saida;
    
    public TelaProdutos(TelaEntrada telaEntrada) {
        initComponents();
        entrada = telaEntrada;
        preencherTabela();
    }
    public TelaProdutos(TelaSaida telaSaida) {
        initComponents();
         saida = telaSaida;
        preencherTabela();
    }

    private TelaProdutos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Produtos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel2.setText("Consultar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jTextField1.setText("Codigo");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 100, -1));

        jTextField2.setText("Descrição");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 270, -1));

        jButton1.setText("Buscar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, -1));

        jButton2.setText("Add Produto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, -1, -1));

        jButton3.setText("Novo Produto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produtos", "Unidade", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProdutos.setMinimumSize(new java.awt.Dimension(100, 200));
        tbProdutos.setPreferredSize(new java.awt.Dimension(100, 200));
        tbProdutos.setShowGrid(true);
        jScrollPane1.setViewportView(tbProdutos);
        if (tbProdutos.getColumnModel().getColumnCount() > 0) {
            tbProdutos.getColumnModel().getColumn(0).setMinWidth(60);
            tbProdutos.getColumnModel().getColumn(0).setPreferredWidth(60);
            tbProdutos.getColumnModel().getColumn(0).setMaxWidth(60);
            tbProdutos.getColumnModel().getColumn(2).setMinWidth(70);
            tbProdutos.getColumnModel().getColumn(2).setPreferredWidth(70);
            tbProdutos.getColumnModel().getColumn(2).setMaxWidth(70);
            tbProdutos.getColumnModel().getColumn(3).setMinWidth(100);
            tbProdutos.getColumnModel().getColumn(3).setPreferredWidth(100);
            tbProdutos.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 940, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       addProduto();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FormProduto formProduto = new FormProduto(this, true);
        formProduto.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProdutos().setVisible(true);
            }
        });
    }
    
    public void preencherTabela() {
        List<Produto> listaProdutos = controleProduto.consultarProdutos();
              
        DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        
        
        for (Produto p : listaProdutos) {
            
            modelo.addRow(new Object[]{p.getId(), p.getDescricao(), p.getMedida(), 0.0});
        }
        
    }
    public void addProduto(){
        Produto produto = new Produto();
        Estoque estoque = new Estoque();
        
        if (tbProdutos.getSelectedRow() != -1) {

            int indice = tbProdutos.getSelectedRow();
            produto.setId((int) tbProdutos.getValueAt(indice, 0));
            produto.setDescricao((String) tbProdutos.getValueAt(indice, 1));
            produto.setMedida((String) tbProdutos.getValueAt(indice, 2));
            produto.setQuantidade((Double) tbProdutos.getValueAt(indice, 3)) ;
            
            
//            estoque.setProduto(produto);
//            estoque.setQuantidadeDisponivel();
            
            if(produto.getQuantidade() > 0){
                if(entrada != null){
                    entrada.addListProduto(produto);
                }else if(saida != null){
                    saida.addListProduto(produto);
                }
                
            }else{
                JOptionPane.showMessageDialog(this, "Informe a quantidade");
            }

            
            
        } else {
            JOptionPane.showMessageDialog(this, "Selecione algum Item para Inserir");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tbProdutos;
    // End of variables declaration//GEN-END:variables
}