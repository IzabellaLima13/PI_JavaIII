package br.com.loja;

import java.util.ArrayList;
import java.util.List;

import br.com.veiculo.carro.Carro;
import br.com.veiculo.motocicleta.Motocicleta;

public class Loja {
		private String Endere�o;
		private String Nome;
		public List<Carro> listaDeCarros = new ArrayList<Carro>();
		public List<Motocicleta> listaDeMotocicletas = new ArrayList<Motocicleta>();

		
		
		public String getEndere�o() {
			return Endere�o;
		}

		public void setEndere�o(String endere�o) {
			Endere�o = endere�o;
		}

		public String getNome() {
			return Nome;
		}

		public void setNome(String nome) {
			Nome = nome;
		}

		public List<Carro> getListaDeCarros() {
			return listaDeCarros;
		}

		public void setListaDeCarros(List<Carro> listaDeCarros) {
			this.listaDeCarros = listaDeCarros;
		}

		public List<Motocicleta> getListaDeMotocicletas() {
			return listaDeMotocicletas;
		}

		public void setListaDeMotocicletas(List<Motocicleta> listaDeMotocicletas) {
			this.listaDeMotocicletas = listaDeMotocicletas;
		}
		
		
		

}
