package paquete;

public class ordenamiento_b {
	
	public void ordenamiento_b(int[] array) {
		
		int aux;
		boolean cambiar = false;
		
		
		while(true) {
			
			cambiar = false;
			
			for(int i=1; i < array.length; i++) {
				if(array[i] < array[i-1]) {
					aux=array[i];
					array[i]=array[i-1];
					array[i-1]=aux;
					cambiar = true;
				}
				
			}
			
			if(cambiar==false)
				break;
		}
	}

}
