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
public class Servicos {
    private int id;
    private String descricao;
    private float valor;

    public Servicos(int id, String descricao, float valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Servicos(String descricao, float valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
    
    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
