package arvore;

public class Read extends Astnode{
	private Id id;

	public Read(){
		this.id = null;
		this.nome = "Read";
	}

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public String geraArvore(int nivel){
		String arvore = "";
		for(int i = 0; i < nivel*4; i++) arvore+= " ";
		arvore += "<Read>\n";
		arvore += id.geraArvore(nivel + 1);
		for(int i = 0; i < nivel*4; i++) arvore+= " ";
		arvore += "</Read>\n";
		
		return arvore;
	}
}
