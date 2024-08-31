package pessoa;

public enum TipoTrabalho {
	GESTAO( "Admin", "Gestão", 17_500.00f ),
	FACILITADOR( "Usuario_CRUD", "Atendente", 3_500.00f ),
	ESTAGIO( "Usuario_Leitura", "Leitor de relatórios", 1_200.00f );

	final String nivelDeAcesso;
	final String cargo;
	final float salario;

	TipoTrabalho( String nivelDeAcesso, String cargo, float salario ) {
		this.nivelDeAcesso = nivelDeAcesso;
		this.cargo = cargo;
		this.salario = salario;
	}
}
