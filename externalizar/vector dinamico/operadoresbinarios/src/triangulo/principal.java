package triangulo;
public class principal {
    public static void main(String[] args) {
        //crear 100 objetos "Triangulo"
        double base,altura;//base= entre 5 y 85, altura =entre 10 y 100
        Triangulo[] triangulo=new Triangulo[100];//vector tamaño 100 tipo Triangulo
        Triangulo t;
        //llenar un vector con 100 objetos tipo Triangulo
        for(int i=0;i<100;i++){
            base= Math.random()*80+5;
            altura=Math.random()*90+10;
            triangulo[i]=new Triangulo (base,altura) ;
        }
        //mostrar todos los objetos
        //n base altura area
        Triangulo.cabecera();
        for (int i = 0; i < 100; i++) {
            triangulo[i].imprimirDetalles(i);
        }
    }
}
