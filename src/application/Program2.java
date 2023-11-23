package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();


        System.out.println("=== test 1: department findById ===");
        Department department = departmentDao.findById(3);
        System.out.println(department);
        System.out.println();

//
//        System.out.println("=== test 2: seller findAll ===");
//        list = sellerDao.findAll();
//        list.forEach(System.out::println);
//        System.out.println();

        /*
        System.out.println("=== test 3: department insert ===");
        Department newDepartment = new Department(null, "NewDepartment");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New is = " + newDepartment.getId());
        System.out.println();
         */

//        System.out.println("=== test 4: seller update ===");
//        seller = sellerDao.findById(1);
//        seller.setName("Martha Waine");
//        sellerDao.update(seller);
//        System.out.println("Update completed");
//        System.out.println();

//        System.out.println("=== test 5: seller delete ===");
//        System.out.println("Enter id for delete test: ");
//        int id = sc.nextInt();
//        sellerDao.deleteById(id);
//        System.out.println("Delete completed");

        sc.close();
    }
}
