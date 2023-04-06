package factoryMethodPattern;

public class GetPlanFactory {

	public Plan getPlan(String planType) {
		if (planType == null)
			return null;
		
		else if (planType.equalsIgnoreCase("domestic"))
			return new DomesticPlan();
		
		else if (planType.equalsIgnoreCase("commercial"))
			return new CommercialPlan();
		
		else if (planType.equalsIgnoreCase("Institutional"))
			return new InstitutionalPlan();
					
		return null;
	}

}
