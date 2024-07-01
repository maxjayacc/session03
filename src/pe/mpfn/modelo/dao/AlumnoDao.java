package pe.mpfn.modelo.dao;

import pe.mpfn.modelo.entidades.Alumno;
import pe.mpfn.modelo.entidades.Personal;

import java.util.List;

public interface AlumnoDao  extends  EntidadDao<Alumno, Integer>{
    public List<Alumno> findByNombre(String nombre);
    public  List<Alumno> findByEstado(String estado);
    public List<Alumno> findByRangeEdad(Integer edadMinima, Integer edadMaxima);
}
