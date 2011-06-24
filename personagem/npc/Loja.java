package personagem.npc;

import personagem.Inventario;
import personagem.NPC;
import personagem.Personagem;

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

