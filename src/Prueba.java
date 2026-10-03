public class Prueba {

    private String codigo;
    private String nombre;
    private String correo;

    public Prueba() {
    }

    public Prueba(String codigo, String nombre, String correo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Prueba{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
