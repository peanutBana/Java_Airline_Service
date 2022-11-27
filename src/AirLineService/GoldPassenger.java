package AirLineService;

public class GoldPassenger extends Passenger{
	
	public double saleRatio;	//할인율
	
	GoldPassenger(String passengerName, int passengerID,String passPortNum){
		super(passengerName, passengerID, passPortNum);
		super.passengerGrade = "GOLD";
		super.mileageRatio= 0.02; 
		this.saleRatio = 0.1;
	}

	@Override
	public int calcTicketPrice(int price) {
		mileageRatio += (price * mileageRatio);
		return price - (int)(price * saleRatio);
	}
	
	
}
