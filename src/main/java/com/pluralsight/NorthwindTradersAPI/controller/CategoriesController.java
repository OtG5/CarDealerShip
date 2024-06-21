package com.pluralsight.NorthwindTradersAPI.controller;

@RestController
public class CategoriesController {
    // respond to http://localhost:8080/customers
    @RequestMapping(path="/customers", method=RequestMethod.GET)
    public List<Category> getCustomers() {
        List<Category> customers = new ArrayList<>();
        customers.add(new (...));
        customers.add(new Category(...));
        customers.add(new Category(...));
        return customers;
    }
}
