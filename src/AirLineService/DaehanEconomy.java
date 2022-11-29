package AirLineService;

public class DaehanEconomy extends AirLine {
	DaehanEconomy(){
		defaultAirLine();
		seatLevel = "economy";
		super.airLineName = "대한항공";
	}
	
	DaehanEconomy(String airLineName, String departRegion, String arriveRegion){
		super.airLineName = "대한항공";
		this.airLineName = airLineName;
		super.departRegion = departRegion;
		super.arriveRegion = arriveRegion;
	}

	@Override
	public int calcTicketPrice(int ticketPrice) {
		return ticketPrice;
	}
}
