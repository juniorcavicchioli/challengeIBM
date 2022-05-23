package br.com.fiap.challenge.model;

public class Empresa extends Dados {
	String cnpj;

	public Empresa(String nome, String telefone, Endereco endereco, String cnpj) {

		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cnpj = cnpj;

	}

	public String getCnpj() {
		return cnpj;
	}

}
