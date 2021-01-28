/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.RelatorioAgendamentoController;
import Model.Agendamento;
import Model.AgendamentoBD;
import Model.DAO.AgendamentoDAO;
import Model.DAO.Conexao;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author breno
 */
public class RelatAgendamento extends javax.swing.JFrame {
    private final RelatorioAgendamentoController controller;
    
 ArrayList listaR ;
    /**
     * Creates new form RelatAgendamento
     */
    public RelatAgendamento() throws SQLException {
        initComponents();
        //lerJTable();
       metodoTeste();
       controller = new RelatorioAgendamentoController(this);
        controller.inserirIcone(this);
      
    }
    
    public void lerJTable() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) jTableRelatAgendamento.getModel();
        modelo.setNumRows(0);
        Connection conexao = new Conexao().getConnection();
        AgendamentoDAO agendamentodao = new AgendamentoDAO(conexao);
        
        for (AgendamentoBD agendament: agendamentodao.ler()) {
            
            modelo.addRow(new Object[]{
                agendament.getIdAgendamento(),
                agendament.getNomeCliente(),
                agendament.getData(),
                agendament.getNomeServico(),
                agendament.getValorServico(),
                agendament.getNomePeca(),
                agendament.getValorPeca(),
                agendament.getObservacao(),
                agendament.getValorTotal(),
                agendament.getFormaPagamento(),
                agendament.getQtdParcelas()
            });
            
        }
    }
    
    //teste 
    public void metodoTeste(){
        try{
        Connection conexao = new Conexao().getConnection();
        AgendamentoDAO agendamentodao = new AgendamentoDAO(conexao);
        
        listaR = agendamentodao.ler();
        mostraLista(listaR);
        }catch(Exception e){
            Logger.getLogger(CadCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
   
    
    public void mostraLista(ArrayList<AgendamentoBD> lista){
        DefaultTableModel modelo = (DefaultTableModel) jTableRelatAgendamento.getModel();
        if(lista.isEmpty() || lista == null){
            JOptionPane.showMessageDialog(null, "Não há agendamentos!");
        }else{
        
                for (AgendamentoBD agendament: lista) {
            
            modelo.addRow(new Object[]{
                agendament.getIdAgendamento(),
                agendament.getNomeCliente(),
                agendament.getData(),
                agendament.getNomeServico(),
                agendament.getValorServico(),
                agendament.getNomePeca(),
                agendament.getValorPeca(),
                agendament.getObservacao(),
                agendament.getValorTotal(),
                agendament.getFormaPagamento(),
                agendament.getQtdParcelas()
            });
            
        }
                
    }
    
                
    }
    
    public void lerJTableForData(String data) throws SQLException {
       //teste não chamar nova conexão com banco
        /*
        DefaultTableModel modelo = (DefaultTableModel) jTableRelatAgendamento.getModel();
        modelo.setNumRows(0);
        Connection conexao = new Conexao().getConnection();
        AgendamentoDAO agendamentodao = new AgendamentoDAO(conexao);
        */
       
        
       
        if(!listaR.isEmpty()){
            // listaR.forEach(null);
            //mostraLista(resultado);
        }
        
        
/***        for (AgendamentoBD agendament: agendamentodao.lerForData(data)) {
            
            modelo.addRow(new Object[]{
                agendament.getIdAgendamento(),
                agendament.getNomeCliente(),
                agendament.getData(),
                agendament.getNomeServico(),
                agendament.getValorServico(),
                agendament.getNomePeca(),
                agendament.getValorPeca(),
                agendament.getObservacao(),
                agendament.getValorTotal(),
                agendament.getFormaPagamento(),
                agendament.getQtdParcelas()
            });
            
        }
        **/
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRelatAgendamento = new javax.swing.JTable();
        jButtonExcluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextQtdParcelas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextCliente = new javax.swing.JTextField();
        jTextData = new javax.swing.JTextField();
        jTextServico = new javax.swing.JTextField();
        jTextValorServico = new javax.swing.JTextField();
        jTextPeca = new javax.swing.JTextField();
        jTextValorPeca = new javax.swing.JTextField();
        jTextObservacao = new javax.swing.JTextField();
        jTextValorTotal = new javax.swing.JTextField();
        jTextFormaPagamento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agendamentos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Relatório de Agendamento"));

        jTableRelatAgendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cliente", "Data", "Serviço", "Valor Serviço", "Peça", "Valor Peça", "Observação", "Valor total", "Forma de Pagamento", "Qtd de Parcelas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableRelatAgendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRelatAgendamentoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableRelatAgendamentoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableRelatAgendamento);
        if (jTableRelatAgendamento.getColumnModel().getColumnCount() > 0) {
            jTableRelatAgendamento.getColumnModel().getColumn(0).setResizable(false);
            jTableRelatAgendamento.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTableRelatAgendamento.getColumnModel().getColumn(2).setResizable(false);
            jTableRelatAgendamento.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTableRelatAgendamento.getColumnModel().getColumn(3).setResizable(false);
            jTableRelatAgendamento.getColumnModel().getColumn(4).setResizable(false);
            jTableRelatAgendamento.getColumnModel().getColumn(4).setPreferredWidth(55);
            jTableRelatAgendamento.getColumnModel().getColumn(6).setResizable(false);
            jTableRelatAgendamento.getColumnModel().getColumn(6).setPreferredWidth(50);
            jTableRelatAgendamento.getColumnModel().getColumn(7).setResizable(false);
            jTableRelatAgendamento.getColumnModel().getColumn(7).setPreferredWidth(250);
        }

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jLabel1.setText("Id");

        jLabel11.setText("Qtd Parcelas");

        jLabel2.setText("Cliente");

        jLabel3.setText("Data");

        jLabel4.setText("Serviço");

        jLabel5.setText("Valor do Serviço");

        jLabel6.setText("Peça");

        jLabel7.setText("Valor da Peça");

        jLabel8.setText("Observação");

        jLabel9.setText("Valor Total");

        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        jTextData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDataActionPerformed(evt);
            }
        });

        jLabel10.setText("Forma de Pgmeto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextServico, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextValorServico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextPeca, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextValorPeca, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextQtdParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)))
                .addGap(59, 59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextValorServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextPeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextValorPeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextQtdParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 1194, Short.MAX_VALUE)
                        .addComponent(jButtonExcluir)
                        .addGap(47, 47, 47))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableRelatAgendamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRelatAgendamentoMouseClicked
         if(jTableRelatAgendamento.getSelectedRow() != -1) {
        
        jTextCliente.setText(jTableRelatAgendamento.getValueAt(jTableRelatAgendamento.getSelectedRow(), 1).toString());
        jTextData.setText(jTableRelatAgendamento.getValueAt(jTableRelatAgendamento.getSelectedRow(), 2).toString());
        jTextServico.setText(jTableRelatAgendamento.getValueAt(jTableRelatAgendamento.getSelectedRow(), 3).toString());
        jTextValorServico.setText(jTableRelatAgendamento.getValueAt(jTableRelatAgendamento.getSelectedRow(), 4).toString());
        jTextPeca.setText(jTableRelatAgendamento.getValueAt(jTableRelatAgendamento.getSelectedRow(), 5).toString());
        jTextValorPeca.setText(jTableRelatAgendamento.getValueAt(jTableRelatAgendamento.getSelectedRow(), 6).toString());
        jTextObservacao.setText(jTableRelatAgendamento.getValueAt(jTableRelatAgendamento.getSelectedRow(), 7).toString());
        jTextValorTotal.setText(jTableRelatAgendamento.getValueAt(jTableRelatAgendamento.getSelectedRow(), 8).toString());
        jTextFormaPagamento.setText(jTableRelatAgendamento.getValueAt(jTableRelatAgendamento.getSelectedRow(), 9).toString());
        jTextQtdParcelas.setText(jTableRelatAgendamento.getValueAt(jTableRelatAgendamento.getSelectedRow(), 10).toString());
        
        
        
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um agendamento!");
        }
    }//GEN-LAST:event_jTableRelatAgendamentoMouseClicked

    public JButton getjButtonExcluir() {
        return jButtonExcluir;
    }

    public void setjButtonExcluir(JButton jButtonExcluir) {
        this.jButtonExcluir = jButtonExcluir;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getjTableRelatAgendamento() {
        return jTableRelatAgendamento;
    }

    public void setjTableRelatAgendamento(JTable jTableRelatAgendamento) {
        this.jTableRelatAgendamento = jTableRelatAgendamento;
    }

    public JTextField getjTextCliente() {
        return jTextCliente;
    }

    public void setjTextCliente(JTextField jTextCliente) {
        this.jTextCliente = jTextCliente;
    }

    public JTextField getjTextData() {
        return jTextData;
    }

    public void setjTextData(JTextField jTextData) {
        this.jTextData = jTextData;
    }

    public JTextField getjTextFieldId() {
        return jTextFieldId;
    }

    public void setjTextFieldId(JTextField jTextFieldId) {
        this.jTextFieldId = jTextFieldId;
    }

    public JTextField getjTextObservacao() {
        return jTextObservacao;
    }

    public void setjTextObservacao(JTextField jTextObservacao) {
        this.jTextObservacao = jTextObservacao;
    }

    public JTextField getjTextPeca() {
        return jTextPeca;
    }

    public void setjTextPeca(JTextField jTextPeca) {
        this.jTextPeca = jTextPeca;
    }

    public JTextField getjTextServico() {
        return jTextServico;
    }

    public JTextField getjTextFormaPagamento() {
        return jTextFormaPagamento;
    }

    public void setjTextFormaPagamento(JTextField jTextFormaPagamento) {
        this.jTextFormaPagamento = jTextFormaPagamento;
    }

    public JTextField getjTextQtdParcelas() {
        return jTextQtdParcelas;
    }

    public void setjTextQtdParcelas(JTextField jTextQtdParcelas) {
        this.jTextQtdParcelas = jTextQtdParcelas;
    }

    public void setjTextServico(JTextField jTextServico) {
        this.jTextServico = jTextServico;
    }

    public JTextField getjTextValorPeca() {
        return jTextValorPeca;
    }

    public void setjTextValorPeca(JTextField jTextValorPeca) {
        this.jTextValorPeca = jTextValorPeca;
    }

    public JTextField getjTextValorServico() {
        return jTextValorServico;
    }

    public void setjTextValorServico(JTextField jTextValorServico) {
        this.jTextValorServico = jTextValorServico;
    }

    public JTextField getjTextValorTotal() {
        return jTextValorTotal;
    }

    public void setjTextValorTotal(JTextField jTextValorTotal) {
        this.jTextValorTotal = jTextValorTotal;
    }

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if(jTableRelatAgendamento.getSelectedRow() != -1) {
        
        String nome = getjTextCliente().getText(); //Tive que criar getter e setter pra poder acessar os campos da view
        String data = getjTextData().getText();
        String servico = getjTextServico().getText();
        String valorStringServico = getjTextValorServico().getText();
        double valorServico = Double.parseDouble(valorStringServico);
        String peca = getjTextPeca().getText();
        String valorStringPeca = getjTextValorPeca().getText();
        double valorPeca = Double.parseDouble(valorStringPeca);
        String observacao = getjTextObservacao().getText();
        String valorStringTotal = getjTextValorTotal().getText();
        double valorTotal = Double.parseDouble(valorStringTotal);
        int id = ((int)jTableRelatAgendamento.getValueAt(jTableRelatAgendamento.getSelectedRow(), 0));
        String formaPagamento = getjTextFormaPagamento().getText();
        String qtdParcelasString = getjTextQtdParcelas().getText();
        int qtdParcelas = Integer.parseInt(qtdParcelasString);

        
        AgendamentoBD agendament = new AgendamentoBD(id, nome, data, servico, valorServico, peca, valorPeca, observacao, valorTotal, formaPagamento, qtdParcelas);
      
       
        try {
            Connection conexao = new Conexao().getConnection();
            AgendamentoDAO agendamentodao = new AgendamentoDAO(conexao);
            agendamentodao.delete(agendament);
            
            JOptionPane.showMessageDialog(null, "Agendamento Excluido!");
            
        } catch (SQLException ex) {
            //Logger.getLogger(CadCliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao excluir!"+ex);
        }
        
           try {
               lerJTable();
           } catch (SQLException ex) {
               Logger.getLogger(CadCliente.class.getName()).log(Level.SEVERE, null, ex);
           }
           
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um Agendamento para excluir!");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTextDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDataActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jTableRelatAgendamentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRelatAgendamentoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableRelatAgendamentoMousePressed

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
            java.util.logging.Logger.getLogger(RelatAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RelatAgendamento().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(RelatAgendamento.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRelatAgendamento;
    private javax.swing.JTextField jTextCliente;
    private javax.swing.JTextField jTextData;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFormaPagamento;
    private javax.swing.JTextField jTextObservacao;
    private javax.swing.JTextField jTextPeca;
    private javax.swing.JTextField jTextQtdParcelas;
    private javax.swing.JTextField jTextServico;
    private javax.swing.JTextField jTextValorPeca;
    private javax.swing.JTextField jTextValorServico;
    private javax.swing.JTextField jTextValorTotal;
    // End of variables declaration//GEN-END:variables
}
