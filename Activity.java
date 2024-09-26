package Week9;

public class Activity 
{

	public enum Season {Winter,Spring,Summer,Fall};


	private Season[] seasons;


    //complete this method.
	public boolean recommend(Season season)
	{
		for(Season s : seasons)
		{
			if(s == season)
			{
				return true;
			}
		}
	return false;
	}


	public Activity(Season[] season)
	{
		this.seasons = season;		
	}
}
