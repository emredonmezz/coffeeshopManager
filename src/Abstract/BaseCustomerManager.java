package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements ICustomerService{

    @Override
    public void save(Customer customer) throws Exception {
        System.out.println(customer.firstName + " " + customer.lastName + " saved to Database");
    }
}
