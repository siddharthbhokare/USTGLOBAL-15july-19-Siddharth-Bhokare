package com.dev.finalproject.project;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dev.project.dto.Flipkart;


public class App 
{
    public static void main( String[] args )
    {
       
     Scanner sc = new Scanner(System.in);
     System.out.println("press 1: show all ,press 2 : buy product");
     int i = Integer.parseInt(sc.nextLine());
		switch (i) {
		case 1 :{
			System.out.println("1 is pressed");
			EntityManager entitymanager= null;
			EntityTransaction transaction=null;
			
			try {
				Flipkart f1 = new Flipkart();
//			     
				EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("TestPersistence");
				entitymanager = entitymanagerfactory.createEntityManager();
				transaction = entitymanager.getTransaction();
				
				String jpql = "from  Flipkart";
					Query query =entitymanager.createQuery(jpql);
					List<Flipkart> resultList= query.getResultList();
					for (Flipkart flipkart : resultList) {
						System.out.println(flipkart.getProduct_ID());
						System.out.println(flipkart.getProduct_Name());
						System.out.println(flipkart.getProduct_cost());
						System.out.println(flipkart.getProduct_color());
						System.out.println(flipkart.getDescription());
						System.out.println("************************************************");
					}
					

				 } catch (Exception e) {
				transaction.rollback();
				e.printStackTrace();
			}
		}break;
		
		
		 
			
		case 2 :{
			System.out.println("2 is pressed");
			System.out.println("buy product");
			
			
			
			    System.out.println("enter the card number");
				Pattern pat = Pattern.compile("\\d{16}"); 
				Matcher mat = pat.matcher(sc.next());
				boolean b = mat.matches();
				System.out.println(b);
				System.out.println("******************************************");
				
				
				System.out.println("enter the cvv number");
				Pattern pat1 = Pattern.compile("d{3}"); 
				Matcher mat1 = pat1.matcher(sc.next());
				boolean c = mat1.matches();
				System.out.println(c);
				System.out.println("********************************************");
				
		}break;
		default :{
			System.out.println("invalid number");
		}
		
				
				System.out.println("enter the address for delievery");
				sc.nextLine();
				sc.nextLine();
				
				System.out.println("order placed successfully");
			
			
			
		
		}
		
       
    }
}
