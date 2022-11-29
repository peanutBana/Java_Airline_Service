package AirLineService;

//이코노미
	public class AsianaEconomy extends AirLine{
		AsianaEconomy(){
			defaultAirLine();
			super.airLineName = "아시아나항공";
		}
		
		AsianaEconomy(String airLineName, String departRegion, String arriveRegion){
			super.airLineName = "아시아나항공";
			this.airLineName = airLineName;
			super.departRegion = departRegion;
			super.arriveRegion = arriveRegion;
		}

		@Override
		public int calcTicketPrice(int ticketPrice) {
			return ticketPrice;
		}
	}
