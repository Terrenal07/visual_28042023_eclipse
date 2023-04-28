package vectordinamico;

import java.util.Scanner;

public class passgen {
 public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
     //datos
     int lng,cnt;     
     //entrada
     System.out.println("¿De cuantos simbolos quiere la contraseña?");
     cnt=sc.nextInt();
     System.out.println("¿Cuantas contraseñas desea generar?");
     lng=sc.nextInt();
     char[][] pass = new char[lng][cnt];
     //proceso
     for (int i=0;i<pass.length;i++){
            for(int j=0;j<pass[i].length;j++){
                pass[i][j]=(char)(int)(Math.random()*26+65);
            }
            System.out.println();
     }
          for (int i=0;i<pass.length;i++){
              System.out.print("contraseña "+(i+1)+": ");
            for(int j=0;j<pass[i].length;j++){
                System.out.print(pass[i][j]);
            }
            System.out.println();
          }
  }  
}
