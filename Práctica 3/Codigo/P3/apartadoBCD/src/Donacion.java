import java.util.Date;

public class Donacion {
    private Float cantidad;
    private Date fecha;

    public Donacion(Float cantidad, Date fecha) {
        this.setCantidad(cantidad);
        this.setFecha(fecha);
    }
    
    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
