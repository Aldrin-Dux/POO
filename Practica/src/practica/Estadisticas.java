package practica;

public class Estadisticas {

    protected String nombre;
    protected int numDorsal;
    private int rut;
    private int goles;
    protected int valoracion;

    public Estadisticas(String nombre, int numDorsal, int rut, int goles) {
        this.nombre = nombre;
        this.numDorsal = numDorsal;
        this.rut = rut;
        this.goles = goles;
    }  
    public String getNombre() {
        return nombre;
    }

    public int getNumDorsal() {
        return numDorsal;
    }

    public int getRut() {
        return rut;
    }

    public int getGoles() {
        return goles;
    }

    public int Valoracion() {
        valoracion = goles * 30;
        return valoracion;
    }
}
