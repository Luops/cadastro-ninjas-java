package br.com.ellyon.CadastroDeNinjas.Missoes.Model;

import br.com.ellyon.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import jakarta.persistence.*;

// JPA = Java Persistence API
// Transformar a classe em uma entidade no banco de dados
@Entity
// Trabalhar com tabelas e setar o nome da tabela
@Table(name = "tb_missoes")

public class MissoesModel {
    @Id
    // Condicao para gerar o ID (Nessa caso gerar com numeros)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private char rank;
    // @OneToMany uma missao para uma missao
    @OneToMany
    private NinjaModel ninja;

    public MissoesModel() {
    }

    public MissoesModel(String name, char rank) {
        this.name = name;
        this.rank = rank;
    }

    public MissoesModel(String name, char rank, NinjaModel ninja) {
        this.name = name;
        this.rank = rank;
        this.ninja = ninja;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameMission() {
        return name;
    }

    public void setNameMission(String nameMission) {
        this.name = nameMission;
    }

    public char getDifficulty() {
        return rank;
    }

    public void setDifficulty(char rank) {
        this.rank = rank;
    }

    public NinjaModel getNinja() {
        return ninja;
    }

    public void setNinja(NinjaModel ninja) {
        this.ninja = ninja;
    }
}
