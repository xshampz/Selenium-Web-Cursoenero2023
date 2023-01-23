package com.java;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int velocidadActualcoche = 100; // Km*h
		int velocidadLimiteCarretera= 100;
		int velocidadLimiteCalle= 70;
		int velocidadLimiteEscolar= 30;
		
		String zona = "Calle";

		if (zona == "Carretera") {

			if (velocidadActualcoche > velocidadLimiteCarretera) {
				// Block code
				System.out.println("Carretera - Multa");
			} else {
				System.out.println("Carretera - Eres un buen conductor");
			}
		}

		else if (zona == "Calle") {
			
			if (velocidadActualcoche > velocidadLimiteCalle) {
				// Block code
				System.out.println("Calle - Multa");
			} else {
				System.out.println("Calle - Eres un buen conductor");

			}
		}

		else if (zona == "Escolar") {
			
			if (velocidadActualcoche > velocidadLimiteEscolar) {
				// Block code
				System.out.println("Zona Escolar - Multa");
			} else {
				System.out.println("Zona Escolar - Eres un buen conductor");

			}
		}
	}
}
