package pe.mpfn.servicios;

import pe.mpfn.modelo.entidades.Permiso;


import java.util.List;

public interface PermisoService {
    void grabar(Permiso permiso);
    void actualizar(Permiso permiso);
    void eliminar(int id);
    List<Permiso> listar();
    Permiso buscar(int id);
}
