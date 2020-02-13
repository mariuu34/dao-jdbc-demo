package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createdSellerDao();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== TESTE 1 : seller FindById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TESTE 2 : seller FindByDepartment ===");
		Department department = new Department(2, null);	
		List<Seller> list = sellerDao.findByDeparment(department);
		for(Seller obj : list)
			System.out.println(obj);
		
		System.out.println("\n=== TESTE 3 : seller FindAll ===");
		list = sellerDao.findAll();
		for(Seller obj : list)
			System.out.println(obj);
		
		/*System.out.println("\n=== TESTE 4 : seller Insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted new id = "+ newSeller.getId());
		*/
		System.out.println("\n=== TESTE 5 : seller Update ===");
		seller = sellerDao.findById(1);
		seller.setName("Bruce Wayne");		
		sellerDao.update(seller);
		seller.setName("Updatw Completed");
		
		System.out.println("\n=== TESTE 6 : seller Delete ===");
		System.out.println("Enter id for delete test :");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
	}

}
