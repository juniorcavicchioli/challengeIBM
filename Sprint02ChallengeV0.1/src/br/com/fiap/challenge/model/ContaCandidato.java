package br.com.fiap.challenge.model;

public class ContaCandidato extends Conta {
	private String descricao;
	private Curriculo curriculo;
	
	public ContaCandidato(String email, String senha) {
		this.setId(Integer.parseInt("1"+Integer.toString(getNextId())));
		this.email = email;
		this.senha = senha;
	}
	
	private static int nextId = 1; // atributo estatico para gerar o id
	private static int getNextId() {
	    return nextId++;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Curriculo getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(Curriculo curriculo) {
		this.curriculo = curriculo;
	}
	
}
