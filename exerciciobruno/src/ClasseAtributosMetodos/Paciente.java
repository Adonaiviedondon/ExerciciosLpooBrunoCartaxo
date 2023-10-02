package ClasseAtributosMetodos;

public class Paciente {
    private int codigo;
    private String nome;
    private String DataNascimento;
    private char Sexo;
    private String PlanoSaude;
    private String Alergia;
    private String TipoSanguineo;
private Paciente(int codigo, String nome, String dataNascimento, char sexo, String planoSaude, String alergia,
			String tipoSanguineo) {
		this.codigo = codigo;
		this.nome = nome;
		this.DataNascimento = dataNascimento;
		this.Sexo = sexo;
		this.PlanoSaude = planoSaude;
		this.Alergia = alergia;
		this.TipoSanguineo = tipoSanguineo;
	}
public void ImprimirDados() {
    	System.out.println("dados do paciente:");
    	System.out.println("codigo:"+ codigo);
    	System.out.println("nome:"+ nome);
    	System.out.println("Data de Nascimento:"+ DataNascimento);
    	System.out.println("Sexo:"+ Sexo);
    	System.out.println("Plano de Saude"+ PlanoSaude);
    	System.out.println("Alergia:"+ Alergia);
    	System.out.println("Tipo de Sangue"+ TipoSanguineo);
    }
    public void modificarDados( String nomeatual, String dataNascimentoatual, char sexoatual, String planoSaudeatual, String alergiaatual,
			String tipoSanguineoatual) {
    	
		nome = nomeatual;
		DataNascimento = dataNascimentoatual;
		Sexo = sexoatual;
		PlanoSaude = planoSaudeatual;
		Alergia = alergiaatual;
		TipoSanguineo = tipoSanguineoatual;
    }
    
    public static void main(String[] args) {
		Paciente paciente = new Paciente(1,"adonai","24/05/1993",'M',"Sus","nenhum","A");
		
		paciente.ImprimirDados();
		 
		paciente.modificarDados("Benta","12/06/1969",'F',"Sus","nenhuma","A-");
		
		paciente.ImprimirDados();
	}
    
    
    
}
