package Project;

import java.util.Scanner;

public class Calculat_compensation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.print("Input name: ");
	      String name = input.nextLine();
	      System.out.print("Input Salary: ");
	     double salary = input.nextDouble();
	      System.out.print("Input Monthly sales: ");
	      double sales = input.nextDouble();
	      if(sales>=50001){
	     	 double com =(salary+(sales *0.03));
	    	  System.out.println("Name Employee is "+name+"   compensation is : " + com); 
	      }
	      else if (sales>=25001){
	     	 double com =(salary+(sales *0.02));
	    	  System.out.println("Name Employee is "+name+"   compensation is : " + com); 
	          }
	      else{
	     	 double com =(salary+(sales *0.01));
	 
	    	  System.out.println("Name Employee is "+name+"   compensation is : " + com); 
	          }
	      }
	}

