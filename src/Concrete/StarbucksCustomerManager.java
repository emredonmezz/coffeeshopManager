package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Adapters.MernisServiceAdapter;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
    ICustomerCheckService customerCheckService;

    public StarbucksCustomerManager(MernisServiceAdapter customerCheckService){
        this.customerCheckService = customerCheckService;
    }

    public void save(Customer customer) throws Exception{
        if (this.customerCheckService.checkIfRealPerson(customer)) {
            super.save(customer);
        } else {
            System.out.println("Starbucks refused customer registration. Reason is:");
            System.out.println(customer.firstName + " "+ customer.lastName +" is not a valid user.");
        }

    }
}