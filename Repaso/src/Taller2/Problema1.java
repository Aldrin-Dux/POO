package Taller2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Problema1 {
    public static Scanner tc = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Guerrero", 120, 0);
        Mago mago = new Mago("Mago", 95, 0);
        Arquero arquero = new Arquero("Arquero", 105, 0);
        mago.setHabilidades("Poder de Fuego", 30);
        mago.setHabilidades("Hechizo de Desintegracion", 25);
        guerrero.setHabilidades("Golpe Debil con Espada", 25);
        guerrero.setHabilidades("Golpe Fuerte con Espada", 30);
        arquero.setHabilidadesDistancia("Flecha Explosiva", 35);
        arquero.setHabilidadesDistancia("Disparo Rapido", 15);
        Personaje jugador = seleccionarPersonaje(guerrero, mago, arquero);
        Personaje oponente = null;
        int opcion1;
        do {
            mostrarMenuCombates();
            opcion1 = tc.nextInt();
            if (opcion1 >= 1 && opcion1 <= 3) {
                switch (opcion1) {
                    case 1:
                        if (jugador != guerrero) {
                            oponente = guerrero;
                        } else {
                            System.out.println("No puedes enfrentarte a otro Guerrero");
                        }
                        break;
                    case 2:
                        if (jugador != mago) {
                            oponente = mago;
                        } else {
                            System.out.println("No puedes enfrentarte a otro Mago");
                        }
                        break;
                    case 3:
                        if (jugador != arquero) {
                            oponente = arquero;
                        } else {
                            System.out.println("No puedes enfrentarte a otro Arquero");
                        }
                        break;
                }
                if (oponente != null) {
                    enfrentar(jugador, oponente);
                    determinarGanador(jugador, oponente); // Llamada aqui para determinar ganador despues de cada enfrentamiento
                }
            } else if (opcion1 != 4) {
                System.out.println("Opcion no valida");
            }
        } while (opcion1 != 4);
        System.out.println("Saliendo del juego");
        tc.close();
    }

    private static void mostrarMenuCombates() {
        System.out.println("Menu de Combates");
        System.out.println("1) Enfrentarse a Guerrero");
        System.out.println("2) Enfrentarse a Mago");
        System.out.println("3) Enfrentarse a Arquero");
        System.out.println("4) Salir");
        System.out.print("Elige una opcion: ");
    }

    private static Personaje seleccionarPersonaje(Guerrero guerrero, Mago mago, Arquero arquero) {
        int opcion2;
        Personaje jugador = null;
        do {
            System.out.println("Elige tu personaje:");
            System.out.println("1. Guerrero");
            System.out.println("2. Mago");
            System.out.println("3. Arquero");
            opcion2 = tc.nextInt();
            switch (opcion2) {
                case 1:
                    jugador = guerrero;
                    System.out.println(jugador);
                    break;
                case 2:
                    jugador = mago;
                    System.out.println(jugador);
                    break;
                case 3:
                    jugador = arquero;
                    System.out.println(jugador);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            if (jugador != null) {
                imprimirDetallesPersonaje(jugador);
            }
        } while (jugador == null);

        return jugador;
    }

    private static void enfrentar(Personaje jugador, Personaje oponente) {
        oponente.resetearVida();
        while (jugador.getVida() > 0 && oponente.getVida() > 0) {
            opcionesAtaque(jugador);
            int opcionAtaque = tc.nextInt();
            jugador.atacar(oponente, opcionAtaque);

            if (oponente.getVida() > 0) {
                int ataqueAleatorio = random.nextInt(2) + 1;
                oponente.atacar(jugador, ataqueAleatorio);
            }
        }
        jugador.resetearVida();
    }

    private static void imprimirDetallesPersonaje(Personaje personaje) {
        System.out.println(personaje);
    }

    private static void determinarGanador(Personaje jugador, Personaje oponente) {
        if (jugador.getVida() > 0) {
            jugador.setExperiencia();
            System.out.println(jugador + " ha ganado la batalla");

        } else {
            oponente.setExperiencia();
            System.out.println(jugador + " ha ganado la batalla");

        }
    }

    private static void opcionesAtaque(Personaje jugador) {
        if (jugador instanceof Guerrero) {
            Guerrero guerrero = (Guerrero) jugador;
            mostrarHabilidades(guerrero.getHabilidades());
        } else if (jugador instanceof Mago) {
            Mago mago = (Mago) jugador;
            mostrarHabilidades(mago.getHabilidades());
        } else if (jugador instanceof Arquero) {
            Arquero arquero = (Arquero) jugador;
            mostrarHabilidades(arquero.getHabilidadesDistancia());
        }
        System.out.print("Elige una opcion de ataque: ");
    }

    private static void mostrarHabilidades(ArrayList<String> habilidades) {
        for (int i = 0; i < habilidades.size(); i++) {
            System.out.println((i + 1) + ". " + habilidades.get(i));
        }
    }
}

