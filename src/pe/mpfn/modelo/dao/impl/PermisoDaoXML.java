package pe.mpfn.modelo.dao.impl;

import pe.mpfn.modelo.dao.PermisoDao;
import pe.mpfn.modelo.entidades.Permiso;

import java.util.List;

public class PermisoDaoXML implements PermisoDao {
    @Override
    public void create(Permiso entidad) {
        System.out.println("PermisoDaoXML.create");
    }

    @Override
    public void update(Permiso entidad) {
        System.out.println("PermisoDaoXML.update");
    }

    @Override
    public void delete(Integer id) {
        System.out.println("PermisoDaoXML.delete");
    }

    @Override
    public List<Permiso> findAll() {

        System.out.println("PermisoDaoXML.findAll");
        return List.of();
    }

    @Override
    public Permiso find(Integer id) {
        System.out.println("PermisoDaoXML.find");
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
