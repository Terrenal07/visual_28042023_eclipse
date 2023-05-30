package archivos_csv;

import archivo_csv.transacciones;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class lectura {

    public static void main(String[] args) {
        String nra = "data\\transacciones.csv";
        String fila = "";

        List<transacciones> transacciones = new ArrayList<transacciones>();

        File f = null;
        FileReader fr = null;
        BufferedReader br = null;
        double pagot = 0.0;
        double pagoc = 0.0;

        try {
            f = new File(nra);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            int i = 0;

            while ((fila = br.readLine()) != null) {
                //System.out.println(fila);
                String[] partes = fila.split(";");
                if (i != 0) {
                    transacciones t = new transacciones(Integer.parseInt(partes[0]),
                            partes[1],
                            partes[2],
                            Double.parseDouble(partes[3]),
                            partes[4],
                            partes[5]);
                    transacciones.add(t);
                }
                i++;
            }
            for (transacciones e : transacciones) {
                if (e.getFORMA_PAGO().equalsIgnoreCase("Contado")) {
                    pagoc = pagoc + e.getVENTAS();
                } else {
                    pagot = pagot + e.getVENTAS();
                }

            }
            if (pagoc > pagot) {
                System.out.println("Se ha pagado más al contado");
                System.out.println("Se ha pagado al contado " + pagoc + " frente al pago en tarjeta " + pagot);
            } else {
                System.out.println("Se ha pagado más en tarjeta");
                System.out.println("Se ha pagado en tarjeta " + pagot + " frente al pago en contado " + pagoc);
            }

        } catch (Exception e) {
            System.out.println("ERROR ARCHIVO");

        }

        for (transacciones t : transacciones) {
            //System.out.println(t);
        }

        //AVERIGUAR QUE FORMA DE PAGO TUVO LA MAYOR VENTA EN TOTAL.
        //ESCRIBIR ARCHIVO
        String nra1 = "data\\resumen.csv";
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            f = new File(nra1);
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            fila = "FORMA PAGO;VENTA";
            bw.write(fila + "\n");
            fila = "Contado;" + pagoc;
            bw.write(fila + "\n");
            fila = "Tarjeta;" + pagot;
            bw.write(fila + "\n");
            bw.flush();
        } catch (Exception e) {
            System.out.println("ERROR AL ESCRIBIR ARCHIVO");
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (Exception e) {
                System.out.println("ERROR AL CERRAR ARCHIVO");
            }
        }
    }
}
