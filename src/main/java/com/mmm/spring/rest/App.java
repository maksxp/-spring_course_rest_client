package com.mmm.spring.rest;

import com.mmm.spring.rest.configuration.MyConfig;
import com.mmm.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
//        List <Employee> allEmployees = communication.getAllEmployees();
//
//        System.out.println(allEmployees);
//        System.out.println("____________________________________________________________");
//
//        Employee employee = communication.getEmployee(12);
//        System.out.println(employee);

//        Employee emp = new Employee("Sveta", "Sokolova", "IT", 1200);
//        emp.setId(18);
//        communication.saveEmployee(emp);

        communication.deleteEmployee(18);
    }
}
