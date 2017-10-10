public class Person
{
	String name;
	private Ticket ticket;
	
	Person ()
	{
	
	}
	
	Person (String newName)
	{
		name = newName;
		ticket = buyTicket();
	}

	private Ticket buyTicket()
	{
		return null;
	}

	public Ticket getTicket()
	{
		return ticket;
	}

}
