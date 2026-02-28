package edu.dosw;


public abstract class Evento {
    protected String titulo;
    protected String fechaInicio;
    protected String horaInicio;
    protected int duracion;
    protected int cupoMaximo;
    protected EstadoEvento estado;
    protected List<Usuario> inscritos;

    public Evento(String titulo, String fechaInicio, String horaInicio, int duracion, int cupoMaximo) {
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.duracion = duracion;
        this.cupoMaximo = cupoMaximo;
        this.estado = EstadoEvento.PENDIENTE;
        this.inscritos = new ArrayList<>();
    }

    public boolean inscribir(Usuario usuario) {
        if (inscritos.size() >= cupoMaximo) {
            return false;
        }
        inscritos.add(usuario);
        }
        
        return true;
   
    public static notificarInscritos(string Usuario);
    
    public void cambiarEstado(EstadoEvento nuevoEstado) {
        this.estado = nuevoEstado;
        notificarInscritos("Evento " + nuevoEstado);
    }

    public void cambiarFecha(String nuevaFecha, String nuevaHora) {
        this.fechaInicio = nuevaFecha;
        this.horaInicio = nuevaHora;
        notificarInscritos("Cambio de fecha del evento " + titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public EstadoEvento getEstado() {
        return estado;
    }

    public int getCantidadInscritos() {
        return inscritos.size();
    }

}

