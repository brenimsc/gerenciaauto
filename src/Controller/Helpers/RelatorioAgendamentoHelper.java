/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helpers;

import Model.AgendamentoBD;
import View.RelatAgendamento;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author breno
 */
public class RelatorioAgendamentoHelper {
    
    private final RelatAgendamento view;
    
    public RelatorioAgendamentoHelper(RelatAgendamento view) {
        this.view = view;
    }
    
     public void preencherTabelaRelatorio(ArrayList<AgendamentoBD> agendamentos) {
        
      DefaultTableModel tableModel = (DefaultTableModel) view.getjTableRelatAgendamento().getModel();
      tableModel.setNumRows(0);
      
      // percorrer a lista preenchendo table model
        for (AgendamentoBD agendamentobd : agendamentos) {
            tableModel.addRow(new Object[] {  //criando cada linha do objeto
                
                agendamentobd.getNomeCliente(),  //acrescentando
                agendamentobd.getData(),  //acrescentando
                agendamentobd.getNomeServico(),
                agendamentobd.getValorServico(),
                agendamentobd.getNomePeca(),
                agendamentobd.getValorPeca(),
                agendamentobd.getObservacao(),
                agendamentobd.getValorTotal(),
                agendamentobd.getFormaPagamento(),
                agendamentobd.getQtdParcelas()//acrescentando 
            });
            
        }
        
    }
    
    
}
