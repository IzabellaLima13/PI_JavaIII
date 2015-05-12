package br.com.veiculo;

public class Veiculo {
	
	private String chassi;
	private String montadora;
	private String modelo;
	private float motorizacao;
	private float preco;
	
	public Veiculo(String chassi, String montadora, String modelo, float motorizacao, float preco) {
		this.chassi = chassi;
		this.montadora = montadora;
		this.modelo = modelo;
		this.motorizacao = motorizacao;
		this.preco = preco;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getMotorizacao() {
		return motorizacao;
	}

	public void setMotorizacao(float motorizacao) {
		this.motorizacao = motorizacao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	

}
