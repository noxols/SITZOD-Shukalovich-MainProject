package two;

public abstract class Institution {
	abstract String name();
	abstract String accreditation();
	abstract String city();
	abstract int budget();
	
	void info(){
		System.out.println(
				"\n Название: "+name()+
				"\n Уровень: "+accreditation()+
				"\n Город: "+city()+
				"\n Бюджет: "+budget());
	}
	
}
