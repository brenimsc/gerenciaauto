/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helpers;

import Model.Cliente;
import View.RelCliente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author breno
 */
public class ClienteHelper {
    
    private final RelCliente view;
    //private final RelAgendamento view;

    public ClienteHelper(RelCliente view) {
        this.view = view;
    }
    public void preencherTabelaCliente(ArrayList<Cliente> clientes) {
        
      DefaultTableModel tableModel = (DefaultTableModel) view.getjTableRelCliente().getModel();
      tableModel.setNumRows(0);
      
      // percorrer a lista preenchendo table model
        for (Cliente cliente : clientes) {
            tableModel.addRow(new Object[] {  //criando cada linha do objeto
                
                cliente.getNome(),  //acrescentando
                cliente.getTelefone(),  //acrescentando
                cliente.getCpf(),
                cliente.getEndereço()//acrescentando 
            });
            
 
            
        }
        
    }
    
}

