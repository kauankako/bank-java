package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("SEJA BEM VINDO AO KaKo BANK");
		System.out.println();
		
		System.out.print("Digite o número da conta: ");
		int numConta = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		System.out.println("Digite o nome do titular da conta: ");
		String nomeTitular = sc.nextLine();
		System.out.println();
		
		Conta conta;
		System.out.println("Existe um valor de depósito inicial? s ou n?");
		char vaiDepositar = sc.next().charAt(0);
		
		if (vaiDepositar == 's') {
			System.out.println("Quanto será o depósito inicial?");
			double saldo = sc.nextDouble();
			conta = new Conta(numConta, nomeTitular, saldo);
		}else{
			conta = new Conta(numConta, nomeTitular);
		}

		System.out.println();
		System.out.println("CONTA NÚMERO: " + conta.getNumConta());
		System.out.println("NOME TITULAR: " + conta.getNomeTitular());
		System.out.println("SALDO: " + conta.getSaldo());
		System.out.println();
		
		System.out.print("Entre com o valor a ser depositado: ");
		double valorDepositado = sc.nextDouble();
		conta.deposita(valorDepositado);
		
		System.out.println();
		System.out.println("CONTA NÚMERO: " + conta.getNumConta());
		System.out.println("NOME TITULAR: " + conta.getNomeTitular());
		System.out.println("SALDO: " + conta.getSaldo());
		System.out.println();
		
		System.out.println("Entre com o valor a ser sacado: ");
		double valorSacado = sc.nextDouble();
		conta.sacar(valorSacado);
		
		System.out.println();
		System.out.println("CONTA NÚMERO: " + conta.getNumConta());
		System.out.println("NOME TITULAR: " + conta.getNomeTitular());
		System.out.println("SALDO: " + conta.getSaldo());
		System.out.println();
		sc.close();
	}

}
