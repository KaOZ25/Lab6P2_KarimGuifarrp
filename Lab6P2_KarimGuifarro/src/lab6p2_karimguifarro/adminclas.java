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
public class adminclas {
       private ArrayList<clases> lista = new ArrayList();
    private File archivo = null;

    public adminclas(String path) {
        archivo = new File(path);
    }

    public ArrayList<clases> getLista() {
        return lista;
    }

    public void setLista(ArrayList<clases> lista) {
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

    public void setClases(clases p) {
        this.lista.add(p);
    }

    public void escribirArchivo1() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (clases t : lista) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getSeccion() + ";");
                bw.write(t.getCodigo() + ";");
                bw.write(t.getCodigo_carrera() + ";");
                bw.write(t.getCant_alum() + ";");
                bw.write(t.getNum_aula() + ";");
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
                    lista.add(new clases(sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.nextInt(),
                            sc.nextInt()       
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
