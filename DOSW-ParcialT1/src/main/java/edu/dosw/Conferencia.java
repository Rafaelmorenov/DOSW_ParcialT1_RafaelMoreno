package edu.dosw;

public class Conferencia extends Evento {
    private String nombreConferencista;

    public Conferencia(String titulo, String fechaInicio, String horaInicio, int duracion, int cupoMaximo, String nombreConferencista) {
        super(titulo, fechaInicio, horaInicio, duracion, cupoMaximo);
        this.nombreConferencista = nombreConferencista;
    }
}
