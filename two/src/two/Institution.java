package two;

public abstract class Institution {
	abstract String name();
	abstract String accreditation();
	abstract String city();
	abstract int budget();
	
	void info(){
		System.out.println(
				"\n ��������: "+name()+
				"\n �������: "+accreditation()+
				"\n �����: "+city()+
				"\n ������: "+budget());
	}
	
}
