package br.com.aplicação.com;

import java.util.Scanner;

import br.com.modelo.com.ContaPoupanca;
import br.com.modelo.com.ContaInvestimento;

public class Main {
	

	
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		 
		int op;
		int oc;
		ContaPoupanca cp = null;
		ContaInvestimento ci = null;
		
		do {
			
			
			System.out.println("1.Abrir Conta");
			System.out.println("2.Sacar");
			System.out.println("3.Depositar");
			System.out.println("4.Saldo");
			System.out.println("5.Sair");
			op = input.nextInt();
			
			if(op==1) {
				System.out.println("Qual é o tipo de conta que gostaria de abrir?\n1.poupanca\n2.investimento");
				oc = input.nextInt();
				if(oc==1) {
					cp = new ContaPoupanca();	
		   }else {
		 ci = new ContaInvestimento();	
				   }
				System.out.println("Conta Criada com SUS!");	
				
			  }else if(op==2) {
				  
			  }else if(op==3) {
				  
			  }else if(op==4) {
					System.out.println("Qual é o tipo de conta que gostaria de abrir?\n1.poupanca\n2.investimento");
					 oc = input.nextInt();
					if(oc==1) {
						System.out.println("Saldo da sua conta poupança é:"+cp.getSaldo());
					}else {
						System.out.println("Saldo da Sua conta de Investimento é:"+cp.getSaldo());
						 
					}
			  }
			
			
			  }while(op!=5);
			  
		  

		}
		  
		
}
	
		
		  
		  
		  

	   
		
	

	


