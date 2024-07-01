package pe.mpfn.modelo.dao.impl;

import pe.mpfn.modelo.dao.AlumnoDao;
import pe.mpfn.modelo.dao.PermisoDao;
import pe.mpfn.util.Tipo;

public class DaoFactory {
    public static final DaoFactory INSTANCE = new DaoFactory();

    public static DaoFactory getInstance()
    {return INSTANCE;}

    private DaoFactory() {

    }
    public PermisoDao getPermisoDao(Tipo tipo) {
        switch (tipo){
            case DB:
                return new PermisoDaoDataBase();
            case FILE:
                return new PermisoDaoFile();
            case XML:
                return new PermisoDaoXML();
            case MEMORY:
                return new PermisoDaoMemory();
            default:
                return null;
        }
    }
    public AlumnoDao getAlumnoDao(Tipo tipo) {
        switch (tipo) {
            case MEMORY:
                return new AlumnoDaoMemory();
            default:
                return null;
        }
    }
}




