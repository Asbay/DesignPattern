package StructuralDP.CompositeDP;

import java.util.List;
import java.util.stream.Collectors;

public class RegionalDepartment extends Department{



    List<Department> childDepartments;

    public RegionalDepartment(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    @Override
    String getName() {
        return childDepartments.stream().  //finance objesi ve sales objesi
                map(Department::getName).   //"Finance " ve " Sales"
                collect(Collectors.joining(" , ")); // CIKTI bu sekilde olacak :: "Finance , Sales"
    }

    @Override
    List<String> getEmployees() {
        return childDepartments.stream().
                flatMap(d -> d.getEmployees().stream()).collect(Collectors.toList());
    }
}
