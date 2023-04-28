package interfaces;
public class ppalVector {
    public static void main(String[] args) {
        //metodo con vector
        resuelto trv=new resuelto();
        String[]vectorBinario={"1","0","1"};
        int x=trv.convertirVectorBinarioDecimal(vectorBinario);
        if(x!=-1){
            System.out.println("decimal: "+x);
        }else{
            System.out.println("error en entrada");
        }
        //metodo con cadena
        String cadenaBinario="10100";
        resuelto trs=new resuelto();
        x=trs.convertirVectorBinarioDecimal(cadenaBinario);
        if(x!=-1){
            System.out.println("decimal: "+x);
        }else{
            System.out.println("error en entrada");
        }
        //metodo con entero
        int numeroBinario=101011;
        resuelto trn=new resuelto();
        x=trn.convertirVectorBinarioDecimal(numeroBinario);
        if(x!=-1){
            System.out.println("decimal: "+x);
        }else{
            System.out.println("error en entrada");
        }
        //metodo con cadena binaria
        char[] charBinario={'1','0','1','1'};
        resuelto trc=new resuelto();
        x=trc.convertirVectorBinarioDecimal(charBinario);
        if(x!=-1){
            System.out.println("decimal: "+x);
        }else{
            System.out.println("error en entrada");
        }
        //convertir decimal a binario
    } 
}
