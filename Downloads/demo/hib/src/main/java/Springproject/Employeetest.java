package Springproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employeetest {
    public static void main(String[] args) {
        //ApplicationContext context =new ClassPathXmlApplicationContext("Employee.xml");
        //Employee employee =(Employee) context.getBean("obj");
     //   System.out.println(employee);
        // employee.display
        // using confrigation
        ApplicationContext context =new AnnotationConfigApplicationContext(Empconfig.class);
        Employee employee =(Employee) context.getBean(Employee.class);
        employee.setId(5);
        employee.setName("raj");

        System.out.println(employee);

    }
}
