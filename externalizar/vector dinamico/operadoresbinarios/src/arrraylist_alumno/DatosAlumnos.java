package arrraylist_alumno;

import java.util.ArrayList;
import java.util.List;

public class DatosAlumnos {
    static int[] id = {1, 2, 3, 4, 5};
    static String[] nombre = {"Miguel", "Carlos", "Cesar", "Silvia", "Maria"};
    static double[] estatura = {1.70, 1.71, 1.72, 1.73, 1.74};
    static boolean[] casado = {true, false, true, false, true};

    public static List<Alumno> getListaObjetos() {
        List<Alumno> alumnos_al = new ArrayList<Alumno>();
        for (int i = 0; i < id.length; i++) {
            Alumno objetoalumno = new Alumno(id[i], nombre[i], estatura[i], casado[i]);
            alumnos_al.add(objetoalumno);
        }
        return alumnos_al;
    }
}