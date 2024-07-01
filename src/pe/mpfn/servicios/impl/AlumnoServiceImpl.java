package pe.mpfn.servicios.impl;

import pe.mpfn.modelo.dao.AlumnoDao;
import pe.mpfn.modelo.dao.impl.DaoFactory;
import pe.mpfn.modelo.entidades.Alumno;
import pe.mpfn.modelo.entidades.Personal;
import pe.mpfn.servicios.AlumnoService;
import pe.mpfn.util.Util;

import java.util.List;

public class AlumnoServiceImpl implements AlumnoService {
    AlumnoDao dao;
    public AlumnoServiceImpl() {
      this.dao = DaoFactory.getInstance().getAlumnoDao(Util.tipo);
    }

    @Override
    public void grabar(Alumno alumno) {
        dao.create(alumno);

    }

    @Override
    public void actualizar(Alumno alumno) {
        dao.update(alumno);
    }

    @Override
    public void eliminar(int id) {
        dao.delete(id);
    }

    @Override
    public List<Alumno> listar() {

        return dao.findAll();
    }

    @Override
    public Alumno buscar(int id) {
        return dao.find(id);
    }
}
