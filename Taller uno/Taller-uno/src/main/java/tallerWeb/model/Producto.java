package tallerWeb.model;

import java.util.Date;

public class Producto {
    public Producto() {
    }
    private String descripcion;
    private String categoria;
    private int existencia;
    private int precio;
    
    private Date ultimoIngreso;
    private boolean disponible;
    private String observacion;
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getExistencia() {
        return existencia;
    }
    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public Date getUltimoIngreso() {
        return ultimoIngreso;
    }
    public void setUltimoIngreso(Date ultimoIngreso) {
        this.ultimoIngreso = ultimoIngreso;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public String getObservacion() {
        return observacion;
    }
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    @Override
    public String toString() {
        return "Producto [descripcion=" + descripcion + ", categoria=" + categoria + ", existencia=" + existencia
                + ", precio=" + precio + ", ultimoIngreso=" + ultimoIngreso + ", disponible=" + disponible
                + ", observacion=" + observacion + "]";
    }
    
}
