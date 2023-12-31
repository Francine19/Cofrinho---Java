package cofre;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
	List <Moeda> listMoeda = new ArrayList <> ();
	
	public void adicionar (Moeda M){
		listMoeda.add (M);
	}
	
	public double totalConvert () {
	//Aqui 'converter' é trazido e soma a lista de moedas para real//
		if (this.listMoeda.isEmpty()) {
			return 0;
		}
		double inicioValor = 0;
		for (Moeda M : listMoeda) {
			inicioValor = inicioValor + M.converter();
		}
		return inicioValor;
	}
	
	public void remover (Moeda M) {
		listMoeda.remove(M);
	}
	
	public void listar () {
	/*Caso a lista de moedas esteja vazia uma mensagem irá aparecer, 
		se não o programa irá mostrar as moedas presentes normalmente*/
		if (this.listMoeda.isEmpty()) {
			System.out.println("O cofrinho se encontra vazio...");
		}
		for(Moeda M: listMoeda) {
			M.informação ();
			
		}
	}
}	
