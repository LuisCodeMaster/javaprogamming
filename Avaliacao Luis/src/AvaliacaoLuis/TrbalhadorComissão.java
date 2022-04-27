package AvaliacaoLuis;

public class TrbalhadorComissão extends Trabalhador implements Ipagamentos {
	private String nome;
	private String sobrenome;
	private double Salario;
	private double comissão;
	private double itemvendidos;
	private double Salariof;
	

//public   TrbalhadorComissão( String nome, String sobrenome, double salario, double comissão, double itemvendidos, double saláriof) {	
			
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

public void setComissão(double comissão) {
	this.comissão = comissão;
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



public double getComissão() {
	return comissão;
}

public void setComissão(int comissão) {
	this.comissão = comissão;
}

public double getItemvendidos() {
	return itemvendidos;
}

public void setItemvendidos(int itemvendidos) {
	this.itemvendidos = itemvendidos;
}

	public String tostring() {
		
		return "Trabalhador por Comissão:"+this.nome+" "+this.sobrenome+ "Salário: R$:"+this.Salariof; 
	}

	@Override
	public double Calculo() {
	     setSalario(1200);
	     setComissão(getItemvendidos()*1.5);
		setSalariof(getSalario()+getComissão());
		
		return Salariof;
	}




}
