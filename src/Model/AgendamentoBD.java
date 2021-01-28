/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author breno
 */
public class AgendamentoBD {
    int idAgendamento;
    String nome;
    String data;
    String descricaoServico;
    Double valorServico;
    String descricaoPeca;
    Double valorPeca;
    String observacao;
    Double valorTotal;
    String formaPagamento;
    int qtdParcelas;
    

    public AgendamentoBD(String nome, String data, String descricaoServico, Double valorServico, String descricaoPeca, Double valorPeca, String observacao, Double valorTotal, String formaPagamento, int qtdParcelas) {
        this.nome = nome;
        this.data = data;
        this.descricaoServico = descricaoServico;
        this.valorServico = valorServico;
        this.descricaoPeca = descricaoPeca;
        this.valorPeca = valorPeca;
        this.observacao = observacao;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
        this.qtdParcelas = qtdParcelas;
    }
    
     public AgendamentoBD(int idAgendamento, String nome, String data, String descricaoServico, Double valorServico, String descricaoPeca, Double valorPeca, String observacao, Double valorTotal, String formaPagamento, int qtdParcelas) {
        this.idAgendamento = idAgendamento;
        this.nome = nome;
        this.data = data;
        this.descricaoServico = descricaoServico;
        this.valorServico = valorServico;
        this.descricaoPeca = descricaoPeca;
        this.valorPeca = valorPeca;
        this.observacao = observacao;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
        this.qtdParcelas = qtdParcelas;
    }

    public int getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(int idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamemento) {
        this.formaPagamento = formaPagamemento;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }
    
    

    public String getNomeCliente() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNomeServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public Double getValorServico() {
        return valorServico;
    }

    public void setValorServico(Double valorServico) {
        this.valorServico = valorServico;
    }

    public String getNomePeca() {
        return descricaoPeca;
    }

    public void setDescricaoPeca(String descricaoPeca) {
        this.descricaoPeca = descricaoPeca;
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
