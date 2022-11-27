package AirLineService;

abstract class AirLine {
	public String seatLevelseatLevel;		//항공사 이름
	public String departRegion;		//출발지 
	public String arriveRegion;		//도착지
	
	
	AirLine(){
		defaultAirLine();
	}
	
	AirLine(String airPlaneType){
		defaultAirLine();
	}
	
	public void defaultAirLine(){
		departRegion = "SouthKorea";
		arriveRegion = "Quatar";
	}
	
	public int calcTicketPrice(int ticketPrice) {
		return ticketPrice;
	}
}
