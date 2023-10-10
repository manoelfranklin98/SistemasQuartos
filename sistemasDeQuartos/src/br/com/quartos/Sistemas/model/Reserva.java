package br.com.quartos.Sistemas.model;
class Reserva {
    Cliente cliente;
    Quarto quarto;
    String dataCheckIn;
    String dataCheckOut;

    public Reserva(Cliente cliente, Quarto quarto, String dataCheckIn, String dataCheckOut) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
    }

    public double calcularTotal() {

        return 0.0;
    }

    public void exibirInfo() {
        System.out.println("Reserva para o Cliente: " + cliente.nome + " - Quarto: " + quarto.numero + " - Check-In: " + dataCheckIn + " - Check-Out: " + dataCheckOut);
    }
}
