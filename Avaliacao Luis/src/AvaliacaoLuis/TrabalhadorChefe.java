package AvaliacaoLuis;

public class TrabalhadorChefe extends Trabalhador implements Ipagamentos {
	private String nome;
	private String sobrenome;
	private double SalarioSemanal;
	private double SalarioMensal;
	
	public  TrabalhadorChefe( String nome, String sobrenome, double SalarioSemanal) {
		setSobrenome(sobrenome);
		setNome(nome);
		setSalarioSemanal(SalarioSemanal);
		
	}
	
	public  TrabalhadorChefe( String nome, String sobrenome) 
	{
		setNome(nome);
		setSobrenome(sobrenome);
	}
	public  TrabalhadorChefe() 
	{
		
	}
	public  TrabalhadorChefe(double SalarioSemanal) 
	{
		setSalarioSemanal(SalarioSemanal);
	}
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalarioSemanal() {
		return SalarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.SalarioSemanal = salarioSemanal;
	}

	public double getSalarioMensal() {
		return this.SalarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.SalarioMensal = salarioMensal;
	}

	public  double Calculo() {
		setSalarioSemanal(1500);
		setSalarioMensal(getSalarioSemanal()* 4);
		return this.SalarioMensal;
	}
	public String tostring() {
	return "Trbalhador Chefe:"+ getNome()+" "+getSobrenome()+"Salário: R$:"+ Calculo();
	}
}
