package br.com.fiap.challenge.model;

public class ContaRecrutador extends Conta {
	private Empresa empresa;
	
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
