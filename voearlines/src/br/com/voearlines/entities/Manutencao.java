package br.com.voearlines.entities;

//Classes POJO
public class Manutencao {
	
	private int id;
	private String observacao;
	private String descricaoServico;
	
	
	public Manutencao(String observacao, String descricaoServico) {
		super();
		this.observacao = observacao;
		this.descricaoServico = descricaoServico;
	}


	public int getId() {
		return id;
	}


	public String getObservacao() {
		return observacao;
	}


	public String getDescricaoServico() {
		return descricaoServico;
	}
	

}
