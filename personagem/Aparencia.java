package personagem;

import java.util.Map;


public class Aparencia {
	private String diretorioBase;
	private Map<String, ItemAparencia> componentes;
	
	public String getDiretorioBase() {
		return diretorioBase;
	}

	public Map<String, ItemAparencia> getComponentes() {
		return componentes;
	}

	public void setDiretorioBase(String diretorioBase) {
		this.diretorioBase = diretorioBase;
	}
	
	public void setComponentes(Map<String, ItemAparencia> componentes) {
		this.componentes = componentes;
	}
}

