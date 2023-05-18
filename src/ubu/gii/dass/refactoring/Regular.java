package ubu.gii.dass.refactoring;

public class Regular extends MovieType {

	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return MovieType.REGULAR;
	}

	@Override
	public double getCharge(Rental rental) {
		// TODO Auto-generated method stub
		double amount = 2;
		if (rental.getDaysRented() > 2)
			amount += (rental.getDaysRented() - 2) * 1.5;
		return amount;
	}

}
