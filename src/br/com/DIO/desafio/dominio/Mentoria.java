package br.com.DIO.desafio.dominio;

import java.time.LocalDate;
import java.util.Locale;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria() {
    }

   /* public Mentoria(String titulo, String descricao, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }*/

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }



    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
