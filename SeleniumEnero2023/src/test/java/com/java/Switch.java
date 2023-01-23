package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Switch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int velocidadActualcoche = 100; // Km*h
		int velocidadLimiteCarretera = 100;
		int velocidadLimiteCalle = 70;
		int velocidadLimiteEscolar = 30;
		char option;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		do {
			System.out.println("Ingresa la zona en donde estás:");
			System.out.println("1= Carretera \n2= Calle \n3= Escolar");
			String Zona = buffer.readLine();

			switch (Zona) {
			case "1": {
				if (velocidadActualcoche > velocidadLimiteCarretera) {
					// Block code
					System.out.println("Carretera - Multa");
				} else {
					System.out.println("Carretera - Eres un buen conductor");

				}

			}
				break;
			case "2": {
				if (velocidadActualcoche > velocidadLimiteCalle) {
					// Block code
					System.out.println("Calle - Multa");
				} else {
					System.out.println("Calle - Eres un buen conductor");

				}

			}
				break;
			case "3": {
				if (velocidadActualcoche > velocidadLimiteEscolar) {
					// Block code
					System.out.println("Zona Escolar - Multa");
				} else {
					System.out.println("Zona Escolar - Eres un buen conductor");

				}
			}
				break;

			default:
				System.out.println("Estoy aquí");
			}
			System.out.println("Volver a seleccionar zona? s= Si n= No");
			option = buffer.readLine().charAt(0);
		} while (option == 's');
	}

}
