package Hello.Hello;

public class Profissao {
	
	int id;
	String nome;
	String descricao;

	public Profissao(int id, String nome, String descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public String toString() {
		return "Profissao ID: " + this.id + ", NOME: " + this.nome + ", DESCRICAO: " + this.descricao;
	}
}
