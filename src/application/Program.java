package application;

import java.util.List;

import model.DAO.DAOFactory;
import model.DAO.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDAO sellerdao = DAOFactory.createSellerDAO();
		
		System.out.println("=== TESTE 1: Seller find by id ===");
		
		Seller seller = sellerdao.findById(3);
				
		System.out.println(seller);
		
		System.out.println("=== TESTE 2: Seller find by department ===");
		Department dept = new Department(2, null);
		List <Seller> list = sellerdao.findByDepartment(dept);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
	}

}
