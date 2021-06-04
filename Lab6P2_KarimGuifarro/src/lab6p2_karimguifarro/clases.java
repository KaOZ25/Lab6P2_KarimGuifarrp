
package lab6p2_karimguifarro;

import java.util.ArrayList;

public class clases {
   private String nombre;
   private String seccion;
   private String codigo;
   private String codigo_carrera;
   private int cant_alum;
   private int num_aula;
  private ArrayList <alumnos> alum= new ArrayList();

    public clases(String nombre, String seccion, String codigo, String codigo_carrera, int cant_alum, int num_aula) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.codigo = codigo;
        this.codigo_carrera = codigo_carrera;
        this.cant_alum = cant_alum;
        this.num_aula = num_aula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo_carrera() {
        return codigo_carrera;
    }

    public void setCodigo_carrera(String codigo_carrera) {
        this.codigo_carrera = codigo_carrera;
    }

    public int getCant_alum() {
        return cant_alum;
    }

    public void setCant_alum(int cant_alum) {
        this.cant_alum = cant_alum;
    }

    public int getNum_aula() {
        return num_aula;
    }

    public void setNum_aula(int num_aula) {
        this.num_aula = num_aula;
    }

    public ArrayList<alumnos> getAlum() {
        return alum;
    }

    public void setAlum(ArrayList<alumnos> alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return "clases{" + "nombre=" + nombre + ", seccion=" + seccion + ", codigo=" + codigo + ", codigo_carrera=" + codigo_carrera + ", cant_alum=" + cant_alum + ", num_aula=" + num_aula + ", alum=" + alum + '}';
    }
           
}
