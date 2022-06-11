package BuilderPattern;

import BuilderPattern.builder.ExpensiveHomeBuilder;
import BuilderPattern.builder.ModerateHomeBuilder;
import BuilderPattern.director.EngineeringCompany;
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
