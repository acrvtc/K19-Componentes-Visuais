package br.com.k19.controle;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class SolicitacaoDeAtendimento {
	
	private String nome;
	private String email;
	private long telefone;
	private int genero;
	
	
	private Map<String, Integer> sexos = new LinkedHashMap<String, Integer>();
	
	private void inicializaComboGenero() {
		this.sexos.put("Masculino", 1);
		this.sexos.put("Feminino", 2);
	}	
	
	private long pedido;
	
	private int assunto;
	private String comentario;
	
	private Map<String, Integer> assuntos = new LinkedHashMap<String, Integer>();
	
	private void inicializaComboTipoAssunto() {
		this.assuntos.put("Reclamação", 1);
		this.assuntos.put("Dúvida", 2);
		this.assuntos.put("Elogio", 3);
	}
	
	
	public String enviar(){
		return null;
	}
	
	//Método construtor
	public SolicitacaoDeAtendimento(){

		inicializaComboGenero();
		
		inicializaComboTipoAssunto();
	}

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(String chave) {
		Integer genero = sexos.get(chave);
		
		this.genero = genero;
	}

	public Map<String, Integer> getSexos() {
		return sexos;
	}

	public void setSexos(Map<String, Integer> sexos) {
		this.sexos = sexos;
	}

	public long getPedido() {
		return pedido;
	}

	public void setPedido(long pedido) {
		this.pedido = pedido;
	}

	public int getAssunto() {
		return assunto;
	}

	public void setAssunto(int assunto) {
		this.assunto = assunto;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Map<String, Integer> getAssuntos() {
		return assuntos;
	}

	public void setAssuntos(Map<String, Integer> assuntos) {
		this.assuntos = assuntos;
	}	
	

	
}
