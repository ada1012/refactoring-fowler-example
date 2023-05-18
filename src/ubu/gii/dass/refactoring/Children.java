package ubu.gii.dass.refactoring;

public class Children extends MovieType {

	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return MovieType.CHILDRENS;
	}

	@Override
	public double getCharge(Rental rental) {
		// TODO Auto-generated method stub
		double amount = 1.5;
		if (rental.getDaysRented() > 3)
			amount += (rental.getDaysRented() - 3) * 1.5;
		return amount;
	}

}
