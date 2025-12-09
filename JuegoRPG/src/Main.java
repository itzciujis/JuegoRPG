import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] enemigos = {"Amego Segarro", "Pedro Sanchez", "Charo", "Maeb", "Reina del brillo", "Repartidor de Uber Eats"};
        String[] recompensas = {"Segarro", "Liberacion de el comunismo", "Diploma de machista oficial",
                "Poder ancestral de la sabiduria", "Bicicleta de Uber Eats", "Cupon de 5 leuros",
                "Liberacion de IVA", "Spray anti segarros"};
        String[] inventario = new String[10];
        String[] interaccion = {"Normal", "Normal", "Normal", "Normal", "Critico", "Esquivado"};

        int PS = 0;
        int PM = 0;
        int dañoFisico = 0;
        int dañoMagico = 0;
        int oro = 0;
        double multiplicador = 0;

        while (true) {
            System.out.println("Bienvenido al mundo de Barcelona, cómo te llamas? \uD83C\uDF06 \uD83D\uDCAC");
            String nombrePersonaje = sc.nextLine();

            System.out.println("Elige tu clase: \uD83C \uDF93✨");
            System.out.println("1. Caudillo de España \uD83D\uDEE1\uFE0F \uD83D\uDC51");
            System.out.println("2. Socialista comunista ☭\uD83D \uDFE5");
            System.out.println("3. Persona normal \uD83D\uDE42");
            System.out.println("4. Enfermito del Twitter \uD83D\uDC26 \uD83E\uDD12");
            System.out.println("5. Emo sin futuro \uD83D\uDDA4 \uD83D\uDE14");
            System.out.println("6. Indio \uD83C\uDFF9 \uD83C\uDF04");

            int seleccion = sc.nextInt();
            sc.nextLine();

            if (seleccion == 1) {
                PS = 120;
                PM = 30;
                multiplicador = 1.2;
                dañoFisico = 25;
                dañoMagico = 15;
                oro = 0;
            }
            if (seleccion == 2) {
                PS = 90;
                PM = 50;
                multiplicador = 1.0;
                dañoFisico = 15;
                dañoMagico = 25;
                oro = 0;
            }
            if (seleccion == 3) {
                PS = 100;
                PM = 40;
                multiplicador = 1.0;
                dañoFisico = 20;
                dañoMagico = 20;
                oro = 0;
            }
            if (seleccion == 4) {
                PS = 70;
                PM = 60;
                multiplicador = 0.9;
                dañoFisico = 10;
                dañoMagico = 30;
                oro = 0;
            }
            if (seleccion == 5) {
                PS = 80;
                PM = 50;
                multiplicador = 1.0;
                dañoFisico = 15;
                dañoMagico = 25;
                oro = 0;
            }
            if (seleccion == 6) {
                PS = 100;
                PM = 30;
                multiplicador = 1.1;
                dañoFisico = 30;
                dañoMagico = 15;
                oro = 0;
            }


            System.out.println("Preparado para salir a las peligrosas calles de Barcelona?\uD83D\uDDE1\uFE0F ⚠\uFE0F");
            String modificar = sc.nextLine();
            if (modificar.equalsIgnoreCase("no")) continue;

            while (true) {
                int enemigoIndex = rand.nextInt(enemigos.length);
                String enemigoActual = enemigos[enemigoIndex];
                int PSenemigo = 0;
                int dañoEnemigo = 0;
                double multEnemigo = 1.0;

                if (enemigoActual.equals("Amego Segarro")) {
                    PSenemigo = 80;
                    dañoEnemigo = 10;
                    multEnemigo = 1.0;
                }
                if (enemigoActual.equals("Pedro Sanchez")) {
                    PSenemigo = 100;
                    dañoEnemigo = 15;
                    multEnemigo = 1.1;
                }
                if (enemigoActual.equals("Charo")) {
                    PSenemigo = 90;
                    dañoEnemigo = 12;
                    multEnemigo = 1.0;
                }
                if (enemigoActual.equals("Maeb")) {
                    PSenemigo = 110;
                    dañoEnemigo = 14;
                    multEnemigo = 1.1;
                }
                if (enemigoActual.equals("Reina del brillo")) {
                    PSenemigo = 100;
                    dañoEnemigo = 12;
                    multEnemigo = 1.2;
                }
                if (enemigoActual.equals("Repartidor de Uber Eats")) {
                    PSenemigo = 120;
                    dañoEnemigo = 15;
                    multEnemigo = 1.0;
                }

                System.out.println("Te encuentras con: " + enemigoActual + "⚔\uFE0F \uD83D\uDCA5");

                while (PS > 0 && PSenemigo > 0) {
                    System.out.println("\uD83D\uDCCA\uD83D\uDCAATu PS: " + PS + " |\uD83D\uDEE1\uFE0F PS enemigo: " + PSenemigo + " |⚡ PM: " + PM);
                    System.out.println("Elige acción: 1) Ataque físico ⚔\uFE0F 2) Ataque mágico ✨ 3) Huir \uD83C\uDFC3\u200D♂\uFE0F");
                    String opcion = sc.nextLine();

                    if (opcion.equals("1")) {
                        int ataque = rand.nextInt(interaccion.length);
                        int dañoTotal = 0;
                        if (interaccion[ataque].equals("Normal")) {
                            dañoTotal = (int) (dañoFisico * multiplicador);
                        }
                        if (interaccion[ataque].equals("Critico")) {
                            dañoTotal = (int) (dañoFisico * multiplicador * 1.5);
                        }
                        if (interaccion[ataque].equals("Esquivado")) {
                            dañoTotal = 0;
                        }
                        PSenemigo -= dañoTotal;
                        System.out.println("Infliges " + dañoTotal + " de daño \uD83D\uDCA5 Vida enemiga: " + PSenemigo + " \uD83D\uDEE1\uFE0F");
                    }

                    if (opcion.equals("2")) {
                        if (PM >= 25) {
                            int dañoTotal = (int) (dañoMagico * multiplicador);
                            PSenemigo -= dañoTotal;
                            PM -= 25;
                            System.out.println("Ataque mágico inflige " + dañoTotal + " de daño ✨\uD83D\uDCA5 Vida enemiga: " + PSenemigo + " \uD83D\uDEE1\uFE0F");
                        } else {
                            System.out.println("No tienes PM suficiente.");
                        }
                    }

                    if (opcion.equals("3")) {
                        oro -= 5;
                        if (oro < 0) oro = 0;
                        System.out.println("\uD83C\uDFC3\u200D♂\uFE0F\uD83D\uDCA8Huyes y pierdes \uD83E\uDE995 de oro.");
                        break;
                    }

                    if (PSenemigo > 0) {
                        int ataqueEnemigo = rand.nextInt(interaccion.length);
                        int dañoTotal = dañoEnemigo;
                        if (interaccion[ataqueEnemigo].equals("Critico")) {
                            dañoTotal = dañoEnemigo * 2;
                        }
                        if (interaccion[ataqueEnemigo].equals("Esquivado")) {
                            dañoTotal = 0;
                        }
                        PS -= dañoTotal;
                        System.out.println("⚔\uFE0F\uD83D\uDC79 El enemigo te ataca y recibes " + dañoTotal + " de daño \uD83D\uDC94 Tu PS: " + PS);
                    }

                    PM += 10;
                    if (PM > 50) PM = 50;
                }

                if (PS <= 0) {
                    System.out.println("\uD83D\uDC80⚰\uFE0F Has muerto. Fin del juego\uD83C\uDFAE");
                    return;
                }

                System.out.println("\uD83C\uDFC6\uD83C\uDF89Has derrotado a " + enemigoActual + "\uD83D\uDC80");
                int oroGanado = rand.nextInt(5) + 1;
                String itemGanado = recompensas[rand.nextInt(recompensas.length)];
                oro += oroGanado;
                for (int i = 0; i < inventario.length; i++) {
                    if (inventario[i] == null) {
                        inventario[i] = itemGanado;
                        break;
                    }
                }
                int vidaRecuperada = rand.nextInt(26) + 25;
                PS += vidaRecuperada;
                if (PS > 100) PS = 100;
                System.out.println("Obtienes " + itemGanado + "\uD83C\uDF81 y " + oroGanado + " de oro recuperas " + vidaRecuperada + " PS\uD83D\uDC96");
                System.out.print("Inventario: ");
                for (int i = 0; i < inventario.length; i++) {
                    if (inventario[i] != null) System.out.print(inventario[i] + ", ");
                }
                System.out.println("\uD83C\uDFAESeguir jugando? (✅si/❌no)");
                String cont = sc.nextLine();
                if (!cont.equalsIgnoreCase("si")) return;
            }
        }
    }
}
