/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controler.Entidades.SaidaController;
import Controler.Entidades.ProdutoController;
import Model.Entidades.Escola;
import Model.Entidades.Saida;
import Model.Entidades.Estoque;
import Model.Entidades.Fornecedor;
import Model.Entidades.ItemSaida;
import Model.Entidades.Produto;
import Util.FormaterDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaSaida extends javax.swing.JInternalFrame {

    List<Produto> listaProdutos = new ArrayList<>();
    List<ItemSaida> listaSaida = new ArrayList<>();
    ProdutoController controleProduto = new ProdutoController();
    SaidaController controleSaida = new SaidaController();
    Escola escolaSelecionada;
            
    FormaterDate formatDate = new FormaterDate();

    public TelaSaida() {
        initComponents();
        txtData.setText(formatDate.FormataData(new Date()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEscola = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdutosSaida = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1000, 590));

        jPanel1.setBackground(new java.awt.Color(93, 124, 166));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("Saida");

        txtEscola.setEditable(false);
        txtEscola.setBackground(new java.awt.Color(255, 255, 255));
        txtEscola.setForeground(new java.awt.Color(204, 204, 204));
        txtEscola.setText("Escola");

        jButton1.setBackground(new java.awt.Color(146, 166, 76));
        jButton1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Add Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Escola :");

        txtData.setEditable(false);
        txtData.setBackground(new java.awt.Color(255, 255, 255));
        txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Data:");

        tbProdutosSaida.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbProdutosSaida);
        if (tbProdutosSaida.getColumnModel().getColumnCount() > 0) {
            tbProdutosSaida.getColumnModel().getColumn(0).setResizable(false);
            tbProdutosSaida.getColumnModel().getColumn(1).setMinWidth(100);
            tbProdutosSaida.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbProdutosSaida.getColumnModel().getColumn(1).setMaxWidth(100);
        }

        jButton2.setBackground(new java.awt.Color(229, 42, 39));
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnInserir.setBackground(new java.awt.Color(51, 153, 0));
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(146, 166, 76));
        jButton3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Selecionar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addComponent(txtEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addGap(18, 18, 18)
                            .addComponent(btnInserir))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jLabel1)
                    .addContainerGap(1073, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton3)
                    .addComponent(jLabel4)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnInserir))
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addContainerGap(544, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        TelaProdutos telaProdutos = new TelaProdutos(this);
        telaProdutos.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        Saida saida = new Saida();
        Escola escola = new Escola();
        
        
        saida.setDataEntrega(new Date());
        if(escolaSelecionada != null){
        escola.setId(escolaSelecionada.getId());    
        }
        
        saida.setEscola(escola);        
        saida.setProdutos(listaSaida);
        
        controleSaida.inserirSaida(saida);
        
        
        for(Produto p : listaProdutos){
            
            Double qtd = controleProduto.consultarProdutoId(p.getId()).getQuantidade();
            
            
            p.outProduto(qtd);
                      
            controleProduto.atualizarProduto(p);
        }
        
        JOptionPane.showMessageDialog(this, "Produtos Inseridos com Sucesso");
        this.dispose();
        
        
    }//GEN-LAST:event_btnInserirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TelaPrincipal t = new TelaPrincipal();
        TelaSelecaoEscolas selecionaEscola = new TelaSelecaoEscolas(t,true);
        selecionaEscola.atualizarTabela(this);
        selecionaEscola.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    public void preencherTabela() {

        DefaultTableModel modelo = (DefaultTableModel) tbProdutosSaida.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (Produto p : listaProdutos) {

            modelo.addRow(new Object[]{p.getDescricao(), p.getQuantidade()});
        }

    }

    public void addListProduto(Produto produto) {
        int existe = 0;
        ItemSaida itemSaida = new ItemSaida();
        
        for (Produto e : listaProdutos) {
            if (e.getId() == produto.getId()) {
                existe = 1;
            }
        }

        if (existe == 0) {
            itemSaida.setProduto(produto.getId());
            itemSaida.setQuantidade(produto.getQuantidade());
            listaSaida.add(itemSaida);
            listaProdutos.add(produto);
            preencherTabela();
        } else {
            JOptionPane.showMessageDialog(this, "Produto ja existe");
        }
    }
    
    public void selecionarEscola(Escola e){
        escolaSelecionada = e;
        txtEscola.setText(escolaSelecionada.getNome());
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProdutosSaida;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEscola;
    // End of variables declaration//GEN-END:variables
}
