package edu.dosw;

public class Usuario {
    private String id;
    private String nombre;
    private String correo;

    public Usuario(String id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public boolean esProfesor() {
        return correo.endsWith("@escuelaing.edu.co");
    }

    public boolean esEstudiante() {
        return correo.endsWith("@mail.escuelaing.edu.co");
    }
}
