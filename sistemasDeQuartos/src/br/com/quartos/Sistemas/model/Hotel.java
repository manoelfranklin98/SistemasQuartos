package br.com.quartos.Sistemas.model;

public class Hotel {
    String nome;
    String endereco;
    Quarto[] quartos;
    public Cliente[] clientes;

    public Hotel(String nome, String endereco, int numQuartos, int numClientes) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new Quarto[numQuartos];
        this.clientes = new Cliente[numClientes];

        for (int i = 0; i < numQuartos; i++) {
            quartos[i] = new Quarto(i + 1,
                    "Simples",
                    100.0);
        }
    }

    public boolean verificarDisponibilidade() {
        for (Quarto quarto : quartos) {
            if (quarto.disponibilidade) {
                return true;
            }
        }
        return false;
    }

    public boolean fazerReserva(Cliente cliente, int numeroQuarto, String dataCheckIn, String dataCheckOut) {
        if (numeroQuarto >= 1 && numeroQuarto <= quartos.length) {
            Quarto quarto = quartos[numeroQuarto - 1];
            if (quarto.disponibilidade) {
                quarto.reservar();
                Reserva reserva = new Reserva(cliente, quarto, dataCheckIn, dataCheckOut);
                cliente.adicionarReserva(reserva);
                return true;
            }
        }
        return false;
    }

    public void cancelarReserva(Reserva reserva) {
        reserva.quarto.liberar();
        Cliente cliente = reserva.cliente;
        for (int i = 0; i < cliente.reservas.length; i++) {
            if (cliente.reservas[i] == reserva) {
                cliente.reservas[i] = null;
                break;
            }
        }
    }

    public void exibirInfo() {
        System.out.println("Hotel: " + nome + " - Endereço: " + endereco);
        System.out.println("Quartos disponíveis:");
        for (Quarto quarto : quartos) {
            quarto.exibirInfo();
        }
        System.out.println("Clientes:");
        for (Cliente cliente : clientes) {
            if (cliente != null) {
                cliente.exibirInfo();
            }
        }
    }
}