package br.com.fiap.challenge.model;

import java.util.ArrayList;

public class ContaRecrutador extends Conta {
	private Empresa empresa;
	private ArrayList<Vaga> vagas;
	
	public ArrayList<Vaga> getVagas() {
		return vagas;
	}
	public void setVagas(ArrayList<Vaga> vagas) {
		this.vagas = vagas;
	}
	public ContaRecrutador(String email, String senha) {
		this.setId(Integer.parseInt("2"+Integer.toString(getNextId())));
		this.setEmail(email);
		this.setSenha(senha);
	}
	
	private static int nextId = 1; // atributo estatico para gerar o id
	private static int getNextId() {
	    return nextId++;
	}
	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
}
