public class Payments {
	
	public void doPayment(String type, float amt)
	{
		System.out.println("Payment has done by: "+type+" "+amt);
	}
	public void doPayment(String type, float amt, float disc)
	{
		System.out.println("Payment has done by: "+type+" "+amt+" "+disc);
	}
	public void doPayment(String type, int amt)
	{
		System.out.println("Payment has done by: "+type+" "+amt);
	}

	public static void main(String[] args) {
		
		Payments obj = new Payments();
		obj.doPayment("Cash on Delivery", 250);
		obj.doPayment("Debit Card", 240);
		obj.doPayment("Credit Card", 210, 30);

	}

}
