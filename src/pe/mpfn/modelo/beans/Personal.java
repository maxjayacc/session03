package pe.mpfn.modelo.beans;

import pe.mpfn.util.Util;

import java.util.Objects;

public class Personal {
    private int id;
    private String nombre;
    private boolean estado;
    private double promedio;
    private int edad;
    public Personal() {
        this.id=Util.generarId();}

    public Personal(int id, String nombre, boolean estado, double promedio, int edad) {
        this.id = Util.generarId();
        this.nombre = nombre;
        this.estado = estado;
        this.promedio = promedio;
        this.edad = edad;
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
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{"+"id"+id+"nombre"+nombre+"estado"+estado+"promedio"+promedio+"edad"+edad+"}";
    }


    public int hasCode(){
        int hash = 7;
        hash= 71* hash + this.id;
        hash= 71* hash + Objects.hashCode(this.nombre);
        hash= 71* hash + (this.estado?1:0);
        return hash;
    }

    public boolean equals(Object obj){

        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final Personal other = (Personal) obj;
        if(this.id == other.id){
            return false;
        }
        if(this.estado != other.estado){
            return false;
        }
        if(this.edad != other.edad){
            return false;
        }
        if(!Objects.equals(this.nombre, other.nombre)){
            return false;
        }
        return true;
    }
}
