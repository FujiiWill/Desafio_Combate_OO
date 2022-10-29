package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armour = sc.nextInt();
		Champion champion1 = new Champion(name, life, attack, armour);
		
		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armour = sc.nextInt();
		Champion champion2 = new Champion(name, life, attack, armour);
		
		int n, i;
		
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		n = sc.nextInt();
		System.out.println();
		
		i=1;
		while(champion1.getLife() > 0 && champion2.getLife() > 0 && i <= n) {
			i ++;
			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);
						
			System.out.println("Resultado do turno " + (i-1) + ":");
			System.out.println(champion1.status());
			System.out.println(champion2.status());
			System.out.println();				
		}
		
		System.out.println("FIM DO COMBATE");
		
		sc.close();
	}
}
