package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Dogancan", "Kinik"));
        employees.add(new Employee(1, "Dogancan", "Kinik"));
        employees.add(new Employee(2, "Seyyit Battal", "Arvas"));
        employees.add(new Employee(2, "Seyyit Battal", "Arvas"));
        employees.add(new Employee(3, "Anil", "Ensari"));
        employees.add(new Employee(3, "Anil", "Ensari"));
        employees.add(new Employee(4, "Burak", "Cevizli"));
        employees.add(null);

        Map<Integer, Employee> map = Main.findUniques(employees);
        System.out.println(map);
    }
    public static List<Employee> findDuplicates(List<Employee> liste){
        List<Employee> newEmployees = new LinkedList<>();
        for(Employee employee : liste){
            if(Collections.frequency(liste,employee) != 1 && !newEmployees.contains(employee)){
                newEmployees.add(employee);
            }
        }
        return newEmployees;
    }

    public static Map<Integer, Employee> findUniques(List<Employee> liste){
        Map<Integer,Employee> newEmployees = new HashMap<>();
        for(Employee employee : liste){
            if(Collections.frequency(liste,employee) == 1 && employee != null){
                newEmployees.put(employee.getId(), employee);
            } else if(Collections.frequency(liste,employee) != 1 && !newEmployees.containsKey(employee.getId())){
                newEmployees.put(employee.getId(),employee);
            }
        }
        return newEmployees;
    }

    public static List<Employee> removeDuplicates(List<Employee> liste){
        List<Employee> employeeList = new LinkedList<>();
        for(Employee employee: liste){
            if(Collections.frequency(liste,employee) == 1 && employee != null){
                employeeList.add(employee);
            }
        }
        return employeeList;
    }
}