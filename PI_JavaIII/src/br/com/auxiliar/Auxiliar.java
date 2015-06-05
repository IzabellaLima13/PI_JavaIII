package br.com.auxiliar;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.veiculo.Cambio;
import br.com.veiculo.CapTanque;
import br.com.veiculo.Cilindrada;
import br.com.veiculo.Cores;
import br.com.veiculo.Modelo;
import br.com.veiculo.Montadora;
import br.com.veiculo.Motorizacao;
import br.com.veiculo.Tipo;
import br.com.veiculo.TipodeVeiculo;
import br.com.veiculo.Veiculo;

public class Auxiliar 
{
	static boolean loop = false;
	static Scanner scan = new Scanner(System.in);
	
	
	
	public static void printVeiculo(Veiculo x)
	{
		System.out.println(x.getMapa().toString());
	}	
	public static Veiculo addVeiculo()
	{
		Veiculo aux = new Veiculo();
		
		return aux;
	}	
	public static TipodeVeiculo addTipoVeiculo()
	{
		TipodeVeiculo aux = null;
		while(!loop)
		{
			try{
				System.out.println("Digite numero correspondente ao modelo: (0)CARRO, (1)MOTOCICLETA");
				aux = TipodeVeiculo.values()[Integer.parseInt(scan.nextLine())];
				loop = true;}
			catch(ArrayIndexOutOfBoundsException aio){
				System.out.println("Erro, favor digitar um numero válido");}
			catch(InputMismatchException ime){
				System.out.println("Erro, voce digitou algo diferente de um numero");}
			catch(NumberFormatException nfe){
				System.out.println("Erro, digite algo valido");}
		}loop = false;
		return aux;
	}
	public static Modelo addModelo()
	{
		Modelo aux = null;
		while(!loop)
		{
			try{
				System.out.println("Digite numero correspondente ao modelo: (0)Uno, (1)Duster, (2)Celta, (3)S200, (4)SUPERCHARGER, (5)BACON3");
				aux = Modelo.values()[Integer.parseInt(scan.nextLine())];
				loop = true;}
			catch(ArrayIndexOutOfBoundsException aio){
				System.out.println("Erro, favor digitar um numero válido");}
			catch(InputMismatchException ime){
				System.out.println("Erro, voce digitou algo diferente de um numero");}
			catch(NumberFormatException nfe){
				System.out.println("Erro, digite algo valido");}
		}loop = false;
		return aux;
	}
	public static Cores addCor()
	{
		Cores aux = null;
		while(!loop)
		{
			try{
				System.out.println("Digite numero correspondente à cor: Preto(0), Amarelo(1), Azul(2), Prata(3), Vermelho(4), Branco(5)");
				aux = Cores.values()[Integer.parseInt(scan.nextLine())];
				loop = true;}
			catch(ArrayIndexOutOfBoundsException aio){
				System.out.println("Erro, favor digitar um numero válido");}
			catch(InputMismatchException ime){
				System.out.println("Erro, voce digitou algo diferente de um numero");}
			catch(NumberFormatException nfe){
				System.out.println("Erro, digite algo valido");}
		}loop = false;
		return aux;
	}
	public static Cambio addCambio()
	{
		Cambio aux = null;
		while(!loop)
		{
			try
			{
				System.out.println("Digite numero correspondente ao cambio:AUTOMÁTICO(0), SEMI_AUTOMÁTICO(1), MANUAL(2)");
				aux = Cambio.values()[Integer.parseInt(scan.nextLine())];
				loop = true;
				}
			catch(InputMismatchException ime)
			{
				System.out.println("Erro, voce digitou algo diferente de um numero");
				}
			catch(ArrayIndexOutOfBoundsException aio)
			{
				System.out.println("Erro, favor digitar um numero válido");
				}
			catch(NumberFormatException nfe)
			{
				System.out.println("Erro, digite algo valido");
				}
		}loop = false;
		return aux;
	}
	public static Montadora addMontadora()
	{
		Montadora aux = null;
		while(!loop)
		{
			try
			{
				System.out.println("Digite numero correspondente à montadora: YAMAHA(0), HARLEY(1), FIAT(2), RENAULT(3)");
				aux = Montadora.values()[Integer.parseInt(scan.nextLine())];
				loop = true;
				}
			catch(InputMismatchException ime)
			{
				System.out.println("Erro, voce digitou algo diferente de um numero");
				}
			catch(ArrayIndexOutOfBoundsException aio)
			{
				System.out.println("Erro, favor digitar um numero válido");
				}
			catch(NumberFormatException nfe)
			{
				System.out.println("Erro, digite algo valido");
				}
		}loop = false;
		return aux;
	}
	public static Tipo addTipo()
	{
		Tipo aux = null;
		while(!loop)
		{
			try
			{
				System.out.println("Digite numero do tipo: UNO(0), DUSTER(1), CELTA(2), S200(3), SUPERCHARGER(4), BACON3(5)");
				aux = Tipo.values()[Integer.parseInt(scan.nextLine())];
				loop = true;
				}
			catch(InputMismatchException ime)
			{
				System.out.println("Erro, voce digitou algo diferente de um numero");
				}
			catch(ArrayIndexOutOfBoundsException aio)
			{
				System.out.println("Erro, favor digitar um numero válido");
				}
			catch(NumberFormatException nfe)
			{
				System.out.println("Erro, digite algo valido");
				}
		}loop = false;
		return aux;
	}
	public static Motorizacao addMotorizacao()
	{
		Motorizacao aux = null;
		while(!loop)
		{
			try
			{
				System.out.println("Digite numero do motor: M1(0), M2(1), M3(2)");
				aux = Motorizacao.values()[Integer.parseInt(scan.nextLine())];
				loop = true;
				}
			catch(InputMismatchException ime)
			{
				System.out.println("Erro, voce digitou algo diferente de um numero");
				}
			catch(ArrayIndexOutOfBoundsException aio)
			{
				System.out.println("Erro, favor digitar um numero válido");
				}
			catch(NumberFormatException nfe)
			{
				System.out.println("Erro, digite algo valido");
				}
		}loop = false;
		return aux;
	}
	public static float addPreco()
	{
		float aux=0;
		while(!loop)
		{
			try
			{
				System.out.println("Digite o preço do carro");
				aux = scan.nextFloat();
				loop = true;
				}
			catch(InputMismatchException ime)
			{
				System.out.println("Erro, favor digitar um numero válido");
				}
			catch(NumberFormatException nfe)
			{
				System.out.println("Erro, digite algo valido");
				}
		}loop = false;
		return aux;
	}
	public static Cilindrada addCilindrada()
	{
		Cilindrada aux = null;
		while(!loop)
		{
			try
			{
				System.out.println("Cilindrada:C1000(0),C200(1),C300(2)");
				aux = Cilindrada.values()[Integer.parseInt(scan.nextLine())];
				loop = true;
			}
			catch(InputMismatchException ime)
			{
				System.out.println("Erro, voce digitou algo diferente de um número");
				}
			catch(ArrayIndexOutOfBoundsException aio)
			{
				System.out.println("Erro, favor digitar um número válido");
				}
			catch(NumberFormatException nfe)
			{
				System.out.println("Erro, digite algo valido");
				}
		}loop = false;
		return aux;
	}
	public static CapTanque addCaptanque()
	{
		CapTanque aux = null;
		while(!loop)
		{
			try
			{
				System.out.println("Qual é a capacidade do tanque: L10, L20, L30");
				aux = CapTanque.values()[Integer.parseInt(scan.nextLine())];
				loop = true;
			}
			catch(InputMismatchException ime)
			{
				System.out.println("Erro, caractere inválido");
				}
			catch(ArrayIndexOutOfBoundsException aio){
				System.out.println("Erro, digite novamente!");
				}
			catch(NumberFormatException nfe){
				System.out.println("Erro, insira novamente");
				}
		}loop = false;
		return aux;
	}
	public static String addChassi()
	{
		String aux = null;
		System.out.println("Digite o chassi");
		aux = scan.next();
		return aux;
	}
}


