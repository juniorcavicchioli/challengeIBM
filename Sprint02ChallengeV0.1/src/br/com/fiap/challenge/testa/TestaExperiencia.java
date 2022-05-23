package br.com.fiap.challenge.testa;

import br.com.fiap.challenge.model.Experiencia;

public class TestaExperiencia {

	public static void main(String[] args) {
		Experiencia experiencia = new Experiencia("Jornal de Jundiaí", "Colunista", "04/2020");
		experiencia.setTermino("09/2021");
		
		
		System.out.println("Instituição: "+experiencia.getOrganizacao());
		System.out.println("Função: "+experiencia.getFuncao());
		System.out.println("Início: "+experiencia.getInicio()+" e Termino:"+experiencia.getTermino());		

	}

}
