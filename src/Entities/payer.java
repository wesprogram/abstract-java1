package Entities;

public abstract class payer {

	private String name;
	private Double annualIncome;
	
	
	public payer() {
	}

	public payer(String name, Double annualIncome) {
		
		this.name = name;
		this.annualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	public abstract double taxes ();

	public String labels () {
		return getName()
				+ ": $ "
				+ taxes()
				+" ";
	}
}