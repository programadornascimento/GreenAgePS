package personagem.npc;

import personagem.NPC;
import personagem.Personagem;

public class Banco extends NPC {
	private Personagem titular;
	private Integer saldo;
	
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

