package br.com.quartos.Sistemas.model;
public class Cliente {
 public  String nome;
   public  int id;
  public  String email;
    Reserva[] reservas;

    public Cliente(String nome, int id, String email, int maxReservas) {
        this.nome = nome;
        this.id = id;
        this.email = email;
        this.reservas = new Reserva[maxReservas];
    }

    public void adicionarReserva(Reserva reserva) {
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] == null) {
                reservas[i] = reserva;
                break;
            }
        }
    }

    public void exibirInfo() {
        System.out.println("Cliente: " + nome + " - ID: " + id + " - E-mail: " + email);
    }
}