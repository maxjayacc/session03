package pe.mpfn.modelo.dao;
import pe.mpfn.modelo.entidades.Permiso;
import java.util.List;

public interface PermisoDao  extends EntidadDao <Permiso, Integer>{
public List<Permiso> findByNombre(String nombre);
public List<Permiso> findByEstado(String estado);
}

