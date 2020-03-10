package pruebas;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class probing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prueba1();
		
		prueba2();
		
	}
	
	private static void prueba1() {
		List<Integer>list = new ArrayList<Integer>(Arrays.asList(8,9,4,3,2,9,3,8,5,1)); 
		System.out.println(list.get(0));
		int aux, aux2, pos = 0;
		for (int i = list.size() -1 ; i >=0 ; i--) {
			aux = list.get(i);
		
			for (int j = i-1; j >=0 ; j--) {
				aux2=list.get(j);
				
				if (aux==aux2) {
					
					list.remove(j);
					System.out.println("Eliminación: 	" + " El número " + aux + " está duplicado en la posición " + j);
				}
				
				
			}	
		}
		System.out.println("Visualizamos la lista : ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	
	private static void prueba2() {
		List<Integer>list = new ArrayList<Integer>(Arrays.asList(1,2,1,3,3,4)); 
		System.out.println("Estado inicial de la lista: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		int aux;
		System.out.println();
		
		for (int i =0; i < list.size() ; i++) {
			aux = list.get(i);
			for (int j = i+1 ; j < list.size(); j++) {
				
				if (aux == list.get(j)) {
					list.remove(j);
					list.add(j, 0 );
					System.out.println("Numero " + aux + "	Pos "  + j);
				}
			}		
		}	
		
		List <Integer > positions = new ArrayList<Integer>();
		
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i)==0) {
					positions.add(i);
				}
			}
			
		
		
		
		System.out.println("Después de las modificaciones : ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
	
	

}
