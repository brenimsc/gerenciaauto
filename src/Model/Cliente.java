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
public class Cliente {
    private int id;
    private String nome;
    private String telefone;
    private String cpf;
    private String endereco;

    public Cliente(int id, String nome, String telefone, String cpf, String endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    /**
     *
     * @param nome
     * @param telefone
     * @param cpf
     * @param endereco
     */
   public Cliente(String nome, String telefone, String cpf, String endereco) {
       this.nome = nome;
       this.telefone = telefone;
      this.cpf = cpf;
      this.endereco = endereco;
        
  }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereço() {
        return endereco;
    }

    public void setEndereço(String endereço) {
        this.endereco = endereço;
    }
    
    @Override
    public String toString() {  //Aqui estou rescrevendo o metodo toString, pra quando for referenciar ele no JCOmboBox ele me trazer o nome na referencia
        return getNome();
    }
    
    
}
