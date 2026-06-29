/*
 * Clase modelo basada en el diagrama de clases de EcoLazo.
 */
package Modelo;

import java.time.LocalDate;

/**
 * Representa un articulo publicado dentro de EcoLazo.
 */
public class Articulo {

    private int idArticulo;
    private Usuario usuario;
    private Categoria categoria;
    private String titulo;
    private String descripcion;
    private String fotoArticulo;
    private String estadoFisico;
    private String estadoPublicacion;
    private String horarioEntrega;
    private String condicionesEntrega;
    private LocalDate fechaPublicacion;

    public Articulo() {
    }

    public Articulo(int idArticulo, Usuario usuario, Categoria categoria, String titulo, String descripcion,
            String fotoArticulo, String estadoFisico, String estadoPublicacion, String horarioEntrega,
            String condicionesEntrega, LocalDate fechaPublicacion) {
        this.idArticulo = idArticulo;
        this.usuario = usuario;
        this.categoria = categoria;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fotoArticulo = fotoArticulo;
        this.estadoFisico = estadoFisico;
        this.estadoPublicacion = estadoPublicacion;
        this.horarioEntrega = horarioEntrega;
        this.condicionesEntrega = condicionesEntrega;
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFotoArticulo() {
        return fotoArticulo;
    }

    public void setFotoArticulo(String fotoArticulo) {
        this.fotoArticulo = fotoArticulo;
    }

    public String getEstadoFisico() {
        return estadoFisico;
    }

    public void setEstadoFisico(String estadoFisico) {
        this.estadoFisico = estadoFisico;
    }

    public String getEstadoPublicacion() {
        return estadoPublicacion;
    }

    public void setEstadoPublicacion(String estadoPublicacion) {
        this.estadoPublicacion = estadoPublicacion;
    }

    public String getHorarioEntrega() {
        return horarioEntrega;
    }

    public void setHorarioEntrega(String horarioEntrega) {
        this.horarioEntrega = horarioEntrega;
    }

    public String getCondicionesEntrega() {
        return condicionesEntrega;
    }

    public void setCondicionesEntrega(String condicionesEntrega) {
        this.condicionesEntrega = condicionesEntrega;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public boolean publicar() {
        return false;
    }

    public void marcarComoDonado() {
    }
}