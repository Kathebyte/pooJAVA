package Tarea2;

import java.time.LocalDateTime;

public class Reserva {
    // Atributos
    Integer id;
    LocalDateTime fecha;
    Integer cantidadPersonas;
    String estado; // activa cancelada
    String decoracionMesa;
    Integer idCliente;
    String motivoAsistencia;

    // Constructor
    Reserva(Integer nuevoId, LocalDateTime nuevoFecha, Integer nuevoCantidadPersonas, String nuevoDecoracionMesa, Integer nuevoIdCliente,String nuevoMotivoAsistencia) {
        this.id = nuevoId;
        this.fecha = nuevoFecha;
        this.decoracionMesa = nuevoDecoracionMesa;
        this.idCliente = nuevoIdCliente;
        this.cantidadPersonas = nuevoCantidadPersonas;
        this.motivoAsistencia = nuevoMotivoAsistencia;

        activarReserva();
    }

    // Metodos
    public void activarReserva () {
        this.estado = "activa";
    }

    public void cancelarReserva () {
        this.estado = "cancelada";
    }

    public void modificarReserva(LocalDateTime nuevaFecha1, Integer nuevaCantidadPersonas1,String nuevoMotivoAsistencia1, String nuevoDecoracionMesa1) {
        this.fecha= nuevaFecha1;
        this.cantidadPersonas =nuevaCantidadPersonas1;
        this.motivoAsistencia=nuevoMotivoAsistencia1;
        this.decoracionMesa=nuevoDecoracionMesa1;


    }

}

