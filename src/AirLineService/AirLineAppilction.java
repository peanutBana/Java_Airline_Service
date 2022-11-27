package AirLineService;

import java.util.ArrayList;
import java.util.Date;

public class AirLineAppilction {
	//항공권 예약티켓 정보저장할 ArrayList 생성
	private static ArrayList<Ticketing> ticketList = new ArrayList<Ticketing>();

	public static void main(String[] args) {
		//Passenger 생성
		Passenger PassengerLee = new Passenger("이강인", "M30286766");
		Passenger PassengerKim = new Passenger("김승규", "M75019299");
		GoldPassenger PassengerHwang = new GoldPassenger("황의조", "M173349972");
		GoldPassenger PassengerNa= new GoldPassenger("나상호", "M15509732");
		VIPPassenger PassengerSon = new VIPPassenger("손흥민", "M40329253");
		
		AirLine asianaEconomy = new AsianaAirLine("lowCost", "economy");
		AirLine asianaBusiness= new AsianaAirLine("aisana", "business");
		AirLine daehanEconomy = new DaehanAirLine("daehan", "economy");
		AirLine daehanEconomy = new DaehanAirLine("daehan", "economy");
		
		
		
		
	}
}


