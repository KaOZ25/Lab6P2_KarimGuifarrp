/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_karimguifarro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Karim Ozael
 */
public class admindoc {
     private ArrayList<docente> lista = new ArrayList();
    private File archivo = null;

    public admindoc(String path) {
        archivo = new File(path);
    }

    public ArrayList<docente> getLista() {
        return lista;
    }

    public void setLista(ArrayList<docente> listaPersonas) {
        this.lista = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "admin{" + "listaPersonas=" + lista + '}';
    }

    public void setDocente(docente p) {
        this.lista.add(p);
    }

    public void escribirArchivo1() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (docente t : lista) {
                bw.write(t.getUsuario() + ";");
                bw.write(t.getContraseña() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getApellido() + ";");
                bw.write(t.getNum_registro() + ";");
                bw.write(t.getTitulo_uni() + ";");
                bw.write(t.getTitulo_pos() + ";");
                bw.write(t.getVeces_clase() + ";");
                bw.write(t.getFacultad() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        lista = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    lista.add(new docente(sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.nextInt(),
                            sc.next(),
                            sc.next(),
                            sc.nextInt(),
                            sc.next()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
