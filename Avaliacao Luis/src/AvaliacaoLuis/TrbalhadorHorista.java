package AvaliacaoLuis;

public class TrbalhadorHorista extends Trabalhador implements Ipagamentos {
private String nome;
private String sobrenome;
private double valorporhora;
private double qtdhourw;
private double Salário;
public   TrbalhadorHorista( ) {
	
	
	
		
		
	}
@Override
public double Calculo() {
	valorporhora = 30;
	Salário = valorporhora*qtdhourw;
	return Salário  ;
}

public String tostring() {
	return "Trabalhador Horista:"+this.nome+" "+this.sobrenome+"Salário: R$:"+this.Salário;
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
public double getValorporhora() {
	return valorporhora;
}
public void setValorporhora(int valorporhora) {
	this.valorporhora = valorporhora;
}
public double getQtdhourw() {
	return qtdhourw;
}
public void setQtdhourw(int qtdhourw) {
	this.qtdhourw = qtdhourw;
}

}
