package lab6p2_karimguifarro;


public class docente {
    private String usuario;
    private String contraseña;
    private String nombre;
    private String apellido;
    private int num_registro;
    private String titulo_uni;
    private String titulo_pos;
    private int veces_clase;
    private String facultad;

    public docente(String usuario, String contraseña, String nombre, String apellido, int num_registro, String titulo_uni, String titulo_pos, int veces_clase, String facultad) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.num_registro = num_registro;
        this.titulo_uni = titulo_uni;
        this.titulo_pos = titulo_pos;
        this.veces_clase = veces_clase;
        this.facultad = facultad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNum_registro() {
        return num_registro;
    }

    public void setNum_registro(int num_registro) {
        this.num_registro = num_registro;
    }

    public String getTitulo_uni() {
        return titulo_uni;
    }

    public void setTitulo_uni(String titulo_uni) {
        this.titulo_uni = titulo_uni;
    }

    public String getTitulo_pos() {
        return titulo_pos;
    }

    public void setTitulo_pos(String titulo_pos) {
        this.titulo_pos = titulo_pos;
    }

    public int getVeces_clase() {
        return veces_clase;
    }

    public void setVeces_clase(int veces_clase) {
        this.veces_clase = veces_clase;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "docente{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", apellido=" + apellido + ", num_registro=" + num_registro + ", titulo_uni=" + titulo_uni + ", titulo_pos=" + titulo_pos + ", veces_clase=" + veces_clase + ", facultad=" + facultad + '}';
    }

    
    
    
}
