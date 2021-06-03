package CofeeShop;


import java.rmi.RemoteException;
import java.time.LocalDate;

public class Main {
 public static void main(String[] args) throws RemoteException {

     BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
     Customer burak = new Customer(1,"HAKKI BURAK","ALKIÞ",LocalDate.of(2001, 10, 27),"42283088184");
     customerManager.save(burak);
     
}
}	