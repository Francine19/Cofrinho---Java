package cofre;

public class Euro extends Moeda {
//Mesma estrutura do dolar e funcionamento//
	public Euro (double valortotal) {
		this.valor = valortotal;
	}
	
	@Override
	public void informação() {
		System.out.println("O Euro:" +valor);
	}
	
	@Override
	public double converter() {
		valor = (valor*5.56);
			return valor;
	}

	@Override
	public boolean equals (Object objt) {
		Euro objtEuro = (Euro) objt;
		
		if (getClass() != objt.getClass()) {
			return false;
		}
		if (valor != objtEuro.valor) {
			return false;
		}
		return true;
	}
}
