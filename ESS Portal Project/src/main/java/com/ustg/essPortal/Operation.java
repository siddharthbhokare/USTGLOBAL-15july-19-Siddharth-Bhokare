package com.ustg.essPortal;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustg.essPortal.dto.EmployeeInfo;
import com.ustg.essPortal.dto.LeaveInfo;

public class Operation {
	static Scanner sc = new Scanner(System.in);

	static int i;
	static String x;

	public static void main(String[] args) {

		System.out.println("Press 1 to register employee");
		System.out.println("Press 2 to login");
		i = sc.nextInt();

		switch (i) {

		case 1:

			EntityManagerFactory entityManagerFactory = null;
			EntityManager entityManager = null;
			EntityTransaction entityTransaction = null;

			entityManagerFactory = Persistence.createEntityManagerFactory("MyPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			try {
				EmployeeInfo em = new EmployeeInfo();
				System.out.println("enter the email = ");
				em.setEmail(sc.nextLine());
				System.out.println("enter the password = ");
				em.setPassword(sc.nextLine());
				System.out.println("enter the eId = ");
				em.setEmployee_ID(sc.nextInt());
				System.out.println("enter the Type = ");
				em.setEmployee_Type(sc.nextLine());
				System.out.println("enter the name =");
				em.setEmployee_Name(sc.nextLine());
				entityTransaction.commit();
			} catch (Exception e) {
				entityTransaction.rollback();
				e.printStackTrace();
			}finally {
				entityManager.close();
			}

			break;

		case 2:

			EntityManagerFactory entityManagerFactory1 = null;
			EntityManager entityManager1 = null;
			EntityTransaction entityTransaction1 = null;

			entityManagerFactory1 = Persistence.createEntityManagerFactory("MyPersistence");
			entityManager1 = entityManagerFactory1.createEntityManager();
			entityTransaction1 = entityManager1.getTransaction();
			entityTransaction1.begin();

			
			EmployeeInfo em1 = new EmployeeInfo();
			int id=sc.nextInt();
			System.out.println("enter the id  = ");
			em1.setEmployee_ID(id);
			System.out.println("enter the password = ");
			em1.setPassword(sc.nextLine());
			EmployeeInfo eil = entityManager1.find(EmployeeInfo.class, id);
			
			entityTransaction1.commit();

			String Employee_Type = null;
			System.out.println("enter the type = ");
			em1.setEmployee_Type(sc.nextLine());

			if (Employee_Type == "Manager") {

				System.out.println("press 1 for show thw leave request=");
				System.out.println("press 2 for see Approve/Reject request=");
				int y = sc.nextInt();

				switch (y) {

				case 1:
					String jpql = "from LeaveInfo";
					Query query = entityManager1.createQuery(jpql);
					List<LeaveInfo> info = query.getResultList();

					for (LeaveInfo leaveinfo : info) {
						System.out.println(leaveinfo);
					}
					break;

				case 2:
					String jpql1 = "from LeaveInfo";
					Query query1 = entityManager1.createQuery(jpql1);
					List<LeaveInfo> info1 = query1.getResultList();

					for (LeaveInfo leaveinfo1 : info1) {
						System.out.println(leaveinfo1);
					}
				}

				if (Employee_Type == "Employee") {

					System.out.println("Press 1 to show all the status of leave requests = ");
					System.out.println("Press 2 to show request for a leave = ");

					int z = sc.nextInt();

					switch (z) {

					case 1:
						
						System.out.println("enter the employee id = ");
						int val = sc.nextInt();
						
				String jpql2 = "select from LeaveInfo where Employee_ID in(1,2) ";
				
				Query query2 = entityManager1.createQuery(jpql2);
				List<LeaveInfo> info2 = query2.getResultList();
				
				for(LeaveInfo leaveinfo2 : info2) {
					System.out.println(leaveinfo2);
				}
				
				break;
				
					case 2:
						
						System.out.println("enter request for the leave = ");
						String request = sc.nextLine();
						
				
					
					}
				}
			}

			break;

		}

	}

}
