package dominio.npc;

import dominio.NPC;
import dominio.Personagem;

public class Banco extends NPC {
	private Personagem titular;
	private Integer saldo;
	
	public Banco() {
		super(2);
		super.register(this);
	}
	
	public Personagem getTitular() {
		return titular;
	}

	public Integer getSaldo() {
		return saldo;
	}

	public void setTitular(Personagem titular) {
		this.titular = titular;
	}

	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}
	
	public boolean iniciar(Personagem pessoa) {
		//Script do npc "Pessoa"
		return false;
	}
}

