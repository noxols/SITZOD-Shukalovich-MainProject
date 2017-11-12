package two;

public class Lyceum extends Institution {

	@Override
	String name() {
		return "Лицей №45";
	}

	@Override
	String accreditation() {
		return "3 уровень";
	}

	@Override
	String city() {
		return "Винница";
	}

	@Override
	int budget() {
		return 100000;
	}
	
	

}
