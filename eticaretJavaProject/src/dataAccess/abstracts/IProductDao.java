package dataAccess.abstracts;

import java.util.List;

import eticaretJavaProject.entities.concretes.Product;

public interface IProductDao {

	void addProduct(Product product);
	void remove(Product product);
	void update(Product product);
	Product getId(Product product);
	List<Product> getAll();
	
    boolean checkUserAuth(Product product);
		
	boolean checkMail(Product product);
}
