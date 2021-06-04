/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_karimguifarro;

/**
 *
 * @author Karim Ozael
 */
public class alumnos extends login{
    private String nombre;
    private String apellido;
    private int edad;
    private String ID;
    private String carrera;
    private int año_estudio;
    private int prom_grad;
    private String facultad;
    public alumnos(String user, String contra) {
        super(user, contra);
    }

    public alumnos(String nombre, String apellido, int edad, String ID, String carrera, int año_estudio, int prom_grad, String facultad, String user, String contra) {
        super(user, contra);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ID = ID;
        this.carrera = carrera;
        this.año_estudio = año_estudio;
        this.prom_grad = prom_grad;
        this.facultad = facultad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAño_estudio() {
        return año_estudio;
    }

    public void setAño_estudio(int año_estudio) {
        this.año_estudio = año_estudio;
    }

    public int getProm_grad() {
        return prom_grad;
    }

    public void setProm_grad(int prom_grad) {
        this.prom_grad = prom_grad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "alumnos{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", ID=" + ID + ", carrera=" + carrera + ", a\u00f1o_estudio=" + año_estudio + ", prom_grad=" + prom_grad + ", facultad=" + facultad + super.toString()+'}';
    }
    
}
