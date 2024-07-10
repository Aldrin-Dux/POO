package parcial2b;

class Secretarios extends POOSA {

    public int despacho;
    public int horasLaboradas;
    public double costoHora;
    public int horasExtra;

    public Secretarios(String nombre, String apellido, int cedula, String direccion,
            int aniosAntiguedad, int telefono, double salario, int despacho,
            int horasLaboradas,double costoHora, int horasExtra) {
        super(nombre, apellido, cedula, direccion, aniosAntiguedad, telefono, salario);
        this.despacho = despacho;
        this.horasLaboradas = horasLaboradas;
        this.costoHora = costoHora;
        this.horasExtra = horasExtra;
    }

    @Override
    public double calcularSalario() {
        this.salario = super.calcularSalario()+(horasLaboradas*costoHora+
                (horasExtra*(costoHora*0.5)));
        return this.salario;
    }
    public void mostrarDatos(){
        System.out.println("----------------------------------------------------");
        System.out.println("La secretari@: " + getNombre() + " " + getApellido()
                + "\nCedula: " + getCedula() + "\nDireccion: " + getDireccion() + "\nEn nuestra"
                + "empresa desde hace " + getAniosAntiguedad() + " anios \nTelefono:"
                + getTelefono() + "\nTiene un salario de: " + calcularSalario());
    }
}
