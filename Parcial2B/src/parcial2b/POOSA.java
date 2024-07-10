package parcial2b;

public class POOSA {

    private String nombre;
    private String apellido;
    private int cedula;
    private String direccion;
    private int aniosAntiguedad;
    private int telefono;
    protected double salario;
    
    public POOSA(String nombre, String apellido, int cedula, String direccion, 
            int aniosAntiguedad, int telefono, double salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=cedula;
        this.direccion=direccion;
        this.aniosAntiguedad=aniosAntiguedad;
        this.telefono=telefono;
        this.salario=salario;
    }
    public double calcularSalario(){
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public int getTelefono() {
        return telefono;
    }
}
