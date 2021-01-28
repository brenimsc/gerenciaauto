/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helpers;

import Model.Peca;
import View.RelPeca;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author breno
 */
public class PecaHelper {
     private final RelPeca view;
    //private final RelAgendamento view;

    public PecaHelper(RelPeca view) {
        this.view = view;
    }
    public void preencherTabelaPeca(ArrayList<Peca> pecas) {
        
      DefaultTableModel tableModel = (DefaultTableModel) view.getjTableRelPeca().getModel();
      tableModel.setNumRows(0);
      
      // percorrer a lista preenchendo table model
        for (Peca peca : pecas) {
            tableModel.addRow(new Object[] {  //criando cada linha do objeto
                
                peca.getId(),  //acrescentando
                peca.getDescricao(),
                peca.getMarca(),
                peca.getValor(),
                peca.getQtd()//acrescentando 
            });
            
 
            
        }
        
    }
}
