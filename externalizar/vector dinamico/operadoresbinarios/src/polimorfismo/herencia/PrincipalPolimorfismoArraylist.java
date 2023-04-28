package polimorfismo.herencia;

import polimorfismo.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static libreriaibf.MetodosUtil.staticRedondear;

public class PrincipalPolimorfismoArraylist {
    static String elim=null;
    static List<FigurasGeometrica2D> listaObjetos_al=new ArrayList<FigurasGeometrica2D>();
    static Scanner sc= new Scanner(System.in);
    static FigurasGeometrica2D objetofg;
    static boolean salida=true;
    public static void main(String[] args) {
        do{
        String opcion="";
        System.out.println("(1) llenar arraylist");
        System.out.println("(2) mostrar todos los elementos");
        System.out.println("(3) limpiar Arraylist");
        System.out.println("(4) remover todos los triangulos");
        System.out.println("(5) remover todos los circulos");
        System.out.println("(6) mostrar solamente objetos triangulos");
        System.out.println("(7) mostar solamente los objetos que superen un area determinada");
        System.out.println("(8) añadir objetos de un tipo determinado");
        System.out.println("(9) salir");
        System.out.println();
        System.out.println("seleccionar (1-9)");
        opcion=sc.next();
        
        switch (opcion) {
    case "1":
        // llenar arraylist
        llenararray();
        break;
    case "2":
        // mostrar todos los elementos
        mostrarTodo();
        break;
    case "3":
        // limpiar arraylist
        listaObjetos_al.clear();
        break;
    case "4":
        // eliminar todos los triangulos
        elim="triangulo";
        eliminarfigura();
        break;
    case "5":
        // remover todos los circulos
        elim="circulo";
        eliminarfigura();
        break;
    case "6":
        // mostrar solamente objetos triangulos
        mostrarTriangulos();
        break;
    case "7":
        // mostar solamente los objetos que superen un area determinada
        mostrarArea();
        break;
    case "8":
        // añadir objetos de un tipo determinado
        anadirFigura();
        break;
    case "9":
        // salir
        salida=true;
        break;
    default:
        // Código por defecto si la opción no coincide con ningún caso
        break;
}
    }while(!salida);

    }
static public void info(){
    System.out.printf("Area %-11s: %-7.2f mm2%n",objetofg.Soy(),staticRedondear(objetofg.area()));
}
static public void llenararray(){
    String[] v = {"Triangulo", "Cuadrado", "Circulo", "Rectangulo"};
    System.out.println("numero de objetos a crear: ");
    int nu=sc.nextInt();
    FigurasGeometrica2D figura=null;
    for (int i=0;i<nu;i++){
        int n = (int) (Math.random() * 4);
        if (v[n].equals("Triangulo")){
          double base=(Math.random() * 6+1);
          double altura=(Math.random() * 6+1);
          figura=new Triangulo(base,altura);
        }
        if (v[n].equals("Cuadrado")){
          double lado=(Math.random() * 6+1);
          figura=new Cuadrado(lado);
        }
        if (v[n].equals("Rectangulo")){
          double base=(Math.random() * 6+1);
          double altura=(Math.random() * 6+1);
          figura=new Rectangulo(base,altura);
        }
        if (v[n].equals("Circulo")){
          double radio=(Math.random() * 6+1);
          figura=new Circulo(radio);
        }
        listaObjetos_al.add(figura);
    }  
}
static public void mostrarTodo(){
    System.out.println();
    for(int i=0;i<listaObjetos_al.size();i++){
            objetofg=listaObjetos_al.get(i);
            info();
        }
        System.out.println();
}
static public void eliminarfigura(){
        for (int i = 0; i < listaObjetos_al.size(); i++) {
            FigurasGeometrica2D objetoEliminar = null;
            if (listaObjetos_al.get(i).Soy().equals(elim)) {
                objetoEliminar = listaObjetos_al.get(i);
            }
            if (objetoEliminar != null) {
                listaObjetos_al.remove(objetoEliminar);
            }
        }
}
static public void mostrarTriangulos(){
    System.out.println();
    for(int i=0;i<listaObjetos_al.size();i++) {
            if (listaObjetos_al.get(i).Soy().equals("triangulo")) {
                objetofg=listaObjetos_al.get(i);
                info(); 
                }
            }
        System.out.println();
}
static public void mostrarArea(){
    System.out.println("determine area: ");
        double area=sc.nextDouble();
        System.out.println();
        for(int i=0;i<listaObjetos_al.size();i++) {
            if (listaObjetos_al.get(i).area()>area) {
                objetofg=listaObjetos_al.get(i);
                info();
            }
        }
        System.out.println();
}
static public void anadirFigura() {
    FigurasGeometrica2D gen = null;
    boolean entradaCorrecta = false;

    do {
        System.out.println("Tipo de figura a añadir (Triangulo, Cuadrado, Rectangulo o Circulo): ");
        sc.nextLine(); // Consumir el carácter de nueva línea pendiente
        String fig = sc.nextLine();

        switch (fig) {
            case "Triangulo":
                {
                    double base = (Math.random() * 6 + 1);
                    double altura = (Math.random() * 6 + 1);
                    gen = new Triangulo(base, altura);
                    entradaCorrecta = true;
                    break;
                }
            case "Cuadrado":
                double lado = (Math.random() * 6 + 1);
                gen = new Cuadrado(lado);
                entradaCorrecta = true;
                break;
            case "Rectangulo":
                {
                    double base = (Math.random() * 6 + 1);
                    double altura = (Math.random() * 6 + 1);
                    gen = new Rectangulo(base, altura);
                    entradaCorrecta = true;
                    break;
                }
            case "Circulo":
                double radio = (Math.random() * 6 + 1);
                gen = new Circulo(radio);
                entradaCorrecta = true;
                break;
            default:
                System.out.println("Entrada incorrecta");
                break;
        }
    } while (!entradaCorrecta);

    listaObjetos_al.add(gen);
    salida=false;
}
}