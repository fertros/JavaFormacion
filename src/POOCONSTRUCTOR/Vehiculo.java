package POOCONSTRUCTOR;

public class Vehiculo {
    //Variables de la clase
    int pasajeros;
    int capacidad;
    int consumo;

    //Constructor para Vehiculo
    Vehiculo(int pas, int cap, int con) {
        pasajeros = pas;
        capacidad = cap;
        consumo = con;
    }
    //Autonomia del Vehiculo
    int Autonomia() {
        return (capacidad*100)/consumo;
    }
}

