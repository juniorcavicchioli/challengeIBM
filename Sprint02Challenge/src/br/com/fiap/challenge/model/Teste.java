package br.com.fiap.challenge.model;

public class Teste {
	private static int nextId = 0001;
	
	private static int getNextId() {
	    return nextId++;
	}
	private int id = Integer.parseInt("1"+Integer.toString(getNextId()));
	public int getId() { 
		return id; 
	}
}
