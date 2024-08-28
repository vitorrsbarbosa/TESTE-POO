import Pessoa.Estagiario;
import Pessoa.Funcionario;
import Pessoa.Gestor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main( String[] args ) {
		Gestor gestor = new Gestor( "Marciano","Gestor",true );
		Funcionario funcionario = new Funcionario( "Kleber","Cadastrador",true );
		Estagiario estagiario = new Estagiario( "Jovem","Leitor de crédito",false ,true);

		gestor.verificaStatusFuncionario( funcionario );
		gestor.verificaStatusFuncionario( estagiario );

		gestor.realizarOperacaoNoBanco();
		funcionario.realizarOperacaoNoBanco();
		estagiario.realizarOperacaoNoBanco();


		System.out.println( gestor.toString() );
		System.out.println( funcionario.toString() );
		System.out.println( estagiario.toString() );
	}
}