package dominio.item;

import dominio.Atributos;
import dominio.Item;

public class Equipamento extends Item {
	private TipoEquipamento tipoEquipamento;
	private Atributos modificadorDeAtributos;
	public Equipamento(String nome, String descricao, Integer valor, TipoEquipamento tipoEquipamento, Atributos modificadorDeAtributos) {
		super(nome, descricao, valor, 1);
		this.tipoEquipamento = tipoEquipamento;
		this.modificadorDeAtributos = modificadorDeAtributos;
		super.register(this);
	}
	
	public TipoEquipamento getTipoEquipamento() {
		return tipoEquipamento;
	}

	public Atributos getModificadorDeAtributos() {
		return modificadorDeAtributos;
	}

	public void setTipoEquipamento(TipoEquipamento tipoEquipamento) {
		this.tipoEquipamento = tipoEquipamento;
	}

	public void setModificadorDeAtributos(Atributos modificadorDeAtributos) {
		this.modificadorDeAtributos = modificadorDeAtributos;
	}
	
	public ElementoItem criar() {
		//Script para criar elemento de equipamento
		return null;
	}
}