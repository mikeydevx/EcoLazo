/*
 * Clase modelo basada en el diagrama de clases de EcoLazo.
 */
package Modelo;

/**
 * Representa una solicitud hecha por un usuario sobre un articulo.
 */
public class Solicitud {

    private int idSolicitud;
    private Articulo articulo;
    private Usuario solicitante;
    private String fechaSolicitud;
    private String estadoSolicitud;
    private String motivoSolicitud;

    public Solicitud() {
    }

    public Solicitud(int idSolicitud, Articulo articulo, Usuario solicitante, String fechaSolicitud,
            String estadoSolicitud, String motivoSolicitud) {
        this.idSolicitud = idSolicitud;
        this.articulo = articulo;
        this.solicitante = solicitante;
        this.fechaSolicitud = fechaSolicitud;
        this.estadoSolicitud = estadoSolicitud;
        this.motivoSolicitud = motivoSolicitud;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Usuario getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Usuario solicitante) {
        this.solicitante = solicitante;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getEstadoSolicitud() {
        return estadoSolicitud;
    }

    public void setEstadoSolicitud(String estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }

    public String getMotivoSolicitud() {
        return motivoSolicitud;
    }

    public void setMotivoSolicitud(String motivoSolicitud) {
        this.motivoSolicitud = motivoSolicitud;
    }

    public void crear() {
    }

    public void aceptar() {
    }

    public void rechazar() {
    }

    public void cancelar() {
    }

    public void completar() {
    }
}