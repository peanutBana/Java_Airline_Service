package AirLineService;

//비즈니스
	public class AsianaBusiness extends AirLine{
		AsianaBusiness(){
			defaultAirLine();
			seatLevel = "business";
			super.airLineName = "아시아나항공";
		}
		
		AsianaBusiness(String airLineName, String departRegion, String arriveRegion){
			super.airLineName = "아시아나항공";
			this.airLineName = airLineName;
			super.departRegion = departRegion;
			super.arriveRegion = arriveRegion;
		}
		
		@Override
		public int calcTicketPrice(int ticketPrice) {
			return(int)(ticketPrice*1.5);	//이코노미 1.5배 가격
		}
	}