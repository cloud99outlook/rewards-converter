public class RewardValue {
    
	
	private final double cashValue;
    public static double miles_to_Cash_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    
    //conversion
    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / miles_to_Cash_RATE);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * miles_to_Cash_RATE;
    }

    
    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}