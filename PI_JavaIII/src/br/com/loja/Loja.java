package br.com.loja;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.auxiliar.Auxiliar;
import br.com.veiculo.Veiculo;

public class Loja {
		private String Endere�o = "Rua Bacon n30";
		private String Nome = "Bacon Motors";
		public static ArrayList<Veiculo> listaDeVeiculos = new ArrayList<Veiculo>();
		
		public Loja()
		{
			ArrayList<Veiculo> listaDeVeiculos = new ArrayList<>();
		}
<<<<<<< HEAD
		
		
		public void localizarVeiculo()
=======
		public void buscarVeiculo()
>>>>>>> origin/master
		{
			String aux = Auxiliar.addChassi();
			
			for(Veiculo x: listaDeVeiculos)
			{
				if(x.getChassi().equals(aux))
				{
					Auxiliar.printVeiculo(x);
				}
			}
		}
<<<<<<< HEAD
		public void imprimirVeiculos()
=======
		public void listarVeiculos()
>>>>>>> origin/master
		{
			for(Veiculo x : listaDeVeiculos)
			{
				Auxiliar.printVeiculo(x);
			}
		}
		public void pesquisarVeiculo()
		{
			Veiculo abc = new Veiculo();
			int aux;
			int opcao;
			Scanner scan = new Scanner(System.in);
			
			do
			{
				System.out.println("Digite o numero correspondente ao parametro que deseja procurar. ");
				System.out.println("1 = Tipo de Veiculo");
				System.out.println("2 = CapTanque (somente Motos)");
				System.out.println("3 = Cilindrada (somente Motos)");
				System.out.println("4 = Cambio (somente carros)");
				System.out.println("5 = Motorizacao (somente carros)");
				System.out.println("6 = Cor");
				System.out.println("7 = Modelo");
				System.out.println("8 = Montadora");
				System.out.println("9 = Tipo");
				System.out.println("10 = Modelo");
				System.out.println("0 = Para pesquisar com os parametros escolhidos");
				
				opcao = scan.nextInt();
				
			switch(opcao)
			{
			case 1:
<<<<<<< HEAD
				abc.setMapa("Tipo  de Veiculo", Auxiliar.addTipoVeiculo());break;
			case 2:
				abc.setMapa("Capacidade de Tanque", Auxiliar.addCaptanque());break;
=======
				abc.setMapa("TipoVeiculo", Auxiliar.addTipoVeiculo());break;
			case 2:
				abc.setMapa("CapTanque", Auxiliar.addCaptanque());break;
>>>>>>> origin/master
			case 3:
				abc.setMapa("Cilindrada", Auxiliar.addCilindrada());break;
			case 4:
				abc.setMapa("Cambio", Auxiliar.addCambio());break;
			case 5:
<<<<<<< HEAD
				abc.setMapa("Motoriza��o", Auxiliar.addMotorizacao());break;
=======
				abc.setMapa("Motorizacao", Auxiliar.addMotorizacao());break;
>>>>>>> origin/master
			case 6:
				abc.setMapa("Cor", Auxiliar.addCor());break;
			case 7:
				abc.setMapa("Modelo", Auxiliar.addModelo());break;
			case 8:
				abc.setMapa("Montadora", Auxiliar.addMontadora());break;
			case 9:
<<<<<<< HEAD
				abc.setMapa("Tipo de veiculo", Auxiliar.addTipo());break;
			case 10:
				abc.setMapa("Modelo de veiculo", Auxiliar.addModelo());break;
			case 0:
				System.out.println("Fim!");break;
=======
				abc.setMapa("Tipo", Auxiliar.addTipo());break;
			case 10:
				abc.setMapa("Modelo", Auxiliar.addModelo());break;
			case 0:
				System.out.println("Yippee ki-yay, motherfucker!");break;
>>>>>>> origin/master
			default:
				System.out.println("Op��o inv�lida. Escolha uma das op��es listadas.");
				break;
			}
				
			} while (!(opcao ==0));
			
			for(Veiculo x : listaDeVeiculos)
			{
				x.getMapa().equals(abc.getMapa());
			}
		}
}