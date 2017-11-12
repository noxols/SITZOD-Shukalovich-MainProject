package two;

public class Gymnasium extends Institution {

	@Override
	String name() {
		String name = "Гимназия №3";
		return name;
	}

	@Override
	String accreditation() {
		String accred = "3 уровень";
		return accred;
		
	}

	@Override
	String city() {
		String city = "Киев";
		return city;
	}

	@Override
	int budget() {
		int budget = 200000;
		return budget;
	}
	
}
