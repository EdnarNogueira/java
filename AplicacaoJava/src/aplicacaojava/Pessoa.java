/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaojava;

/**
 *
 * @author ednar
 */
public class Pessoa {
    String nome;
    String Sobrenome;
    int idade;
    float peso;
    
    public Pessoa(){ // Método Construtor
        
    }

    public String getNome() { // Método acessor
        return nome;
    }

    public void setNome(String nome) { // Método modificador 
        this.nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
}
