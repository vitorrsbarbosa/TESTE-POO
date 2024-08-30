package Pessoa;

public class Estagiario extends Pessoa {
	public Estagiario( String nome, TipoTrabalho tipoTrabalho ) {
		super( nome, tipoTrabalho );
	}

	public void realizarOperacaoNoBanco( float valor) {
		System.out.println( "Depositar R$" + valor + " na conta" );
	}

	public void realizarOperacaoBanco( boolean trabalhando) {
		if( ! trabalhando && ! this.isTrabalhando( ) ) {
			return;
		} else if( trabalhando && this.isTrabalhando( ) ) {
			return;
		} else if( ! trabalhando && this.isTrabalhando( ) ) {
			System.out.println( "Finalizando expediente" );
		} else {
			System.out.println( "Iniciando jornada de trabalho" );
		}
	}
}
