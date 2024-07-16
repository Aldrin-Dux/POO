package com.mycompany.ejemploisp;

// Interface
interface Impresora {

    void imprimir();
}

interface Escaner {

    void escanear();
}

// Clases
class ImpresoraBasica implements Impresora {

    @Override
    public void imprimir() {
        System.out.println("-Imprimiendo documento....-");
    }
}

class EscanerBasico implements Escaner {

    @Override
    public void escanear() {
        System.out.println("-Escaneando documento....-");
    }
}

// Main
public class Ejecutor {

    public static void main(String[] args) {
        ImpresoraBasica impresora = new ImpresoraBasica();
        EscanerBasico escaner = new EscanerBasico();

        System.out.println("Impresora Basica: ");
        impresora.imprimir();
        System.out.println();

        System.out.println("Escaner Basica: ");
        escaner.escanear();
    }
}
