package ubu.gii.dass.refactoring;

public class NewRelease extends MovieType {

	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return MovieType.NEW_RELEASE;
	}

	@Override
	public double getCharge(Rental rental) {
		// TODO Auto-generated method stub
		return rental.getDaysRented() * 3;
	}


}
