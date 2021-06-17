package com.spring.rest;

import com.spring.rest.configuration.MyConfig;
import com.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication"
                , Communication.class);
       List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);

//        Employee employee = communication.getEmployee(5);
//        System.out.println(employee);

//        Employee emp = new Employee("Svetlana","Sokolova"
//            , "IT", 1200);
////        emp.setId(13);
//        communication.saveEmployee(emp);

//        communication.deleteEmployee(13);


    }
}
