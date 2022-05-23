package br.com.fiap.challenge.model;

import java.util.ArrayList;

public class Site {
	 
	private String nome;
	private ArrayList<ContaCandidato> contasD;
	private ArrayList<ContaRecrutador> contasR;
	
	public Site(String nome) {
		this.nome = nome;
	}
	
	
	public ArrayList<ContaCandidato> getContasD() {
		return contasD;
	}
	public void setContasD(ArrayList<ContaCandidato> contasD) {
		this.contasD = contasD;
	}
	public ArrayList<ContaRecrutador> getContasR() {
		return contasR;
	}
	public void setContasR(ArrayList<ContaRecrutador> contasR) {
		this.contasR = contasR;
	}
	
	public String getNome() {
		return nome;
	}
}
