/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helpers;

import Model.Agendamento;
import Model.AgendamentoBD;
import Model.Cliente;
import Model.Peca;
import Model.Servicos;
import View.CadAgendamento;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author breno
 */  // Helper funciona paara mostrar na tela;
public class AgendamentoHelper implements IHelper{
    
    private final CadAgendamento view;
    //private final RelAgendamento view;

    public AgendamentoHelper(CadAgendamento view) {
        this.view = view;
    }
   // public AgendamentoHelper(RelAgendamento view) {
       // this.view = view;
    //}

    public void preencherTabela(ArrayList<Peca> pecas) {
        
      DefaultTableModel tableModel = (DefaultTableModel) view.getjTableAgendamento().getModel();
      tableModel.setNumRows(0);
      
      // percorrer a lista preenchendo table model
        for (Peca peca : pecas) {
            tableModel.addRow(new Object[] {  //criando cada linha do objeto
                
                peca.getDescricao(),  //acrescentando
                peca.getMarca(),
                peca.getQtd(),
                peca.getValor()
            });
            
        }
        
    }
    
    
   

    public void preencherClientes(ArrayList<Cliente> clientes) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxCliente().getModel();
        
        for (Cliente cliente : clientes) {
            
            
            comboBoxModel.addElement(cliente);  //Aqui esta o truque// Override no Cliente, pra quando for referenciar ele no JCOmboBox ele me trazer o nome na referencia
            
        }
    }

    public void preencherServicos(ArrayList<Servicos> servicoss) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxServico().getModel();
        
        for (Servicos servicos : servicoss) {
            comboBoxModel.addElement(servicos);  //Aqui esta o truque
        }
        
    }

    public void preencherPeca(ArrayList<Peca> pecas) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxPeca().getModel();
        
        for (Peca peca : pecas) {
            
            comboBoxModel.addElement(peca);
            
        }
        
        
    }
    
    public Cliente obterCliente() { //pegando o cliente do combobox
       return (Cliente) view.getjComboBoxCliente().getSelectedItem();  //Pegando objeto seleciona do tipo cliente
    }

    public Servicos obterServico() {
       return (Servicos) view.getjComboBoxServico().getSelectedItem();  //Pegando objeto seleciona do tipo servico
    }

    public void setarValor(float valor) {
        view.getjTextValor().setText(valor+""); //Estou pegando o campo da view e passando o valor do servico//Concatenei
    }


    public Peca obterPeca() {
        return (Peca) view.getjComboBoxPeca().getSelectedItem();
    }

    public void setarValorPeca(float valor) {
        view.getjTextValorPeca().setText(valor+"");
    }
    
    
    

    public float valorTotal() {
        Float valor = Float.parseFloat(view.getjTextValor().getText());
        Float valorPeca = Float.parseFloat(view.getjTextValorPeca().getText().trim());
        Float total = valor+valorPeca;
        return total;
    }
    
    public void setaValorTotal(float total) {
     view.getjTextValorTotal().setText(total+"");
    }
    
    public Agendamento obterModelo() {
        //Receber valores da tela CadAgendamento
        String idString = view.getjTextId().getText(); //recebi como string
        int id = Integer.parseInt(idString);//passei de string para int
        Cliente cliente = obterCliente();
        int clienteid = cliente.getId();
        Servicos servico = obterServico();
        int servicoid = servico.getId();
        Peca peca = obterPeca();
        int pecaid = peca.getId();
        
        String valorString = view.getjTextValor().getText();
        double valor = Double.parseDouble(valorString);
        String data = view.getjTextData().getText(); //formated
        String dataa = data+"";
        String valorPecaString = view.getjTextValorPeca().getText();
        double valorPeca = Double.parseDouble(valorPecaString);
        String oberservacao = view.getjTextAreaObs().getText();
        String valorTotalString = view.getjTextValorTotal().getText();
        double valorTotal = Double.parseDouble(valorTotalString);
        String qtdParcelasString = (String) view.getjComboBoxParcelas().getSelectedItem();
        int qtdParcelas = Integer.parseInt(qtdParcelasString);
        String formaPagamento = (String) view.getjComboBoxFormaPagamento().getSelectedItem();
        
        //Criar um objeto do tipo Agendamento recebendo os parametros que eu recebi
        Agendamento agendamento = new Agendamento(id, clienteid, servicoid, pecaid, valor, data, valorPeca, oberservacao, valorTotal, formaPagamento, qtdParcelas);
        return agendamento;
    }
    
    public Agendamento obterModeloNome() {
        //Receber valores da tela CadAgendamento
        Cliente cliente = obterCliente();
        String nomeCliente = cliente.getNome();
        Servicos servico = obterServico();
        String nomeServico = servico.getDescricao();
        Peca peca = obterPeca();
        String nomePeca = peca.getDescricao();
        
        String valorString = view.getjTextValor().getText();
        double valor = Double.parseDouble(valorString);
        String data = view.getjTextData().getText(); //formated
        String dataa = data+"";
        String valorPecaString = view.getjTextValorPeca().getText();
        double valorPeca = Double.parseDouble(valorPecaString);
        String observacao = view.getjTextAreaObs().getText();
        String valorTotalString = view.getjTextValorTotal().getText();
        double valorTotal = Double.parseDouble(valorTotalString);
        String qtdParcelasString = (String) view.getjComboBoxParcelas().getSelectedItem();
        int qtdParcelas = Integer.parseInt(qtdParcelasString);
        String formaPagamento = (String) view.getjComboBoxFormaPagamento().getSelectedItem();
        
        //Criar um objeto do tipo Agendamento recebendo os parametros que eu recebi
        Agendamento agendamento = new Agendamento(nomeCliente, nomeServico, nomePeca, valor, data, valorPeca, observacao, valorTotal, formaPagamento, qtdParcelas);
        return agendamento;
    }
   



    @Override
    public void limparTela() {
        view.getjTextId().setText("");
        view.getjTextData().setText("");
        view.getjTextAreaObs().setText("");
        view.getjTextAreaObs().setText("");
        view.getjTextData().setText("");
        view.getjTextId().setText("");
        view.getjTextValor().setText("");
        view.getjTextValorPeca().setText("");
        view.getjTextValorTotal().setText("");
    }
    
    

}
    
   
    
    

