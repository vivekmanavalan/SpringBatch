package com.batch.demo.config;

import com.batch.demo.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer item) throws Exception {
        //applying rules to the import from CSV
        /*if(item.getCountry().equals("United States")){
            return item;
        } else {
            return null;
        }*/
        return null;
    }
}
