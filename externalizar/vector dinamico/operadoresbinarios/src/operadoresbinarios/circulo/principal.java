package operadoresbinarios.circulo;
public class principal {
    public static void main(String[] args) {
        double radio;
        Circulo[]circulo=new Circulo[100];
        Circulo c;
        for(int i=0;i<100;i++){
            radio= Math.random()*99+1;
            circulo[i]=new Circulo (radio) ;
        }
        Circulo.cabecera();
        for (int i = 0; i < 100; i++) {
            circulo[i].imprimirDetalles(i+1);
        }
    }
}
