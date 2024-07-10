package parcial2b;

class Vendedores extends POOSA {

    public String matriculaCoche;
    public String marcaCoche;
    public String modeloCoche;
    public int areaDeVenta;
    public double porcentajeComision;
    public double ventasTotales;

    public Vendedores(String nombre, String apellido, int cedula, String direccion,
            int aniosAntiguedad, int telefono, double salario, String matriculaCoche,
            String marcaCoche, String modeloCoche, int areaDeVenta, double porcentajeComision,
             double ventasTotales) {
        super(nombre, apellido, cedula, direccion, aniosAntiguedad, telefono, salario);
        this.matriculaCoche = matriculaCoche;
        this.marcaCoche = marcaCoche;
        this.modeloCoche = modeloCoche;
        this.areaDeVenta = areaDeVenta;
        this.porcentajeComision = porcentajeComision;
        this.ventasTotales = ventasTotales;
    }

    @Override
    public double calcularSalario() {
        this.salario = super.calcularSalario() + (ventasTotales * porcentajeComision);
        return this.salario;
    }

    public void mostrarDatos() {
        System.out.println("----------------------------------------------------");
        System.out.println("El vendedor: " + getNombre() + " " + getApellido()
                + "\nCedula: " + getCedula() + "\nDireccion: " + getDireccion() + "\nEn nuestra"
                + "empresa desde hace " + getAniosAntiguedad() + " anios \nTelefono:"
                + getTelefono() + "\nCon un auto con las caracteristicas\nMatricula: " + matriculaCoche + "\nMarca:"
                + marcaCoche + "\nModelo: " + modeloCoche + "\nEn el area: " + areaDeVenta + "\nCon"
                + "un porcentaje de  comision de: " + porcentajeComision*100 + "% por venta"
                + "\nVentasTotales: " + ventasTotales + "\nTiene un salario"
                + "de: " + calcularSalario());
    }

    public double getVentasTotales() {
        return ventasTotales;
    }
    
}
