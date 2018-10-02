package paquete;

class main {

	public static void main(String[] args) {
		
		int arreglo[]= {5,4,3,2,1};
		
		ordenamiento_b o = new ordenamiento_b();
		
		o.ordenamiento_b(arreglo);
	
		
		for(int i = 0; i < arreglo.length; i++) {
			
			System.out.println(arreglo[i]);
		}
	}

}
