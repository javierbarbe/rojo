/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;

import static java.lang.Thread.sleep;
import java.util.Objects;

/**
 *
 * @author alumnot
 */
public class Agua extends Pokemon {

    private int aleatorio = (int) (Math.random() * 10);
    private String salvaje;
    private int poder;

    private String genera() {
        switch (aleatorio) {
            case 1:
                salvaje = "Squirtle  ";
                poder = 100;
                break;
            case 2:
                salvaje = "Horsea    ";
                poder = 30;
                break;
            case 6:
                salvaje = "Goldeen   ";
                poder = 50;
                break;
            case 7:
                salvaje = "Starmie   ";
                poder = 20;
                break;
            case 3:
                salvaje = "Starmie   ";
                poder = 50;
                break;
            case 4:
                salvaje = "Squirtle  ";
                poder = 100;
                break;
            case 8:
                salvaje = "Squirtle  ";
                poder = 150;
                break;
            case 9:
                salvaje = "Goldeen   ";
                poder = 10;
                break;
            case 10:
                salvaje = "Horsea    ";
                poder = 10;
                break;
            case 5:
                salvaje = "Lugia     ";
                poder = 200;
                break;
            case 0:
                salvaje = "Golduck   ";
                poder = 120;
                break;
        }
        return salvaje;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.salvaje);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Agua other = (Agua) obj;
        if (!Objects.equals(this.salvaje, other.salvaje)) {
            return false;
        }
        return true;
    }

    public Agua() {

        setNombre(genera());
        setDefensa(gen() + poder);
        setLevel(experiencia());
        setNivel(1 + up());
        setPs(200 + (poder / 4));
        setTipo("agua");
        setAtaque(gen() + poder);

    }

    private int gen() {
        return (int) (Math.random() * 100);
    }

  
    public void recibe() {

    }

    public double experiencia() {
        double exp = (Math.random() * 1000);
        return this.level + exp;

    }

    public int up() {
        if (this.level >= 4000) {
            this.nivel += 1;
            this.level = 0;
        }
        return this.nivel;

    }


    

}
