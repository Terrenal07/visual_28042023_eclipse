import archivo_csv.transacciones;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class resumencategorias {
    public static void main(String[] args) {
        String nra = "data\\transacciones.csv";
        String fila = "";

        List<transacciones> transacciones = new ArrayList<transacciones>();

        File f = null;
        FileReader fr = null;
        BufferedReader br = null;
        double pagot = 0.0;
        double pagoc = 0.0;
        double categoria_electrodomesticos=0;
        double categoria_informatica=0;
        double categoria_Audio=0;
        
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
            //empieza lectura
            for (transacciones e : transacciones) {
                if (e.getCATEGORIA().equalsIgnoreCase("Electrodoméstico")) {
                    categoria_electrodomesticos+=e.getVENTAS();
                }
                if (e.getCATEGORIA().equalsIgnoreCase("Informática")) {
                    categoria_informatica+=e.getVENTAS();
                }
                if (e.getCATEGORIA().equalsIgnoreCase("Audio y televisión")) {
                    categoria_Audio+=e.getVENTAS();
                }
            }
            System.out.println("electrodomesticos: "+categoria_electrodomesticos);
            System.out.println("informatica: "+categoria_informatica);
            System.out.println("Audio y televisión: "+categoria_Audio);
        } catch (Exception e) {
            System.out.println("ERROR ARCHIVO");
        }
        for (transacciones t : transacciones) {
            //System.out.println(t);
        }
        //ESCRIBIR ARCHIVO
        String nra1 = "data\\categoria.csv";
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            f = new File(nra1);
            fw = new FileWriter(f);//fw = new FileWriter(f,true); asi comienza a escribir desde la ultima linea del archivo
            bw = new BufferedWriter(fw);
            fila = "CATEGORIA;TOTAL VENTAS";
            bw.write(fila + "\n");
            fila = "Electrodoméstico;" + categoria_electrodomesticos;
            bw.write(fila + "\n");
            fila = "Informática;" + categoria_informatica;
            bw.write(fila + "\n");
            fila = "Audio y televisión;" + categoria_Audio;
            bw.write(fila + "\n");
            bw.flush();
        } catch (Exception e) {
            System.out.println("ERROR AL ESCRIBIR ARCHIVO");
        }
    }
}
