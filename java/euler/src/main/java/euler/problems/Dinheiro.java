package euler.problems;

public enum Dinheiro {

	CEM_REAIS(100.00), /**/
	CINQUENTA_REAIS(50.00), /**/
	VINTE_REAIS(20.00), /**/
	DEZ_REAIS(10.00), /**/
	CINCO_REAIS(5.00), /**/
	DOIS_REAIS(2.00), /**/
	UM_REAL(1.00), /**/
	CINQUENTA_CENTAVOS(0.50), /**/
	VINTE_E_CINCO_CENTAVOS(0.25), /**/
	DEZ_CENTAVOS(0.10), /**/
	CINCO_CENTAVOS(0.05), /**/
	UM_CENTAVO(0.01);

	private double valor;

	Dinheiro(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}
}
