package br.com.fiap.challenge.model;

public class Experiencia {
	private String organizacao;
	private String funcao;
	private String inicio;
	private String termino;
	private String descricao;

	public Experiencia(String organizacao, String funcao, String inicio) {
		this.organizacao = organizacao;
		this.funcao = funcao;
		this.inicio = inicio;
	}

	public String getTermino() {
		return termino;
	}

	public void setTermino(String termino) {
		this.termino = termino;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getOrganizacao() {
		return organizacao;
	}

	public String getFuncao() {
		return funcao;
	}

	public String getInicio() {
		return inicio;
	}

}
