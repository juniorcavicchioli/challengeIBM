package br.com.fiap.challenge.model;

public class Conta extends Dados{
	protected int id;
	protected String email;
	protected String senha;
	protected Dados dados;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Dados getDados() {
		return dados;
	}

	public void setPessoa(Dados dados) {
		this.dados = dados;
	}

}
