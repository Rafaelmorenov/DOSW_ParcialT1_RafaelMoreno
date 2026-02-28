package edu.dosw;

public class EventoFactory {

    public static Evento crearEvento(String tipo, Usuario creador, String titulo, String fechaInicio, 
                                     String horaInicio, int duracion, int cupoMaximo, 
                                     boolean requiereMaterialPrevio, String extra) {
        
        if (tipo.equalsIgnoreCase("Conferencia")) {
            if (!creador.esProfesor()) {
                throw new IllegalArgumentException("Solo profesores pueden crear conferencias");
            }
            Conferencia conf = new Conferencia(titulo, fechaInicio, horaInicio, duracion, cupoMaximo, extra);
            return conf;
        }
        
        if (tipo.equalsIgnoreCase("Taller")) {
            if (!creador.esProfesor() && !creador.getCorreo().contains("admin")) {
                throw new IllegalArgumentException("Solo profesores o administrativos pueden crear talleres");
            }
            Taller taller = new Taller(titulo, fechaInicio, horaInicio, duracion, cupoMaximo, requiereMaterialPrevio);
            return taller;
        }
        
        if (tipo.equalsIgnoreCase("Hackathon")) {
            if (!creador.esProfesor()) {
                throw new IllegalArgumentException("Solo profesores pueden crear hackathons");
            }
            Hackathon hack = new Hackathon(titulo, fechaInicio, horaInicio, duracion, cupoMaximo, extra);
            return hack;

        }
    }
}
