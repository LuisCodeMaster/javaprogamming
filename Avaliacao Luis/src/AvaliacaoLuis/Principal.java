package AvaliacaoLuis;

import java.util.Scanner;
 

public class Principal {

	public static void main (String[]args) {
		
	Scanner scan = new Scanner(System.in);
	
	
	 System.out.println("(1)Trabalhador Chefe (2) Trabalhador Comiss�o (3) Trbalhador Horista (4) Trabalhador Produ��o ");
	 int an = scan.nextInt();
	 
	 if(an == 1) { 
		    TrabalhadorChefe  chefe = new TrabalhadorChefe(); 
			System.out.println("Type the  your first name");
			 chefe.setNome( scan.next());
			System.out.println("Type your last name");
			chefe.setSobrenome(  scan.next());
			chefe.Calculo();
			System.out.println("Dados :\n"+chefe.tostring());
			 
		 
		 
		 
	 } else if (an == 2) {
		 TrbalhadorComiss�o tc = new TrbalhadorComiss�o();
		 
		 
		 System.out.println("Type the  your first name");
		 tc.setNome( scan.next());
		System.out.println("Type your last name");
		tc.setSobrenome(  scan.next());
		System.out.println("Trabalhador Comiss�o");
		System.out.println("Coloque a quantidade de itens vendidos");
	     
		  tc.setItemvendidos(scan.nextInt());
		tc.Calculo();
		System.out.println("Dados :\n"+tc.tostring());
		
		 
		 
	 } else if (an == 3) {
		 System.out.println("Trabalhador Horista");
		 TrbalhadorHorista tbh= new TrbalhadorHorista();
		 System.out.println("Type the  your first name");
			tbh.setNome(scan.next());
			System.out.println("Type your last name");
			tbh.setSobrenome(scan.next());
		 
			 System.out.println("Trbalhador Horista");
				
			 System.out.println("Coloque a quantidade de horas trabalhadas");
			     
			  tbh.setQtdhourw(scan.nextInt());
			     tbh.Calculo();
			
			
			 
			 System.out.println("Dados: \n"+tbh.toString());
			 
		 		 
	 } else if (an == 4) {
		 TrbalhadorProdu��o produ��o = new TrbalhadorProdu��o();
		 produ��o =  new TrbalhadorProdu��o();
		 System.out.println("Type the  your first name");
			produ��o.setNome(scan.next());
			System.out.println("Type your last name");
			produ��o.setSobrenome(scan.next());
			
		 System.out.println("Trbalhador Produ��o");
		
		 System.out.println("Coloque a quantidade de itens vendidos");
		     produ��o.setQtditems(scan.nextInt());
		produ��o.Calculo();
		
		
		 
		 System.out.println("Dados: \n"+produ��o.toString());
		 
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	//if()
	
	
	
	
	
		
		
	    //System.out.println(tc.tostring());
		//TrbalhadorComiss�o tc1 = new TrbalhadorComiss�o(null, null, 0, 0, 0);
		
		//TrbalhadorHorista th = new TrbalhadorHorista(null, null, 0, 0);
		//Scanner scan11 = new Scanner(System.in);
		//System.out.println("Coloque a quantidade de horas trabalhadas");
	  //  th.setQtdhourw(scan11.nextInt());
		
	    
		
		
		//
		//TrbalhadorProdu��o tp = new TrbalhadorProdu��o(null, null, an);
	}

}
 