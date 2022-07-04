package Entities;

public class companyPayer extends payer {
	
	private Integer employeeNumber;

	public companyPayer() {
		super();
	}

	public companyPayer(String name, Double annualIncome, Integer employeeNumber) {
		super(name, annualIncome);
		this.employeeNumber = employeeNumber;
	}

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public double taxes() {
		
		if (employeeNumber < 10) {
			
			return getAnnualIncome() * 0.16;
				
		}
			else {
				
				return getAnnualIncome() * 0.14;
						
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
