package Tarea2;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        LocalDateTime fechaReserva = LocalDateTime.of(2022, 3, 12, 8, 0, 0);
        Cliente  cliente1 = new Cliente(01, 10508765, "katy", 31565432, "katy123@gmail.com");
        Reserva reserva1 = new Reserva(01, fechaReserva, 3, "no decoracion",null, "cumpleanos");
        System.out.println("=====================");
        System.out.println(cliente1.nombre);
        System.out.println(reserva1.fecha);
        System.out.println(reserva1.motivoAsistencia);
        System.out.println(reserva1.estado);
        System.out.println(cliente1.numeroCelular);

        System.out.println("=====================");
        reserva1.cancelarReserva();
        System.out.println("Reserva: " + reserva1.estado);

    }
        


}

