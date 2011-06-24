package personagem.item;

import personagem.Personagem;

public class ElementoItemNaoConsumivel extends ElementoItem {
	private ItemNaoConsumivel categoria;
	
	public Item getItem() {
		return this.categoria;
	}
	
	public void setItem(Item item) {
		categoria = (ItemNaoConsumivel) item;
	}
	
	public boolean usar(Personagem pessoa) {
		//Script para usar item não-consumível
		return false;
	}
}
