package br.com.k19.controle;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.k19.modelo.Curso;


@ManagedBean
@SessionScoped
public class CursosBean {
	
	private FacesMessage mensagem = new FacesMessage("Curso adicionado com sucesso!");
	
	private List<Curso> cursos = new ArrayList<Curso>();
	private Curso curso = new Curso();
	
	public CursosBean() {
		System.out.println("Novo managed bean construido!");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Novo managed bean create!");
	}
	
	public void adicionaCurso(){
		this.cursos.add(this.curso);
		this.curso = new Curso();

		System.out.println("Exibir mensagem...");
		FacesContext.getCurrentInstance().addMessage(null, mensagem);		
	}

	
	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	
	
}
