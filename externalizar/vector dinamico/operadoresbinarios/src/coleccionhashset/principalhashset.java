package coleccionhashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class principalhashset {
    public static void main(String[] args) {
        Set<Integer> numeros=new HashSet<Integer>();
        for (int i=0;i<15;i++){
            numeros.add((int)(Math.random()*30+1));
        }
        System.out.println("**hashset**");
        System.out.println("Lista numeros diferentes generados");
        System.out.println(numeros);
        System.out.println("**treeset**");
        Set<Integer> numerosord=new TreeSet<Integer>();
        for (int i=0;i<15;i++){
            numerosord.add((int)(Math.random()*30+1));
        }
        System.out.println("Lista numeros diferentes generados");
        System.out.println(numerosord);
    }
    
}
