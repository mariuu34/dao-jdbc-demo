package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createdDepartmentDao();
		
		System.out.println("=== TESTE 1 - Department FindById");
		Department dep = depDao.findById(1);
		System.out.println(dep);
		
		System.out.println("=== TESTE 2 - Department FindById");
		dep = depDao.findById(1);
		System.out.println(dep);
		
		
	}

}
