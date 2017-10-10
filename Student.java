

public class Student extends Person
{
	String name;
	private Ticket ticket;
	
	Student (String newName)
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

