package pe.mpfn.modelo.beans;

import java.util.Locale;

public class Profesor extends  Persona{
    private String categoria;
    private double sueldo;

    public Profesor(String categoria, String nombre, boolean genero) {
        super(nombre,genero);
        this.categoria = categoria.toUpperCase();
    }
    public Profesor(){
        super();
    }

    public String getCategoria() {
        return categoria;
    }


    @Override
    public String toString() {
        return "Profesor{"+super.toString() + "categoria=" + categoria +"sueldo=" + getSueldo() +"}";
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria.toUpperCase();
        }
    public double getSueldo() {
        switch (categoria) {
            case "A":
                sueldo = 2000;
                break;
            case "B":
                sueldo = 1500;
                break;
            case "C":
                sueldo = 1000;
                break;
            default:
                sueldo = 0;
        }
        return sueldo;
    }
}


