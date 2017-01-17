package com.example.listener;
import javax.servlet.*;

public class MyServletContextAttributeListener implements ServletContextAttributeListener {

@Override
public void attributeAdded(ServletContextAttributeEvent event) {
	  System.out.println("\n###################################\n");
      System.out.println("attributeAdded method has been called in" + getClass().getName());
      // ServletContextAttributeEvent ofcourse you can call getName() and getValue() 
      // because you talking about attributes:
      System.out.println("Newly added attribute name = " + event.getName() + 
    		  ", value = " + event.getValue());
      System.out.println("\n###################################\n");
	
}
@Override
public void attributeRemoved(ServletContextAttributeEvent event) {
	 System.out.println("\n###################################\n");
     System.out.println("attributeRemoved method has been called in" + this.getClass().getName());
     System.out.println("Removed attribute name = " + event.getName() + 
    		 ", value = " + event.getValue());
     System.out.println("\n###################################\n");	
}
@Override
public void attributeReplaced(ServletContextAttributeEvent event) {
	   System.out.println("\n###################################\n");
       System.out.println("attributeReplaced method has been called in" + this.getClass().getName());
       System.out.println("Replaced attribute name = " + event.getName() + 
    		   ", value = " + event.getValue());
       System.out.println("\n###################################\n");
	
	}
}
