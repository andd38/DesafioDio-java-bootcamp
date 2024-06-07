package br.com.DIO.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;

import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicio= LocalDate.now();
    private final LocalDate dataFinal = dataInicio.plusDays(45);

    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    private Set<Dev>devs = new HashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public Set<Dev> getDevs() {
        return devs;
    }

    public void setDevs(Set<Dev> devs) {
        this.devs = devs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bootcamp bootcamp = (Bootcamp) o;

        if (!Objects.equals(nome, bootcamp.nome)) return false;
        if (!Objects.equals(descricao, bootcamp.descricao)) return false;
        if (!dataInicio.equals(bootcamp.dataInicio)) return false;
        if (!dataFinal.equals(bootcamp.dataFinal)) return false;
        if (!Objects.equals(conteudos, bootcamp.conteudos)) return false;
        return Objects.equals(devs, bootcamp.devs);
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        result = 31 * result + dataInicio.hashCode();
        result = 31 * result + dataFinal.hashCode();
        result = 31 * result + (conteudos != null ? conteudos.hashCode() : 0);
        result = 31 * result + (devs != null ? devs.hashCode() : 0);
        return result;
    }
}
