package pe.mpfn.servicios.impl;
import pe.mpfn.modelo.dao.PermisoDao;
import pe.mpfn.modelo.dao.impl.DaoFactory;
import pe.mpfn.modelo.entidades.Permiso;
import pe.mpfn.servicios.PermisoService;
import pe.mpfn.util.Util;

import java.util.List;

public class PermisoServiceImpl implements PermisoService {

    private PermisoDao dao;
    public PermisoServiceImpl() {
        this.dao = DaoFactory.getInstance().getPermisoDao(Util.tipo);
    }
    @Override
    public void grabar(Permiso permiso) {
        dao.create(permiso);

    }

    @Override
    public void actualizar(Permiso permiso) {
        dao.update(permiso);

    }

    @Override
    public void eliminar(int id) {
        dao.delete(id);

    }

    @Override
    public List<Permiso> listar() {
        return dao.findAll();
    }

    @Override
    public Permiso buscar(int id) {
        return dao.find(id);
    }
}
