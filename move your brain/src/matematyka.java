
public class matematyka {

	public static void podwojenie(Ko�o k) {
		
		Double tempR = k.getPromie�();
		tempR = tempR *2;
		k.setPromie�(tempR);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ko�o kolo = new Ko�o();
		
		System.out.println("wartosc kolo : " + kolo.getPromien());
		
		podwojenie(kolo);
		
		System.out.println("wartosc kolo : " + kolo.getPromien());

	}

}
