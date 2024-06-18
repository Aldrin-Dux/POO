package pkg2dobimestre;

public class EstudioCaso2 {

    public static void main(String[] args) {

    }
}

class trabajo {

    public int id;
    public String descripcion;
    public double numeroHoras;
    public String estado;
    public double costoTrabajo;
    public int plazo;

    public trabajo(int id, String descripcion, int plazo) {
        this.id = id;
        this.descripcion = descripcion;
        this.plazo = plazo;
    }
public void setEstado(String estado){
        this.estado=estado;
    }
    public void aumentarHoras(double numeroHorasIncremento) {
        this.numeroHoras+=numeroHorasIncremento;
    }
    public void calcularCostoTrabajo() {
        
    }
    
    @Override
    public String toString() {
        return "trabajo{" + "id=" + id + ", descripcion=" + descripcion + ", numeroHoras="
                + numeroHoras + ", estado=" + estado + ", costoTrabajo=" + costoTrabajo + ", plazo=" + plazo + '}';
    }
    
}

class ReparacionMecanica extends trabajo {
    public double precioMaterial;
    public ReparacionMecanica(double precioMaterial, int id, String descripcion, int plazo) {
        super(id, descripcion, plazo);
        this.precioMaterial = precioMaterial;
    }  
    @Override
    public void calcularCostoTrabajo() {}
    public void aumentarPrecio(){}

    @Override
    public String toString() {
        return "ReparacionMecanica{"+super.toString() + "precioMaterial=" + precioMaterial + '}';
    }
    
}

class ReparacionChapasPinturas extends trabajo {
    public double precioMaterial;
    public ReparacionChapasPinturas(double precioMaterial, int id, String descripcion, int plazo) {
        super(id, descripcion, plazo);
        this.precioMaterial = precioMaterial;
    }
    @Override
    public void calcularCostoTrabajo() {}
    public void aumentarPrecio(){}

    @Override
    public String toString() {
        return "ReparacionChapasPinturas{"+super.toString() + "precioMaterial=" + precioMaterial + '}';
    }
    
}

class Revision extends trabajo {

    public void revision() {
    }
    public Revision(int id, String descripcion, int plazo) {
        super(id, descripcion, plazo);
    }
    @Override
    public void calcularCostoTrabajo() {}    
}
