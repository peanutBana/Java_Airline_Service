package AirLineService;

import java.util.Calendar;
import java.util.Date;

public class Ticket{
	private Passenger passenger;
	private AirLine airLine;
	
	private Date date = new Date();
	
	Ticket(){};
	
	Ticket(Passenger passenger, AirLine airLine){
		this.passenger = passenger;
		this.airLine = airLine;
		this.passenger.addTicket(this);
		this.airLine.addTicket(this);
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public AirLine getAirLine() {
		return airLine;
	}

	public void setAirLine(AirLine airLine) {
		this.airLine = airLine;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	
}
