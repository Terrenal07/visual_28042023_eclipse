package operadoresbinarios;

import java.util.Scanner;

public class operadoresbinarios {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //datos
        int i=0;
        int ban=0;
        String mask,ipa,ipb;
        //entrada
        System.out.println("Introduzca mascara de subred: ");
        mask=sc.nextLine();
        System.out.println("Introduzca IP A: ");
        ipa=sc.nextLine();
        System.out.println("Introduzca IP B: ");
        ipb=sc.nextLine();
        String[] pmask=mask.split("\\.");
        String[] pip=ipa.split("\\.");
        String[] pipb=ipb.split("\\.");
        int[] ipreda =new int [pip.length];
        int[] ipredb =new int [pipb.length];
        int[] ipmask =new int [pmask.length];
        //proceso
        if(pip.length==4 && pipb.length==4 && pmask.length==4){
            for(String s: pip){
            ipreda[i]= Integer.parseInt(s);
            i=i+1;
        }
        i=0;
        for(String s: pmask){
            ipmask[i]= Integer.parseInt(s);
            i=i+1;
        }
        i=0;
        for(String a: pipb){
            ipredb[i]= Integer.parseInt(a);
            i=i+1;
        }
        for(i=0;i<ipmask.length;i++){            
            if ((ipreda[i]&ipmask[i])==(ipredb[i]&ipmask[i])){ 
            }else{
                i=80;
            }
        }
        }else{
            System.out.println("Formato IPV4 introducido no es correcto");
            ban=1;
        }
        
        //salida
        if(i>70){
            System.out.println("no es la misma red");
            ban=2;
        }else{
            if (ban==0){
                System.out.println("es la misma red");
                ban=2;
            }else{
            }
        }
        if(i>70){
            System.out.println("no es la misma red");
            ban=2;
        }else{
            if (ban==0){
                System.out.println("es la misma red");
                ban=2;
            }else{
            }
        }
    }
}