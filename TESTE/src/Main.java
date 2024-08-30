import Pessoa.Estagiario;
import Pessoa.Funcionario;
import Pessoa.Gestor;
import Pessoa.TipoTrabalho;

public class Main {
	public static void main( String[] args ) {
		Gestor gestor = new Gestor( "Giberlto", TipoTrabalho.GESTAO );
		gestor.setTrabalhando( true );

		Funcionario funcionario = new Funcionario( "Fabio", TipoTrabalho.FACILITADOR );
		funcionario.setTrabalhando( false );

		Estagiario estagiario = new Estagiario( "Enrique", TipoTrabalho.ESTAGIO );
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