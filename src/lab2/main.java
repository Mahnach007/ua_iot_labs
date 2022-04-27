package lab2;
import java.util.ArrayList;
import java.util.Collections;


public class main extends CallCenterEquipment{
	
	

	public main(int price, String type, String mark) {
		super(price, type, mark);
	}

	public static void main (String[] agrs) throws Exception  {
	     
	     Computer computer = new Computer(16, "dick", "Sumsung", "slut", "Rtx 3090");
	     Phone phone = new Phone(13, "Iphone", "Xiaomi", 13, "Rtx 3090");
	     Monitor monitor = new Monitor(15, "DX Racer", "Apple", 27.7, "");
	     
	     System.out.println(computer);
	     System.out.println(phone);
	     System.out.println(monitor);

	  }

	
}
