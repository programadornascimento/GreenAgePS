package personagem.item;

import personagem.Atributos;

public class Equipamento extends Item {
	private TipoEquipamento tipoEquipamento;
	private Atributos modificadorDeAtributos;
	
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