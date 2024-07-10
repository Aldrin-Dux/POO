package practica;

class Defensores extends Estadisticas {

    private int pases;
    private int recuperaciones;

    public Defensores( String nombre, int numDorsal, int rut, int goles,int pases, int recuperaciones) {
        super(nombre, numDorsal, rut, goles);
        this.pases = pases;
        this.recuperaciones = recuperaciones;
    }

    @Override
    public int Valoracion() {
        this.valoracion = super.Valoracion() + (pases  + recuperaciones * 4);
        return this.valoracion;
    }
     public void mostrarEstadistica(){
        System.out.println("El jugador"+getNombre()+" valoracion "+Valoracion());
    }
}