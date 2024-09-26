package Week9;

public class Pizza 
{

	public enum Topping 
	{

		Salami(5), Mushrooms(2), Ham(6), Pinapple(1), Bacon(4);

		private int price;

		public int getPrice()
		{
			return this.price;
		}

		private Topping(int price)
		{
			this.price = price;
		}		
	}

	public enum Size
	{
		Small(5), Medium(10), Large(12);

		private int basePrice;

		public int getBasePrice()
		{
			return this.basePrice;
		}

		private Size(int basePrice)
		{
			this.basePrice = basePrice;
		}		
	}


	private Size size;
	private Topping[] toppings;	

    //1. Complete this method.
	public int getTotal()
	{
		
		int totalPrice = size.getBasePrice();

        // Add the price of each topping to the total price
        for (Topping topping : toppings) {
            totalPrice += topping.getPrice();
        }

        return totalPrice;

	}

	public Pizza(Size size,Topping[] toppings)
	{
		this.size = size;
		this.toppings = new Topping[0];

		if(toppings != null)
		{		
			this.toppings = toppings;
		}		
	}
	public static void main(String[] args)
	{
		Pizza small = new Pizza(Pizza.Size.Small,new Pizza.Topping[] {Pizza.Topping.Pinapple,Pizza.Topping.Salami,Pizza.Topping.Bacon});

		System.out.println("total = "+small.getTotal());
	}
}
