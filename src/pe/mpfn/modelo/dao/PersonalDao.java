package pe.mpfn.modelo.dao;
import pe.mpfn.modelo.entidades.Personal;
import java.util.List;

public interface PersonalDao extends EntidadDao<Personal ,Integer> {

public List<Personal> findByRangeEdad(Integer edadMinima, Integer edadMaxima);
}
