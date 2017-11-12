package one;

public class Main {

	public static void main(String[] args) {
		Instrument domra = new Instrument("Домра","Струнные","Деревянные струнные", 8000, 2002);
		Instrument suzafon = new Instrument("Сузафон","Духовые","Медные духовые", 12500, 2008);
		Instrument royals = new Instrument("Рояль","Клавишные","Струнные клавишные", 60000, 2015);
		Instrument baraban = new Instrument("Барабан","Ударные","С мебраной",7500,2010);
		Instrument fleita = new Instrument("Флейта","пвапва","Медные",0,2010);
	
		domra.PriceInfo();
		suzafon.PriceInfo();
		royals.PriceInfo();
		baraban.PriceInfo();
		fleita.PriceInfo();
		
		domra.TypeInfo();
		suzafon.TypeInfo();
		royals.TypeInfo();
		baraban.TypeInfo();
		fleita.TypeInfo();
		
        System.out.println(domra.toString());
        System.out.println(suzafon.toString());
	}

}
