package Pessoa;

public class Gestor extends Pessoa{
	public Gestor( String nome, String funcao, boolean trabalhando ) {
		super( nome, funcao, trabalhando );
	}

	@Override
	public void realizarOperacaoNoBanco( ) {
		System.out.println( "Liberar limite de crédito para cliente.." );
	}
	public void verificaStatusFuncionario(Pessoa funcionario){
		System.out.println( "O funcionário " + funcionario.getNome() + " está no cargo " + funcionario.getFuncao() );
		if(funcionario.isTrabalhando()) {
			System.out.println( "E no momento está trabalhando normalmente." );
		} else {
			System.out.println( "Não está em jornada de trabalho no momento." );
		}
	}
}
