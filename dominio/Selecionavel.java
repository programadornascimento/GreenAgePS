package dominio;

/*
 * Classe requisito para coleções estáticas de objetos.
 * Justificativa: Cache dos objetos que podem ser gerados por repetidas consultas ao banco.
 * No nosso caso, como não há banco, os objetos são mantidos somente neste cache.
 * Os objetos das classes que implementam essa caracteristica não são tão mutáveis em sua origem,
 * além de serem de necessidade geral para todo o sistema.
 * Assim, se você cadastrou uma classe, então ela fica em Classe.all, e pode ser usada na criação
 * de itens, por exemplo, sem uma consulta ao banco de dados, que não existe.
 */

public abstract class Selecionavel {
	private static int uid = 0;
	protected Integer id;
	protected Integer type;
	
	protected Selecionavel() {
		this.id = genUid();
	}
	
	protected Selecionavel(Integer type) {
		this();
		this.type = type;
	}
	
	public static int genUid() {
		return ++uid;
	}
	
	public Integer getId() {
		return id;
	}
	
	public Integer getType() {
		return type;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setType(Integer type) {
		this.type = type;
	}
}
