/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AgendamentoController;
import Controller.LoginController;
import ServicoEmail.Correios;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author breno
 */
public class CadAgendamento extends javax.swing.JFrame {
    private final AgendamentoController controller;
    

    /**
     * Creates new form Servico
     */
    public CadAgendamento() throws SQLException {
        initComponents();
        controller = new AgendamentoController(this);
        iniciar();
        controller.inserirIcone(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelObs3 = new javax.swing.JLabel();
        jButtonRealServico7 = new javax.swing.JButton();
        jButtonRealServico6 = new javax.swing.JButton();
        jButtonRealServico4 = new javax.swing.JButton();
        jButtonRealServico3 = new javax.swing.JButton();
        jButtonRealServico1 = new javax.swing.JButton();
        jTextData = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxParcelas = new javax.swing.JComboBox();
        jComboBoxFormaPagamento = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jTextValorPeca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxPeca = new javax.swing.JComboBox();
        jTextValorTotal = new javax.swing.JTextField();
        jLabelObs2 = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAgendamento = new javax.swing.JTable();
        jButtonRealServico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObs = new javax.swing.JTextArea();
        jLabelObs = new javax.swing.JLabel();
        jTextValor = new javax.swing.JTextField();
        jTextId = new javax.swing.JTextField();
        jLabelValor = new javax.swing.JLabel();
        jLabelServico = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jComboBoxServico = new javax.swing.JComboBox();
        jComboBoxCliente = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextValor1 = new javax.swing.JTextField();
        jLabelValor1 = new javax.swing.JLabel();
        jLabelObs1 = new javax.swing.JLabel();
        jTextData1 = new javax.swing.JTextField();
        jTextData2 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButtonRealServico2 = new javax.swing.JButton();
        jButtonRealServico5 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agendamento");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelObs3.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabelObs3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelObs3.setText("*Clique aqui para somar");
        getContentPane().add(jLabelObs3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 170, 30));

        jButtonRealServico7.setBackground(new java.awt.Color(0, 0, 0));
        jButtonRealServico7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonRealServico7.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRealServico7.setText("Dados do agendamento");
        jButtonRealServico7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealServico7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRealServico7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 330, 40));

        jButtonRealServico6.setBackground(new java.awt.Color(255, 51, 51));
        jButtonRealServico6.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRealServico6.setText("SubTotal");
        jButtonRealServico6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealServico6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRealServico6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 130, 30));

        jButtonRealServico4.setBackground(new java.awt.Color(255, 51, 51));
        jButtonRealServico4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonRealServico4.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRealServico4.setText("Enviar por email...");
        jButtonRealServico4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealServico4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRealServico4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 170, 30));

        jButtonRealServico3.setBackground(new java.awt.Color(255, 51, 51));
        jButtonRealServico3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRealServico3.setText("Enviar por email");
        jButtonRealServico3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealServico3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRealServico3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 130, 30));

        jButtonRealServico1.setBackground(new java.awt.Color(255, 51, 51));
        jButtonRealServico1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRealServico1.setText("Enviar por email");
        jButtonRealServico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealServico1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRealServico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 130, 30));

        try {
            jTextData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextData.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDataActionPerformed(evt);
            }
        });
        getContentPane().add(jTextData, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 250, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Qtd. Parcelas");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Forma de pagamento");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 160, -1));

        jComboBoxParcelas.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jComboBoxParcelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(jComboBoxParcelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 70, -1));

        jComboBoxFormaPagamento.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jComboBoxFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dinheiro", "Cartão de Débito", "Cartão de Crédito" }));
        jComboBoxFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFormaPagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxFormaPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 280, 40));
        jComboBoxFormaPagamento.getAccessibleContext().setAccessibleDescription("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor Peça");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 80, -1));

        jTextValorPeca.setEditable(false);
        jTextValorPeca.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextValorPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextValorPecaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextValorPeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 250, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total R$");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 60, -1));

        jComboBoxPeca.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jComboBoxPeca.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxPeca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxPecaItemStateChanged(evt);
            }
        });
        jComboBoxPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPecaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxPeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 250, 40));

        jTextValorTotal.setEditable(false);
        jTextValorTotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jTextValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 280, 40));

        jLabelObs2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelObs2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelObs2.setText("Peça");
        getContentPane().add(jLabelObs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 80, 30));

        jLabelData.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelData.setForeground(new java.awt.Color(255, 255, 255));
        jLabelData.setText("Data");
        getContentPane().add(jLabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 50, 30));

        jTableAgendamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableAgendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Peça", "Marca", "Quantidade", "Valor Unitário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableAgendamento);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 740, 150));

        jButtonRealServico.setBackground(new java.awt.Color(255, 51, 51));
        jButtonRealServico.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButtonRealServico.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRealServico.setText("Realizar Serviço");
        jButtonRealServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealServicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRealServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 280, 40));

        jTextAreaObs.setColumns(20);
        jTextAreaObs.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        jTextAreaObs.setRows(5);
        jScrollPane1.setViewportView(jTextAreaObs);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 280, 190));

        jLabelObs.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelObs.setForeground(new java.awt.Color(255, 255, 255));
        jLabelObs.setText("Observação");
        getContentPane().add(jLabelObs, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 90, 30));

        jTextValor.setEditable(false);
        jTextValor.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextValorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 250, 40));

        jTextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdActionPerformed(evt);
            }
        });
        getContentPane().add(jTextId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 250, 40));

        jLabelValor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelValor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValor.setText("Valor R$");
        getContentPane().add(jLabelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 70, 30));

        jLabelServico.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelServico.setForeground(new java.awt.Color(255, 255, 255));
        jLabelServico.setText("Serviço");
        getContentPane().add(jLabelServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 60, 30));

        jLabelCliente.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCliente.setText("Cliente");
        getContentPane().add(jLabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 60, 30));

        jLabelId.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId.setText("Id");
        getContentPane().add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 60, 30));

        jComboBoxServico.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jComboBoxServico.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxServico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxServicoItemStateChanged(evt);
            }
        });
        jComboBoxServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxServicoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 250, 40));

        jComboBoxCliente.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jComboBoxCliente.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 250, 40));

        jLabel3.setBackground(new java.awt.Color(51, 255, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 990, 660));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Fundoservico.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1220, 670));

        jTextValor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextValor1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 250, 40));

        jLabelValor1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValor1.setText("Valor R$");
        getContentPane().add(jLabelValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 50, 30));

        jLabelObs1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelObs1.setText("Observação");
        getContentPane().add(jLabelObs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 80, 30));

        jTextData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextData1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 250, 40));

        jTextData2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextData2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextData2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 250, 40));

        jTextField2.setText("jTextField2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        jButtonRealServico2.setBackground(new java.awt.Color(255, 51, 51));
        jButtonRealServico2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRealServico2.setText("Enviar por email");
        jButtonRealServico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealServico2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRealServico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 130, 30));

        jButtonRealServico5.setBackground(new java.awt.Color(255, 51, 51));
        jButtonRealServico5.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRealServico5.setText("Realizar Serviço");
        jButtonRealServico5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealServico5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRealServico5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 280, 40));

        jToggleButton1.setText("jToggleButton1");
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        setSize(new java.awt.Dimension(1107, 726));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextValorActionPerformed

    private void jComboBoxServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxServicoActionPerformed

    private void jComboBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxClienteActionPerformed

    private void jButtonRealServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealServicoActionPerformed
       
        if (jTextValorTotal.getText().length() > 0) {
        try {
            this.controller.agendar();
        } catch (SQLException ex) {
            Logger.getLogger(CadAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else {
      JOptionPane.showMessageDialog(null, "Verifique se todos os campos estão preenchidos ou se o botão de 'Subtotal' já foi calculado!");
    }
        
    }//GEN-LAST:event_jButtonRealServicoActionPerformed

    private void jTextValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextValor1ActionPerformed

    private void jComboBoxPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPecaActionPerformed

    private void jComboBoxServicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxServicoItemStateChanged
        this.controller.atualizaValor();
        //String valorS = getjTextValorPeca().getText();
        //float valor = Float.parseFloat(valorS);
        
         //this.controller.atualizaValor();
        //JOptionPane.showMessageDialog(null, "Selecione a peça!");
        
      //  controller.atualizaValorTotal();  
    }//GEN-LAST:event_jComboBoxServicoItemStateChanged

    private void jTextData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextData1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextData1ActionPerformed

    private void jTextData2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextData2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextData2ActionPerformed

    private void jTextValorPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValorPecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextValorPecaActionPerformed

    private void jComboBoxPecaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxPecaItemStateChanged
        controller.atualizaValorPeca();
        
    }//GEN-LAST:event_jComboBoxPecaItemStateChanged

    private void jComboBoxFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFormaPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFormaPagamentoActionPerformed

    private void jButtonRealServico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealServico1ActionPerformed
    
        controller.enviarPorEmail();
        JOptionPane.showMessageDialog(null, "Email enviado!"
                + "\nLembre-se de Realizar o Serviço");
    }//GEN-LAST:event_jButtonRealServico1ActionPerformed

    private void jButtonRealServico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealServico2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRealServico2ActionPerformed

    private void jButtonRealServico3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealServico3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRealServico3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButtonRealServico4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealServico4ActionPerformed
        controller.enviarPorEmail();
        JOptionPane.showMessageDialog(null, "Email enviado!"
                + "\nLembre-se de Realizar o Serviço");
    }//GEN-LAST:event_jButtonRealServico4ActionPerformed

    private void jButtonRealServico5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealServico5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRealServico5ActionPerformed

    private void jButtonRealServico6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealServico6ActionPerformed
        controller.atualizaValorTotal();
    }//GEN-LAST:event_jButtonRealServico6ActionPerformed

    private void jTextIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdActionPerformed

    private void jButtonRealServico7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealServico7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRealServico7ActionPerformed

    private void jTextDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDataActionPerformed

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
            java.util.logging.Logger.getLogger(CadAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadAgendamento().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CadAgendamento.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public JButton getjButtonRealServico() {
        return jButtonRealServico;
    }

    public void setjButtonRealServico(JButton jButtonRealServico) {
        this.jButtonRealServico = jButtonRealServico;
    }

    public JTable getjTable1() {
        return jTableAgendamento;
    }

    public void setjTable1(JTable jTable1) {
        this.jTableAgendamento = jTable1;
    }

    public JTextArea getjTextAreaObs() {
        return jTextAreaObs;
    }

    public JComboBox getjComboBoxParcelas() {
        return jComboBoxParcelas;
    }

    public void setjComboBoxParcelas(JComboBox jComboBoxParcelas) {
        this.jComboBoxParcelas = jComboBoxParcelas;
    }

    public void setjTextAreaObs(JTextArea jTextAreaObs) {
        this.jTextAreaObs = jTextAreaObs;
    }

    public JTextField getjTextData() {
        return jTextData;
    }

    public void setjTextData(JFormattedTextField jTextData) {
        this.jTextData = jTextData;
    }


    public JTextField getjTextId() {
        return jTextId;
    }

    public void setjTextId(JTextField jTextId) {
        this.jTextId = jTextId;
    }

    public JTextField getjTextValor() {
        return jTextValor;
    }

    public void setjTextValor(JTextField jTextValor) {
        this.jTextValor = jTextValor;
    }

    public JTextField getjTextValor1() {
        return jTextValor1;
    }

    public void setjTextValor1(JTextField jTextValor1) {
        this.jTextValor1 = jTextValor1;
    }

    public JTable getjTableAgendamento() {
        return jTableAgendamento;
    }

    public void setjTableAgendamento(JTable jTableAgendamento) {
        this.jTableAgendamento = jTableAgendamento;
    }

    public JComboBox getjComboBoxCliente() {
        return jComboBoxCliente;
    }

    public void setjComboBoxCliente(JComboBox jComboBoxCliente) {
        this.jComboBoxCliente = jComboBoxCliente;
    }

    public JComboBox getjComboBoxServico() {
        return jComboBoxServico;
    }

    public void setjComboBoxServico(JComboBox jComboBoxServico) {
        this.jComboBoxServico = jComboBoxServico;
    }

    public JComboBox getjComboBoxPeca() {
        return jComboBoxPeca;
    }

    public void setjComboBoxPeca(JComboBox jComboBoxServico1) {
        this.jComboBoxPeca = jComboBoxServico1;
    }

    public JTextField getjTextValorPeca() {
        return jTextValorPeca;
    }

    public void setjTextValorPeca(JTextField jTextValorPeca) {
        this.jTextValorPeca = jTextValorPeca;
    }

    public JTextField getjTextValorTotal() {
        return jTextValorTotal;
    }

    public void setjTextValorTotal(JTextField jTextValorTotal) {
        this.jTextValorTotal = jTextValorTotal;
    }

    public JTextField getjTextData1() {
        return jTextData1;
    }

    public void setjTextData1(JTextField jTextData1) {
        this.jTextData1 = jTextData1;
    }

    public JTextField getjTextData2() {
        return jTextData2;
    }

    public void setjTextData2(JTextField jTextData2) {
        this.jTextData2 = jTextData2;
    }

    public JComboBox getjComboBoxFormaPagamento() {
        return jComboBoxFormaPagamento;
    }

    public void setjComboBoxFormaPagamento(JComboBox jComboBoxFormaPagamento) {
        this.jComboBoxFormaPagamento = jComboBoxFormaPagamento;
    }
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRealServico;
    private javax.swing.JButton jButtonRealServico1;
    private javax.swing.JButton jButtonRealServico2;
    private javax.swing.JButton jButtonRealServico3;
    private javax.swing.JButton jButtonRealServico4;
    private javax.swing.JButton jButtonRealServico5;
    private javax.swing.JButton jButtonRealServico6;
    private javax.swing.JButton jButtonRealServico7;
    private javax.swing.JComboBox jComboBoxCliente;
    private javax.swing.JComboBox jComboBoxFormaPagamento;
    private javax.swing.JComboBox jComboBoxParcelas;
    private javax.swing.JComboBox jComboBoxPeca;
    private javax.swing.JComboBox jComboBoxServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelObs;
    private javax.swing.JLabel jLabelObs1;
    private javax.swing.JLabel jLabelObs2;
    private javax.swing.JLabel jLabelObs3;
    private javax.swing.JLabel jLabelServico;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JLabel jLabelValor1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAgendamento;
    private javax.swing.JTextArea jTextAreaObs;
    private javax.swing.JFormattedTextField jTextData;
    private javax.swing.JTextField jTextData1;
    private javax.swing.JTextField jTextData2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextValor;
    private javax.swing.JTextField jTextValor1;
    private javax.swing.JTextField jTextValorPeca;
    private javax.swing.JTextField jTextValorTotal;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    private void iniciar() throws SQLException {
        this.controller.atualizaTabela();
        this.controller.atualizaCliente();
        this.controller.atualizaServico();
        this.controller.atualizaPeca();
        this.controller.atualizaValor();
        this.controller.atualizaValorPeca();
        //getjTextValorTotal().setText("0");
       // this.controller.atualizaValorTotal();
        
    }

 

    
}
