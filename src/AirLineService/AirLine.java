package AirLineService;

import java.util.ArrayList;
import java.util.Scanner;


public class AirLine{
	public String airLineName;		//항공사 이름
	protected String departRegion;		//출발지 
	protected String arriveRegion;		//도착지
	public String seatLevel;		//좌석 등급
	
	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}

	private ArrayList<Ticket> tickets;
	static Scanner sc = new Scanner(System.in);
	
	AirLine(){
		defaultAirLine();
		tickets = new ArrayList<Ticket>();
	}
	
	AirLine(String airLineName, String departRegion, String arriveRegion){
		this.airLineName = airLineName;
		this.departRegion = departRegion;
		this.arriveRegion = arriveRegion;
		defaultAirLine();
	}
	
	
	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}
	
	public void defaultAirLine(){
		departRegion = "SouthKorea";
		arriveRegion = "Quatar";
	}
	
	public int calcTicketPrice(int ticketPrice) {
		return ticketPrice;
	}
	
}
