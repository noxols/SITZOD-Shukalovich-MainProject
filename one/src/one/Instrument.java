package one;

public class Instrument {
	private double price;
	int year;
	private String name, type, subtype;
	public Instrument(String name, String type, String subtype, double price, int year) {
		this.name=name;
		this.type = type;
		this.subtype = subtype;
		this.price = price;
		this.year = year;
	}
	
public void PriceInfo(){
        if (price>15000){
            System.out.println("Ценовая категория выше среднего: " + price + "\n");
        }
        else if(price<15000 && price>0){
            System.out.println("Ценовая категория ниже среднего: "  + price + "\n");
        }
        else if(price<=0){
                System.out.println("Такая цена невозможна: "+ price + "\n");
        }
        else {
            System.out.println("Такой цены: " + price + " не найдено. \n");
        }
	}



	public void TypeInfo(){
	if (type.equals("Струнные")){
		System.out.println(type +" - это группа музыкальных инструментов, в которых источником звука (вибратором) является колебания струн.\n");
	}
	else 
		if (type.equals("Духовые")){
				System.out.println(type +" -  музыкальные инструменты,  издающие музыкальные звуки в результате колебаний заключённого в них столба воздуха.\n");
	}
	else 
		if (type.equals("Клавишные")){
				System.out.println(type +" - группа инструментов, извлечение звука в которых осуществляется при помощи системы рычагов и управляется при помощи клавиш.\n");
		}
	else 
		if (type.equals("Ударные")){
				System.out.println(type + " —  группа музыкальных инструментов, звук из которых извлекается ударом или тряской по звучащему телу \n");
		}
	else {
		System.out.println("Группа: " + type + " не найдена. \n");
	        }
	    }
	
	@Override
    public String toString() {
        return "Название инструмента: " + name + 
        		"\n Тип: " + type  + 
        		"\n Подтип: " + subtype +
                "\n Цена: " + price + 
                "\n Год: " + year + "\n";
	}
	
}


