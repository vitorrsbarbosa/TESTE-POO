package Pessoa;

public class Funcionario extends Pessoa {


	public Funcionario( String nome, String funcao, boolean trabalhando ) {
		super( nome, funcao, trabalhando );
	}


	@Override
	public void realizarOperacaoNoBanco( ) {
		System.out.println( "Cadastrar funcionario" );
	}
}
