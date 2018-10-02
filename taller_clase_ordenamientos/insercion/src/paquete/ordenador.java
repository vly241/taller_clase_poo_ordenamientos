package paquete;

public class ordenador {

		
		public void ordenar_insercion(int[] array) {
			
			int aux;
			int cont1, cont2;
			
			for(cont1=1; cont1 < array.length; cont1++) {
				
				aux = array[cont1];
				
				
				for(cont2 = cont1 - 1; cont2 >= 0 && array[cont2] > aux ; cont2--) {
					
					array[cont2+1] = array[cont2];
					array[cont2] = aux;
					
				}
			}
		}

	}
