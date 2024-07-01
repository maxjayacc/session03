package pe.mpfn.modelo.dao.impl;

import pe.mpfn.modelo.dao.PermisoDao;
import pe.mpfn.modelo.entidades.Permiso;

import java.util.ArrayList;
import java.util.List;

public class PermisoDaoMemory implements PermisoDao {

    private List<Permiso> permisos;
    public PermisoDaoMemory() {
        this.permisos= new ArrayList<>();
    }

    @Override
    public void create(Permiso permiso) {
        System.out.println("PermisoDaoMemory.create");
        if(find(permiso.id())==null && permiso != null) {
            permisos.add(permiso);
        }
    }

    @Override
    public void update(Permiso permiso) {
        System.out.println("PermisoDaoMemory.update");
                for (int i = 0; i < permisos.size(); i++) {
                    if(permisos.get(i).id()==permiso.id()){
                        permisos.set(i, permiso);
                    }
                }
    }

    @Override
    public void delete(Integer id) {
        System.out.println("PermisoDaoMemory.delete");
        for (Permiso permiso : permisos) {
            if(permiso.id()==(id)){
                permisos.remove(permiso);
            }
        }
    }

    @Override
    public List<Permiso> findAll() {
        System.out.println("PermisoDaoMemory.findAll");
        return permisos;
    }

    @Override
    public Permiso find(Integer id) {
        System.out.println("PermisoDaoMemory.find");
        for (Permiso permiso : permisos) {
            if(permiso.id()==(id)){
                return permiso;
            }
        }
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
