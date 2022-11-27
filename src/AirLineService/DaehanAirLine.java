package AirLineService;

public class DaehanAirLine extends AirLine{
	public String seatLevel;		//좌석 등급
	int passengerNum;
	
	DaehanAirLine(){
		defaultAirLine();
		seatLevel = "economy";		//좌석 등급
	}
	
	DaehanAirLine(String airPlaneType, int passengerNum){
		this.airPlaneType = airPlaneType;
		this.passengerNum = passengerNum;
	}
}
