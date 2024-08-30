import Pessoa.Estagiario;
import Pessoa.Funcionario;
import Pessoa.Gestor;

public class Main {
	public static void main( String[] args ) {
		Gestor gestor = new Gestor( );
		gestor.setNome( "Gilberto" );
		gestor.setFuncao( "Gerente" );
		gestor.setTrabalhando( true );

		Funcionario funcionario = new Funcionario( );
		funcionario.setNome( "Fabio" );
		funcionario.setFuncao( "Facilitador" );
		funcionario.setTrabalhando( false );

		Estagiario estagiario = new Estagiario( );
		estagiario.setNome( "Enrique" );
		estagiario.setFuncao( "Entregador" );
		estagiario.setTrabalhando( true );

		gestor.realizarOperacaoNoBanco( );
		gestor.realizarOperacaoNoBanco( funcionario );
		gestor.realizarOperacaoNoBanco( estagiario );
		gestor.realizarOperacaoNoBanco( 240f, funcionario );
		System.out.println( "-------------------" );
		funcionario.realizarOperacaoNoBanco();
		funcionario.realizarOperacaoNoBanco( 25 );
		funcionario.realizarOperacaoNoBanco( 53.5f );
		System.out.println( "-------------------" );
		estagiario.realizarOperacaoNoBanco();
		estagiario.realizarOperacaoNoBanco( 33.3f );
		estagiario.realizarOperacaoBanco( false );

		System.out.println( gestor.toString() );
		System.out.println( funcionario.toString() );
		System.out.println( estagiario.toString() );
	}
}