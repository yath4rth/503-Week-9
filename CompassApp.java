package Week9;
public class CompassApp {
	public enum Compass
	{
		NORTH, SOUTH, EAST, WEST
	}
	public static void main(String[] args)
	{
		for(Compass c : Compass.values())
		{
			System.out.println(c);
		}
	}

}
