package Concrete;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {
    public boolean checkIfRealPerson(Customer customer){
        return true;
    }
}
