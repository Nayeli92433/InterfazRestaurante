public class Bebida {
    private String nombre;
    private String descripcion;
    private String precio;
    private String tipoBebida;
    public Bebida(String nombre, String descripcion, String precio, String tipoBebida) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipoBebida= tipoBebida;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public String getTipoBebida() {
        return tipoBebida;
    }
}
