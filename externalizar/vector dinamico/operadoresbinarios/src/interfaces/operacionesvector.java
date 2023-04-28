package interfaces;
public interface operacionesvector {
   public int convertirVectorBinarioDecimal(String[]vectorBinario);//entrada "1","0","1"... salida numero decimal(int)
   public int convertirVectorBinarioDecimal(String cadenaBinario);//entrada "101.." salida numero decimal(int)
   public int convertirVectorBinarioDecimal(int numeroBinario);//entrada 101.. salida nuemero decimal(int)
   public int convertirVectorBinarioDecimal(char[]vectorCaracterBinario);//('1','0','1'... salida nuemeor deciaml (int)
   public long convertirBinarioDecimal(int numeroBinario);//entrada 5 salida 101 
}
//polimorfismo en metodos