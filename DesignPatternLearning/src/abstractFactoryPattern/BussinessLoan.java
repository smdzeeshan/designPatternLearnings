package abstractFactoryPattern;

public class BussinessLoan extends Loan {

	@Override
	void getInterestRate(double r) {
		rate = r;
	}

}
