package br.com.voearlines.frontend;

import javax.swing.JOptionPane;

import br.com.voearlines.bo.ClienteBO;
import br.com.voearlines.bo.PilotoBO;


public class Principal {

	public static void main(String[] args) {
		
		ClienteBO cbo = new ClienteBO();
		
		PilotoBO pbo = new PilotoBO();
		
		int idade;
		String leiaIdade;
		
		leiaIdade = JOptionPane.showInputDialog("Entre com a Idade");
		idade = Integer.parseInt(leiaIdade);
		
		JOptionPane.showMessageDialog(null, cbo.validaIdade(idade));
		
		
		int piloto;
		String leiaPiloto = null;
		
		leiaIdade = JOptionPane.showInputDialog("Entre com a idade do piloto");
		piloto = Integer.parseInt(leiaPiloto);
		
		JOptionPane.showMessageDialog(null, pbo.validaPiloto(idade));
		
		/*
		if(idade < 18) {
			JOptionPane.showMessageDialog(null, "Embarque não autorizado!","VoeArlines",JOptionPane.ERROR_MESSAGE);
			
		}else {
			JOptionPane.showMessageDialog(null, "Boa Viagem!!! VoeArlines alcançando Sonhos imcomparáveis");
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Aeronave aeronave1 = new Aeronave("Embraer","Bandeirante", "EMB-100");
		AeronaveDAO aeronaveDAO1 = new AeronaveDAO();
		System.out.println(aeronaveDAO1.cadastrarAeronave(aeronave1)); 
		
		Aeronave aeronave2 = new Aeronave("Embraer","Bandeirante", "EMB-110");
		AeronaveDAO aeronaveDAO2 = new AeronaveDAO();
		System.out.println(aeronaveDAO2.cadastrarAeronave(aeronave2)); 
		
		Aeronave aeronave3 = new Aeronave("Embraer","Bandeirante", "EMB-110A");
		AeronaveDAO aeronaveDAO3 = new AeronaveDAO();
		System.out.println(aeronaveDAO3.cadastrarAeronave(aeronave3)); 
		
		Aeronave aeronave4 = new Aeronave("Embraer","Bandeirante", "EMB-110B");
		AeronaveDAO aeronaveDAO4 = new AeronaveDAO();
		System.out.println(aeronaveDAO4.cadastrarAeronave(aeronave4)); 
		
		Aeronave aeronave5 = new Aeronave("Embraer","Bandeirante", "EMB-110B1");
		AeronaveDAO aeronaveDAO5 = new AeronaveDAO();
		System.out.println(aeronaveDAO5.cadastrarAeronave(aeronave5)); 
		
		Aeronave aeronave6 = new Aeronave("Embraer","Bandeirante", "EMB-110C");
		AeronaveDAO aeronaveDAO6 = new AeronaveDAO();
		System.out.println(aeronaveDAO6.cadastrarAeronave(aeronave6)); 
		
		Aeronave aeronave7 = new Aeronave("Embraer","Bandeirante", "EMB-110C");
		AeronaveDAO aeronaveDAO7 = new AeronaveDAO();
		System.out.println(aeronaveDAO7.cadastrarAeronave(aeronave7)); 
		
		Aeronave aeronave8 = new Aeronave("Embraer","Bandeirante", "EMB-110C (N)");
		AeronaveDAO aeronaveDAO8 = new AeronaveDAO();
		System.out.println(aeronaveDAO8.cadastrarAeronave(aeronave8)); 
		
		Aeronave aeronave9 = new Aeronave("Embraer","Bandeirante", "EMB-110E");
		AeronaveDAO aeronaveDAO9 = new AeronaveDAO();
		System.out.println(aeronaveDAO9.cadastrarAeronave(aeronave9)); 
		
		Aeronave aeronave10 = new Aeronave("Embraer","Bandeirante", "EMB-110E (J)");
		AeronaveDAO aeronaveDAO10 = new AeronaveDAO();
		System.out.println(aeronaveDAO10.cadastrarAeronave(aeronave10)); 
		
		Aeronave aeronave11 = new Aeronave("Embraer","Bandeirante", "EMB-110K1");
		AeronaveDAO aeronaveDAO11 = new AeronaveDAO();
		System.out.println(aeronaveDAO11.cadastrarAeronave(aeronave11)); 
		
		Aeronave aeronave12 = new Aeronave("Embraer","Bandeirante", "EMB-110P");
		AeronaveDAO aeronaveDAO12 = new AeronaveDAO();
		System.out.println(aeronaveDAO12.cadastrarAeronave(aeronave12)); 
		
		Aeronave aeronave13 = new Aeronave("Embraer","Bandeirante", "EMB-110P1");
		AeronaveDAO aeronaveDAO13 = new AeronaveDAO();
		System.out.println(aeronaveDAO13.cadastrarAeronave(aeronave13)); 
		
		Aeronave aeronave14 = new Aeronave("Embraer","Bandeirante", "EMB-110P1 (K)");
		AeronaveDAO aeronaveDAO14 = new AeronaveDAO();
		System.out.println(aeronaveDAO14.cadastrarAeronave(aeronave14)); 
		
		Aeronave aeronave15 = new Aeronave("Embraer","Bandeirante", "EMB-110P1SAR");
		AeronaveDAO aeronaveDAO15 = new AeronaveDAO();
		System.out.println(aeronaveDAO15.cadastrarAeronave(aeronave15)); 
		
		Aeronave aeronave16 = new Aeronave("Embraer","Bandeirante", "EMB-110P1A");
		AeronaveDAO aeronaveDAO16 = new AeronaveDAO();
		System.out.println(aeronaveDAO16.cadastrarAeronave(aeronave16)); 
		
		Aeronave aeronave17 = new Aeronave("Embraer","Bandeirante", "EMB-11OS1");
		AeronaveDAO aeronaveDAO17 = new AeronaveDAO();
		System.out.println(aeronaveDAO17.cadastrarAeronave(aeronave17)); 
		
		Aeronave aeronave18 = new Aeronave("Embraer","Bandeirante", "EMB-11OS1");
		AeronaveDAO aeronaveDAO18 = new AeronaveDAO();
		System.out.println(aeronaveDAO18.cadastrarAeronave(aeronave18)); 
		
		Aeronave aeronave19 = new Aeronave("Embraer","Bandeirante", "EMB-110P1A");
		AeronaveDAO aeronaveDAO19 = new AeronaveDAO();
		System.out.println(aeronaveDAO19.cadastrarAeronave(aeronave19)); 
		
		*/
		
		

	}

}
