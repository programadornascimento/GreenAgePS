package dominio.npc;

import dominio.Atributos;
import dominio.Inventario;
import dominio.NPC;
import dominio.Personagem;
import dominio.item.Equipamento;
import dominio.item.ItemConsumivel;
import dominio.item.ItemNaoConsumivel;
import dominio.item.TipoEquipamento;

public class Loja extends NPC {
	private Inventario estoque;
	public Loja() {
		super(3);
		this.estoque = new Inventario();
		Equipamento equip1 = new Equipamento("Espada da força", "Espada que causa destruição em massa", 500, TipoEquipamento.Espada, new Atributos(null, null, null, null, null, 10, null, null, null));
		Equipamento equip2 = new Equipamento(null, null, null, null, null);
		Equipamento equip3 = new Equipamento(null, null, null, null, null);
		for(int i = 0; i < 10; i++) {
			this.estoque.addItem(equip1.criar());
		}
		for(int i = 0; i < 8; i++) {
			this.estoque.addItem(equip2.criar());
		}
		for(int i = 0; i < 6; i++) {
			this.estoque.addItem(equip3.criar());
		}
		ItemConsumivel potion1 = new ItemConsumivel(null, null, null, null, null);
		ItemConsumivel potion2 = new ItemConsumivel(null, null, null, null, null);
		ItemConsumivel potion3 = new ItemConsumivel(null, null, null, null, null);
		for(int i = 0; i < 10; i++) {
			this.estoque.addItem(potion1.criar());
		}
		for(int i = 0; i < 8; i++) {
			this.estoque.addItem(potion2.criar());
		}
		for(int i = 0; i < 6; i++) {
			this.estoque.addItem(potion3.criar());
		}
		ItemNaoConsumivel ornament1 = new ItemNaoConsumivel(null, null, null);
		ItemNaoConsumivel ornament2 = new ItemNaoConsumivel(null, null, null);
		ItemNaoConsumivel ornament3 = new ItemNaoConsumivel(null, null, null);
		for(int i = 0; i < 10; i++) {
			this.estoque.addItem(ornament1.criar());
		}
		for(int i = 0; i < 8; i++) {
			this.estoque.addItem(ornament2.criar());
		}
		for(int i = 0; i < 6; i++) {
			this.estoque.addItem(ornament3.criar());
		}
		super.register(this);
	}
	
	public Loja(Integer type) {
		super(type);
	}
	
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

