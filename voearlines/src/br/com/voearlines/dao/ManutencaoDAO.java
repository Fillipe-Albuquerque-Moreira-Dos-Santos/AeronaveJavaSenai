package br.com.voearlines.dao;
import br.com.voearlines.entities.Manutencao;

public class ManutencaoDAO {
	
	public String cadastrarManutencao(Manutencao manutencao) {

		return manutencao.getDescricaoServico();
	}

}


