package AvaliacaoLuis;

public abstract class Trabalhador {
	
	  private String nome;
	  private String sobrenome;
	  private int sal�riobys;
	  
	  
	  
	public int getSal�riobys() {
		return sal�riobys;
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






	public Trabalhador() { 
		
			
	}
	
   public String tostring() {
	return  this.nome+" "+this.sobrenome;
	   
   }
   
   

}
