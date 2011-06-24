package Personagem;

public class Armazem extends NPC {
	private Personagem titular;
	private Inventario estoque;

	public Personagem getTitular() {
		return titular;
	}

	public Inventario getEstoque() {
		return estoque;
	}

	public void setTitular(Personagem titular) {
		this.titular = titular;
	}

	public void setEstoque(Inventario estoque) {
		this.estoque = estoque;
	}
	
	public boolean iniciar(Personagem pessoa) {
		//Script do npc "Armazém"
		return false;
	}
}