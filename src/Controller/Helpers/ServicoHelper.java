/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helpers;

import Model.Servicos;
import View.RelServico;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author breno
 */
public class ServicoHelper {

   private final RelServico view;
    //private final RelAgendamento view;

    public ServicoHelper(RelServico view) {
        this.view = view;
    }
    public void preencherTabelaServico(ArrayList<Servicos> servicos) {
        
      DefaultTableModel tableModel = (DefaultTableModel) view.getjTableRelServico().getModel();
      tableModel.setNumRows(0);
      
      // percorrer a lista preenchendo table model
        for (Servicos servico : servicos) {
            tableModel.addRow(new Object[] {  //criando cada linha do objeto
                
                servico.getDescricao(),  //acrescentando
                servico.getValor()//acrescentando 
            });
            
 
            
        }
        
    }
}
