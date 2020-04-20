package application;

import model.DAO.DAOFactory;
import model.DAO.SellerDAO;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDAO sellerdao = DAOFactory.createSellerDAO();
		
		Seller seller = sellerdao.findById(3);
				
		System.out.println(seller);
	}

}
