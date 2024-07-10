package parcial2b;

public class Ejecutor {

    public static void main(String[] args) {
        Secretarios secretaria = new Secretarios("Maria", "Aquilar", 12345678, "Loja", 7,
                99456789, 300, 1, 35, 20, 8);
        secretaria.mostrarDatos();
        Vendedores vendedor = new Vendedores("Juan", "Guillermo", 234567, "Quito", 3,3455629,
               400, "AAB3", "Susuki","desconocido", 1, 0.12, 1700);
        vendedor.mostrarDatos();
        JefesDeZona jefe= new JefesDeZona("Diego", "Rodriguez", 12345678, "Loja", 23,
                99456789, 0, 1,"Maria", 1);
        jefe.mostrarDatos();
    }
}
