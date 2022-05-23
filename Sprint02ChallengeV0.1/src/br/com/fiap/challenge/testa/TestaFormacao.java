package br.com.fiap.challenge.testa;

import br.com.fiap.challenge.model.Formacao;

public class TestaFormacao {

	public static void main(String[] args) {
		Formacao formacao = new Formacao("FIAP", "Analise e Dev de Sistemas", "Técnico Superior", "02/2022", "cursando");
		
		System.out.println("Curso: "+formacao.getCurso());
		System.out.println("Status: "+formacao.getStatus());
		System.out.println("Status: "+formacao.getInstituicao());
		System.out.println("Status: "+formacao.getInicio());

	}

}
