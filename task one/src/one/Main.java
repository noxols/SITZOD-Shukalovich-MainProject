package one;

public class Main {

	public static void main(String[] args) {
		Instrument domra = new Instrument("Äîìðà","Ñòðóííûå","Äåðåâÿííûå ñòðóííûå", 8000, 2002);
		Instrument suzafon = new Instrument("Ñóçàôîí","Äóõîâûå","Ìåäíûå äóõîâûå", 12500, 2008);
		Instrument royals = new Instrument("Ðîÿëü","Êëàâèøíûå","Ñòðóííûå êëàâèøíûå", 60000, 2015);
		Instrument baraban = new Instrument("Áàðàáàí","Óäàðíûå","Ñ ìåáðàíîé",7500,2010);
		Instrument fleita = new Instrument("Ôëåéòà","ïâàïâà","Ìåäíûå",0,2010);
	
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
