package br.com.aula.heranca.model;

public class PessoaFisica extends Pessoa {

	private String cpf;

	//Construtor
	public PessoaFisica(String nome) {
		super(nome);
	}
	
	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}

	//Métodos de acesso
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
