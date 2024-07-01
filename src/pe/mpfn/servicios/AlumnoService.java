package pe.mpfn.servicios;

import pe.mpfn.modelo.entidades.Alumno;
import pe.mpfn.modelo.entidades.Personal;

import java.util.List;

public interface AlumnoService {
    void grabar (Alumno alumno);
    void actualizar (Alumno alumno);
    void eliminar (int id);
    List<Alumno> listar();
    Alumno buscar (int id);
}
