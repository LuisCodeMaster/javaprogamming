package AvaliacaoLuis;

import java.util.Scanner;
 

public class Principal {

	public static void main (String[]args) {
		
	Scanner scan = new Scanner(System.in);
	
	
	 System.out.println("(1)Trabalhador Chefe (2) Trabalhador Comissão (3) Trbalhador Horista (4) Trabalhador Produção ");
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
		 TrbalhadorComissão tc = new TrbalhadorComissão();
		 
		 
		 System.out.println("Type the  your first name");
		 tc.setNome( scan.next());
		System.out.println("Type your last name");
		tc.setSobrenome(  scan.next());
		System.out.println("Trabalhador Comissão");
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
		 TrbalhadorProdução produção = new TrbalhadorProdução();
		 produção =  new TrbalhadorProdução();
		 System.out.println("Type the  your first name");
			produção.setNome(scan.next());
			System.out.println("Type your last name");
			produção.setSobrenome(scan.next());
			
		 System.out.println("Trbalhador Produção");
		
		 System.out.println("Coloque a quantidade de itens vendidos");
		     produção.setQtditems(scan.nextInt());
		produção.Calculo();
		
		
		 
		 System.out.println("Dados: \n"+produção.toString());
		 
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	//if()
	
	
	
	
	
		
		
	    //System.out.println(tc.tostring());
		//TrbalhadorComissão tc1 = new TrbalhadorComissão(null, null, 0, 0, 0);
		
		//TrbalhadorHorista th = new TrbalhadorHorista(null, null, 0, 0);
		//Scanner scan11 = new Scanner(System.in);
		//System.out.println("Coloque a quantidade de horas trabalhadas");
	  //  th.setQtdhourw(scan11.nextInt());
		
	    
		
		
		//
		//TrbalhadorProdução tp = new TrbalhadorProdução(null, null, an);
	}

}
 