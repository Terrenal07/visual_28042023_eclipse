package interfaces;
public class resuelto implements operacionesvector{

    @Override
    public int convertirVectorBinarioDecimal(String[] vectorBinario) {
        int x=0,acu=0,e=-1;
        for(int i=0,j=vectorBinario.length-1;i<vectorBinario.length;i++,j--){
            x=Integer.parseInt(vectorBinario[i]);
            if (x==1|x==0){
                acu=acu+x*(int)Math.pow(2, j);
            }else{
                acu=e;
                break;
            }
            }
        return acu;
        }

    @Override
    public int convertirVectorBinarioDecimal(String cadenaBinario) {
        int x=0,acu=0,e=-1;
            for (int i = 0, j = cadenaBinario.length() - 1; i < cadenaBinario.length(); i++, j--) {
                x = Character.getNumericValue(cadenaBinario.charAt(i));
            if (x==1|x==0){
                acu=acu+x*(int)Math.pow(2, j);
            }else{
                acu=e;
                break;
            }
            }
        return acu;
        }

    @Override
    public int convertirVectorBinarioDecimal(int numeroBinario) {
        String cadena=String.valueOf(numeroBinario);
        String[] vectorBinario=cadena.split("");
        int x=0,acu=0,e=-1;
        for(int i=0,j=vectorBinario.length-1;i<vectorBinario.length;i++,j--){
            x=Integer.parseInt(vectorBinario[i]);
            if (x==1|x==0){
                acu=acu+x*(int)Math.pow(2, j);
            }else{
                acu=e;
                break;
            }
            }
        return acu;
        }

    @Override
    public int convertirVectorBinarioDecimal(char[] vectorCaracterBinario) {
        String cadena=String.valueOf(vectorCaracterBinario);
        String[] vectorBinario=cadena.split("");
        int x=0,acu=0,e=-1;
        for(int i=0,j=vectorBinario.length-1;i<vectorBinario.length;i++,j--){
            x=Integer.parseInt(vectorBinario[i]);
            if (x==1|x==0){
                acu=acu+x*(int)Math.pow(2, j);
            }else{
                acu=e;
                break;
            }
            }
        return acu;
        }

    @Override
    public long convertirBinarioDecimal(int numeroBinario) {
        int n=numeroBinario,c,r;
        String acu="";
        while (n>=2){
            c=n/2;
            r=n%2;
            acu=r+acu;
        }
        return Long.parseLong(acu);
    }

}
