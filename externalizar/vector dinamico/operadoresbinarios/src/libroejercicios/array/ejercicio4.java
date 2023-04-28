package libroejercicios.array;
public class ejercicio4 {
    public static void main(String[] args) {
        int[] numero=new int[20];
        int[] cuadrado=new int[20];
        int[] cubo=new int[20];
        System.out.println("numero-cuadrado-cubo");
        for(int i=0;i<numero.length;i++){
            numero[i]=(int)(Math.random()*100)+1;
            cuadrado[i]=(int)Math.pow(numero[i],2 );
            cubo[i]=(int)Math.pow(numero[i],3 );
            System.out.println("("+numero[i]+"),("+cuadrado[i]+"),("+cubo[i]+")");
        }
    }
    
}
