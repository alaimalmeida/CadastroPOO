/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastropoo.model;

/**
 *
 * @author Alaim
 */
public class PessoaFisica extends Pessoa{
    private String cpf;
    private int idade;
    
    //construtores
    public PessoaFisica(int idade, String cpf, String nome, int id) {
        super(id, nome);
        this.cpf = cpf;
        this.idade = idade;
    }
    
    //metodo exibir
    @Override
    public void exibir() {
        super.exibir();
        System.out.println("CPF: " + cpf + "\nIdade: " + idade);
    }
    
    //getters e setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
