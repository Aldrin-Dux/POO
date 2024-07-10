package practic;

class Ejecutor {

    public static void main(String[] args) {

        Estadisticas estadistica = new Estadisticas("Aldrin", 11, 1, 1);
        Atacantes atacantes = new Atacantes("Juan", 12, 2, 15, 7, 8);
        Defensores defensores = new Defensores("Aldrin", 13, 3, 15, 7, 8);
        Porteros porteros = new Porteros("Denji", 13, 3, 15, 4);
        atacantes.mostrarEstadistica();
    }
}

