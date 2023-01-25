package StructuralDP.CompositeDP;

import java.util.Arrays;

public class CompositeRunner {
    public static void main(String[] args) {

        CompositeRunner compositeRunner = new CompositeRunner();
        compositeRunner.compositeDemo();

    }

    public void compositeDemo(){
        //esitligin sol tarafi herzaman interface yada abstrack class olmali

        Department financeDepartment = new Finance();
        Department saleaDepartment = new Sales();
        Department argeDepartment = new Arge();

        Department regionalDepartment= new RegionalDepartment(Arrays.asList( financeDepartment, saleaDepartment, argeDepartment));

        System.out.println(regionalDepartment.getName());
        System.out.println("**************");
        System.out.println(regionalDepartment.getEmployees());


    }

}
