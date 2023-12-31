package cofre;

public class Dolar extends Moeda{
	
	public Dolar (double valortotal) {
		this.valor = valortotal;
	}

	@Override
	public void informação() {
	//Informação que irá aparecer quando o usuário pedir para listar as moedas//
		System.out.println("O Dolar:"+valor);
	}

	@Override
	public double converter() {
	//Os valores são multiplicados e retornados//
		valor = (valor*5.06);
			return valor;
	}
	
	@Override
	public boolean equals (Object objt) {
	/*Aqui para as moedas funcionarem corretamente na parte de 'remover moedas', 
	 * ele compara o valor inserido e quando o usuário remover uma moeda esta
	 * irá ser removida.
	 */
		Dolar objtDolar = (Dolar) objt;
		
		if (getClass() != objt.getClass()) {
			return false;
		}
		if (valor != objtDolar.valor) {
			return false;
		}
		return true;
	}
}


