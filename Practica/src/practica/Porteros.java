package practica;

class Porteros extends Estadisticas {

    private int atajadas;

    public Porteros( String nombre, int numDorsal, int rut, int goles,int atajadas) {
        super(nombre, numDorsal, rut, goles);
        this.atajadas = atajadas;
    }

    @Override
    public int Valoracion() {
        this.valoracion = super.Valoracion() + (atajadas * 5);
        return this.valoracion;
    }
    public void mostrarEstadistica(){
        System.out.println("El jugador"+getNombre()+" valoracion "+Valoracion());
    }
}

