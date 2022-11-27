package AirLineService;

//이코노미
	public class AsianaEconomy extends AsianaAirLine{
		AsianaEconomy(int passengerNum){
			this.passengerNum = passengerNum;
		}

		@Override
		public int calcTicketPrice(int ticketPrice) {
			return ticketPrice;
		}
	}
