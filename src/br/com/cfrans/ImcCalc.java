package br.com.cfrans;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ImcCalc {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Olá! Vamos calcular seu IMC?");
		System.out.print("Digite sua altura, em metros: ");
		float altura = sc.nextFloat();
		System.out.print("Digite seu peso, com as casas decimais se houver: ");
		float peso = sc.nextFloat();
		
		float imc = peso / (altura * altura);
		DecimalFormat df = new DecimalFormat("#.##");
		
		if(imc > 18.5 && imc < 25){
			System.out.println("Seu IMC é: " + df.format(imc));
			System.out.println("Você está dentro do seu peso ideal!");

		} else if (imc > 25){
			System.out.println("Seu IMC é: " + df.format(imc));
			System.out.println("Você está acima do seu peso ideal.");

		} else if (imc < 18.5){
			System.out.println("Seu IMC é: " + df.format(imc));
			System.out.println("Você está abaixo do seu peso ideal.");

			
		}
		sc.close();
	}

}