package com.edtech;
	import java.util.*;

	class EmployeeMain {
	    public static void main(String[] args) {
	       try (Scanner sc = new Scanner(System.in)) {
			Employee employee = new Employee();

	        System.out.println("Enter the name:");
	        String name = sc.nextLine();
	        employee.setName(name);

	        System.out.println("Enter Address:");
	        String address = sc.nextLine();
	        employee.setAddress(address);

	        System.out.println("Enter Mobile:");
	        String mobile = sc.nextLine();
	        employee.setMobile(mobile);

	        System.out.println("\nEmployee Details");
	        System.out.println("Name: " + employee.getName());
	        System.out.println("Address: " + employee.getAddress());
	        System.out.println("Mobile: " + employee.getMobile());
		}
	    }
	}


