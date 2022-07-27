package br.edu.ifsul.aula1.model;

//Criação de Classe
public class Pessoa {
    //atributos
    private int id;
    private  String nome;
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

    //construtor parametrizado
    public Pessoa(int id, final String nome, final int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    //construtor parametrizado
    public Pessoa(String nome){
        this.nome = nome;
    }

    //getters e setters

    //getters (leitura)
    public int getId() {
        return this.id;
    }
    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }

    //setters (escrita)
    public void setId(final int id) {
        this.id = id;
    }
    public void setNome(final String nome) {
        this.nome = nome;
    }
    public void setIdade(final int idade) {
        this.idade = idade;
    }

    //toString converte um objeto em uma String para a saída no terminal (* o terminal só aceita String)
    @Override
    public String toString() {
        return "Pessoa{" +
            "id=" + id +
            ", nome='" + nome + '\'' +
            ", idade=" + idade +
            '}';
    }
}
