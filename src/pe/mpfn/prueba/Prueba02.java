package pe.mpfn.prueba;

import pe.mpfn.modelo.entidades.Permiso;
import pe.mpfn.modelo.entidades.Personal;
import pe.mpfn.servicios.PermisoService;
import pe.mpfn.servicios.PersonalService;
import pe.mpfn.servicios.impl.PermisoServiceImpl;
import pe.mpfn.servicios.impl.PersonalServiceImpl;

public class Prueba02 {
    public static void main(String[] args) {
        Personal personal = new Personal(1,"Maximo Hiraoka", "ACTIVO",30,23);
        Personal personal1 = new Personal(200,"EDER Hiraoka", "ACTIVO",10,13);
        Personal personal2 = new Personal(1,"FRANK Hiraoka", "ACTIVO",10,3);

        Permiso permiso = new Permiso(10,"PARTICULAR","activo", "PERMISO RESERVADO");
        Permiso permiso1 = new Permiso(11,"FUERA DEL HORARIO","activo", "PERMISO RESERVADO HORARIO");
        Permiso permiso2 = new Permiso(12,"CITA MEDICA","activo", "PERMISO  MEDICA");

        PermisoService  service= new PermisoServiceImpl();

        service.grabar(permiso);
        service.grabar(permiso1);
        service.grabar(permiso2);
        System.out.println("Listado de Permiso");
        for(Permiso c: service.listar()){
            System.out.println(c);
        }
        service.listar().forEach(System.out::println);


    }
}
