package parcial2b;

class JefesDeZona extends POOSA {

    public int despacho;
    public String secretaria;
    public String[] vendedores;
    public int zona;

    public JefesDeZona(String nombre, String apellido, int cedula, String direccion,
            int aniosAntiguedad, int telefono, double salario,
            int despacho, String secretaria, int zona
    ) {
        super(nombre, apellido, cedula, direccion, aniosAntiguedad, telefono, salario);
        this.despacho = despacho;
        this.secretaria = secretaria;
        this.zona = zona;
    }

    @Override
    public double calcularSalario() {
        double salarioGlobal;
        Vendedores vendedor = new Vendedores("Juan", "Guillermo", 234567, "Quito", 3, 3455629,
                400, "AAB3", "Susuki", "desconocido", 1, 0.12, 1700);
        salarioGlobal=vendedor.getVentasTotales();
        this.salario = super.calcularSalario() + (salarioGlobal * 0.1);
        return this.salario;
    }
        public void mostrarDatos() {
            System.out.println("----------------------------------------------------");
        System.out.println("El jefe: " + getNombre() + " " + getApellido()
                + "\nCedula: " + getCedula() + "\nDireccion: " + getDireccion() + "\nEn nuestra"
                + "empresa desde hace " + getAniosAntiguedad() + " anios \nTelefono:"
                + getTelefono() + "\nDel despacho: "+despacho+"\nSecretaria: "+secretaria
                +"\nEs jefed de la zona: "+zona+"\nTiene un salario de: " + calcularSalario());
        }
        

}
