package AirLineService;

public class DaehanAirLine extends AirLine{
	public String seatLevel;		//좌석 등급
	int passengerNum;
	String AirLineName = "대한항공";
	
	DaehanAirLine(){
		defaultAirLine();
		seatLevel = "economy";		//좌석 등급
	}
	
	DaehanAirLine(int passengerNum){
		this.passengerNum = passengerNum;
	}
	
	public int calcTicketPrice(int ticketPrice) {
		return ticketPrice;
	}	
		
}
