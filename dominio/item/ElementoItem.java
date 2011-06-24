package dominio.item;

import dominio.Personagem;

public abstract class ElementoItem {
	public abstract Item getItem();
	public abstract void setItem(Item item);
	public abstract boolean usar(Personagem pessoa);
}
