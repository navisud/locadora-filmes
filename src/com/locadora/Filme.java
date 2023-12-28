package com.locadora;

import java.time.LocalDate;

public class Filme {
    public String titulo;
    public float duracao;
    public float preco;
    public boolean alugado = false;
    public LocalDate devolucao;

    public LocalDate getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(LocalDate devolucao) {
        this.devolucao = devolucao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public Filme(String titulo, float duracao, float preco, boolean alugado) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.preco = preco;
        this.alugado = alugado;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                ", preco=" + preco +
                ", alugado=" + alugado+"}";
    }
}
