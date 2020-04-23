package numeroscomplejos;

public class Clase {
	public static void main(String[] args) {
		hora h1= new hora(1,1,1);
		h1.print();
		System.out.println(h1.aSegundos());
		h1.deSegundos(10000);
		h1.print();
		hora h2= new hora(10,10,10);
		if(h1.mayorQue(h2)) {
			System.out.println("H1 > H2");
		}else {
			System.out.println("H1 < H2");
		}
		hora h3=h1.copia();
		
		System.out.println(h3.hashCode());

	}

}


