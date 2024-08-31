package pessoa;

public class Gestor extends Pessoa{
	public Gestor( String nome, TipoTrabalho tipoTrabalho ) {
		super( nome, tipoTrabalho );
	}

	@Override
	public void realizarOperacaoNoBanco( ) {
		System.out.println( "Liberar limite de crédito para cliente.." );
	}

	public void realizarOperacaoNoBanco(Pessoa funcionario){
		System.out.println( "O funcionário " + funcionario.getNome( ) + " está no cargo de " + funcionario.getTipoTrabalho( ).toString( ).toLowerCase( ) );
		if(funcionario.isTrabalhando()) {
			System.out.println( "E no momento está trabalhando normalmente." );
		} else {
			System.out.println( "Não está em jornada de trabalho no momento." );
		}
	}

	public void realizarOperacaoNoBanco(float aumento,Pessoa funcionario){
		System.out.println( "Promovendo funcionário " + funcionario.getNome() + " com um aumento de R$" + aumento + " no salário" );
	}
}
