/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Agendamento;
import Model.Cliente;
import Model.Peca;
import Model.Servicos;
import java.util.ArrayList;

/**
 *
 * @author breno
 */
public class Banco {
    
    public static ArrayList<Peca> peca;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Servicos> servico;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        peca = new ArrayList<Peca>();
        cliente = new ArrayList<Cliente>();
        servico = new ArrayList<Servicos>();
        agendamento = new ArrayList<Agendamento>();
        
        //criando elementos
        
        /*Peca peca1 = new Peca(1, "Martelo", "Ferro", 30);
        Peca peca2 = new Peca(2, "Parafuso", "Ferro", 15);*/
         
        Cliente cliente1 = new Cliente(1, "Alan", "14", "42561", "Garça");
        Cliente cliente2 = new Cliente(2, "Joao", "14", "42561", "Garça");
        Cliente cliente3 = new Cliente(3,"Alan", "14", "42561", "Garça");
        Cliente cliente4 = new Cliente(4, "Neymar Santos", "14", "42561", "Garça");
       
        
        Servicos servico1 = new Servicos(1, "Manutençao", 18);
        Servicos servico2 = new Servicos(2, "Retirada", 30);
        Servicos servico3 = new Servicos(3, "Martelada", 15);
        Servicos servico4 = new Servicos(4, "Bateria", 25);

      //  Agendamento agendamento1 = new Agendamento(1, cliente1, servico2, 30, "14/07/2018 09:30",peca1,"teste",7,7);
       // Agendamento agendamento2 = new Agendamento(2, cliente3, servico4, 40, "14/07/2018 10:00",peca2,"teste",8,8);
       // Agendamento agendamento3 = new Agendamento(3, cliente4, servico1, 18, "14/07/2018 10:30",peca1,"teste",9,9);
        
        //Adiciona Elementos na lista
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
  
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);

        
      //  agendamento.add(agendamento1);
      //  agendamento.add(agendamento2);
    //    agendamento.add(agendamento3);
        
    }
    
}
