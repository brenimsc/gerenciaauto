/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicoEmail;

import Model.Agendamento;
import Model.AgendamentoBD;
import ServicoEmail.Email;

/**
 *
 * @author breno
 */
public class Correios {
    
    public void NotificarPorEmail(Agendamento agendamento) {
        
        String emailFormatado = formarEmail(agendamento);
        String destinatario = "brenosk8_2@outlook.com";
        
        Email email = new Email("Agendamento Manutençao", emailFormatado, destinatario);
        email.enviar(); 
    }

    private String formarEmail(Agendamento agendamento) {
        
        
        
        String nomeCliente = agendamento.getNomeCliente(); 
        String servico = agendamento.getNomeServico(); 
        String peca = agendamento.getNomePeca(); 
        String data = agendamento.getData();
        double valor = agendamento.getValorTotal();
        String formaPagamento = agendamento.getFormaPagamento();
        int qtdParcelas = agendamento.getQtdParcelas();
        String obs = agendamento.getObservacao();
        
        
        return "Ola... Registramos uma manutencao em nosso sistema referente ao cliente "+nomeCliente +". "+ 
                "\n\n Segue os dados abaixo:"+
                "\n Servico: "+ servico+
                "\n Peca: "+peca +
                "\n Data: "+data+
                "\n Valor: "+valor+
                "\n Forma de Pagamento: "+formaPagamento+
                "\n Quantidade de Parcelas: "+qtdParcelas+ "x"+
                "\n Observacao: "+obs; //Arrumar a escrita que esta bugada
        
    }
    
    



}
