
public class matematyka {

	public static void podwojenie(Ko³o k) {
		
		Double tempR = k.getPromieñ();
		tempR = tempR *2;
		k.setPromieñ(tempR);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ko³o kolo = new Ko³o();
		
		System.out.println("wartosc kolo : " + kolo.getPromien());
		
		podwojenie(kolo);
		
		System.out.println("wartosc kolo : " + kolo.getPromien());

	}

}
