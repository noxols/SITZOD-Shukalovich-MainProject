package two;

public class University extends Institution{

	@Override
	String name() {
		return "ДонНУ";
	}

	@Override
	String accreditation() {
		return "4 уровень";
	}

	@Override
	String city() {
		return "Донецк";
	}

	@Override
	int budget() {
		return 360000000;
	}

}
