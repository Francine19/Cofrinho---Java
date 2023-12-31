package cofre;

public class Real extends Moeda {
//Mesma estrutura do dolar e funcionamento//

	public Real (double valortotal) {
		this.valor = valortotal;
	}
	
	@Override
	public void informação() {
		System.out.println("O Real:" +valor);
	}

	@Override
	public double converter() {
		valor = (valor*1);
			return valor;
	}
	
	@Override
	public boolean equals (Object objt) {
		Real objtReal = (Real) objt;
		
		if (getClass() != objt.getClass()) {
			return false;
		}
		if (valor != objtReal.valor) {
			return false;
		}
		return true;
	}
}
