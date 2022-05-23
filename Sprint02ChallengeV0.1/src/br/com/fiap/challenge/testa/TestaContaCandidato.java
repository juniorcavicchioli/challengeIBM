package br.com.fiap.challenge.testa;

import br.com.fiap.challenge.model.ContaCandidato;

public class TestaContaCandidato {

	public static void main(String[] args) {
		ContaCandidato contaC = new ContaCandidato("email@fiap.com.br", "123456789fiap");
		
		System.out.println("E-mail: "+contaC.getEmail());
		System.out.println("Senha: "+contaC.getSenha());
		System.out.println("Id: "+contaC.getId());
		
		contaC.setDescricao("Sou Fulano e sei fazer purê de batata. Autonomo plantando batatas querendo um emprego para fritá-las");
		System.out.println("Apresentação: "+contaC.getDescricao());
		
		contaC.setNome("Fulano");
		contaC.setTelefone("(11) 23333-4444");
		System.out.println("Nome: "+contaC.getNome());
		System.out.println("Telefone: "+contaC.getTelefone());
		
		//currículo TestaCurriculo
	}

}
