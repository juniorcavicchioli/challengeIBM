package br.com.fiap.challenge.model;

import java.util.ArrayList;

public class Empresa extends Dados {
	private int id = Integer.parseInt("5" + Integer.toString(getNextId()));
	private String cnpj;
	private ArrayList<Vaga> vagas;
	
	private static int nextId = 1; // atributo estatico para gerar o id
	private static int getNextId() {
		return nextId++;
	}
	public int getId() {
		return id;
	}
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
