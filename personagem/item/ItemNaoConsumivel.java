package personagem.item;

import personagem.Personagem;

public class ItemNaoConsumivel extends Item {
	
	public boolean usar(Personagem pessoa) {
		//Script para usar item não-consumível
		return false;
	}
}

