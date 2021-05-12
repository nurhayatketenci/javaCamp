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
		System.out.println("Ad�n�z� girin");
		String name=scan.next();
		System.out.println("Soyad�n�z� girin");
		String surname=scan.next();
		System.out.println("Do�um y�l�n�z� girin");
		int date=scan.nextInt();
		System.out.println("Tc numaran�z� giriniz");
		String nationality=scan.next();
		
      BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
      customerManager.Save(new Customer(1,name,surname,date,nationality));
	}

}
