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
public class Peca {
    private int id;
    private String descricao;
    private String marca;
    private float valor;
    private int qtd;
    //Acrescentar a quantidade e fazer igual ao homem do video aqui.

    public Peca(int id, String descricao, String marca, float valor, int qtd) {
        this.id = id;
        this.descricao = descricao;
        this.marca = marca;
        this.valor = valor;
        this.qtd = qtd;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
     public Peca(String descricao, String marca, float valor, int qtd) {
        this.descricao = descricao;
        this.marca = marca;
        this.valor = valor;
        this.qtd = qtd;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String descricao) {
        this.marca = marca;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {  //Aqui estou rescrevendo o metodo toString, pra quando for referenciar ele no JCOmboBox ele me trazer o nome na referencia
        return getDescricao();
    }
    
}

