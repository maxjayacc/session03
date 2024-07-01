package pe.mpfn.prueba;

import pe.mpfn.modelo.dao.PermisoDao;
import pe.mpfn.modelo.dao.impl.DaoFactory;
import pe.mpfn.modelo.entidades.Alumno;
import pe.mpfn.modelo.entidades.Permiso;
import pe.mpfn.modelo.entidades.Personal;
import pe.mpfn.util.Util;

public class Prueba01 {
    public static void main(String[] args) {

        Permiso permiso = new Permiso(100,"Permiso Particular","true","Permiso particular");
        PermisoDao dao = DaoFactory.getInstance().getPermisoDao(Util.tipo);
        dao.create(permiso);

    }
}
