import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CafeNeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import java.time.LocalDate;

public class Main {
    public static void  main(String[]args) throws Exception{
        BaseCustomerManager customerManagerStar = new StarbucksCustomerManager(new MernisServiceAdapter());
        BaseCustomerManager customerManagerNero = new CafeNeroCustomerManager();
        //Customer information is an excerpt from a demo ID card.
        Customer customer1 = new Customer(1,"MERVESU","BAŞKAN",
                LocalDate.of(1987,9,30),"21574521838");
        customerManagerStar.save(customer1);
        customerManagerNero.save(customer1);
    }
}
