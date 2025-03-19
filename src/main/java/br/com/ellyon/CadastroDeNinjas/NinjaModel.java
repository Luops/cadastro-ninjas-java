package br.com.ellyon.CadastroDeNinjas;

import jakarta.persistence.*;

// JPA = Java Persistence API
@Entity // Transformar a classe em uma entidade no banco de dados
@Table(name = "tb_cadastro_de_ninjas") // Trabalhar com tabelas e setar o nome da tabela

public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Condicao para gerar o ID (Nessa caso gerar com numeros)
    private Long id;
    private String name;
    private String email;
    private int age;

    public NinjaModel(){
    }

    public NinjaModel(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
}
