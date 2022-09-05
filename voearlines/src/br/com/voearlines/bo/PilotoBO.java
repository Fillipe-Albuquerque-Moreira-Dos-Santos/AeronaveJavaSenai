package br.com.voearlines.bo;

public class PilotoBO implements IValidacaoDecolar {
	
	public String validaPiloto(int piloto){
		String r;
		if (piloto <= IValidacaoDecolar.IDADEMIN) {
			r = "Você não tem idade pra ser piloto";
		}else {
			r = "Ok. Você tem idade pra pilotar! VoeArlines alcançando novos voos com você!";
		}
		return r;	
		
	}

	@Override
	public void validaPiloto() {
		// TODO Auto-generated method stub
		
	}


}
