package dominio.npc;

import dominio.Inventario;
import dominio.NPC;
import dominio.Personagem;

public class Loja extends NPC {
	private Inventario estoque;
	
	public boolean iniciar(Personagem pessoa) {
		//Script do npc "Monstro"
		return false;
	}
	
	public Inventario getEstoque() {
		return estoque;
	}
	
	public void setEstoque(Inventario estoque) {
		this.estoque = estoque;
	}
}

