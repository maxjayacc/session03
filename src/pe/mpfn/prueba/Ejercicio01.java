package pe.mpfn.prueba;

import pe.mpfn.modelo.entidades.Alumno;
import pe.mpfn.modelo.entidades.Permiso;
import pe.mpfn.servicios.AlumnoService;
import pe.mpfn.servicios.impl.AlumnoServiceImpl;

public class Ejercicio01 {

    public static void main(String[] args) {
        //TODO mostrar la lista del Personal

        Alumno alumno = new Alumno(10,"MAX EDER","activo",20,12);
        Alumno alumno1 = new Alumno(11,"frank EDER","activo",15,12);
        Alumno alumno2 = new Alumno(12,"JUDAS","desactivo",15,10);
        Alumno alumno4 = new Alumno(13,"PERSY","desactivo",15,9);

        AlumnoService servicio = new AlumnoServiceImpl();
        servicio.grabar(alumno);
        servicio.grabar(alumno1);
        servicio.grabar(alumno2);
        servicio.grabar(alumno4);

        System.out.println("Listado de Permiso");
        for(Alumno a: servicio.listar()){
            System.out.println(a);
        }




    }
}
