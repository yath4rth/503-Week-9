package Week9;

public class Order 
{

	public enum Status
	{
		ready,out,received,complete;	
	}

	private Status status;
	
	public Status getStatus()
	{
		return this.status;
	}


	public void next()
	{
		switch(this.status)
		{
		case ready:
            this.status = Status.out;
            break;
        case out:
            this.status = Status.received;
            break;
        case received:
            this.status = Status.complete;
            break;
        case complete:
            // Do nothing if the status is complete
            break;
		}
		//complete this method
	}

	public Order()
	{
		this.status = Status.ready;
	}

}
