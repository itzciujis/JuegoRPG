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
            while (PS >= 0 && PSenemigo >= 0) {
                System.out.println("Estas son las estas de tu enemigo " + enemigoactual);
                System.out.println("PS = " + PSenemigo);
                System.out.println("Multiplicador de daño = " + multiplicadordañoenemigo);
                System.out.println("Daño = " + dañoenemigo);
                System.out.println("Que accion vas a realizar para defenderte de este malechor?");
                System.out.println("Tus opciones son:");
                System.out.println("1. Ataque fisico");
                System.out.println("2. Ataque magico");

                String opciondeataque = sc.nextLine();
                int ataque = rand.nextInt(6) + 1;
                if (ataque == 1 || ataque == 2 || ataque == 3 || ataque == 4) {
                    if (opciondeataque.equals("1")) {
                        int dañofisicototal = (int) (dañofisico * multiplicadordaño);
                        PSenemigo -= dañofisicototal;
                        System.out.println("Has usado tu ataque fisico quitandole un total de " + dañofisicototal + " de vida a tu enemigo");
                        System.out.println("Vida restante del enemigo: " + PSenemigo);
                    }
                    if (ataque == 5) {
                        System.out.println("Has fallado el ataque y no hiciste daño a tu rival");
                    }
                    if (ataque == 6) {
                        System.out.println("Has conseguido hacer un critico!!");
                        System.out.println("Tu daño es multiplicado por 1.5 que de normal");
                        int dañofisicototal = (int) ((dañofisico * multiplicadordaño) * 1.5);
                    }

                }
                if (opciondeataque.equals(23) && PM >= 25) {
                    if (opciondeataque.equals("2")) {
                        int dañomagicototal = (int) (dañomagico * multiplicadordaño);
                        PSenemigo -= dañomagicototal;
                        System.out.println("Has usado tu ataque magico quitandole un total de " + dañomagicototal + " de vida a tu enemigo");
                        System.out.println("Vida restante del enemigo: " + PSenemigo);
                    } else if (PM < 25) {
                        System.out.println("No tienes energia mistica para atacar con un ataque magico");
                    }
                    double dañototalenemigo = dañoenemigo * multiplicadordañoenemigo;
                    System.out.println("El enemigo te ataco quitandote un total de " + dañototalenemigo);
                    System.out.println("Dejandote a " + PS);
                }
            }
            if (PSenemigo <= 0) {
                PSenemigo += 5;
                System.out.println("Enorabuena derrotaste a tu enemigo y defendiste españa de sus malechores");
                System.out.println("Pero aun hay mucho camino por recorrer y muchos enemigos que derrotar");
                System.out.println("Pero en tu larga travesia encuentras un magnifico kebab que te vende suministros, que deseas comprarle");
                System.out.println("1. kebab + 25 de vida");
                System.out.println("2. bandera de españa + 25 de PM");
                System.out.println("3. spray de pimienta + 5 de daño fisico");
                System.out.println("4. siesta descomunal + 0.05 de multiplicador de daño");
                String item1 = "kebab";
                String item2 = "banderadeespañ";
                String item3 = "spraypimienta";
                String item4 = "siestadescomunal";
                int elecciondecompra = sc.nextInt();
                String itemComprado = null;

                switch (elecciondecompra) {
                    case 1:
                        PS += 25;
                        itemComprado = item1;
                        System.out.println("Compraste " + item1 + " PS actual: " + PS);
                        break;
                    case 2:
                        PM += 25;
                        itemComprado = item2;
                        System.out.println("Compraste " + item2 + " PM actual: " + PM);
                        break;
                    case 3:
                        dañofisico += 5;
                        itemComprado = item3;
                        System.out.println("Compraste " + item3 + " Daño físico actual: " + dañofisico);
                        break;
                    case 4:
                        multiplicadordaño += 0.05;
                        itemComprado = item4;
                        System.out.println("Compraste " + item4 + " Multiplicador de daño actual: " + multiplicadordaño);
                        break;
                    default:
                        System.out.println("No compraste nada.");
                        break;
                }

                if (itemComprado != null) {
                    for (int i = 0; i < inventario.length; i++) {
                        if (inventario[i] == null) {
                            inventario[i] = itemComprado;
                            break;
                        }
                    }
                }

                System.out.print("Inventario actual: ");
                for (String it : inventario) {
                    if (it != null) {
                        System.out.print(it + ", ");
                    }
                }
                break;
            }
        }
    }
}



