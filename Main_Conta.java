package Encapsulamento;

import java.util.Scanner;

public class Main_Conta {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        Conta c1 = new Conta();

        System.out.printf("Escreva seu nome: ");
        c1.setNome(teclado.nextLine());
        System.out.printf("Digite seu número de conta: ");
        c1.setNumero(teclado.nextLine());
        System.out.printf("Informe seu cpf: ");
        c1.setCpf(teclado.nextLine());
        c1.setSaldo(8000);
        System.out.println("\nExibindo extrato...");
        try{
			Thread.sleep(1000);
		} 
        catch (InterruptedException e){
			e.printStackTrace();
        }
        System.out.println("Saldo atual: " + c1.getExtrato());
        System.out.printf("Valor de depósito: ");
        c1.setDeposito(teclado.nextDouble());
        System.out.println("Depositando valor...");
        try{
			Thread.sleep(3000);
		} 
        catch (InterruptedException e){
            System.out.println("Saldo atual: " + c1.getExtrato());
            System.out.println(c1.getExtrato());
            e.printStackTrace();
        }
        System.out.println("Saldo atual: " + c1.getExtrato());
        System.out.printf("\nSaque selecionado. \nInsira o valor do saque: ");
        c1.setSaque(teclado.nextDouble());
        System.out.println("Sacando o valor desejado..");
        try{
			Thread.sleep(3000);
		} 
        catch (InterruptedException e){
			e.printStackTrace();
        }
        System.out.println("Saldo atual da conta: " + c1.getExtrato());
    }
}
