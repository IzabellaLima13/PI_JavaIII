package br.com.veiculo;

import java.util.HashMap;

import br.com.auxiliar.Auxiliar;

public class Veiculo 
{
	
	private float preco;
	private String chassi;
	private HashMap<String, Enum> mapa;
	
	public Veiculo()
	{
		 mapa = new HashMap<String,Enum>();
		 
		 mapa.put("TipoVeiculo",Auxiliar.addTipoVeiculo());
		 
		 if(mapa.containsValue(TipodeVeiculo.CARRO))
		 {
			 mapa.put("Cambio", Auxiliar.addCambio());
			 mapa.put("Motorizacao",Auxiliar.addMotorizacao());
		 }
		 else if(mapa.containsValue(TipodeVeiculo.MOTO))
		 {
			 mapa.put("Cilindrada", Auxiliar.addCilindrada());
			 mapa.put("CapTanque",Auxiliar.addCaptanque());
		 }	 
		 mapa.put("Cores",Auxiliar.addCor());
		 mapa.put("Modelo",Auxiliar.addModelo());
		 mapa.put("montadoras",Auxiliar.addMontadora());
		 mapa.put("Tipo",Auxiliar.addTipo());
		 
		 setPreco(Auxiliar.addPreco());
		 setChassi(Auxiliar.addChassi());
	}
	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public HashMap<String, Enum> getMapa() {
		return mapa;
	}

	public void setMapa(String x, Enum y) {
		this.mapa.put(x,y);
	}
	
	
	
}