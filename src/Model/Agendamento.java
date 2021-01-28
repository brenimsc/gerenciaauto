/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author breno
 */
public class Agendamento {
    
    private int idAgendamento;
    private String nomeCliente;
    private int idCliente;
    private String nomeServico;
    private int idServico;
    private String nomePeca;
    private int idPeca;
    private int qtdParcelas;
    private String formaPagamento; 
    private Double valorServico;
    private String data;
    private Double valorPeca;
    private String observacao;
    private Double valorTotal;


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public String getNomePeca() {
        return nomePeca;
    }

    public void setNomePeca(String nomePeca) {
        this.nomePeca = nomePeca;
    }
  

    public Agendamento( String nomeCliente, String nomeServico, String nomePeca, Double valorServico, String data, Double valorPeca, String observacao, Double valorTotal, String formaPagamento, int qtdParcelas) {
        this.nomeCliente = nomeCliente;
        this.nomeServico = nomeServico;
        this.nomePeca = nomePeca;
        this.valorServico = valorServico;
        this.data = data;
        this.valorPeca = valorPeca;
        this.observacao = observacao;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
        this.qtdParcelas = qtdParcelas;
        
    }
    

    public Agendamento(int idAgendamento, int idCliente, int idServico, int idPeca, Double valorServico, String data, Double valorPeca, String observacao, Double valorTotal, String formaPagamento, int qtdParcelas) {
        this.idAgendamento = idAgendamento;
        this.idCliente = idCliente;
        this.idServico = idServico;
        this.idPeca = idPeca;
        this.valorServico = valorServico;
        this.data = data;
        this.valorPeca = valorPeca;
        this.observacao = observacao;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
        this.qtdParcelas = qtdParcelas;
    }
    
    public Agendamento( int idCliente, int idServico, int idPeca, Double valorServico, String data, Double valorPeca, String observacao, Double valorTotal, String formaPagamento, int qtdParcelas) {
        this.idCliente = idCliente;
        this.idServico = idServico;
        this.idPeca = idPeca;
        this.valorServico = valorServico;
        this.data = data;
        this.valorPeca = valorPeca;
        this.observacao = observacao;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
        this.qtdParcelas = qtdParcelas;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    
    
    public int getIdAgendamento() {
        return idAgendamento;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public int getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(int idPeca) {
        this.idPeca = idPeca;
    }

    public Double getValorServico() {
        return valorServico;
    }

    public void setValorServico(Double valorServico) {
        this.valorServico = valorServico;
    }

    public String getData() {
        return data;
    }
    
    public String getDataFormatada() {
        
        return new SimpleDateFormat("dd/MM/yyyy").format(data);
       
        
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getValorPeca() {
        return valorPeca;
    }

    public void setValorPeca(Double valorPeca) {
        this.valorPeca = valorPeca;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
 
   
    
    
}
