package hasmap;

import java.util.HashMap;
import java.util.Map;

public class main1 {

    public static void main(String[] args) {
        //mostrar todo
        Map<Integer, String> diccionario = new HashMap<>();

        diccionario.put(1, "maria");
        diccionario.put(2, "marla");
        diccionario.put(3, "marta");
        diccionario.put(4, "mari");
        diccionario.put(5, "marina");

        for (Map.Entry<Integer, String> x : diccionario.entrySet()) {
            System.out.println(x.getKey() + "," + x.getValue());
            System.out.println(x);
        }
        //buscar por clave    
        String valor = diccionario.get(3);
        System.out.println("valor: 3" + ", " + valor);

        //eliminar por clave
        String eliminado = diccionario.remove(3);
        System.out.println(eliminado + " eliminado");

        //pertenecia
        if (diccionario.containsKey(4)) {
            System.out.println("ahi esta 4");

        } else {
            System.out.println("akinoestan 4");
        }
        //tamaño diccionario
        System.out.println("tamaño: "+diccionario.size());
        //
        
    }

}
