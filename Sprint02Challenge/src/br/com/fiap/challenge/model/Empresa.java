package br.com.fiap.challenge.model;

import java.util.ArrayList;

public class Empresa extends Dados {

	private String cnpj;
	private ArrayList<Vaga> vagas;

	public ArrayList<Vaga> getVagas() {
		return vagas;
	}

	public void setVagas(ArrayList<Vaga> vagas) {
		this.vagas = vagas;
	}

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
