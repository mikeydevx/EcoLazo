/*
 * Clase modelo basada en el diagrama de clases de EcoLazo.
 */
package Modelo;

/**
 * Representa un movimiento de lazos asociado a un usuario.
 */
public class TransaccionLazo {

    private int idTransaccion;
    private Usuario usuario;
    private String tipoMovimiento;
    private int cantidad;
    private String motivo;
    private String fechaTransaccion;

    public TransaccionLazo() {
    }

    public TransaccionLazo(int idTransaccion, Usuario usuario, String tipoMovimiento, int cantidad, String motivo,
            String fechaTransaccion) {
        this.idTransaccion = idTransaccion;
        this.usuario = usuario;
        this.tipoMovimiento = tipoMovimiento;
        this.cantidad = cantidad;
        this.motivo = motivo;
        this.fechaTransaccion = fechaTransaccion;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(String fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public void registrarMovimiento() {
    }

    public int consultarSaldo() {
        return 0;
    }
}