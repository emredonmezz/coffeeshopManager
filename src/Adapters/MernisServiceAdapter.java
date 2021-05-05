package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import MernisService.IODKPSPublicSoap;

import java.util.Locale;

public class MernisServiceAdapter implements ICustomerCheckService{
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        IODKPSPublicSoap publicSoap = new IODKPSPublicSoap();
        try {
            return publicSoap.TCKimlikNoDogrula(Long.valueOf(customer.nationalityId),
                    customer.firstName.toUpperCase(Locale.ROOT),customer.lastName.toUpperCase(Locale.ROOT),
                    customer.dateOfBirth.getYear());
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
