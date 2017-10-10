
import java.util.Calendar;

public class Ticket
{
	private int basePrice;

	private void discount(int day)
	{
		Calendar cal = Calendar.getInstance(); 
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

		if (dayOfWeek == day) 
			basePrice -= 2;
	}
	
	Ticket(Person guy)
	{
		if(guy instanceof Adult) basePrice = 8; 
		else if(guy instanceof OAP) basePrice = 6; 
		else if(guy instanceof Student) basePrice = 6;
		else if(guy instanceof Child) basePrice = 4;
		else basePrice = 100;
		
		discount(4);
	}

	public int getPrice()
	{
		return basePrice;
	}

}