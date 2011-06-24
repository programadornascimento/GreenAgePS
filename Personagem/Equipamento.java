package Personagem;

public class Equipamento extends Item {
	private TipoEquipamento tipoEquipamento;
	private Atributos modificadorDeAtributos;
	
	public Integer getTipoEquipamento() {
		return tipoEquipamento;
	}

	public Atributos getModificadorDeAtributos() {
		return modificadorDeAtributos;
	}

	public void setTipoEquipamento(Integer tipoEquipamento) {
		this.tipoEquipamento = tipoEquipamento;
	}

	public void setModificadorDeAtributos(Atributos modificadorDeAtributos) {
		this.modificadorDeAtributos = modificadorDeAtributos;
	}
	
	public boolean usar(Personagem pessoa) {
		//Script para usar equipamento
		return false;
	}
}
