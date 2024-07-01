package pe.mpfn.servicios;

import pe.mpfn.modelo.entidades.Personal;

import java.util.List;

public interface PersonalService {
    void grabar (Personal personal);
    void actualizar (Personal personal);
    void eliminar (int id);
    List<Personal> listar();
    Personal buscar (int id);

}
