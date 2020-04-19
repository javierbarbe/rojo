package Pokemons;

import java.util.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alumnot
 */
public class Poketest {

    public static void main(String[] args) throws InterruptedException {

        Pokemon j1 = new Entrenador();
        Set<Pokemon> poke = new HashSet<Pokemon>();
        Pokemon[] p1 = new Pokemon[4];

        j1.select(p1, poke);

        Pokemon j2 = new Entrenador();
        Set<Pokemon> poke2 = new HashSet<Pokemon>();
        Pokemon[] p2 = new Pokemon[4];
        j2.select(p2, poke2);

        j1.present(p1, p2);

        j1.combate(p1, p2);

        j1.present(p1, p2);

    }
}