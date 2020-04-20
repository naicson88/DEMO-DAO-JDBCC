package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.DAO.DAOFactory;
import model.DAO.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		SellerDAO sellerdao = DAOFactory.createSellerDAO();
		
		System.out.println("=== TESTE 1: Seller find by id ===");
		
		Seller seller = sellerdao.findById(3);
				
		System.out.println(seller);
		
		System.out.println("\n=== TESTE 2: Seller find by department ===");
		Department dept = new Department(2, null);
		List <Seller> list = sellerdao.findByDepartment(dept);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TESTE 3: Seller find all ===");
		list = sellerdao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TESTE 4: Seller INSERT ===");
		
		Seller newseller = new Seller(null,"Arthur","greg@gmail.com.br", new Date(), 4000.50, dept);
		sellerdao.insert(newseller);
		System.out.println("Inserted! new id = " + newseller.getId());
		
		System.out.println("\n=== TESTE 5: Seller UPDATE ===");
		seller = sellerdao.findById(7);
		seller.setName("Martha");
		sellerdao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TESTE 6: Seller UPDATE ===");
		System.out.println("Digite um ID para ser deletado: ");
		int id = sc.nextInt();
		sellerdao.deleteById(id);
		System.out.println("Deleted!");
		
		sc.close();
		
		
	}

}
