package br.edu.ifsul.aula1.model;

//Criação de Classe
public class Pessoa {
    //atributos
    private String nome;
    private int idade;

    //comportamentos

    //construtores
    //construtor padrão ou vazio
    public Pessoa(){

    }
    //construtor parametrizado
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome){
        this.nome = nome;
    }


    //getters (leitura)
    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }
    //setters (escrita)
    public void setNome(final String nome) {
        this.nome = nome;
    }

    public void setIdade(final int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
            "nome='" + nome + '\'' +
            ", idade=" + idade +
            '}';
    }
}
