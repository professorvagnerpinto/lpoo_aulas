package br.edu.ifsul.aula1.controller;

import br.edu.ifsul.aula1.model.Pessoa;

import java.util.*;

public class PessoaController {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        System.out.println(pessoa1.getNome() + " " + pessoa1.getIdade());
        pessoa1.setId(1);
        pessoa1.setNome("João");
        pessoa1.setIdade(30);
        System.out.println(pessoa1.getNome() + " " + pessoa1.getIdade());


        Pessoa pessoa2 = new Pessoa(2, "Rafael", 11);
        System.out.println(pessoa2);

        Pessoa pessoa3 = new Pessoa(3, "Ana", 6);
        System.out.println(pessoa3);

        System.out.println("\n\nManipulando coleções");

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        System.out.println(pessoas);

        //ordenação da List
        System.out.println("\nList ordenada:");
        pessoas.sort(Comparator.comparing(Pessoa::getNome));
        System.out.println(pessoas);

        //pesquisa por força bruta
//        pessoas.forEach(p -> {
//            if(p.getNome().equals("Rafael")){
//                System.out.println(p);
//            }
//        });
//        for (Pessoa p : pessoas) {
//            if(p.getNome().equals("Rafael")){
//                System.out.println(p);
//            }
//        }

        //pesquisando List pelo método filter
        System.out.println();
        System.out.println("Pesquisando List pelo método filter:");
        Pessoa pessoafind = pessoas.stream()
            .filter(p -> p.getNome().equals("Rafael"))
            .findAny()
            .orElse(null);
        System.out.println(pessoafind);

        //Coleção do tipo MAP
        System.out.println("\n\nMap\n\n");
        Map<Integer, Pessoa> pessasMap = new HashMap<>();
        pessasMap.put(pessoa1.getId(), pessoa1);
        pessasMap.put(pessoa2.getId(), pessoa2);
        pessasMap.put(pessoa3.getId(), pessoa3);
        System.out.println(pessasMap);
        System.out.println("\nBuscando Ana:");
        System.out.println(pessasMap.get(3));
    }
}
