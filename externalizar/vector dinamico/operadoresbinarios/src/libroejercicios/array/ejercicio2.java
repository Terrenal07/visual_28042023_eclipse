package libroejercicios.array;
public class ejercicio2 {
    public static void main(String[] args) {
        char[] car=new char [10];
        car[0]='a';
        car[1]='x';
        car[4]='@';
        car[6]='"';
        car[7]='+';
        car[8]='Q';
        for(int i=0;i<car.length;i++){
            System.out.print("("+car[i]+"),");
    }
    System.out.println();
    }
    
}
