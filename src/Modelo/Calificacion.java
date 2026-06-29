/*
 * Clase modelo basada en el diagrama de clases de EcoLazo.
 */
package Modelo;

/**
 * Representa una calificacion entre usuarios despues de una solicitud.
 */
public class Calificacion {

    private int idCalificacion;
    private Solicitud solicitud;
    private Usuario calificador;
    private Usuario calificado;
    private int puntaje;
    private String comentario;
    private String fechaCalificacion;

    public Calificacion() {
    }

    public Calificacion(int idCalificacion, Solicitud solicitud, Usuario calificador, Usuario calificado,
            int puntaje, String comentario, String fechaCalificacion) {
        this.idCalificacion = idCalificacion;
        this.solicitud = solicitud;
        this.calificador = calificador;
        this.calificado = calificado;
        this.puntaje = puntaje;
        this.comentario = comentario;
        this.fechaCalificacion = fechaCalificacion;
    }

    public int getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(int idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public Usuario getCalificador() {
        return calificador;
    }

    public void setCalificador(Usuario calificador) {
        this.calificador = calificador;
    }

    public Usuario getCalificado() {
        return calificado;
    }

    public void setCalificado(Usuario calificado) {
        this.calificado = calificado;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFechaCalificacion() {
        return fechaCalificacion;
    }

    public void setFechaCalificacion(String fechaCalificacion) {
        this.fechaCalificacion = fechaCalificacion;
    }

    public void calificar() {
    }

    public double obtenerPromedio() {
        return 0.0;
    }
}