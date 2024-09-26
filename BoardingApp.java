package Week9;

public class BoardingApp {
	enum Membership
	{
		GOLD(500), SILVER(300), BRONZE(150), NONE(0);
		private int fee;
private Membership(int fee)
{
	this.fee = fee;
}
public int getFee()
{
	return fee;
}
public int setFee(int fee)
{
	return fee;
}
}
	public static void main(String[] args)
	{
		for (Membership membership : Membership.values()) {
            System.out.println(membership.getFee());
	}
}
}
