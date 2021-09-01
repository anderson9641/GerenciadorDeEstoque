package View;

import Controler.Entidades.FornecedorController;
import Model.Entidades.Escola;
import Model.Entidades.Fornecedor;
import Util.PreencherTabelas;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaFornecedor extends javax.swing.JInternalFrame {

    FornecedorController controleFornecedor = new FornecedorController();
    Escola escolaForm = new Escola();
    FormFornecedor form;

    public TelaFornecedor() {
        initComponents();
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFornecedor = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setAutoscrolls(true);

        jPanel1.setBackground(new java.awt.Color(93, 124, 166));

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Fronecedores");

        tbFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOME", "ENDEREÇO", "FONE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(tbFornecedor);
        if (tbFornecedor.getColumnModel().getColumnCount() > 0) {
            tbFornecedor.getColumnModel().getColumn(0).setMinWidth(100);
            tbFornecedor.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbFornecedor.getColumnModel().getColumn(0).setMaxWidth(100);
            tbFornecedor.getColumnModel().getColumn(3).setMinWidth(150);
            tbFornecedor.getColumnModel().getColumn(3).setPreferredWidth(150);
            tbFornecedor.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        btnNovo.setBackground(new java.awt.Color(146, 166, 76));
        btnNovo.setForeground(new java.awt.Color(0, 0, 0));
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/plus.png"))); // NOI18N
        btnNovo.setText("  Novo");
        btnNovo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNovo.setIconTextGap(8);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(146, 166, 76));
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEditar.setIconTextGap(8);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(146, 166, 76));
        btnExcluir.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/remove.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnExcluir.setIconTextGap(8);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(146, 166, 76));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lupa.png"))); // NOI18N
        jButton4.setText("Consultar");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton4.setIconTextGap(8);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Consultar :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 698, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNovo)
                                .addGap(28, 28, 28)
                                .addComponent(btnEditar)
                                .addGap(26, 26, 26)
                                .addComponent(btnExcluir)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tbFornecedor.getSelectedRow() != -1) {
            int indice = tbFornecedor.getSelectedRow();
            int id = (int) tbFornecedor.getValueAt(indice, 0);
            controleFornecedor.deleteFornecedor(id); 
            preencherTabela();
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        escolaForm = null;
        TelaPrincipal t = new TelaPrincipal();

        FormFornecedor form = new FormFornecedor(t, true);
        form.atualizarTabela(this);
        form.setVisible(true);


    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        Fornecedor fornecedor1 = new Fornecedor();
        TelaPrincipal t = new TelaPrincipal();
        FormFornecedor form1 = new FormFornecedor(t, true);
        
        if (tbFornecedor.getSelectedRow() != -1) {

            int indice = tbFornecedor.getSelectedRow();
            fornecedor1.setId((int) tbFornecedor.getValueAt(indice, 0));
            fornecedor1.setNome((String) tbFornecedor.getValueAt(indice, 1));
            fornecedor1.setEndereco((String) tbFornecedor.getValueAt(indice, 2));
            fornecedor1.setFone((String) tbFornecedor.getValueAt(indice, 3));
            
            
            form1.preencherCampos(fornecedor1);
            form1.atualizarTabela(this);
            form1.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione algum Item para Editar");
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    public void preencherTabela() {
        List<Fornecedor> listaFornecedores = controleFornecedor.consultarFornecedores();
              
        DefaultTableModel modelo = (DefaultTableModel) tbFornecedor.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        System.out.println(listaFornecedores.get(0).getClass());
        for (Fornecedor f : listaFornecedores) {
            
            modelo.addRow(new Object[]{f.getId(), f.getNome(), f.getEndereco(), f.getFone()});
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tbFornecedor;
    // End of variables declaration//GEN-END:variables
}
