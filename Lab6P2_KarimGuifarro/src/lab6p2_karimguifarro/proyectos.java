package lab6p2_karimguifarro;
public class proyectos {
   private String titulo;
   private String descripcion;
   private int dificultad;
   private int duracion;
   private int cant_mx;
   private String fecha;

    public proyectos(String titulo, String descripcion, int dificultad, int duracion, int cant_mx, String fecha) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.dificultad = dificultad;
        this.duracion = duracion;
        this.cant_mx = cant_mx;
        this.fecha = fecha;
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

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCant_mx() {
        return cant_mx;
    }

    public void setCant_mx(int cant_mx) {
        this.cant_mx = cant_mx;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "proyectos{" + "titulo=" + titulo + ", descripcion=" + descripcion + ", dificultad=" + dificultad + ", duracion=" + duracion + ", cant_mx=" + cant_mx + ", fecha=" + fecha + '}';
    }
   
}
