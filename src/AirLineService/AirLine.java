package AirLineService;

abstract class AirLine {
	public String airPlaneType;		//항공사 이름
	public String departRegion;		//출발지 
	public String arriveRegion;		//도착지
	public int ticketPrice;

	
	AirLine(){
		defaultAirLine();
	}
	
	AirLine(String airPlaneType){
		this.airPlaneType = airPlaneType;
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
