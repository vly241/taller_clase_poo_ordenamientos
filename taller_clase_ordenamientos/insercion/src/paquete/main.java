package paquete;

class main {

	public static void main(String[] args) {
			
			int arreglo[]= {5,4,3,2,1,6};
			
			ordenador o = new ordenador();
			
			o.ordenar_insercion(arreglo);
		
			
			for(int i = 0; i < arreglo.length; i++) {
				
				System.out.println(arreglo[i]);
			}
		}

	}


