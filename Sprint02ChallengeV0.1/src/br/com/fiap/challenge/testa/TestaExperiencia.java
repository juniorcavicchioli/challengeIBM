package br.com.fiap.challenge.testa;

import br.com.fiap.challenge.model.Experiencia;

public class TestaExperiencia {

	public static void main(String[] args) {
		Experiencia experiencia = new Experiencia("Jornal de Jundia�", "Colunista", "04/2020");
		experiencia.setTermino("09/2021");
		
		
		System.out.println("Institui��o: "+experiencia.getOrganizacao());
		System.out.println("Fun��o: "+experiencia.getFuncao());
		System.out.println("In�cio: "+experiencia.getInicio()+" e Termino:"+experiencia.getTermino());		

	}

}
