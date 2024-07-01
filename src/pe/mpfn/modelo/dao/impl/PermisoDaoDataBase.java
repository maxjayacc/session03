package pe.mpfn.modelo.dao.impl;

import pe.mpfn.modelo.dao.PermisoDao;
import pe.mpfn.modelo.entidades.Permiso;

import java.util.List;

public class PermisoDaoDataBase implements PermisoDao {
    @Override
    public void create(Permiso entidad) {
        System.out.println("PermisoDaoDataBase.create");
    }

    @Override
    public void update(Permiso entidad) {
        System.out.println("PermisoDaoDataBase.update");
    }

    @Override
    public void delete(Integer id) {
        System.out.println("PermisoDaoDataBase.delete");
    }

    @Override
    public List<Permiso> findAll() {
        System.out.println("PermisoDaoDataBase.findAll");
        return List.of();

    }

    @Override
    public Permiso find(Integer id) {
        System.out.println("PermisoDaoDataBase.find");
        return null;

    }

    @Override
    public List<Permiso> findByNombre(String nombre) {
        return List.of();
    }

    @Override
    public List<Permiso> findByEstado(String estado) {
        return List.of();
    }
}
