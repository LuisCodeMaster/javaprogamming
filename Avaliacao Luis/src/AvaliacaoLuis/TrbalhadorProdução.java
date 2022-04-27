package AvaliacaoLuis;

public class TrbalhadorProdução extends Trabalhador implements Ipagamentos {
	private String nome;
	private String sobrenome;
	private double Valorbyitem;
	private double Qtditems;
	private double Salario;
	
	
	public  TrbalhadorProdução() {
		
	}
	


public   TrbalhadorProdução( String nome, String sobrenome, double valorbyintem, double qtditems) {
	
}
public   TrbalhadorProdução(double valorbyitem ) 
{
	
}



public double getSalario() {
	return Salario;
}
public void setSalario(double salario) {
	Salario = salario;
}

public double getQtditems() {
	return Qtditems;
}



public void setQtditems(double qtditems) {
	Qtditems = qtditems;
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




public double getValorbyitem() {
	return Valorbyitem;
}



public void setValorbyitem(double valorbyitem) {
	Valorbyitem = valorbyitem;
}



@Override
public double Calculo() {
	setValorbyitem(30);
	setSalario(getValorbyitem()* getQtditems());
	
	return Salario ;
	
}
public String toString() {
return "Trabalhador Produção:"+this.nome+" "+this.sobrenome+"Salário: "+this.Salario;	
	
}
}
