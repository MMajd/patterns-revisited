package builderpattern;

import builderpattern.builder.ExpensiveHomeBuilder;
import builderpattern.builder.ModerateHomeBuilder;
import builderpattern.director.EngineeringCompany;
import driver.PatternDriver;

public class BuilderDriver implements PatternDriver {

    @Override
    public void run() {
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
