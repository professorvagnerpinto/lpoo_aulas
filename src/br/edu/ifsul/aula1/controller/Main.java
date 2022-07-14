package br.edu.ifsul.aula1.controller;

import br.edu.ifsul.aula1.model.Pessoa;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        System.out.println(pessoa1.getNome() + " " + pessoa1.getIdade());
        pessoa1.setNome("João");
        pessoa1.setIdade(30);
        System.out.println(pessoa1.getNome() + " " + pessoa1.getIdade());


        Pessoa pessoa2 = new Pessoa("Rafael", 11);
        System.out.println(pessoa2.toString());

        Pessoa pessoa3 = new Pessoa("Ana");
        System.out.println(pessoa3.toString());

    }
}
