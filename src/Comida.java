public class Comida {
    private String nombre;
    private String descripcion;
    private String precio;
    private String tipoComida;

    public Comida(String nombre, String descripcion, String precio, String tipoComida) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipoComida= tipoComida;
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

    public String getTipoComida() {
        return tipoComida;
    }
}
