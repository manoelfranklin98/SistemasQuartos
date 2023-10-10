package br.com.quartos.Sistemas.model;

class Quarto {
    int numero;
    String tipo;
    double precoPorNoite;
    boolean disponibilidade;
    int nome;

    public Quarto(int numero, String tipo, double precoPorNoite) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoPorNoite = precoPorNoite;
        this.disponibilidade = true;
        this.nome=nome;

    }

    public void reservar() {
        disponibilidade = false;
    }

    public void liberar() {
        disponibilidade = true;
    }

    public void exibirInfo() {
        System.out.println("Quarto " + numero + " - Tipo: " + tipo + " - Preço por Noite: " + precoPorNoite + " - Disponibilidade: " + (disponibilidade ? "Disponível" : "Ocupado"));
    }
}
