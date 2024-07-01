package pe.mpfn.modelo.dao.impl;

import org.w3c.dom.ls.LSException;
import pe.mpfn.modelo.dao.PersonalDao;
import pe.mpfn.modelo.entidades.Personal;

import java.util.ArrayList;
import java.util.List;

public class PersonalDaoMemory  implements PersonalDao {

    private List<Personal> personals;

    public PersonalDaoMemory() {
        personals = new ArrayList<>();
    }

    @Override
    public List<Personal> findByRangeEdad(Integer edadMinima, Integer edadMaxima) {
        System.out.println("PersonalDaoMemory.findByRangeEdad");
        List<Personal> subList = new ArrayList<>();
        for (Personal personal : personals) {
            if(personal.edad()>=edadMinima && personal.edad()<=edadMaxima){
                subList.add(personal);
            }
        }
        return subList;
    }

    @Override
    public void create(Personal personal) {
        System.out.println("PersonalDaoMemory.create");
        if(find(personal.id())==null && personal != null) {
            personals.add(personal);
        }
    }

    @Override
    public void update(Personal personal) {
        System.out.println("PersonalDaoMemory.update");
        for(int i=0; i<personals.size(); i++) {
            if(personals.get(i).id()==personal.id()) {
                personals.set(i, personal);
            }
        }

    }

    @Override
    public void delete(Integer id) {
        System.out.println("PersonalDaoMemory.delete");
        for(Personal persona : personals) {
            if (persona.id() == id) {
                personals.remove(persona);
            }
        }
    }

    @Override
    public List<Personal> findAll() {
        System.out.println("PersonalDaoMemory.findAll");
        return personals;
    }

    @Override
    public Personal find(Integer id) {
        System.out.println("PersonalDaoMemory.find");
        for(Personal personal : personals) {
            if (personal.id() == id) {
                return personal;
            }
        }
        return null;
    }
}
