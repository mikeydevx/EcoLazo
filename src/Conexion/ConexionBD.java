/*
 * Clase base para manejar la conexion con MySQL.
 */
package Conexion;

import java.sql.Connection;

/**
 * Representa la configuracion inicial de la conexion a la base de datos.
 */
public class ConexionBD {

    private String url;
    private String contrasena;
    private int puerto;
    private String nombreBD;

    public ConexionBD() {
    }

    public ConexionBD(String url, String contrasena, int puerto, String nombreBD) {
        this.url = url;
        this.contrasena = contrasena;
        this.puerto = puerto;
        this.nombreBD = nombreBD;
    }

    public Connection conectar() {
        return null;
    }

    public void desconectar() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public String getNombreBD() {
        return nombreBD;
    }

    public void setNombreBD(String nombreBD) {
        this.nombreBD = nombreBD;
    }
}