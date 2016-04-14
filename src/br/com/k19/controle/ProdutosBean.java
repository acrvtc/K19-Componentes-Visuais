package br.com.k19.controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;

import br.com.k19.modelo.Produto;

@ManagedBean
@SessionScoped
public class ProdutosBean {

	private List<Produto> produtos = new ArrayList<Produto>();
	private Produto produto = new Produto();
	
	private FacesMessage mensagem = new FacesMessage("Curso adicionado com sucesso!");
	
	public void adicionaProduto (){
		this.produtos.add(this.produto);
		this.produto = new Produto();
		
		System.out.println("Exibir mensagem...");
		FacesContext.getCurrentInstance().addMessage(null, mensagem);
	}


	public List<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
		
	
}
