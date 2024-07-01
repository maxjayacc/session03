package pe.mpfn.modelo.beans;

import java.util.Objects;

public class Curso {
    private String id;
    private String nombre;
    private int credito;

    public Curso(){

    }

    public Curso(String id, String nombre, int credito) {
        this.id = id;
        this.nombre = nombre;
        this.credito=credito;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
    @Override
    public String toString(){
        return "Curso{" + "id=" + id + ", nombre=" + nombre + ", credito=" + credito + '}';
    }
    @Override
    public int hashCode(){
        int hash = 7;
        hash = 19* hash + Objects.hashCode(this.id);
        hash = 19* hash + Objects.hashCode(this.nombre);
        hash = 19* hash + this.credito;
        return hash;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final Curso other = (Curso) obj;
        if(this.credito != other.credito){
            return false;
        }
        if(!Objects.equals(this.id, other.id)){
            return false;
        }
        if(!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;}
}

