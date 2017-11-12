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
            System.out.println("������� ��������� ���� ��������: " + price + "\n");
        }
        else if(price<15000 && price>0){
            System.out.println("������� ��������� ���� ��������: "  + price + "\n");
        }
        else if(price<=0){
                System.out.println("����� ���� ����������: "+ price + "\n");
        }
        else {
            System.out.println("����� ����: " + price + " �� �������. \n");
        }
	}



	public void TypeInfo(){
	if (type.equals("��������")){
		System.out.println(type +" - ��� ������ ����������� ������������, � ������� ���������� ����� (����������) �������� ��������� �����.\n");
	}
	else 
		if (type.equals("�������")){
				System.out.println(type +" -  ����������� �����������,  �������� ����������� ����� � ���������� ��������� ������������ � ��� ������ �������.\n");
	}
	else 
		if (type.equals("���������")){
				System.out.println(type +" - ������ ������������, ���������� ����� � ������� �������������� ��� ������ ������� ������� � ����������� ��� ������ ������.\n");
		}
	else 
		if (type.equals("�������")){
				System.out.println(type + " �  ������ ����������� ������������, ���� �� ������� ����������� ������ ��� ������� �� ��������� ���� \n");
		}
	else {
		System.out.println("������: " + type + " �� �������. \n");
	        }
	    }
	
	@Override
    public String toString() {
        return "�������� �����������: " + name + 
        		"\n ���: " + type  + 
        		"\n ������: " + subtype +
                "\n ����: " + price + 
                "\n ���: " + year + "\n";
	}
	
}


