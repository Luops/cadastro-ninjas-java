package br.com.ellyon.CadastroDeNinjas.Ninjas.Model;

import br.com.ellyon.CadastroDeNinjas.Missoes.Model.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

// JPA = Java Persistence API
// Transformar a classe em uma entidade no banco de dados
@Entity
// Trabalhar com tabelas e setar o nome da tabela
@Table(name = "tb_ninjas")

public class NinjaModel {
    @Id
    // Condicao para gerar o ID (Nessa caso gerar com numeros)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private int age;
    // @ManyToOne um ninja tem uma unica missao
    @ManyToOne
    /*
    * JoinColumn(name = "missoes_id") - Juntar as tabelas das classes Ninja + Missoes & Foreing Key ou chave estrangeira
    * */
    @JoinColumn(name = "missoes_id")
    private List<MissoesModel> missoes;

    public NinjaModel(){
    }

    public NinjaModel(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public NinjaModel(String name, String email, int age, List<MissoesModel> missoes) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.missoes = missoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<MissoesModel> getMissoes() {
        return missoes;
    }

    public void setMissoes(List<MissoesModel> missoes) {
        this.missoes = missoes;
    }
}
