package AirLineService;

//비즈니스
	public class DaehanBusiness extends DaehanAirLine{
		DaehanBusiness(){
			defaultAirLine();
			seatLevel = "business";
		}
		
		DaehanBusiness(int passengerNum){
			this.passengerNum = passengerNum;
		}
			
		@Override
		public int calcTicketPrice(int ticketPrice) {
			return(int)(ticketPrice*1.5);	//이코노미 1.5배 가격			
		}
	}
