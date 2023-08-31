package JuegoJava;

import javax.swing.*;

public class Juego {
    public static int datos(){
        int op;

        op = Integer.parseInt(JOptionPane.showInputDialog("Escoja una de las opciones: " +
                "\n1. Piedra" +
                "\n2. Papel" +
                "\n3. Tijeras" +
                "\n4. Lagarto" +
                "\n5. Spock"));
        return op;
    }

    public static void main(String[] args){
        int op1,op2;
        JOptionPane.showMessageDialog(null, "Este es un juego de Piedra, Papel, Tigera, Lagarto y Spock");

        op1 = datos();
        op2 = datos();
    if (op1 < 1 || op1 > 5 ){
        JOptionPane.showMessageDialog(null, "Jugador #1 introdujo una opcion equivocada");
    } else if (op2 < 1 || op2 > 5) {
        JOptionPane.showMessageDialog(null, "Jugador #2 introdujo una opcion equivocada");
    } else {
        if(op1==1 || op2==1){
            if (op1==1 && op2==3){
                JOptionPane.showMessageDialog(null, " Jugador #1 escogio Piedra" +
                        "\nJugador #2 escogio Tijeras"+
                        "\nGanador Jugador #1"+
                        "\nPiedra aplasta a Tijeras");
            } else if (op1==1 && op2==4) {
                JOptionPane.showMessageDialog(null, " Jugador #1 escogio Piedra" +
                        "\nJugador #2 escogio Lagarto"+
                        "\nGanador Jugador #1"+
                        "\nPiedra aplasta a Lagarto");
            } else if (op2==1 && op1==3) {
                JOptionPane.showMessageDialog(null, " Jugador #1 escogio Tijeras" +
                        "\nJugador #2 escogio Piedra"+
                        "\nGanador Jugador #2"+
                        "\nPiedra aplasta a Tijeras");
            } else if (op2==1 && op1==4) {
                JOptionPane.showMessageDialog(null, " Jugador #1 escogio Lagarto" +
                        "\nJugador #2 escogio Piedra"+
                        "\nGanador Jugador #2"+
                        "\nPiedra aplasta a Lagarto");
            }
        }

        if (op1==2 || op2==2){
            if (op1==2 && op2==1){
                JOptionPane.showMessageDialog(null, " Jugador #1 escogio Papel" +
                        "\nJugador #2 escogio Piedra"+
                        "\nGanador Jugador #1"+
                        "\nPapel tapa a Piedra");
            } else if (op1==2 && op2==5) {
                JOptionPane.showMessageDialog(null, " Jugador #1 escogio Papel" +
                        "\nJugador #2 escogio Spock"+
                        "\nGanador Jugador #1"+
                        "\nPapel desautoriza Spock");
            } else if (op2==2 && op1==1) {
                JOptionPane.showMessageDialog(null, " Jugador #1 escogio Piedra" +
                        "\nJugador #2 escogio Papel"+
                        "\nGanador Jugador #2"+
                        "\nPapel tapa a Piedra");
            } else if (op2==2 && op1==5) {
                JOptionPane.showMessageDialog(null, " Jugador #1 escogio Spock" +
                        "\nJugador #2 escogio Papel"+
                        "\nGanador Jugador #2"+
                        "\nPapel desautoriza Spock");
            }
        }

        if (op1==3 || op2==3){
            if (op1==3 && op2==2){
                JOptionPane.showMessageDialog(null, " Jugador #1 escogio Tijeras" +
                        "\nJugador #2 escogio Papel"+
                        "\nGanador Jugador #1"+
                        "\nTijeras cortan Papel");
            } else if (op1==3 && op2==4) {
                JOptionPane.showMessageDialog(null, " Jugador #1 escogio Tijeras" +
                        "\nJugador #2 escogio Lagarto"+
                        "\nGanador Jugador #1"+
                        "\nTijeras decapitan Lagarto");
            } else if (op2==3 && op1==2) {
                JOptionPane.showMessageDialog(null, " Jugador #1 escogio Papel" +
                        "\nJugador #2 escogio Tijeras"+
                        "\nGanador Jugador #2"+
                        "\nTijeras cortan Papel");
            } else if (op2==3 && op1==4) {
                JOptionPane.showMessageDialog(null, " Jugador #1 escogio Lagarto" +
                        "\nJugador #2 escogio Tijeras"+
                        "\nGanador Jugador #2"+
                        "\nTijeras decapitan Lagarto");
            }
        }

        if (op1==4 || op2==4){
            if (op1==4 && op2==5){
                JOptionPane.showMessageDialog(null, " Jugador #1 escogio Lagarto" +
                        "\nJugador #2 escogio Spock"+
                        "\nGanador Jugador #1"+
                        "\nLagarto envenena a Spock");
            } else if (op1==4 && op2==2) {
                JOptionPane.showMessageDialog(null, " Jugador #1 escogio Lagarto" +
                        "\nJugador #2 escogio Papel"+
                        "\nGanador Jugador #1"+
                        "\nLagarto devora papel");
            } else if (op2==4 && op1==5) {
                JOptionPane.showMessageDialog(null, " Jugador #1 escogio Spock" +
                        "\nJugador #2 escogio Lagarto"+
                        "\nGanador Jugador #2"+
                        "\nLagarto envenena a Spock");
            } else if (op2==4 && op1==2) {
                JOptionPane.showMessageDialog(null, " Jugador #1 escogio Papel" +
                        "\nJugador #2 escogio Lagarto"+
                        "\nGanador Jugador #2"+
                        "\nLagarto devora Papel");
            }
        }

        if (op1==5 || op2==5){
            if (op1==5 && op2==3){
                JOptionPane.showMessageDialog(null, " Jugador #1 escogio Spock" +
                        "\nJugador #2 escogio Tijeras"+
                        "\nGanador Jugador #1"+
                        "\nSpock rompe Tijeras");
            } else if (op1==5 && op2==1) {
                JOptionPane.showMessageDialog(null, " Jugador #1 escogio Spock" +
                        "\nJugador #2 escogio Piedra"+
                        "\nGanador Jugador #1"+
                        "\nSpock vaporiza Piedra");
            } else if (op2==5 && op1==3) {
                JOptionPane.showMessageDialog(null, " Jugador #1 escogio Tijeras" +
                        "\nJugador #2 escogio Spock"+
                        "\nGanador Jugador #2"+
                        "\nSpock rompe Tijeras");
            } else if (op2==5 && op1==1) {
                JOptionPane.showMessageDialog(null, " Jugador #1 escogio Piedra" +
                        "\nJugador #2 escogio Spock" +
                        "\nGanador Jugador #2"+
                        "\nSpock vaporiza Piedra");
            }
        }
    }
    }
}
