package JuegoJava;

import javax.swing.*;

public class JuegoOpeTern {
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

            String res = (op1 < 1 || op1 > 5 ) ? "Jugador #1 introdujo una opcion equivocada" :
                    (op2 < 1 || op2 > 5) ? "Jugador #2 introdujo una opcion equivocada" : (op1==1 || op2==1) ? (op1==1 && op2==3) ? " Jugador #1 escogio Piedra" +
                    "\nJugador #2 escogio Tijeras"+
                    "\nGanador Jugador #1"+
                    "\nPiedra aplasta a Tijeras" : (op1==1 && op2==4) ? " Jugador #1 escogio Piedra" +
                    "\nJugador #2 escogio Lagarto"+
                    "\nGanador Jugador #1"+
                    "\nPiedra aplasta a Lagarto" : (op2==1 && op1==3) ? " Jugador #1 escogio Tijeras" +
                    "\nJugador #2 escogio Piedra"+
                    "\nGanador Jugador #2"+
                    "\nPiedra aplasta a Tijeras" : (op2==1 && op1==4) ? " Jugador #1 escogio Lagarto" +
                    "\nJugador #2 escogio Piedra"+
                    "\nGanador Jugador #2"+
                    "\nPiedra aplasta a Lagarto" : (op1==2 || op2==2) ? (op1==2 && op2==1) ? " Jugador #1 escogio Papel" +
                    "\nJugador #2 escogio Piedra"+
                    "\nGanador Jugador #1"+
                    "\nPapel tapa a Piedra" : (op1==2 && op2==5) ? " Jugador #1 escogio Papel" +
                    "\nJugador #2 escogio Spock"+
                    "\nGanador Jugador #1"+
                    "\nPapel desautoriza Spock" : (op2==2 && op1==1) ? " Jugador #1 escogio Piedra" +
                    "\nJugador #2 escogio Papel"+
                    "\nGanador Jugador #2"+
                    "\nPapel tapa a Piedra" : (op2==2 && op1==5) ? " Jugador #1 escogio Spock" +
                    "\nJugador #2 escogio Papel"+
                    "\nGanador Jugador #2"+
                    "\nPapel desautoriza Spock" : (op1==3 || op2==3) ? (op1==3 && op2==2) ? " Jugador #1 escogio Tijeras" +
                    "\nJugador #2 escogio Papel"+
                    "\nGanador Jugador #1"+
                    "\nTijeras cortan Papel" : (op1==3 && op2==4) ? " Jugador #1 escogio Tijeras" +
                    "\nJugador #2 escogio Lagarto"+
                    "\nGanador Jugador #1"+
                    "\nTijeras decapitan Lagarto" : (op2==3 && op1==2) ? " Jugador #1 escogio Papel" +
                    "\nJugador #2 escogio Tijeras"+
                    "\nGanador Jugador #2"+
                    "\nTijeras cortan Papel" : (op2==3 && op1==4) ? " Jugador #1 escogio Lagarto" +
                    "\nJugador #2 escogio Tijeras"+
                    "\nGanador Jugador #2"+
                    "\nTijeras decapitan Lagarto" : (op1==4 || op2==4) ? (op1==4 && op2==5) ? " Jugador #1 escogio Lagarto" +
                    "\nJugador #2 escogio Spock"+
                    "\nGanador Jugador #1"+
                    "\nLagarto envenena a Spock" : (op1==4 && op2==2) ? " Jugador #1 escogio Lagarto" +
                    "\nJugador #2 escogio Papel"+
                    "\nGanador Jugador #1"+
                    "\nLagarto devora papel" : (op2==4 && op1==5) ? " Jugador #1 escogio Spock" +
                    "\nJugador #2 escogio Lagarto"+
                    "\nGanador Jugador #2"+
                    "\nLagarto envenena a Spock" : (op2==4 && op1==2) ? " Jugador #1 escogio Papel" +
                    "\nJugador #2 escogio Lagarto"+
                    "\nGanador Jugador #2"+
                    "\nLagarto devora Papel" : (op1==5 || op2==5) ? (op1==5 && op2==3) ? " Jugador #1 escogio Spock" +
                    "\nJugador #2 escogio Tijeras"+
                    "\nGanador Jugador #1"+
                    "\nSpock rompe Tijeras" : (op1==5 && op2==1) ?" Jugador #1 escogio Spock" +
                    "\nJugador #2 escogio Piedra"+
                    "\nGanador Jugador #1"+
                    "\nSpock vaporiza Piedra" : (op2==5 && op1==3) ? " Jugador #1 escogio Tijeras" +
                    "\nJugador #2 escogio Spock"+
                    "\nGanador Jugador #2"+
                    "\nSpock rompe Tijeras" : (op2==5 && op1==1) ? " Jugador #1 escogio Piedra" +
                    "\nJugador #2 escogio Spock" +
                    "\nGanador Jugador #2"+
                    "\nSpock vaporiza Piedra" : null : null : null : null : null : null ;
            JOptionPane.showMessageDialog(null, res);

    }
}
