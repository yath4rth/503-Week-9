package Week9;

public class LevelApp {
	public enum Levels
	{
		LOW, MED, HIGH
	}
	public String directions(Levels level)
	{
	switch(level) 
	{	
		case LOW:
			return "Down";
	case MED:
			return "Stay";
	case HIGH:
			return "Up";
	default:
			return "?";
	}
	}
	public static void main(String[] args)
	{
		LevelApp app = new LevelApp();
		System.out.println(app.directions(Levels.LOW));
	}
}

