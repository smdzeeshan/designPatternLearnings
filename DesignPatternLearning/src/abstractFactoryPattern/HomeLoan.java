package abstractFactoryPattern;

public class HomeLoan extends Loan {

	@Override
	void getInterestRate(double r) {
		 rate=r;
	}

}
