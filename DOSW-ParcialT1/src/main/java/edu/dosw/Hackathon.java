package edu.dosw;

public class Hackathon extends Evento {
    private String fechaLimiteInscripcion;

    public Hackathon(String titulo, String fechaInicio, String horaInicio, int duracion, int cupoMaximo, String fechaLimiteInscripcion) {
        super(titulo, fechaInicio, horaInicio, duracion, cupoMaximo);
        this.fechaLimiteInscripcion = fechaLimiteInscripcion;
    }

}
