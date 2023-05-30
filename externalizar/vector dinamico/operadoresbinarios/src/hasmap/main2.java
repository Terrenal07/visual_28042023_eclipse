package hasmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class main2 {

    public static void main(String[] args) {
        Map<Integer, String> diccionario = new HashMap<>();

        diccionario.put(1, "maria");
        diccionario.put(2, "marla");
        diccionario.put(3, "marta");
        diccionario.put(4, "mari");
        diccionario.put(5, "marina");
        diccionario.put(6, "marina");
        diccionario.put(7, "marina");

        TreeSet<String> val = new TreeSet<>();//se crea un treeset con el nombre valores
        for (String value : diccionario.values()) {//por cada valor en el diccionario se realiza una vuelta en el bucle for
            val.add(value);//en cada vuelta se coge un valor del diccionario y se añade al treeset value
        }//como el treeset no puede tener valores repetidos ese contendra todos los nombres unicos 

        System.out.println("Valores en el TreeSet:"+val);
        
    }

}
