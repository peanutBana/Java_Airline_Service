package AirLineService;

public class AsianaAirLine extends AirLine{

	public String seatLevel;		//좌석 등급
	int passengerNum;
	String AirLineName = "아시아나";
	
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
