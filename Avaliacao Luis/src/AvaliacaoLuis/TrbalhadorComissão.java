package AvaliacaoLuis;

public class TrbalhadorComiss�o extends Trabalhador implements Ipagamentos {
	private String nome;
	private String sobrenome;
	private double Salario;
	private double comiss�o;
	private double itemvendidos;
	private double Salariof;
	

//public   TrbalhadorComiss�o( String nome, String sobrenome, double salario, double comiss�o, double itemvendidos, double sal�riof) {	
			
//	}


public double getSalariof() {
	return Salariof;
}

public double getSalario() {
	return Salario;
}

public void setSalario(double salario) {
	Salario = salario;
}

public void setSalariof(double salariof) {
	Salariof = salariof;
}

public void setComiss�o(double comiss�o) {
	this.comiss�o = comiss�o;
}

public void setItemvendidos(double itemvendidos) {
	this.itemvendidos = itemvendidos;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getSobrenome() {
	return sobrenome;
}

public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}



public double getComiss�o() {
	return comiss�o;
}

public void setComiss�o(int comiss�o) {
	this.comiss�o = comiss�o;
}

public double getItemvendidos() {
	return itemvendidos;
}

public void setItemvendidos(int itemvendidos) {
	this.itemvendidos = itemvendidos;
}

	public String tostring() {
		
		return "Trabalhador por Comiss�o:"+this.nome+" "+this.sobrenome+ "Sal�rio: R$:"+this.Salariof; 
	}

	@Override
	public double Calculo() {
	     setSalario(1200);
	     setComiss�o(getItemvendidos()*1.5);
		setSalariof(getSalario()+getComiss�o());
		
		return Salariof;
	}




}
