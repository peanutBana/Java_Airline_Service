package AirLineService;

public class VIPPassenger extends Passenger{
	
	public double saleRatio;
	
	VIPPassenger(String passengerName,int passengerID, String passPortNum){
		super(passengerName, passengerID, passPortNum);
		super.passengerGrade = "VIP";
		super.mileageRatio= 0.03; 
		this.saleRatio = 0.2;
	}
	
	@Override
	public int calcTicketPrice(int price) {
		mileageRatio += (price * mileageRatio);
		return price - (int)(price * saleRatio);
	}
}
