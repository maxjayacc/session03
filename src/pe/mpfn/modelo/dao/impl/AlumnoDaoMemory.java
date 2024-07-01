package pe.mpfn.modelo.dao.impl;

import pe.mpfn.modelo.dao.AlumnoDao;
import pe.mpfn.modelo.entidades.Alumno;
import pe.mpfn.modelo.entidades.Personal;

import java.util.ArrayList;
import java.util.List;

public class AlumnoDaoMemory  implements AlumnoDao {
    private List<Alumno> alumnos;

    public AlumnoDaoMemory() {
        this.alumnos=new ArrayList<>();
    }

    @Override
    public void create(Alumno alumno) {
        if(find(alumno.id())==null && alumno!=null) {
            alumnos.add(alumno);
        }
    }

    @Override
    public void update(Alumno alumno) {
        for(int i=0; i<alumnos.size(); i++){
            if(alumnos.get(i).id()==alumno.id()){
                alumnos.set(i, alumno);
            }
        }

    }

    @Override
    public void delete(Integer id) {

        for(Alumno alumno : alumnos){
            if(alumno.id()==id){
                alumnos.remove(alumno);
            }
        }
    }

    @Override
    public List<Alumno> findAll() {
        return alumnos;
    }

    @Override
    public Alumno find(Integer id) {
        for(Alumno alumno : alumnos){
            if(alumno.id()==id){
                return alumno;
            }
        }
        return null;
    }

    @Override
    public List<Alumno> findByNombre(String nombre) {
        return List.of();
    }

    @Override
    public List<Alumno> findByEstado(String estado) {
        return List.of();
    }

    @Override
    public List<Alumno> findByRangeEdad(Integer edadMinima, Integer edadMaxima) {
        List<Alumno> subPersonals=new ArrayList<>();
        for(Alumno alumno : alumnos){
            if(alumno.edad()>= edadMinima && alumno.edad() <= edadMaxima){
                subPersonals.add(alumno);
            }
        }
        return subPersonals;

    }
}
