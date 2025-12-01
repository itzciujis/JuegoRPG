import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int PSenemigo = 0;
        double multiplicadordañoenemigo = 0;
        int dañoenemigo = 0;
        int caudillo = 1;
        int socialista = 2;
        int personanormla = 3;
        int enfermitodetwiter = 4;
        int emosinfuturo = 5;
        int indio = 6;
        int PS = 0;
        int PM = 0;
        double multiplicadordaño = 0;
        int dañofisico = 0;
        int dañomagico = 0;
        int oro = 0;
        PSenemigo = 0;

        String[] enemigos = {"Amego segarro", "Pedro Sanchez", "Charo", "Maeb", "Reina del brillo", "Repartidor de uber eats",};
        String[] recompensas = {"Segarro", "Liberacion de el comunismo", "Diploma de machista oficial", "Poder ancetral de la sabiduria", "Bicicleta de uber eats", "Cupon de 5 leuros", "Liberacion de IVA", "Spray anti segarros",};
        String[] inventario = new String[10];
        String[] interraccion = {"Normal", "Normal", "Normal", "Normal", "Normal", "Critico", "Esquivado",};
        while (true) {
            System.out.println("Bienvenido al salvaje y despiadado mundo de Barcelona, como te llamas joven aventurero?");
            String nombrepersonaje = sc.nextLine();
            System.out.println("Que clase de persona eres?");
            System.out.println("1.Caudillo de españa");
            System.out.println("2.Socialista comunista");
            System.out.println("3.Persona nomral");
            System.out.println("4.Enfermito del twiter");
            System.out.println("5.Emo sin futuro");
            System.out.println("6.Indio");
            int selecionpersonaje = sc.nextInt();
            sc.nextLine();
            if (selecionpersonaje == 1) {
                PS = 200;
                PM = 10;
                multiplicadordaño = 1.5;
                dañofisico = 30;
                dañomagico = 10;
                oro = 0;
            }
            if (selecionpersonaje == 2) {
                PS = 75;
                PM = 70;
                multiplicadordaño = 1.0;
                dañofisico = 10;
                dañomagico = 30;
                oro = 0;
            }
            if (selecionpersonaje == 3) {
                PS = 100;
                PM = 50;
                multiplicadordaño = 1.0;
                dañofisico = 15;
                dañomagico = 35;
                oro = 0;
            }
            if (selecionpersonaje == 4) {
                PS = 30;
                PM = 75;
                multiplicadordaño = 0.75;
                dañofisico = 5;
                dañomagico = 50;
                oro = 0;
            }
            if (selecionpersonaje == 5) {
                PS = 50;
                PM = 50;
                multiplicadordaño = 1.0;
                dañofisico = 10;
                dañomagico = 40;
                oro = 0;
            }
            if (selecionpersonaje == 6) {
                PS = 58;
                PM = 22;
                multiplicadordaño = 1.5;
                dañofisico = 40;
                dañomagico = 12;
                oro = 0;
            }
            System.out.println("Has escojido " + selecionpersonaje);
            System.out.println("Estas son tus stats ");
            System.out.println("PS " + PS);
            System.out.println("PM " + PM);
            System.out.println("Multiplicador de daño " + multiplicadordaño);
            System.out.println("Daño fisico " + dañofisico);
            System.out.println("Daño magico " + dañomagico);
            System.out.println("Oro " + oro);
            System.out.println("Estas preparado para salir a el peligroso mundo de Barcelona, o quieres modificar tu personaje?");
            String respuestamodificacionpersonaje = sc.nextLine();
            if (respuestamodificacionpersonaje.equalsIgnoreCase("no")) {
                continue;
            } else if (respuestamodificacionpersonaje.equalsIgnoreCase("si")) {
                break;
            }

        }
        while (true) {
            String enemigoactual = enemigos[rand.nextInt(enemigos.length)];
            System.out.println("Has salido a las peligrosas calles de Barcelona y ya encontraste tu primer enemigo " + enemigoactual);
            switch (enemigoactual) {
                case "amegosegarro":
                    PSenemigo = 80;
                    multiplicadordañoenemigo = 1.0;
                    dañoenemigo = 15;
                    break;

                case "Pedro Sanchez":
                    PSenemigo = 250;
                    multiplicadordañoenemigo = 1.5;
                    dañoenemigo = 35;
                    break;

                case "Charo":
                    PSenemigo = 90;
                    multiplicadordañoenemigo = 1.0;
                    dañoenemigo = 18;
                    break;

                case "Maeb":
                    PSenemigo = 300;
                    multiplicadordañoenemigo = 1.2;
                    dañoenemigo = 25;
                    break;

                case "Reina del brillo":
                    PSenemigo = 200;
                    multiplicadordañoenemigo = 1.3;
                    dañoenemigo = 20;
                    break;

                case "Repartidor de uber eats":
                    PSenemigo = 200;
                    multiplicadordañoenemigo = 1.5;
                    dañoenemigo = 50;
                    break;
            }
            while (true) {
                while (true) {
                    int ataque = rand.nextInt(6);
                    System.out.println("Estas son las estas de tu enemigo " + enemigoactual);
                    System.out.println("PS = " + PSenemigo);
                    System.out.println("Multiplicador de daño = " + multiplicadordañoenemigo);
                    System.out.println("Daño = " + dañoenemigo);
                    System.out.println("Que accion vas a realizar para defenderte de este malechor?");
                    System.out.println("Tus opciones son:");
                    System.out.println("1. Ataque fisico");
                    System.out.println("2. Ataque magico");

                    String opciondeataque = sc.nextLine();
                    while (ataque == 1,2,3,4;;;;;) {
                        if (opciondeataque.equals("1")) {
                            int dañofisicototal = (int) (dañofisico * multiplicadordaño);
                            PSenemigo -= dañofisicototal;
                            System.out.println("Has usado tu ataque fisico quitandole un total de " + dañofisicototal + " de vida a tu enemigo");
                            System.out.println("Vida restante del enemigo: " + PSenemigo);
                        } else if (opciondeataque.equals("2")) {
                            int dañomagicototal = (int) (dañomagico * multiplicadordaño);
                            PSenemigo -= dañomagicototal;
                            System.out.println("Has usado tu ataque magico quitandole un total de " + dañomagicototal + " de vida a tu enemigo");
                            System.out.println("Vida restante del enemigo: " + PSenemigo);
                        }
                    }
                    if (ataque == 3){
                        System.out.println("Has fallado el ataque y no hiciste daño a tu rival");
                    }
                    if (PSenemigo <= 0) {
                        System.out.println("Eliminaste a tu enemigo " + enemigoactual);
                        PSenemigo += 5;
                        break;
                    }
                }
                double dañototalenemigo = dañoenemigo * multiplicadordañoenemigo;
                System.out.println("El enemigo te ataco quitandote un total de " + dañototalenemigo);
                System.out.println("Dejandote a " + PS);
            }
        }
    }
}



