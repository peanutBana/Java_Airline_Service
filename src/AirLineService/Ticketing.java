package AirLineService;

public class Ticketing{
	Passenger p;
	AirLine a;
	
	Ticketing(){};
	
	Ticketing(Passenger p, AirLine a){
		this.p = p;
		this.a = a;
	}

	public void showAllPassengerInfo() {
		System.out.println(p.getPassengerName() + "님의 항공편 정보");
		System.out.println(p.getPassengerName() + "님의 항공편 정보");
	
	}
	
}
