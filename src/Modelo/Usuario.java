/*
 * Clase modelo basada en el diagrama de clases de EcoLazo.
 */
package Modelo;

import java.time.LocalDate;

/**
 * Representa a un usuario dentro de EcoLazo.
 */
public class Usuario {

    private int idUsuario;
    private String nombre;
    private String apellidoPaterno;
    private String correo;
    private String telefono;
    private String ubicacion;
    private int saldoLazos;
    private String respuestaSeguridad;
    private String contrasena;
    private LocalDate fechaRegistro;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String apellidoPaterno, String correo, String telefono,
            String ubicacion, int saldoLazos, String respuestaSeguridad, String contrasena,
            LocalDate fechaRegistro) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.correo = correo;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.saldoLazos = saldoLazos;
        this.respuestaSeguridad = respuestaSeguridad;
        this.contrasena = contrasena;
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getSaldoLazos() {
        return saldoLazos;
    }

    public void setSaldoLazos(int saldoLazos) {
        this.saldoLazos = saldoLazos;
    }

    public String getRespuestaSeguridad() {
        return respuestaSeguridad;
    }

    public void setRespuestaSeguridad(String respuestaSeguridad) {
        this.respuestaSeguridad = respuestaSeguridad;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean iniciarSesion() {
        return false;
    }

    public void registrarse() {
    }

    public boolean verificarIdentidad() {
        return false;
    }
}