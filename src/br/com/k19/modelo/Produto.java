package br.com.k19.modelo;

public class Produto {
	
	private String nome;
	private Double preco;
	private boolean exibePreco;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public boolean isExibePreco() {
		return exibePreco;
	}
	public void setExibePreco(boolean exibePreco) {
		this.exibePreco = exibePreco;
	}
	
	
	

}
