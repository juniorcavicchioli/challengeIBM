package br.com.fiap.challenge.model;

public class Vaga {
	private String titulo;
	private String tipo;
	private String descricao;
	private double salario;
	private String beneficios;
	private int quantidade;
	private Requisitos requisitos;
	private int id = Integer.parseInt("3" + Integer.toString(getNextId()));
	
	private static int nextId = 1; // atributo estatico para gerar o id
	
	private static int getNextId() {
		return nextId++;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Requisitos getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(Requisitos requisitos) {
		this.requisitos = requisitos;
	}
	public int getId() {
		return id;
	}

}
