package Pessoa;

public class Funcionario extends Pessoa {
	@Override
	public void realizarOperacaoNoBanco( ) {
		System.out.println( "Extrair relatório de cobranças" );
	}
	public void realizarOperacaoNoBanco(float valor) {
		System.out.println( "Gerar cobrança no valor de R$" + valor + " para o cliente" );
	}
	public void realizarOperacaoNoBanco(int valor) {
		System.out.println( "Gerando desconto de " + valor + "% para o cliente" );
	}
}
