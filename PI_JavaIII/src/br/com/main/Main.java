package br.com.main;
import java.util.Scanner;

import br.com.loja.Loja;
import br.com.veiculo.Veiculo;


public class Main {

	public static void main(String[] args) {
		
		Loja Bacon = new Loja();
		
		Scanner scan = new Scanner(System.in);
		
	
			System.out.println("Digite a opção desejada");
			System.out.println("[0] - Sair");
			System.out.println("[1] - Inserir Veiculo");
			System.out.println("[2] - Buscar por chassi ");
			System.out.println("[3] - Pesquisar veiculos atraves de parametros");
			System.out.println("[4] - Listar veiculos");
			System.out.println("");
			
			
			 int numeroDigitado = scan.nextInt();
			
			
			switch(numeroDigitado){
			
			case 0:
				System.out.println("Encerrando sistema ");
				break;
			
			case 1:
				Veiculo auto = new Veiculo();
				Bacon.listaDeVeiculos.add(auto);
				break;
				
			case 2:
				Bacon.buscarVeiculo();
			case 3:
				Bacon.pesquisarVeiculo();
			case 4:
				Bacon.listarVeiculos();
				
			}
			
		}
		

	}

