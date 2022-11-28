package AirLineService;

public class DaehanEconomy extends DaehanAirLine{
	DaehanEconomy(){
		defaultAirLine();
		seatLevel = "economy";
	}
	
	DaehanEconomy(int passengerNum){
		this.passengerNum = passengerNum;
	}

	@Override
	public int calcTicketPrice(int ticketPrice) {
		return ticketPrice;
	}
}
