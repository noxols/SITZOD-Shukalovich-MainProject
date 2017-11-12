package two;

public class School extends Institution  {

	@Override
	String name() {
		return "Школа №35";
	}

	@Override
	String accreditation() {
		return "2 уровень";
	}

	@Override
	String city() {
		return "Днепропетровск";
	}

	@Override
	int budget() {
		return 55000;
	}
	

}
