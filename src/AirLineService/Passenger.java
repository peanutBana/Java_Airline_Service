package AirLineService;

public class Passenger {
	protected String passengerName;		//승객 이름  
	protected String passPortNum;		//여권 번호
	protected String passengerGrade;	//승객 등급	
	protected int mileage;				//마일리지
	public double mileageRatio;  		//마일리지 적립비율
	
	
	//생성
	public Passenger() {
		defaultPassenger();
	}
	
	public Passenger(String passengerName, String passPortNum) {
		this.passengerName = passengerName;
		this.passPortNum = passPortNum;
		defaultPassenger();
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
	
	
	
	
}