abstract class Personaje {

    protected String nombre;
    protected int vida;
    protected int experiencia;
    protected int vidaInicial;

    public Personaje(String nombre, int vida, int experiencia) {
        this.nombre = nombre;
        this.vida = vida;
        this.experiencia = experiencia;
        this.vidaInicial = vida;
    }

    public abstract void atacar(Personaje oponente, int opcionAtaque);

    public void setExperiencia() {
        this.experiencia += 5;
    }

    public void resetearVida() {
        this.vida = this.vidaInicial;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("|Personaje ").append(nombre);
        sb.append("|vida ").append(vida);
        sb.append("|experiencia ").append(experiencia).append("|");
        return sb.toString();
    }
}

class Mago extends Personaje {

    private ArrayList<String> habilidades;
    private ArrayList<Integer> danoHabilidades;

    public Mago(String nombre, int vida, int experiencia) {
        super(nombre, vida, experiencia);
        this.habilidades = new ArrayList<>();
        this.danoHabilidades = new ArrayList<>();
    }

    public void setHabilidades(String hechizo, int dano) {
        habilidades.add(hechizo);
        danoHabilidades.add(dano);
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    @Override
    public void atacar(Personaje oponente, int opcionAtaque) {
        if (opcionAtaque > 0 && opcionAtaque <= habilidades.size()) {
            int dano = danoHabilidades.get(opcionAtaque - 1);
            oponente.vida -= dano;
        } else {
            System.out.println("Opcion de ataque no valida");
        }
    }
}

class Guerrero extends Personaje {

    private ArrayList<String> habilidades;
    private ArrayList<Integer> danoHabilidades;

    public Guerrero(String nombre, int vida, int experiencia) {
        super(nombre, vida, experiencia);
        this.habilidades = new ArrayList<>();
        this.danoHabilidades = new ArrayList<>();
    }

    public void setHabilidades(String habilidad, int dano) {
        habilidades.add(habilidad);
        danoHabilidades.add(dano);
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    @Override
    public void atacar(Personaje oponente, int opcionAtaque) {
        if (opcionAtaque > 0 && opcionAtaque <= habilidades.size()) {
            int dano = danoHabilidades.get(opcionAtaque - 1);
            oponente.vida -= dano;
        } else {
            System.out.println("Opcion de ataque no valida");
        }
    }
}

class Arquero extends Personaje {

    private ArrayList<String> habilidadesDistancia;
    private ArrayList<Integer> danoHabilidadesDistancia;

    public Arquero(String nombre, int vida, int experiencia) {
        super(nombre, vida, experiencia);
        this.habilidadesDistancia = new ArrayList<>();
        this.danoHabilidadesDistancia = new ArrayList<>();
    }

    public void setHabilidadesDistancia(String habilidad, int dano) {
        habilidadesDistancia.add(habilidad);
        danoHabilidadesDistancia.add(dano);
    }

    public ArrayList<String> getHabilidadesDistancia() {
        return habilidadesDistancia;
    }

    @Override
    public void atacar(Personaje oponente, int opcionAtaque) {
        if (opcionAtaque > 0 && opcionAtaque <= habilidadesDistancia.size()) {
            int dano = danoHabilidadesDistancia.get(opcionAtaque - 1);
            oponente.vida -= dano;
        } else {
            System.out.println("Opcion de ataque no valida");
        }
    }

}
/*
En un juego de rol, se desea implementar un sistema de combate en el que participen 
diferentes tipos de personajes : guerreros , magos y arqueros . Cada personaje tiene 
atributos y habilidades únicas, así como diferentes métodos de ataque y defensa .

El objetivo del juego es enfrentar a los personajes en batallas y determinar el ganador 
en función de sus habilidades, estrategias y atributos. Los guerreros se destacan por su 
fuerza y ​​habilidades cuerpo a cuerpo, los magos por sus hechizos y poderes mágicos, y los 
arqueros por su precisión y habilidades a distancia.

El sistema debe permitir crear nuevos personajes de cada tipo, asignarles atributos iniciales, 
como puntos de vida y nivel de experiencia , y permitirles subir de nivel a medida que ganen batallas. 
Además, se debe implementar un algoritmo de combate que evalúe las habilidades de cada personaje y determine
el resultado de la batalla.

Utilizando programación orientada a objetos, herencia y polimorfismo, implementa el sistema de combate 
y las clases necesarias para representar a los diferentes tipos de personajes. Asegúrate de que cada tipo 
de personaje tenga sus propias habilidades y métodos de ataque y defensa, y que puedan interactuar entre sí en las batallas.

Nota

Para solucionar lo anterior se debe generar lo siguiente:

Un diagrama exclusivo que involucran las funcionalidades principales del juego.
Una solución en lenguaje de programación Java. Usar polimorfismo en la solución.
Clase de prueba/ejecutor, que demuestra la funcionalidad del juego.
*/