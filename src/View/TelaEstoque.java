/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controler.Entidades.ProdutoController;
import Model.Entidades.Produto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaEstoque extends javax.swing.JInternalFrame {

    ProdutoController controleProduto = new ProdutoController();
    
    public TelaEstoque() {
        initComponents();
        preencherTabela();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        tbnNovo = new javax.swing.JButton();
        tbnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(1037, 640));
        setMinimumSize(new java.awt.Dimension(1037, 640));
        setPreferredSize(new java.awt.Dimension(1037, 640));

        jPanel1.setBackground(new java.awt.Color(93, 124, 166));

        jLabel1.setBackground(new java.awt.Color(107, 122, 161));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Estoque");

        jLabel2.setBackground(new java.awt.Color(107, 122, 161));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Consultar : ");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Codigo");
        jTextField1.setToolTipText("Codigo");
        jTextField1.setName(""); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("nome");

        jButton1.setBackground(new java.awt.Color(146, 166, 76));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lupa.png"))); // NOI18N
        jButton1.setText("Buscar");

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Unidade", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbProdutos);
        if (tbProdutos.getColumnModel().getColumnCount() > 0) {
            tbProdutos.getColumnModel().getColumn(0).setMinWidth(100);
            tbProdutos.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbProdutos.getColumnModel().getColumn(0).setMaxWidth(100);
            tbProdutos.getColumnModel().getColumn(2).setMinWidth(100);
            tbProdutos.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbProdutos.getColumnModel().getColumn(2).setMaxWidth(100);
            tbProdutos.getColumnModel().getColumn(3).setMinWidth(100);
            tbProdutos.getColumnModel().getColumn(3).setPreferredWidth(100);
            tbProdutos.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        tbnNovo.setBackground(new java.awt.Color(146, 166, 76));
        tbnNovo.setForeground(new java.awt.Color(0, 0, 0));
        tbnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/plus.png"))); // NOI18N
        tbnNovo.setText("Novo");
        tbnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnNovoActionPerformed(evt);
            }
        });

        tbnEditar.setBackground(new java.awt.Color(146, 166, 76));
        tbnEditar.setForeground(new java.awt.Color(0, 0, 0));
        tbnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        tbnEditar.setText("Editar");
        tbnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(146, 166, 76));
        btnExcluir.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/remove.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(51, 51, 51)
                                .addComponent(tbnNovo)
                                .addGap(18, 18, 18)
                                .addComponent(tbnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir)))
                        .addGap(0, 25, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jLabel1)
                            .addGap(67, 67, 67))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(tbnNovo)
                            .addComponent(tbnEditar)
                            .addComponent(btnExcluir))))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tbnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnNovoActionPerformed
        TelaPrincipal t = new TelaPrincipal();
        FormProduto formProduto = new FormProduto(t, true);
        formProduto.setVisible(true);
    }//GEN-LAST:event_tbnNovoActionPerformed

    private void tbnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnEditarActionPerformed
        Produto produto = new Produto();
        
        
        if (tbProdutos.getSelectedRow() != -1) {

            int indice = tbProdutos.getSelectedRow();
            produto.setId((int) tbProdutos.getValueAt(indice, 0));
            produto.setDescricao((String) tbProdutos.getValueAt(indice, 1));
            produto.setMedida((String) tbProdutos.getValueAt(indice, 2));
            produto.setQuantidade((Double) tbProdutos.getValueAt(indice, 3));
            
            TelaPrincipal t = new TelaPrincipal();
            FormProduto formProduto = new FormProduto(t, true);
        
            
            formProduto.preencherCampos(produto);
            formProduto.atualizarEstoque(this);
            formProduto.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione algum Item para Editar");
        }
    }//GEN-LAST:event_tbnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Produto produto = new Produto();
        
        if (tbProdutos.getSelectedRow() != -1) {

            int indice = tbProdutos.getSelectedRow();
            produto.setId((int) tbProdutos.getValueAt(indice, 0));
            
            controleProduto.deleteProduto(produto.getId());
            preencherTabela();
            
        } else {
            JOptionPane.showMessageDialog(this, "Selecione algum Item para Editar");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    public void preencherTabela() {
        List<Produto> listaProdutos = controleProduto.consultarProdutos();
              
        DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        
        
        for (Produto p : listaProdutos) {
            
            modelo.addRow(new Object[]{p.getId(), p.getDescricao(), p.getMedida(), p.getQuantidade()});
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JButton tbnEditar;
    private javax.swing.JButton tbnNovo;
    // End of variables declaration//GEN-END:variables
}
