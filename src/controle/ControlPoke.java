package controle;

import java.util.ArrayList;

import modelo.Pokemon;

public class ControlPoke {
private static ArrayList<Pokemon> tabelaConta;
	
	private static ControlPoke instancias;

	public static ControlPoke getInstancias() {
		
		if (instancias == null) {
			instancias= new ControlPoke();
			tabelaConta= new ArrayList<>();
			
		}
		return instancias;
	}
	
	
	// Insert
	public boolean insert(Pokemon p) {

		if (p != null) {
			this.tabelaConta.add(p);
			return true;
		}

		return false;
	}

	// Update
	public boolean update(Pokemon p) {

		return false;
	}

	// Delete
	public boolean delete(Pokemon p, int idPokemon) {

		return false;
	}

	// Select
	public ArrayList<Pokemon> listaPokes() {

		return null;
	}
	
	
}
