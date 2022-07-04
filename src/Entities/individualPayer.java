package Entities;

public class individualPayer extends payer {

	private Double healthExpenditures;
	
	
	
	public individualPayer() {
		super();
	}



	public individualPayer(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double taxes() {
		
		if (getAnnualIncome() <  20000.00 ) {
			
			return getAnnualIncome() * 0.15 - healthExpenditures * 0.50;
			
		}
		else {
			return getAnnualIncome() * 0.25 - healthExpenditures * 0.50;
		}	
	}
	
	@Override
	public String labels () {
		return getName()
				+ ": $ "
				+ String.format("%.2f", taxes())
				+" ";
	}
	
	
}

	


