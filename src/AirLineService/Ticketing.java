package AirLineService;

public class Ticketing{
	
	Ticketing(){};
	Ticketing(Passenger p, AirLine a){
	}
	public void showTicketInfo(Passenger a, AirLine b) {
		System.out.println("승객 이름 "+ a.passengerName);
		System.out.println("에어라인 : "+ b.arriveRegion);
	}
	
	public void showAllPassengerInfo(Passenger a, AirLine b) {
		System.out.println(a.passengerName+"님의 아이디는 "+a.passengerID);
	}
}
