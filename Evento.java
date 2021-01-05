
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

public class Evento {
	
	

	private void menu(){
		System.out.print("##--------------Opções do Menu---------------##\n");
		System.out.print("|---------------------------------------------|\n");
		System.out.print("| Opção 1 - Cadastrar Palestrante    			\n");
		System.out.print("| Opção 2 - Cadastrar Responsavel    			\n");
		System.out.print("| Opção 3 - Cadastrar Eventos        			\n");
		System.out.print("| Opção 4 - Imprimir Palestrantes    			\n");
		System.out.print("| Opção 5 - Cadastrar Palestra    			\n");
		System.out.print("| Opção 6 - Imprimir Palestra    				\n");
		System.out.print("| Opção 7 - Imprimir Reponsável     			\n");
		System.out.print("| Opção 8 - Imprimir Eventos        			\n");
		System.out.print("| Opção 9 - Imprimir Gastos 				    \n");
		System.out.print("| Opção 99 - Exibir Menu			     	    \n");
		System.out.print("| Opção 0 - Sair					     	    \n");
		System.out.print("|---------------------------------------------|\n");
		System.out.print("Digite uma opção\n");
		
	}
	
	
	public static void main(String[] args) {
		
		int x_length = 5;
		int y_length = 6;
		int z_length = 3;
		int v_length = 5;
		
		ArrayList<ArrayList<ArrayList<String>>> aEvento = new ArrayList(x_length);
		
		for (int i = 0; i < x_length; i++) {
			aEvento.add(new ArrayList<ArrayList<String>>(y_length));
		    
			for (int j = 0; j < y_length; j++) {
		    	aEvento.get(i).add(new ArrayList<String>(z_length));
		    	
		    	for(int x=0 ; x<1;x++) {
		    		if(j ==0){
		    			aEvento.get(x).add(0,new ArrayList<String>(v_length)); 	
		    		}else {
		    			aEvento.get(x).add(1,new ArrayList<String>(z_length));
		    		}
		    		
		    		
		    	}
		    	
		    }
			
		}
		
		int num;

		Scanner opc = new Scanner(System.in);
		Evento evento = new Evento();
		
		do {

			System.out.print("Selecione opção do Menu ou Digite 99 para exibir menu : ");
			num  =  opc.nextInt();
			
			switch(num) {
			 //===============================================================================
			 //|Cadastro do Palestrante														|
			 //===============================================================================
				case 1:
					
					ClassPalestrante palestrante = new ClassPalestrante();	
				
					String aPalestrante[ ][ ]={	
							{"Maria da Silva 	","01-5798-0101",Double.toString(150)},
							{"Rafael Dias 	    ","01-4798-0201",Double.toString(250)},
							{"Leticia Gomes     ","01-3798-0301",Double.toString(350)},
							{"Renato dos Santos ","01-8498-0101",Double.toString(450)}
							};
					
					for(int y=0;y < aPalestrante.length;y++) {
	
						aEvento.get(y).get(2).add(0,palestrante.nome=aPalestrante[y][0]);
						aEvento.get(y).get(2).add(1,palestrante.telefone=aPalestrante[y][1]);
						aEvento.get(y).get(2).add(2,Double.toString(palestrante.valorHora=Double.parseDouble(aPalestrante[y][2])));
					}
					if(aEvento.size()>0) {
						System.out.println("Palestrante cadastrado com sucesso");
					}
							
					
					break;
					//===============================================================================
					//|Cadastro do resposavel														|
					//===============================================================================	
				
				case 2:

				
					ClassResponsavel responsavel = new ClassResponsavel();
					
					String aresponsavel[][]= {
							{"Luciana Santos ","01-5798-0101",Double.toString(150)},
							{"Thiago Freitas ","01-4798-0201",Double.toString(250)},
							{"Paloma Talesmi ","01-4798-0201",Double.toString(250)},
							{"Takeda Kiamoto ","01-4798-0201",Double.toString(250)}
						};		
					
					for(int y=0;y < aresponsavel.length;y++) {
						
						aEvento.get(y).get(1).add(0,responsavel.nomeCompleto=aresponsavel[y][0]);
						aEvento.get(y).get(1).add(1,responsavel.telefone=aresponsavel[y][1]);
						aEvento.get(y).get(1).add(2,Double.toString(responsavel.valorHora=Double.parseDouble(aresponsavel[y][2])));
					}
					
					
					break;
				//===============================================================================
				//|Cadastro do Evento														|
				//===============================================================================	
				case 3:
					
					ClassEvento novoEvento = new ClassEvento();
					
				
							
					for(int j=0;j<aEvento.size();j++) {
						if(aEvento.get(j).get(0).size()>0) {
							novoEvento.titulo=aEvento.get(j).get(0).get(0); 
							novoEvento.responsavel=aEvento.get(j).get(0).get(1); 
							aEvento.get(j).get(3).add(0,novoEvento.cargaHoraria="10");
							aEvento.get(j).get(4).add(0,novoEvento.dataIni= "19/07/2020");
							aEvento.get(j).get(5).add(0,novoEvento.dataFim= "21/02/2021");
							
						}
						
						
					}
					
					break;
				
				//===============================================================================
				//|Imprimir  Palestrante													|
				//===============================================================================
				case 4:
					ClassPalestrante impPalestrante = new ClassPalestrante();
				
					System.out.println("|---------Relação de Palestrantes---------|\n");
					
					for(int y=0;y < aEvento.size();y++) {
						
						if(aEvento.get(y).get(2).size()>0){
							
							impPalestrante.nome=aEvento.get(y).get(2).get(0);
							impPalestrante.telefone=aEvento.get(y).get(2).get(1);
							impPalestrante.valorHora=Double.parseDouble(aEvento.get(y).get(2).get(2));
							impPalestrante.imprimirPalestrante();
						}			
					}
						
					System.out.println("|-------------------------------------------|");	
						
					break;
				
				//===============================================================================
				//|Cadastro de Palestra															|
				//===============================================================================	
				case 5:	
				
				ClassPalestra palestra =new ClassPalestra();
				
				String apalestra[][]= {
						{"Marketing Digital"   ,aEvento.get(0).get(2).get(0),"15:00","Trabalhar com Marketing","45"},
						{"Alavancagem Vendas"  ,aEvento.get(1).get(2).get(0),"16:00","Ter sucesso em vendas","60"},
						{"Conquista Clientes"  ,aEvento.get(2).get(2).get(0),"17:35","Aumentar carteira clientes","50"},
						{"Estrategia Vencedora",aEvento.get(3).get(2).get(0),"19:00","Competir com os Gigantes","60"}};
				
					
				for(int y=0;y < apalestra.length;y++) {
					
						
						aEvento.get(y).get(0).add(0,apalestra[y][0]);
						aEvento.get(y).get(0).add(1,apalestra[y][1]);
						aEvento.get(y).get(0).add(2,apalestra[y][2]);
						aEvento.get(y).get(0).add(3,apalestra[y][3]);
						aEvento.get(y).get(0).add(4,apalestra[y][4]);
						
						
					}
				break;
				//===============================================================================
				/*|Impressão do Palestras												|*/
				//===============================================================================
				case 6:
					ClassPalestra impPalestra= new ClassPalestra();
					
					System.out.println("|---------Relação das Palestras---------|\n");
					for(int y=0;y < aEvento.size();y++) {
						
						if(aEvento.get(y).get(0).size()>0){
							impPalestra.Titulo		 = aEvento.get(y).get(0).get(0);
							impPalestra.Palestrante	 = aEvento.get(y).get(0).get(1);
							impPalestra.Hora_inicio	 = aEvento.get(y).get(0).get(2);
							impPalestra.Descricao	 = aEvento.get(y).get(0).get(3);
							impPalestra.Carga_Horaria= aEvento.get(y).get(0).get(4);
							impPalestra.imprimir_Palestra();
							}
							
						}
					break;
				//===============================================================================
				/*|Impressão do resposável														|*/
				//===============================================================================
				case 7:
					ClassResponsavel impResponsavel = new ClassResponsavel();
					
					System.out.println("|---------Relação de Palestrantes---------|\n");
					
					for(int y=0;y < aEvento.size();y++) {
						
						if(aEvento.get(y).get(1).size()>0){
							impResponsavel.nomeCompleto=aEvento.get(y).get(1).get(0);
							impResponsavel.telefone=aEvento.get(y).get(1).get(1);
							impResponsavel.valorHora=Double.parseDouble(aEvento.get(y).get(1).get(2));
							impResponsavel.imprimirResposavel();
						}			
					}
						
					System.out.println("|-------------------------------------------|");	
					
					
				
					break;
				//===============================================================================
				//|Impressão do Evento														|
				//===============================================================================
				case 8:
					ClassEvento ImpEvento = new ClassEvento();
					
					SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
					
					System.out.println("|---------Relação dos Eventos---------|\n");
					for(int x=0;x < aEvento.size();x++) {
						
						if(aEvento.get(x).get(0).size()>0){
							ImpEvento.titulo		= aEvento.get(x).get(0).get(0); 
							ImpEvento.responsavel	= aEvento.get(x).get(1).get(0); 
							ImpEvento.dataIni		=  aEvento.get(x).get(4).get(0); 
							ImpEvento.dataFim		=   aEvento.get(x).get(5).get(0);
							ImpEvento.cargaHoraria	= aEvento.get(x).get(3).get(0);							
							ImpEvento.ImprimirEvetos();
						}
						
						}
			
					
					
					break;
				
				//===============================================================================
				//===============================================================================
				//|Impressão do Gastos														|
				//===============================================================================
				case 9:
					
					double GResponsavel=0;
					double GT_Palestra=0;
					String GPPalestra="";
					double Menor_Vl_Palestra=0;
					double Maior_Vl_Palestra=0;
					int index1=0;
					int index2=0;
					
					ClassGastos gastos = new ClassGastos();
			
					
					for(int x=0;x<aEvento.size();x++) {

						if(aEvento.get(x).get(1).size()>0){
						
							GResponsavel+=Double.parseDouble(aEvento.get(x).get(1).get(2));
							
						}
						if(aEvento.get(x).get(2).size()>0){
							GPPalestra+=aEvento.get(x).get(0).get(0)+" ->"+aEvento.get(x).get(2).get(2)+" |\n ";
							
							GT_Palestra+=Double.parseDouble(aEvento.get(x).get(2).get(2));
							
							if(Menor_Vl_Palestra> Double.parseDouble(aEvento.get(x).get(2).get(2)) || Menor_Vl_Palestra==0) {
								Menor_Vl_Palestra=Double.parseDouble(aEvento.get(x).get(2).get(2));
							}
							if(Maior_Vl_Palestra<Double.parseDouble(aEvento.get(x).get(2).get(2))) {
								Maior_Vl_Palestra=Double.parseDouble(aEvento.get(x).get(2).get(2));
							}
						}
						
					
						
					}
					
					System.out.println("|---------Relação dos Gastos Gerais---------|\n");
					
					gastos.Gasto_Responsavel=GResponsavel;
					gastos.Gasto_Total_Palestra=GT_Palestra;
					gastos.Gasto_Por_Palestra=GPPalestra;
					gastos.Maior_Valor_Palestra=Maior_Vl_Palestra ;
					gastos.Menor_Valor_Palestra=Menor_Vl_Palestra;
					gastos.gastrosGerais();
					break;
				
				//===============================================================================
				//|Impressão do resposavel														|
				//===============================================================================
				case 99:
					evento.menu();
					break;
				}
			
			}while(num!=0);
		opc.close();
		System.out.println("Fim do Programa");
	}

}

