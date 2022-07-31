package Tarea2;

public class Cliente {
    Integer id;
    Integer cedula;
    String nombre;
    Integer numeroCelular;
    String correo;
    

    // Constructor
    Cliente (Integer Id,Integer Cedula, String Nombre, Integer NumeroCelular, String Correo) {
        this.id = Id;
        this.cedula= Cedula;
        this.nombre = Nombre;
        this.numeroCelular=NumeroCelular;
        this.correo=Correo;

    }
}
