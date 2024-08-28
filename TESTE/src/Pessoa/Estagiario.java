package Pessoa;

public class Estagiario extends Pessoa {
	private boolean jornadaReduzida;

	public boolean isJornadaReduzida( ) {
		return jornadaReduzida;
	}

	public void setJornadaReduzida( boolean jornadaReduzida ) {
		this.jornadaReduzida = jornadaReduzida;
	}

	public Estagiario( String nome, String funcao, boolean trabalhando, boolean jornadaReduzida ) {
		super( nome, funcao, trabalhando );
		this.jornadaReduzida = jornadaReduzida;
	}
}
