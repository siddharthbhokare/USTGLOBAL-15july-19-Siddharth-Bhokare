/*
 * package com.ustg.essPortal;
 * 
 * import java.util.ArrayList;
 * 
 * import javax.persistence.EntityManager; import
 * javax.persistence.EntityManagerFactory; import
 * javax.persistence.EntityTransaction; import javax.persistence.Persistence;
 * 
 * import com.ustg.essPortal.dto.EmployeeInfo; import
 * com.ustg.essPortal.dto.LeaveInfo;
 * 
 * public class DataTable {
 * 
 * public static void main(String[] args) {
 * 
 * EntityManagerFactory entityManagerFactory = null; EntityManager entityManager
 * = null; EntityTransaction entityTransaction = null;
 * 
 * LeaveInfo lInfo = new LeaveInfo(); lInfo.setEmployee_ID(1);
 * lInfo.setLeave_Date("25/09/2019"); lInfo.setLeave_Status("pending");
 * 
 * LeaveInfo lInfo1 = new LeaveInfo(); lInfo1.setEmployee_ID(2);
 * lInfo1.setLeave_Date("29/09/2019"); lInfo1.setLeave_Status("Appored");
 * 
 * LeaveInfo lInfo2 = new LeaveInfo(); lInfo2.setEmployee_ID(1);
 * lInfo2.setLeave_Date("24/09/2019"); lInfo2.setLeave_Status("Rejected");
 * 
 * ArrayList<LeaveInfo> leave = new ArrayList<LeaveInfo>(); leave.add(lInfo);
 * leave.add(lInfo1); leave.add(lInfo2);
 * 
 * EmployeeInfo emInfo = new EmployeeInfo();
 * 
 * emInfo.setEmployee_ID(1); emInfo.setEmployee_Name("Simran");
 * emInfo.setEmployee_Type("Employee"); emInfo.setEmail("sim23goy@gmail.com");
 * emInfo.setPassword("simu"); emInfo.setLI(leave);
 * 
 * EmployeeInfo emInfo1 = new EmployeeInfo(); emInfo1.setEmployee_ID(2);
 * emInfo1.setEmployee_Name("Sukanya"); emInfo1.setEmployee_Type("Employee");
 * emInfo1.setEmail("suku2hu@gmail.com"); emInfo1.setPassword("suk12");
 * emInfo1.setLI(leave);
 * 
 * EmployeeInfo emInfo3 = new EmployeeInfo(); emInfo3.setEmployee_ID(3);
 * emInfo3.setEmployee_Name("Luqhman"); emInfo3.setEmployee_Type("Manager");
 * emInfo3.setEmail("luqh3@gmail.com"); emInfo3.setPassword("luq56");
 * emInfo3.setLI(leave);
 * 
 * ArrayList<EmployeeInfo> emp = new ArrayList<EmployeeInfo>(); emp.add(emInfo);
 * emp.add(emInfo1); emp.add(emInfo3);
 * 
 * try { entityManagerFactory =
 * Persistence.createEntityManagerFactory("MyPersistence"); entityManager =
 * entityManagerFactory.createEntityManager(); entityTransaction =
 * entityManager.getTransaction(); entityTransaction.begin();
 * //entityManager.persist(emp);
 * 
 * entityManager.persist(emInfo); entityManager.persist(emInfo1);
 * entityManager.persist(emInfo3); entityManager.persist(lInfo);
 * entityManager.persist(lInfo1); entityManager.persist(lInfo2);
 * 
 * entityTransaction.commit(); } catch (Exception e) {
 * entityTransaction.rollback(); e.printStackTrace(); } finally {
 * entityManager.close(); }
 * 
 * }
 * 
 * }
 */