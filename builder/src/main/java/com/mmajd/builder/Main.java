package com.mmajd.builder;

import com.mmajd.builder.builder.*;
import com.mmajd.builder.director.*;

public class Main {
    public static void main(String[] args) {
        /** could add setter for homebuilder */
        EngineeringCompany company = new EngineeringCompany(new ModerateHomeBuilder());

        System.out.println("Building a moderate home");
        company.build();
        System.out.println(company.getHome().toString());
        System.out.println();

        company = new EngineeringCompany(new ExpensiveHomeBuilder());

        System.out.println("Building an expensive home");
        company.build();
        System.out.println(company.getHome().toString());
        System.out.println();
    }
}