package br.com.fiap.challenge.model;


public class Formacao {
	private String instituicao;
	private String curso;
	private String grau;
	private String inicio;
	private String termino;
	private String descricao;
	private String status;

	public Formacao(String instituicao, String curso, String grau, String inicio, String status) {
		this.instituicao = instituicao;
		this.curso = curso;
		this.grau = grau;
		this.inicio = inicio;
		this.status = status;
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

	public String getInstituicao() {
		return instituicao;
	}

	public String getCurso() {
		return curso;
	}

	public String getGrau() {
		return grau;
	}

	public String getInicio() {
		return inicio;
	}

	public String getStatus() {
		return status;
	}

}
