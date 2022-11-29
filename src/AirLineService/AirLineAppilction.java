package AirLineService;

import java.util.ArrayList;
import java.util.Scanner;

public class AirLineAppilction {
	//항공권 예약티켓 정보저장할 ArrayList 생성
	private static ArrayList<Ticket> ticketList = new ArrayList<Ticket>();
	static Scanner sc = new Scanner(System.in);
	static boolean status = true;
	
	//method
	public static void showAllPassengerInfo() {
		for(Ticket ticket : ticketList) {
			
		}
	}
	
	public static Passenger makePassenger() {
		System.out.print("승객 이름을 입력하세요: ");
		String pName = sc.next();
		System.out.print("id번호를 입력하세요: ");
		int pID = sc.nextInt();
		System.out.print("여권번호를 입력하세요: ");
		String pPnum = sc.next();	
		Passenger p = new Passenger(pName, pID ,pPnum);
		return p;
	}
	
	public static AirLine makeAirLine() {
		System.out.print("승객 이름을 입력하세요: ");
		String airLineName = sc.next();
		System.out.print("승객 이름을 입력하세요: ");
		String departRegion = sc.next();
		System.out.print("승객 이름을 입력하세요: ");
		String arriveRegion = sc.next();
		
		return null;
	}

//	public static Passenger findPassenger(int passengerID) {
//		Passenger resultPassenger = null;
//		for(Passenger p : passengerList) {
//			if(p.passengerID == passengerID ) {
//				resultPassenger = p;
//			}
//		}
//		return resultPassenger;
//	}
	
//	public static void showReservationInfo() {
//		int findPassengerID = sc.nextInt();
//		Passenger fP = findPassenger(findPassengerID);
//		System.out.println(fP.passengerName + "님의 항공권 정보");
//		System.out.println();
//	}

	public static void main(String[] args) {
		//Passenger 생성
		Passenger PassengerLee = new Passenger("이강인", 10001 ,"M30286766");
		Passenger PassengerKim = new Passenger("김승규", 10002, "M75019299");
		Passenger PassengerHwang = new GoldPassenger("황의조", 10003, "M173349972");
		Passenger PassengerNa= new GoldPassenger("나상호", 10004, "M15509732");
		Passenger PassengerSon = new VIPPassenger("손흥민", 10005, "M40329253");
		
		
		//AirLine 객체 생성
		AirLine asianaEconomy = new AsianaEconomy();
		AirLine asianaBusiness= new AsianaBusiness();
		AirLine daehanEconomy = new DaehanEconomy();
		AirLine daehanBusiness = new DaehanBusiness();
		
		//Ticketing 객체 생성
		Ticket t1 = new Ticket(PassengerLee, asianaEconomy);
		Ticket t2 = new Ticket(PassengerKim, asianaBusiness);
		Ticket t3 = new Ticket(PassengerHwang, daehanEconomy);
		Ticket t4 = new Ticket(PassengerNa, daehanBusiness);
		Ticket t5 = new Ticket(PassengerSon, asianaBusiness);
		
		//ticketList에 삽입
		ticketList.add(t1);
		ticketList.add(t2);
		ticketList.add(t3);
		ticketList.add(t4);
		ticketList.add(t5);
		
		while(status) {
			System.out.println("--------------------------------------------");
			System.out.println("1.전체 승객 정보 | 2.승객 예매 정보 | 3.승객 예매 정보 삭제 | 4. 종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > "); int choice = sc.nextInt() ;
			
			switch(choice) {
			case 1:
				showAllPassengerInfo();
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				System.out.println("프로그램 종료");
				status = false;
			}
		}
	}
}


