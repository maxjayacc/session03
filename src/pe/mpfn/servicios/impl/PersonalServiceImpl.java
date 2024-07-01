package pe.mpfn.servicios.impl;

import pe.mpfn.modelo.dao.PersonalDao;
import pe.mpfn.modelo.dao.impl.DaoFactory;
import pe.mpfn.modelo.entidades.Personal;
import pe.mpfn.servicios.PersonalService;
import pe.mpfn.util.Util;

import java.util.List;

public class PersonalServiceImpl implements PersonalService {
    private PersonalDao dao;

    @Override
    public void grabar(Personal personal) {


        System.out.println("PersonalServiceImpl.grabar");

    }

    @Override
    public void actualizar(Personal personal) {
        System.out.println("PersonalServiceImpl.actualizar");
    }

    @Override
    public void eliminar(int id) {
        System.out.println("PersonalServiceImpl.eliminar");
    }

    @Override
    public List<Personal> listar() {
        System.out.println("PersonalServiceImpl.listar");
        return List.of();
    }

    @Override
    public Personal buscar(int id) {
        System.out.println("PersonalServiceImpl.buscar");
        return null;
    }
}
