

public class Adult extends Person
{
	String name;
	private Ticket ticket;
	
	Adult (String newName)
	{
		name = newName;
		ticket = buyTicket();
	}


	private Ticket buyTicket()
	{
		Ticket newTicket = new Ticket(this);
		return newTicket;
	}

	public Ticket getTicket()
	{
		return ticket;
	}
}

