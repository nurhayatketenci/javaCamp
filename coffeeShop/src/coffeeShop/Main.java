package coffeeShop;

import java.util.Scanner;

import coffeeShop.abstracts.BaseCustomerManager;
import coffeeShop.adapters.MernisServiceAdapter;
import coffeeShop.concrete.NeroCustomerManager;
import coffeeShop.concrete.StarbucksCustomerManager;
import coffeeShop.entities.Customer;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Adýnýzý girin");
		String name=scan.next();
		System.out.println("Soyadýnýzý girin");
		String surname=scan.next();
		System.out.println("Doðum yýlýnýzý girin");
		int date=scan.nextInt();
		System.out.println("Tc numaranýzý giriniz");
		String nationality=scan.next();
		
      BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
      customerManager.Save(new Customer(1,name,surname,date,nationality));
	}

}
