package AirLineService;

import java.util.ArrayList;
import java.util.Scanner;

public class Passenger{
	private String passengerName;		//승객 이름  
	private int passengerID;		//승객 ID  
	private String passPortNum;		//여권 번호
	protected String passengerGrade;	//승객 등급	
	private int mileage;				//마일리지
	protected double mileageRatio;  		//마일리지 적립비율
	
	private ArrayList<Ticket> tickets;
	static Scanner sc = new Scanner(System.in);
	
	
	//생성
	Passenger() {
		defaultPassenger();
		tickets = new ArrayList<Ticket>(); 
	}
	
	Passenger(String passengerName, int passengerID, String passPortNum) {
		this.passengerName = passengerName;
		this.passengerID = passengerID;
		this.passPortNum = passPortNum;
		tickets = new ArrayList<Ticket>(); 
		defaultPassenger();
	}
	
	public static Passenger makePassenger() {	//3. 예약정보 생성
		System.out.print("승객 이름을 입력하세요: ");
		String pName = sc.next();
		System.out.print("id번호를 입력하세요: ");
		int pID = sc.nextInt();
		System.out.print("여권번호를 입력하세요: ");
		String pPnum = sc.next();	
		Passenger p = new Passenger(pName, pID ,pPnum);
		return p;
	}
	
	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}
	
	//기본 등급 승객 정보
	public void defaultPassenger() {		
		this.passengerGrade = "SILVER";
		mileageRatio = 0.1;	
	}
	
	public int calcTicketPrice(int price) {
		mileageRatio += (price * mileageRatio);
		return price;
	}
	
	public String showPassengerInfo() {
		return passengerName + "님의 등급: " + passengerGrade + ", 적립 마일리지: " + mileage + "마일리지"; 
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getPassengerID() {
		return passengerID;
	}

	public void setPassengerID(int passengerID) {
		this.passengerID = passengerID;
	}

	public String getPassPortNum() {
		return passPortNum;
	}

	public void setPassPortNum(String passPortNum) {
		this.passPortNum = passPortNum;
	}

	public String getPassengerGrade() {
		return passengerGrade;
	}

	public void setPassengerGrade(String passengerGrade) {
		this.passengerGrade = passengerGrade;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}

	
	
}
