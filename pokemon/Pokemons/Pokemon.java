/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author alumnot
 */
public abstract class Pokemon {

    Scanner sc = new Scanner(System.in);
    protected int ataque;
    protected int defensa;
    protected int ps;
    protected double level;
    protected int nivel;
    protected String nombre;
    protected String tipo;
    protected int type;
    protected int danio;
    private int pocion = 3;
    private int vitamina = 3;
    private int proteina = 3;
    private int victoria = 0;
    private int t1 = 6;
    private int t2 = 10;
    private int torneo;

    public int getVictoria() {
        return victoria;
    }

    public void setVictoria(int victoria) {
        this.victoria = victoria;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    protected void ficha() {

        System.out.println("\n Nombre:" + this.nombre);
        System.out.print(" Nivel:" + this.nivel);
        System.out.print(" Tipo:" + this.tipo);
        System.out.print(" ps:" + this.ps);
        System.out.print(" Ataq:" + this.ataque);
        System.out.print(" Def:" + this.defensa);

    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Pokemon() {
    }

    public Pokemon(String nombre) {
        this.nombre = nombre;///hacemos que con el math random enlazamos un numero al nombre del pokemon que va a aparecer
    }

    protected void ataque() {
    }

    ;
    protected void recibir() {
    }

    ;
    
    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //---------------------------------------Seleccion
    protected String tficha() {

        return "(Nivel:" + this.nivel + " Tipo:" + this.tipo + " ps:" + this.ps + " Ataq:" + this.ataque + " Def:" + this.defensa + ")";

    }

    public void present(Pokemon p[], Pokemon y[]) {
        System.out.println("\n\t\t\t\t\t\tEstos son los Pokemons de cada participante: \n");
        System.out.println("\t\t\t\t\t" + p[0].nombre + "\t\t\t\t\t\t\t\t" + y[0].nombre);
        System.out.println("\t\t\t |-------------------------------------------------------|----------------------------------------------------------------------|");
        for (int u = 1; u < 4; u++) {
            System.out.print("\t\t\t |\t\t" + p[u].nombre.toUpperCase() + "\t\t\t\t |\t\t\t      " + y[u].nombre.toUpperCase() + "\t\t\t\t|\n");
            System.out.print("\t\t\t |\t" + p[u].tficha() + "\t | \t  " + y[u].tficha() + "\t\t\t|\n");
            System.out.println("\t\t\t |-------------------------------------------------------|----------------------------------------------------------------------|");
        }

    }

    public void select(Pokemon p[]) {
        System.out.println("\t\t\t\t\t\tNombre del jugador: ");
        System.out.print("\t\t\t\t\t\t   ");
        String n = sc.next();
        System.out.println("\n\t\t\t\t\t\t-----------------");

        p[0] = new Entrenador(n);

        for (int i = 1; i < 4; i++) {
            int op = 1;

            System.out.println("\t\t\t\t\t\tSeleccione tipo vez:" + i);
            System.out.println("\t\t\t\t\t\t 1.Fuego\t\t 2.Agua \t\t 3.Planta");

            switch (intro()) {
                case 1:
                    System.out.println("\t\t\t\t\t\t *******");
                    p[i] = new Fuego();
                    break;
                case 2:
                    System.out.println("\t\t\t\t\t\t       \t\t\t ******");
                    p[i] = new Agua();
                    break;
                case 3:
                    System.out.println("\t\t\t\t\t\t        \t\t        \t\t ********");
                    p[i] = new Planta();
                    break;

            }

        }

    }

    public void select(Pokemon p[], Set poke) {
        System.out.println("\t\t\t\t\t\tNombre del jugador: ");
        System.out.print("\t\t\t\t\t\t   ");
        String n = sc.next();
        System.out.println("\n\t\t\t\t\t\t-----------------");

        p[0] = new Entrenador(n);
        poke.add(p[0]);

        for (int i = 1; i < 4; i++) {
            int op = 1;

            System.out.println("\t\t\t\t\t\tSeleccione tipo vez:" + i);
            System.out.println("\t\t\t\t\t\t 1.Fuego\t\t 2.Agua \t\t 3.Planta");

            switch (intro()) {
                case 1:

                    System.out.println("\t\t\t\t\t\t *******");
                    do {
                        p[i] = new Fuego();
                        poke.add(p[i]);
                    } while (poke.size() == i);
                    break;
                case 2:
                    System.out.println("\t\t\t\t\t\t       \t\t\t ******");
                    do {
                        p[i] = new Agua();
                        poke.add(p[i]);
                    } while (poke.size() == i);
                    break;

                case 3:
                    System.out.println("\t\t\t\t\t\t        \t\t        \t\t ********");
                    do {
                        p[i] = new Planta();
                        poke.add(p[i]);
                    } while (poke.size() == i);
                    break;

            }

        }

    }

    public int intro() {
        boolean ok = false;
        int op;
        do {
            try {

                op = Integer.parseInt(sc.next());

            } catch (NumberFormatException e) {
                op = 9;
            }

            if (3 != op && op != 1 && op != 2) {

                System.out.println("\t\t\t\t\t\t XXXXX SOLO ESTAS OPCIONES MACHO XXXXXX");

            } else {
                ok = true;
            }
        } while (!ok);
        return op;
    }

    public int intro4() {
        boolean ok = false;
        int op;
        do {
            try {

                op = Integer.parseInt(sc.next());

            } catch (NumberFormatException e) {
                op = 9;
            }

            if (3 != op && op != 1 && op != 2 && op != 4) {

                System.out.println("\t\t\t\t\t\t XXXXX SOLO ESTAS OPCIONES MACHO XXXXXX");

            } else {
                ok = true;
            }
        } while (!ok);
        return op;
    }

    //------------------ATAQUES----------------------------------------------------------------------
    public int AtBasico(Pokemon p, Pokemon p2) {
        int atack;

        if ("fuego".equals(p.tipo) && "planta".equals(p2.tipo)) {
            atack = p.ataque;
        } else if ("fuego".equals(p.tipo) && "agua".equals(p2.tipo)) {
            atack = p.ataque / 4;
        } else if ("planta".equals(p.tipo) && "agua".equals(p2.tipo)) {
            atack = p.ataque;
        } else if ("planta".equals(p.tipo) && "fuego".equals(p2.tipo)) {
            atack = p.ataque / 4;
        } else if ("agua".equals(p.tipo) && "planta".equals(p2.tipo)) {
            atack = p.ataque / 4;
        } else if ("agua".equals(p.tipo) && "fuego".equals(p2.tipo)) {
            atack = p.ataque;
        } else {
            atack = p.ataque / 2;
        }
        atack -= (p2.defensa / 10);
        if (atack < 3) {
            atack = 5;
        }

        return atack;

    }    ////Ataque sin nada respetando tipos

    public void ejecutaque(int x, Pokemon y) {

        if (y.ps - x <= 0) {
            y.setPs(0);
        } else {
            y.setPs(y.ps - x);
        }
    } ////ejecuta la recepcion del ataque siendo 0 el minimo

    public void textAtq(String n, Pokemon p, Pokemon y) {
        System.out.println("\n \t\t\t\t\t\t\t(" + p.nombre.trim() + " uso " + n + " a " + y.nombre.trim() + ")");
    }

    public void animacionBasica(String n) throws InterruptedException {
        //Animacion
        System.out.print("\n\t\t\t\t\t\t\t\t");
        for (int i = 0; i < 6; i++) {
            System.out.print(n + " ");
            Thread.sleep(500);
        }
    }

    //---------TIPO AGUA------------------------------------------------------------------------------------
    public void burbuja(Pokemon p, Pokemon y) throws InterruptedException {
        int bur = (p.AtBasico(p, y) / 5) * 3;
        String ata = "burbuja";
        String ani = "O";
        p.ejecutaque(bur, y);

        //Animacion
        p.animacionBasica(ani);

        p.textAtq(ata, p, y);

    }

    public void Hidrobomba(Pokemon p, Pokemon y) throws InterruptedException {
        int bomb = (p.AtBasico(p, y) * 3) / 2;
        String ata = "hidrobomba";
        p.ejecutaque(bomb, y);

        //animacion
        System.out.print("\n\t\t\t\t\t\t\t\t");
        for (int i = 0; i < 7; i++) {
            System.out.print("==");
            Thread.sleep(500);
        }
        System.out.print("Booom!!!! ");
        p.textAtq(ata, p, y);

    }

    //------Tipo normal-----------------------------------------------------------------------
    public void placaje(Pokemon p, Pokemon y) throws InterruptedException {
        String ata = "placaje";
        int plac = (p.ataque / 2) - (y.defensa / 10);
        p.ejecutaque(plac, y);
        System.out.print("\n\t\t\t\t\t\t\t\t ");

        System.out.print("P ");
        Thread.sleep(500);
        System.out.print("L ");
        Thread.sleep(500);
        System.out.print("A ");
        Thread.sleep(500);
        System.out.print("C ");
        Thread.sleep(500);
        System.out.print("A ");
        Thread.sleep(500);
        System.out.print("J ");
        Thread.sleep(500);
        System.out.print("E ");
        Thread.sleep(500);

        System.out.print("\n");

        p.textAtq(ata, p, y);
    }

    public void Coletazo(Pokemon p, Pokemon y) throws InterruptedException {
        String ata = "coletazo";
        int plac = (p.ataque / 3) + (y.defensa / 10);
        p.ejecutaque(plac, y);

        ///-----------------animacion
        System.out.print("\n\t\t\t\t\t\t\t\t");
        System.out.print("8");
        for (int i = 0; i < 7; i++) {
            System.out.print("==");
            Thread.sleep(500);
        }
        System.out.print("D \n");
        p.textAtq(ata, p, y);

    }

    //--------------Tipo FUego-----------
    public void ascuas(Pokemon p, Pokemon y) throws InterruptedException {
        int asc = (p.AtBasico(p, y) / 5) * 3;
        String ata = "ascuas";
        String ani = "8";
        p.ejecutaque(asc, y);

        p.animacionBasica(ani);
        p.textAtq(ata, p, y);

    }

    public void llamarada(Pokemon p, Pokemon y) throws InterruptedException {
        int llam = (p.AtBasico(p, y) * 3) / 2;
        String ata = "llamarada";
        p.ejecutaque(llam, y);

        //Animacion
        System.out.print("\n\t\t\t\t\t\t\t\t    ***");
        System.out.print("\n\t\t\t\t\t\t\t\t    ***");
        System.out.print("\n\t\t\t\t\t\t\t\t***********");
        System.out.print("\n\t\t\t\t\t\t\t\t    ***");
        System.out.print("\n\t\t\t\t\t\t\t\t    ***");
        System.out.print("\n\t\t\t\t\t\t\t\t   ** **  ");
        System.out.print("\n\t\t\t\t\t\t\t\t  **    **");
        System.out.print("\n\t\t\t\t\t\t\t\t**       **");
        p.textAtq(ata, p, y);
    }

    //------------------Tipo planta-------------------------------------------------
    public void Hojafilada(Pokemon p, Pokemon y) throws InterruptedException {
        int asc = (p.AtBasico(p, y) / 5) * 3;
        String ata = "Hoja afilada";
        String ani = "*";
        p.ejecutaque(asc, y);

        p.animacionBasica(ani);
        p.textAtq(ata, p, y);

    }

    public void Rayosolar(Pokemon p, Pokemon y) throws InterruptedException {
        int llam = (p.AtBasico(p, y) * 3) / 2;
        String ata = "rayo solar";
        p.ejecutaque(llam, y);

        //Animacion
        System.out.print("\n\t\t\t\t\t\t\t\t  \\ | /");
        System.out.print("\n\t\t\t\t\t\t\t\t  -- O --");
        System.out.print("\n\t\t\t\t\t\t\t\t   / |\\");
        p.textAtq(ata, p, y);
    }

    ////---------------------------------------------------------------------------------------------------------------------------------------Combate-------------------------------
    public void combate(Pokemon p[], Pokemon p2[]) throws InterruptedException {
        boolean finale=false;
        boolean partido=false;
        int punto1=0;
        int punto2=0;
        int torno=0;
        int torno2=0;
       do{
       
        do {
            int peke;
            int peke2;

            do {
                System.out.println("\n\t\t" + p[0].nombre + "  selecciona un pokemon");
                System.out.println("\n\t 1. " + p[1].nombre + " 2. " + p[2].nombre + " 3. " + p[3].nombre);
                peke = intro();
            } while (p[peke].ps == 0);

            do {
                System.out.println("\n\t\t" + p2[0].nombre + " selecciona un pokemon");
                System.out.println("\n\t 1. " + p2[1].nombre + " 2. " + p2[2].nombre + " 3. " + p2[3].nombre);
                peke2 = intro();
            } while (p2[peke2].ps == 0);

            System.out.println("\n\t\t\t " + p[0].nombre.trim().toUpperCase() + " VS " + p2[0].nombre.trim().toUpperCase());
            System.out.println("\t\t\t\t QUE GANE EL MEJOR!!!!!!");
    ///-------------------------------------------------------------------------------------------------------------------------------------------Combate------------        
            do {
                
                System.out.println("\n\t\t\tTurno de " + p[0].nombre.toUpperCase() + " con " + p[peke].nombre.trim().toUpperCase());
                combo(p[peke], p2[peke2]);
                anime(p2[peke2]);
                if (p2[peke2].ps > 0) {

                    System.out.println("\n\t\t\tTurno de " + p2[0].nombre.toUpperCase().trim() + " con " + p2[peke2].nombre.toUpperCase().trim());
                    combo(p2[peke2], p[peke]);
                    anime(p[peke]);
                }else{  System.out.println("\t\t\t" + p[0].nombre + " gana ");
                punto1++;p[0].setVictoria(punto1);partido=true;}
                
                if(p[peke].ps > 0){}else{  System.out.println(p2[0].nombre + " gana ");
                 punto2++;p2[0].setVictoria(punto2);partido=true;}
                
            } while (partido ==false);
//------------------------------------------------------------------------------------------------------------------------------------------------------------------
              
        System.out.println("\t\t\t" + p[0].nombre.toUpperCase() +" : "+p[0].victoria+"   "+p2[0].nombre.toUpperCase()+" : "+p2[0].victoria);
           
        if(p[0].victoria==3){torno+=1;p[0].setTorneo(torno);};
        if(p2[0].victoria==3){torno2+=1;p2[0].setTorneo(torno);};      
        } while (p2[0].victoria != 3 && p[0].victoria != 3);
        punto1=0;
        punto2=0;
        p[0].setVictoria(0);
        p2[0].setVictoria(0);
        
         System.out.println("\t\t\t" + p[0].nombre.toUpperCase() +" : "+p[0].torneo+"   "+p2[0].nombre.toUpperCase()+" : "+p[0].torneo);
         System.out.println("\t\t\tQuieres echar la revancha? \n Pulse 1 para si \n 2 para no");
        
         if (intro()==2){
         finale=true;
         }
         
        
       }while (finale==true);
        
      
        
        
        
        
        
        

    }

    public int getTorneo() {
        return torneo;
    }

    public void setTorneo(int torneo) {
        this.torneo = torneo;
    }
//--------------------------------------------------------------------------------------------------------------------------------------Combo
    public void combo(Pokemon x, Pokemon y) throws InterruptedException {
        boolean fin = false;

        do {

            System.out.println("\n\t\t\tElija una opcion");
            System.out.println("\t\t\t |-------------------------------------------------------|----------------------------------------------------------------------|");
            System.out.print("\t\t\t |\t\t" + "  1.ATAQUE " + "\t\t\t\t |\t\t\t      " + " 2.MOCHILA " + "\t\t\t\t|\n");
            System.out.println("\t\t\t |-------------------------------------------------------|----------------------------------------------------------------------|");
            System.out.print("\t\t\t |\t\t" + "3.ACARICIAR" + "\t\t\t\t |\t\t\t      " + " 4.RENDIRSE" + "\t\t\t\t|\n");
            System.out.println("\t\t\t |-------------------------------------------------------|----------------------------------------------------------------------|");

            switch (intro4()) {

                case 1:
                    switch (x.getTipo()) {

                        case "planta":

                            System.out.println("\t\t\t |-------------------------------------------------------|----------------------------------------------------------------------|");
                            System.out.print("\t\t\t |\t\t" + " 1.Rayo Solar  " + "\t\t\t\t |\t\t\t      " + " 2.Hoja Afilada" + "\t\t\t\t|\n");
                            System.out.println("\t\t\t |-------------------------------------------------------|----------------------------------------------------------------------|");
                            System.out.print("\t\t\t |\t\t" + " 3.Placaje     " + "\t\t\t\t |\t\t\t      " + " 4.Atras       " + "\t\t\t\t|\n");
                            System.out.println("\t\t\t |-------------------------------------------------------|----------------------------------------------------------------------|");

                            switch (intro4()) {

                                case 1:
                                    if (t1 > 0) {
                                        Rayosolar(x, y);
                                        fin = true;
                                        break;
                                    } else {
                                        System.out.println("\t\t\t No te quedan mas pp");
                                        break;
                                    }

                                case 2:
                                    if (t2 > 0) {
                                        Hojafilada(x, y);
                                        fin = true;
                                        break;
                                    } else {
                                        System.out.println("\t\t\t No te quedan mas pp");
                                        break;
                                    }

                                case 3:
                                    placaje(x, y);
                                    fin = true;
                                    break;
                                case 4:
                                    break;

                            }
                            break;

                        case "fuego":

                            System.out.println("\t\t\t |-------------------------------------------------------|----------------------------------------------------------------------|");
                            System.out.print("\t\t\t |\t\t" + " 1.Llamarada   " + "\t\t\t\t |\t\t\t      " + " 2.Ascuas      " + "\t\t\t\t|\n");
                            System.out.println("\t\t\t |-------------------------------------------------------|----------------------------------------------------------------------|");
                            System.out.print("\t\t\t |\t\t" + " 3.Placaje     " + "\t\t\t\t |\t\t\t      " + " 4.Atras       " + "\t\t\t\t|\n");
                            System.out.println("\t\t\t |-------------------------------------------------------|----------------------------------------------------------------------|");

                            switch (intro4()) {

                                case 1:
                                    if (t1 > 0) {
                                        llamarada(x, y);
                                        fin = true;
                                        break;
                                    } else {
                                        System.out.println("\t\t\t No te quedan mas pp");
                                        break;
                                    }

                                case 2:
                                    if (t2 > 0) {
                                        ascuas(x, y);
                                        fin = true;
                                        break;
                                    } else {
                                        System.out.println("\t\t\t No te quedan mas pp");
                                        break;
                                    }

                                case 3:
                                    placaje(x, y);
                                    fin = true;
                                    break;

                                case 4:
                                    break;

                            }
                            break;

                        case "agua":

                            System.out.println("\t\t\t |-------------------------------------------------------|----------------------------------------------------------------------|");
                            System.out.print("\t\t\t |\t\t" + " 1.HidroBomba  " + "\t\t\t\t |\t\t\t      " + " 2.Burbuja     " + "\t\t\t\t|\n");
                            System.out.println("\t\t\t |-------------------------------------------------------|----------------------------------------------------------------------|");
                            System.out.print("\t\t\t |\t\t" + " 3.Placaje     " + "\t\t\t\t |\t\t\t      " + " 4.Atras       " + "\t\t\t\t|\n");
                            System.out.println("\t\t\t |-------------------------------------------------------|----------------------------------------------------------------------|");

                            switch (intro4()) {

                                case 1:
                                    if (t1 > 0) {
                                        Hidrobomba(x, y);
                                        fin = true;
                                        break;
                                    } else {
                                        System.out.println("\t\t\t No te quedan mas pp");
                                        break;
                                    }

                                case 2:
                                    if (t2 > 0) {
                                        burbuja(x, y);
                                        fin = true;
                                        break;
                                    } else {
                                        System.out.println("\t\t\t No te quedan mas pp");
                                        break;
                                    }

                                case 3:
                                    placaje(x, y);
                                    fin = true;
                                    break;

                                case 4:
                                    break;

                            }
                            break;
                    }
                    break;
                //----------fin de ataques

                case 2:

                    System.out.println("\t\t\t |-------------------------------------------------------|----------------------------------------------------------------------|");
                    System.out.print("\t\t\t |\t\t" + " 1.Pocion      " + "\t\t\t\t |\t\t\t      " + " 2.Proteinas   " + "\t\t\t\t|\n");
                    System.out.println("\t\t\t |-------------------------------------------------------|----------------------------------------------------------------------|");
                    System.out.print("\t\t\t |\t\t" + " 3.Vitaminas   " + "\t\t\t\t |\t\t\t      " + " 4.Atras       " + "\t\t\t\t|\n");
                    System.out.println("\t\t\t |-------------------------------------------------------|----------------------------------------------------------------------|");

                    switch (intro4()) {

                        case 1:

                            if (pocion >= 1) {

                                int poc = x.ps + 80;
                                x.setPs(poc);
                                System.out.println("\t\t\t Has tomato una pocion tu ps es ahora de " + x.ps);
                                fin = true;
                                pocion--;
                            } else {
                                System.out.println("\t\t\t No te quedan mas pociones tio");
                            }
                            break;

                        case 2:

                            if (proteina >= 1) {
                                int att = x.ataque + (int) (Math.random() * 100);
                                x.setAtaque(att);
                                System.out.println("\t\t\t Tu ataque ha aumentado a " + x.ataque);
                                fin = true;
                                proteina--;
                            } else {
                                System.out.println("\t\t\t No te quedan mas proteinas tio");
                            }
                            break;

                        case 3:

                            if (vitamina >= 1) {
                                int defen = x.defensa + (int) (Math.random() * 100);
                                x.setDefensa(defen);
                                System.out.println("\t\t\t Tu defensa ha aumentado a " + x.defensa);
                                fin = true;
                                vitamina--;
                            } else {
                                System.out.println("\t\t\t No te quedan mas vitaminas tio");
                            }
                            break;
                        case 4:

                            break;

                    }
                    break;
                case 3:
                    System.out.println("\t\t\t Has acariciado a tu pokemon");
                    x.setPs(x.ps + 2);
                    x.setDefensa(x.defensa + 5);
                    x.setAtaque(x.ataque + 5);
                    fin = true;
                    break;

                case 4:
                    System.out.println("\t\t\t Rendirse nunca es una opcion");
                    break;

            }

        } while (fin != true);
    }

    //--------------animacion ataque
    public void anime(Pokemon x) {
        int quantum = x.getPs() / 10;

        System.out.println("\t" + x.nombre.toUpperCase().trim() + " Estado:" + x.ps);
        System.out.print("\t\t");
        for (int i = 0; i < quantum; i++) {
            System.out.print("-----");
        }

        System.out.println("\t\t");
        for (int i = 0; i < quantum; i++) {

            System.out.print(" " + i + " |");
        }
        System.out.println("\t\t");

        for (int i = 0; i < quantum; i++) {
            System.out.print("-----");
        }

    }

}