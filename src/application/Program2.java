package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createdDepartmentDao();
		
		System.out.println("=== TESTE 1 - Department FindById ===");
		Department dep = depDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n=== TESTE 2 - Department FindAll ===");
		List<Department>list = depDao.findAll();
		for(Department d : list)
			System.out.println(d);
		
		System.out.println("\n=== TESTE 3 - Department Insert ===");
		/*Department newDep = new Department(null, "Music");
		depDao.insert(newDep);
		System.out.println("Inserted new id = "+ newDep.getId());
		*/
		
		System.out.println("=== TESTE 4 - Department Insert ===");
		dep = depDao.findById(1);		
		dep.setName("Food");
		depDao.update(dep);
		
		System.out.println("Update Completed");
		dep = depDao.findById(1);
		System.out.println(dep);
		
	}

}
