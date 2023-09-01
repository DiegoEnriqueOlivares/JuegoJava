package JuegoJava;

import javax.swing.*;

public class JuegoSwitch {
    public static int datos() {
        int op;

        op = Integer.parseInt(JOptionPane.showInputDialog("Escoja una de las opciones: " +
                "\n1. Piedra" +
                "\n2. Papel" +
                "\n3. Tijeras" +
                "\n4. Lagarto" +
                "\n5. Spock"));
        return op;
    }

    public static void verificarJug1(int a, int b) {
        switch (a) {
            case 1:
                if (a == 1 && b == 3) {
                    JOptionPane.showMessageDialog(null, " Jugador #1 escogio Piedra" +
                            "\nJugador #2 escogio Tijeras" +
                            "\nGanador Jugador #1" +
                            "\nPiedra aplasta a Tijeras");
                } else if (a == 1 && b == 4) {
                    JOptionPane.showMessageDialog(null, " Jugador #1 escogio Piedra" +
                            "\nJugador #2 escogio Lagarto" +
                            "\nGanador Jugador #1" +
                            "\nPiedra aplasta a Lagarto");
                }
                break;
            case 2:
                if (a == 2 && b == 1) {
                    JOptionPane.showMessageDialog(null, " Jugador #1 escogio Papel" +
                            "\nJugador #2 escogio Piedra" +
                            "\nGanador Jugador #1" +
                            "\nPapel tapa a Piedra");
                } else if (a == 2 && b == 5) {
                    JOptionPane.showMessageDialog(null, " Jugador #1 escogio Papel" +
                            "\nJugador #2 escogio Spock" +
                            "\nGanador Jugador #1" +
                            "\nPapel desautoriza Spock");
                }
                break;
            case 3:
                if (a == 3 && b == 2) {
                    JOptionPane.showMessageDialog(null, " Jugador #1 escogio Tijeras" +
                            "\nJugador #2 escogio Papel" +
                            "\nGanador Jugador #1" +
                            "\nTijeras cortan Papel");
                } else if (a == 3 && b == 4) {
                    JOptionPane.showMessageDialog(null, " Jugador #1 escogio Tijeras" +
                            "\nJugador #2 escogio Lagarto" +
                            "\nGanador Jugador #1" +
                            "\nTijeras decapitan Lagarto");
                }
                break;
            case 4:
                if (a == 4 && b == 5) {
                    JOptionPane.showMessageDialog(null, " Jugador #1 escogio Lagarto" +
                            "\nJugador #2 escogio Spock" +
                            "\nGanador Jugador #1" +
                            "\nLagarto envenena a Spock");
                } else if (a == 4 && b == 2) {
                    JOptionPane.showMessageDialog(null, " Jugador #1 escogio Lagarto" +
                            "\nJugador #2 escogio Papel" +
                            "\nGanador Jugador #1" +
                            "\nLagarto devora papel");
                }
                break;
            case 5:
                if (a == 5 && b == 3) {
                    JOptionPane.showMessageDialog(null, " Jugador #1 escogio Spock" +
                            "\nJugador #2 escogio Tijeras" +
                            "\nGanador Jugador #1" +
                            "\nSpock rompe Tijeras");
                } else if (a == 5 && b == 1) {
                    JOptionPane.showMessageDialog(null, " Jugador #1 escogio Spock" +
                            "\nJugador #2 escogio Piedra" +
                            "\nGanador Jugador #1" +
                            "\nSpock vaporiza Piedra");
                }
                break;
        }
    }

    public static void verificarJug2(int a, int b) {
        switch (a) {
            case 1:
                if (a == 1 && b == 3) {
                    JOptionPane.showMessageDialog(null, " Jugador #2 escogio Piedra" +
                            "\nJugador #1 escogio Tijeras" +
                            "\nGanador Jugador #2" +
                            "\nPiedra aplasta a Tijeras");
                } else if (a == 1 && b == 4) {
                    JOptionPane.showMessageDialog(null, " Jugador #2 escogio Piedra" +
                            "\nJugador #1 escogio Lagarto" +
                            "\nGanador Jugador #2" +
                            "\nPiedra aplasta a Lagarto");
                }
                break;
            case 2:
                if (a == 2 && b == 1) {
                    JOptionPane.showMessageDialog(null, " Jugador #2 escogio Papel" +
                            "\nJugador #1 escogio Piedra" +
                            "\nGanador Jugador #2" +
                            "\nPapel tapa a Piedra");
                } else if (a == 2 && b == 5) {
                    JOptionPane.showMessageDialog(null, " Jugador #2 escogio Papel" +
                            "\nJugador #1 escogio Spock" +
                            "\nGanador Jugador #2" +
                            "\nPapel desautoriza Spock");
                }
                break;
            case 3:
                if (a == 3 && b == 2) {
                    JOptionPane.showMessageDialog(null, " Jugador #2 escogio Tijeras" +
                            "\nJugador #1 escogio Papel" +
                            "\nGanador Jugador #2" +
                            "\nTijeras cortan Papel");
                } else if (a == 3 && b == 4) {
                    JOptionPane.showMessageDialog(null, " Jugador #2 escogio Tijeras" +
                            "\nJugador #1 escogio Lagarto" +
                            "\nGanador Jugador #2" +
                            "\nTijeras decapitan Lagarto");
                }
                break;
            case 4:
                if (a == 4 && b == 5) {
                    JOptionPane.showMessageDialog(null, " Jugador #2 escogio Lagarto" +
                            "\nJugador #1 escogio Spock" +
                            "\nGanador Jugador #2" +
                            "\nLagarto envenena a Spock");
                } else if (a == 4 && b == 2) {
                    JOptionPane.showMessageDialog(null, " Jugador #2 escogio Lagarto" +
                            "\nJugador #1 escogio Papel" +
                            "\nGanador Jugador #2" +
                            "\nLagarto devora papel");
                }
                break;
            case 5:
                if (a == 5 && b == 3) {
                    JOptionPane.showMessageDialog(null, " Jugador #1 escogio Spock" +
                            "\nJugador #2 escogio Tijeras" +
                            "\nGanador Jugador #1" +
                            "\nSpock rompe Tijeras");
                } else if (a == 5 && b == 1) {
                    JOptionPane.showMessageDialog(null, " Jugador #1 escogio Spock" +
                            "\nJugador #2 escogio Piedra" +
                            "\nGanador Jugador #1" +
                            "\nSpock vaporiza Piedra");
                }
                break;
        }
    }
    public static void main(String[] args) {
        int op1, op2;
        JOptionPane.showMessageDialog(null, "Este es un juego de Piedra, Papel, Tigera, Lagarto y Spock");

        op1 = datos();
        op2 = datos();
        if (op1 < 1 || op1 > 5) {
            JOptionPane.showMessageDialog(null, "Jugador #1 introdujo una opcion equivocada");
        } else if (op2 < 1 || op2 > 5) {
            JOptionPane.showMessageDialog(null, "Jugador #2 introdujo una opcion equivocada");
        } else {
            verificarJug1(op1, op2);
            verificarJug2(op2, op1);
        }
    }
}