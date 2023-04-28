package arrraylist_alumno;

import java.util.List;

public class ppal1 {
    public static void main(String[] args) {
        //obtener todos los registro como una lista de objetos
        //DatosAlumnos da=new DatosAlumnos();
        List<Alumno> alumnos_al=DatosAlumnos.getListaObjetos();
        //mostrar en form de tabla
        for (int i=0;i<alumnos_al.size();i++){
            Alumno objetoalumno=alumnos_al.get(i);
            System.out.println(objetoalumno.toString());
        }
    }
}