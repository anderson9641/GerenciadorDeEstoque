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
        setPreferredSize(new java.awt.Dimension(1000, 590));

        jLabel1.setText("Estoque");

        jLabel2.setText("Consultar : ");

        jTextField1.setText("Codigo");
        jTextField1.setToolTipText("Codigo");
        jTextField1.setName(""); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("nome");

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

        tbnNovo.setText("Novo");
        tbnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnNovoActionPerformed(evt);
            }
        });

        tbnEditar.setText("Editar");
        tbnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnEditarActionPerformed(evt);
            }
        });

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
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tbnNovo)
                                .addGap(18, 18, 18)
                                .addComponent(tbnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir)))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButton1))
                            .addComponent(jLabel1))
                        .addContainerGap(369, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnNovo)
                    .addComponent(tbnEditar)
                    .addComponent(btnExcluir))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
