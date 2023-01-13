package org.iesalandalus.programacion.cuatroenraya;

import org.iesalandalus.programacion.cuatroenraya.modelo.Ficha;
import org.iesalandalus.programacion.cuatroenraya.modelo.Jugador;
import org.iesalandalus.programacion.cuatroenraya.vista.Consola;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Introduce los datos del PRIMER jugador: ");
		Jugador jug1 = Consola.leerJugador();
		System.out.println("Introduce los datos del SEGUNDO jugador: ");
		Jugador jug2;
		if(jug1.getColorFichas().equals(Ficha.values()[0])) {
			jug2 = Consola.leerJugador(Ficha.values()[1]);
		}
		else {
			jug2 = Consola.leerJugador(Ficha.values()[0]);
		}
		CuatroEnRaya cuatroEnRaya = new CuatroEnRaya(jug1, jug2);
		cuatroEnRaya.jugar();
	}

}
