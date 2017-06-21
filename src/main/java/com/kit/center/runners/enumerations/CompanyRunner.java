package com.kit.center.runners.enumerations;


import com.kit.center.app.classwork.enumerations.Company;

public class CompanyRunner {
    public static void main(String[] args) {
        for (Company company : Company.values()) {
            System.out.println(company.getFullName());
// company.setValue(10);
            System.out.println(company.getValue());
        }
        System.out.println(Company.EBAY.getValue());
    }
}