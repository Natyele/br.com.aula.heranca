package br.com.aula.heranca.model;

public class PessoaJuridica extends Pessoa{
	
	private Long cnpj;

	//Construtores
	public PessoaJuridica(String nome) {
		super(nome);
		
	}
	
	public PessoaJuridica(String nome, Long cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}
	
	//Métodos de acesso
	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}
	
	

}
