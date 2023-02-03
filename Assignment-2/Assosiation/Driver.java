package Association;

class CabServiceProvider
{
	private String cabServiceName;
	private int totalCabs;
	
	public CabServiceProvider(String cabServiceName, int toalCabs){
		
		this.cabServiceName = cabServiceName;
		this.totalCabs = toalCabs;
	}
	
	public String getCabServiceName() {
		return cabServiceName;
	}

	public void setCabServiceName(String cabServiceName) {
		this.cabServiceName = cabServiceName;
	}

	public int getTotalCabs() {
		return totalCabs;
	}

	public void setTotalCabs(int totalCabs) {
		this.totalCabs = totalCabs;
	}

	public double calculateRewardPrice(Driver driver){
		
		double reward = 0 ;
		double rating = driver.getAverageRating();
		
		if(cabServiceName == "Halo"){
			
			if(rating >= 4.5 && rating <= 5)
				reward = 10 * rating;
			
			else if(rating >=4 && rating <4.5)
				reward = 5* rating;			
		}
		else if(cabServiceName == "Aber"){
			if(rating >=4.5 && rating <=5)
				reward = 8 * rating;
			
			else if(rating >=4 && rating <4.5)
				reward = 3 * rating;	
		}
		return Math.round(reward);
	}
}
class Driver {
	
	private String driverName;
	private float averageRating;
	
	public Driver(String driverName, float averageRating){
		this.driverName=driverName;
		this.averageRating=averageRating;
	}
	
	public String getDriverName(){
		return this.driverName;
	}
	
	public void setDriverName(String driverName){
		this.driverName=driverName;
	}
	
	public float getAverageRating(){
		return this.averageRating;
	}
	
	public void setAverageRating(float averageRating){
		this.averageRating=averageRating;
	}

    public String toString(){
        return "Driver\ndriverName: "+this.driverName+"\naverageRating: "+this.averageRating;
    }
}

class CabTester {
	
	public static void main(String args[]){
	    CabServiceProvider cabServiceProvider1 = new CabServiceProvider("Halo", 50);

		Driver driver1 = new Driver("Luke", 4.8f);
		Driver driver2 = new Driver("Mark", 4.2f);
		Driver driver3 = new Driver("David", 3.9f);
		
		Driver[] driversList = { driver1, driver2, driver3 };
		for (Driver driver : driversList) {
			System.out.println("Driver Name: "+driver.getDriverName());
			double bonus = cabServiceProvider1.calculateRewardPrice(driver);
			if (bonus>0)
				System.out.println("Bonus: $"+bonus+"\n");
			else
				System.out.println("Sorry, bonus is not available!");
		}
	}
	}