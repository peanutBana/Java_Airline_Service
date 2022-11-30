package AirLineService;

//비즈니스
	public class DaehanBusiness extends AirLine{
		DaehanBusiness(){
			defaultAirLine();
			seatLevel = "business";
			super.airLineName = "대한항공";
		}
		
		DaehanBusiness(String airLineName, String departRegion, String arriveRegion){
			super.airLineName = "대한항공";
			this.airLineName = airLineName;
			super.departRegion = departRegion;
			super.arriveRegion = arriveRegion;
		}
			
		@Override
		public int calcTicketPrice(int ticketPrice) {
			return(int)(ticketPrice*1.5);	//이코노미 1.5배 가격			
		}
	}
