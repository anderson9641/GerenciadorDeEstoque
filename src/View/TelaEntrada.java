/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controler.Entidades.EntradaController;
import Controler.Entidades.ProdutoController;
import Model.Entidades.Entrada;
import Model.Entidades.Estoque;
import Model.Entidades.Fornecedor;
import Model.Entidades.ItemEntrada;
import Model.Entidades.Produto;
import Util.FormaterDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaEntrada extends javax.swing.JInternalFrame {

    List<Produto> listaProdutos = new ArrayList<>();
    List<ItemEntrada> listaEntrada = new ArrayList<>();
    ProdutoController controleProduto = new ProdutoController();
    EntradaController controleEntrada = new EntradaController();

    FormaterDate formatDate = new FormaterDate();

    public TelaEntrada() {
        initComponents();
        txtData.setText(formatDate.FormataData(new Date()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNotaFiscal = new javax.swing.JTextField();
        txtFornecedor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdutosEntrada = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1000, 590));

        jPanel1.setBackground(new java.awt.Color(93, 124, 166));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Entrada");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nota Fiscal");

        txtNotaFiscal.setBackground(new java.awt.Color(255, 255, 255));
        txtNotaFiscal.setText("Codigo");

        txtFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        txtFornecedor.setText("Descrição");

        jButton1.setBackground(new java.awt.Color(146, 166, 76));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Add Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fornecedor :");

        txtData.setEditable(false);
        txtData.setBackground(new java.awt.Color(255, 255, 255));
        txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Data:");

        jScrollPane1.setColumnHeaderView(null);

        tbProdutosEntrada.setForeground(new java.awt.Color(0, 0, 0));
        tbProdutosEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Descrição", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbProdutosEntrada);
        if (tbProdutosEntrada.getColumnModel().getColumnCount() > 0) {
            tbProdutosEntrada.getColumnModel().getColumn(0).setResizable(false);
            tbProdutosEntrada.getColumnModel().getColumn(1).setMinWidth(100);
            tbProdutosEntrada.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbProdutosEntrada.getColumnModel().getColumn(1).setMaxWidth(100);
        }

        jButton2.setBackground(new java.awt.Color(229, 42, 39));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnInserir.setBackground(new java.awt.Color(51, 153, 0));
        btnInserir.setForeground(new java.awt.Color(0, 0, 0));
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(26, 26, 26)
                            .addComponent(txtNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(795, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addGap(18, 18, 18)
                    .addComponent(btnInserir)
                    .addContainerGap(45, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(515, 515, 515)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(btnInserir))
                    .addContainerGap(22, Short.MAX_VALUE)))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        TelaProdutos telaProdutos = new TelaProdutos(this);
        telaProdutos.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        Entrada entrada = new Entrada();
        Fornecedor fornecedor = new Fornecedor();

        entrada.setNotaFiscal(txtNotaFiscal.getText());
        entrada.setData(new Date());
        fornecedor.setId(Integer.parseInt(txtFornecedor.getText()));
        entrada.setFornecedor(fornecedor);
        entrada.setProdutos(listaEntrada);

        controleEntrada.inserirEntrada(entrada);

        for (Produto p : listaProdutos) {

            Double qtd = controleProduto.consultarProdutoId(p.getId()).getQuantidade();

            p.addProduto(qtd);

            controleProduto.atualizarProduto(p);
        }

        JOptionPane.showMessageDialog(this, "Produtos Inseridos com Sucesso");
        this.dispose();


    }//GEN-LAST:event_btnInserirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void preencherTabela() {

        DefaultTableModel modelo = (DefaultTableModel) tbProdutosEntrada.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (Produto p : listaProdutos) {

            modelo.addRow(new Object[]{p.getDescricao(), p.getQuantidade()});
        }

    }

    public void addListProduto(Produto produto) {
        int existe = 0;
        ItemEntrada itemEntrada = new ItemEntrada();

        for (Produto e : listaProdutos) {
            if (e.getId() == produto.getId()) {
                existe = 1;
            }
        }

        if (existe == 0) {
            itemEntrada.setProduto(produto.getId());
            itemEntrada.setQuantidade(produto.getQuantidade());
            listaEntrada.add(itemEntrada);
            listaProdutos.add(produto);
            preencherTabela();
        } else {
            JOptionPane.showMessageDialog(this, "Produto ja existe");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProdutosEntrada;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtNotaFiscal;
    // End of variables declaration//GEN-END:variables
}
