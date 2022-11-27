package AirLineService;

import java.util.Date;

public class AsianaAirLine extends AirLine{

	Date departDate = new Date();
	Date arriveDate = new Date();
	
	public String seatLevel;		//좌석 등급
	int passengerNum;
	public int ticketPrice = 1000000;
	
	AsianaAirLine(){
		defaultAirLine();
		seatLevel = "economy";		//좌석 등급
	}
	
	AsianaAirLine(int passengerNum){
		this.passengerNum = passengerNum;
	}
	
	public int calcTicketPrice(int ticketPrice) {
		return ticketPrice;
	}
}
