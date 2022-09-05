package br.com.voearlines.bo;

public class ClienteBO implements IValidacaoEmbarque {
// Sobrepor - Polimorfismo. 
	
	public String validaIdade(int idade){
		String r;
		if (idade <= IValidacaoEmbarque.IDADEMIN) {
			r = "Embarque Não autorizado";
		}else {
			r = "Boa Viagem! VoeArlines alcançando novos voos com você!";
		}
		return r;	
		
	}

	@Override
	public void validaIdade() {
		// TODO Auto-generated method stub
		
	}
	
}
