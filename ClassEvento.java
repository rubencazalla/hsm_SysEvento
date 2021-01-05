import java.util.Date;
public class ClassEvento {

	String titulo; 
	String responsavel; 
	String dataIni; 
	String dataFim;
	String cargaHoraria;

	
	public void ImprimirEvetos() { 
		System.out.println("Titulo: "+titulo);
		System.out.println("responsavel : "+responsavel);
		System.out.println("Data Inicio : "+dataIni);
		System.out.println("Data Fim	: "+dataFim);
		System.out.println("Carga Horaria:"+cargaHoraria);
		
	}
	
}
