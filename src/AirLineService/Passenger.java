package AirLineService;

import java.util.ArrayList;

public class Passenger{
	private String passengerName;		//승객 이름  
	private int passengerID;		//승객 ID  
	private String passPortNum;		//여권 번호
	protected String passengerGrade;	//승객 등급	
	private int mileage;				//마일리지
	protected double mileageRatio;  		//마일리지 적립비율
	
	private ArrayList<Ticket> tickets;
	
	
	//생성
	public Passenger() {
		defaultPassenger();
		tickets = new ArrayList<Ticket>(); 
	}
	
	public Passenger(String passengerName, int passengerID, String passPortNum) {
		this.passengerName = passengerName;
		this.passPortNum = passPortNum;
		this.passPortNum = passPortNum;
		tickets = new ArrayList<Ticket>(); 
		defaultPassenger();
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

	
}
