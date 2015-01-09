package com.manifest.hibernatelab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
                new ClassPathXmlApplicationContext("application-context.xml");

         HibernateExample example = (HibernateExample) context.getBean("hibernateExample");
         
         example.addEmployers();
         example.addEmployees();
         example.moveEmployeesToNewDepartment();
    }
}
