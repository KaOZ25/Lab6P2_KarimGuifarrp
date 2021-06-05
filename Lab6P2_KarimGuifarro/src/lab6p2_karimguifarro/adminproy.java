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
public class adminproy {
       private ArrayList<proyectos> lista = new ArrayList();
    private File archivo = null;

    public adminproy(String path) {
        archivo = new File(path);
    }

    public ArrayList<proyectos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<proyectos> lista) {
        this.lista = lista;
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

    public void setProyectos(proyectos p) {
        this.lista.add(p);
    }

    public void escribirArchivo1() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (proyectos t : lista) {
                bw.write(t.getTitulo() + ";");
                bw.write(t.getDescripcion() + ";");
                bw.write(t.getDificultad() + ";");
                bw.write(t.getDuracion() + ";");
                bw.write(t.getCant_mx() + ";");
                bw.write(t.getFecha() + ";");
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
                    lista.add(new proyectos(sc.next(),
                            sc.next(),
                            sc.nextInt(),
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
