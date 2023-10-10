package br.com.quartos.Sistemas.main;
import br.com.quartos.Sistemas.model.*;

public class Main {

    public static void main(String[] args) {
        Hotel hotel = new Hotel(
                "Hotel palace",
                "123 rua das palmeiras .",
                10,
                10);

        Cliente cliente1 = new Cliente("manoel",
                1,
                "manoelfranklinf@gmail.com",
                3);
        Cliente cliente2 = new Cliente("franklin",
                2,
                "manoelfranklinf@gmail.com",
                3);

        hotel.clientes[0] = cliente1;
        hotel.clientes[1] = cliente2;

        hotel.exibirInfo();

        if (hotel.verificarDisponibilidade()) {
            int numeroQuarto = 1;
            boolean reservaEfetuada = hotel.fazerReserva(
                    cliente1, numeroQuarto,
                    "2023-11-01",
                    "2023-11-05");
            if (reservaEfetuada) {
                System.out.println("Reserva efetuada com sucesso!");
            } else {
                System.out.println("Não foi possível fazer a reserva.");
            }
        } else {
            System.out.println("Não há quartos disponíveis.");
        }

        hotel.exibirInfo();
    }
}

