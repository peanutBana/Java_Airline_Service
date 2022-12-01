package AirLineService;

import java.util.ArrayList;
import java.util.Scanner;

public class AirLineAppilction {
	//항공권 예약티켓 정보저장할 ArrayList 생성
	private static ArrayList<Ticket> ticketList = new ArrayList<Ticket>();
	static Scanner sc = new Scanner(System.in);
	static boolean status = true;
	
	//method
	public static void showAllPassengerInfo() {	//1. 모든 승객 예약 정보
		for(Ticket ticket : ticketList) {
			System.out.println("["+ticket.getPassenger().getPassengerName()+"]님의 예약정보");
			System.out.println("승객ID: "+ticket.getPassenger().getPassengerID()+" | 여권번호: "+ticket.getPassenger().getPassPortNum());
			System.out.println("항공사: "+ticket.getAirLine().airLineName+" | 출발지: "+ticket.getAirLine().departRegion+" | 도착지: "+ticket.getAirLine().arriveRegion);
			System.out.println();
		}
	}
	
	public static void showReservationInfo() {	//2. 승객 예매 정보(ID)
		System.out.print("찾으려는 승객의 ID를 입력하세요: ");
		int pID = sc.nextInt();
		Passenger resultP = findPassenger(pID);
		if( resultP == null) {
			System.out.println("해당하는 승객정보가 존재하지 않습니다.");
			System.out.println();
		}
		else {
			System.out.println(findPassenger(pID).showPassengerInfo());		
			System.out.println();
		}
	}	
	
	public static void makeTicket() {//3. 예약정보 생성
		Ticket makeT = null;
		Passenger p = Passenger.makePassenger();
		AirLine a =  AirLine.makeAirLine();
		makeT = new Ticket(p,a);
		ticketList.add(makeT);
		System.out.println("예약되었습니다.");
	}
	
	public static void removeReservation() {
		System.out.print("id번호를 입력하세요: ");
		int pID = sc.nextInt();
		Passenger resultP = findPassenger(pID);
		Ticket resultT = findTicketByID(pID);
		if(resultP == null) {
			System.out.println("해당하는 승객정보가 존재하지 않습니다.");
			System.out.println();
		}
		else {
			ticketList.remove(ticketList.indexOf(resultT));
		}
	}
	public static Ticket findTicketByID(int ID) {
		Ticket resultT = null;
		for(Ticket t : ticketList) {
			if(t.getPassenger() == findPassenger(ID)) {
				resultT = t;
			}
		}
		return resultT;
	}
	
	public static Passenger findPassenger(int passengerID) {
		Passenger resultPassenger = null;
		for(Ticket t : ticketList) {
			if(t.getPassenger().getPassengerID() == passengerID) {
				resultPassenger = t.getPassenger();
			}
		}
		return resultPassenger;
	}
	
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
			System.out.println("---------------------------------------------------------");
			System.out.println("1.전체 승객 정보 | 2.승객 예매 정보 | 3.승객 예매정보 추가 | 4.예약정보 삭제 | 5.종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("선택 > "); int choice = sc.nextInt() ;
			
			switch(choice) {
			case 1:
				showAllPassengerInfo();
				break;
			case 2:
				showReservationInfo();
				break;
			case 3:
				makeTicket();
				break;
			case 4:
				removeReservation();
				break;
			case 5:
				System.out.println("프로그램 종료");
				status = false;
			}
		}
	}
}


