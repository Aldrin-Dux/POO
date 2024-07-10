package practic;

class Atacantes extends Estadisticas {

    private int pases;
    private int recuperaciones;

    public Atacantes( String nombre, int numDorsal, int rut, int goles,int pases, int recuperaciones) {
        super(nombre, numDorsal, rut, goles);
        this.pases = pases;
        this.recuperaciones = recuperaciones;
    }
    @Override
    public int Valoracion() {
        this.valoracion = super.Valoracion() + (pases * 2 + recuperaciones * 3);
        return this.valoracion;
    }

     public void mostrarEstadistica(){
        System.out.println("El jugador"+getNombre()+" valoracion "+Valoracion());
    }
    
}
