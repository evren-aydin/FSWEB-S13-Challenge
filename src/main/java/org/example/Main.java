package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {

        executeTask();
    }
    public static void executeTask() {
        String[] developers = {"John", "Jane", "Alice", "Bob"};
        String[] planlar = {"basic", "standart", "premium"};
        // Healthplan objesi oluşturma
        Healthplan healthplan = new Healthplan(1, "John Doe", Plan.BASIC);
        System.out.println(healthplan.toString());

        // Company objesi oluşturma
        Company company = new Company(2,"Evren", 100000.151,developers);
        System.out.println(company.toString());

        // Employee objesi oluşturma

        Employee employee = new Employee(3,"Kemal", "email@email.com","12346", planlar);
        System.out.println(employee.toString());}
}