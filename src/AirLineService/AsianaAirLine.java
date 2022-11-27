package AirLineService;

import java.util.Date;

public class AsianaAirLine extends AirLine{

	Date departDate = new Date();
	Date arriveDate = new Date();
	
	public String seatLevel;		//좌석 등급
	int passengerNum;
	
	AsianaAirLine(){
		defaultAirLine();
		seatLevel = "economy";		//좌석 등급
	}
	
	AsianaAirLine(String airPlaneType, int passengerNum){
		this.airPlaneType = airPlaneType;
		this.passengerNum = passengerNum;
	}
}
