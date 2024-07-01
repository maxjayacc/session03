package pe.mpfn.modelo.beans;
import pe.mpfn.util.Util;

import java.util.Objects;

public class Persona {
    private int id;
    private String nombre;
    private boolean genero;

    public Persona() {
        this.id =Util.generarId();
    }
    public Persona(String nombre, boolean genero) {
        this.id = id;
        this.nombre = nombre;
        this.genero=genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre!=null)
        this.nombre = nombre;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + ", genero=" + genero + "]";
    }
    @Override
    public int hashCode(){
        int hash = 7;
        hash = 71 * hash + this.id;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + (this.genero ? 1 : 0);
        return hash;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(getClass()!=obj.getClass()){
            return false;
        }
        final Persona other = (Persona) obj;
        if(this.id!=other.id){
            return false;
        }
        if(!Objects.equals(this.nombre, other.nombre)){
            return false;
        }
        return true;
    }




}
