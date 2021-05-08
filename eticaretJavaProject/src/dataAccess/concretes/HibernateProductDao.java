package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.IProductDao;
import eticaretJavaProject.entities.concretes.Product;

public class HibernateProductDao implements IProductDao{
	
	List<Product> products=new ArrayList();

	@Override
	public void addProduct(Product product) {
		System.out.println("hibernate eklendi: "+ product.getFirstName());
		products.add(product);
	}

	@Override
	public void remove(Product product) {
		System.out.println("hibernateden silindi: "+ product.getFirstName());
		products.remove(product);
	}

	@Override
	public void update(Product product) {
		System.out.println("hibernatede güncellendi: " + product.getFirstName());
		((IProductDao) products).update(product);
	}

	@Override
	public Product getId(Product product) {
		
		return null;
	}

	@Override
	public List<Product> getAll() {
		
		return null;
	}

	@Override
	public boolean checkUserAuth(Product product) {
boolean result=false;
		
		for (Product i : products) {
			if(i.getEmail()==product.getEmail() && i.getPassword()==product.getPassword()) {
				result=true;
			}
		}
		
		return result;
	}

	@Override
	public boolean checkMail(Product product) {
		boolean result=true;
		for (Product i : products) {
			System.out.println(products);
			if(i.getEmail()==product.getEmail()) {
				result=false;
			}
		}
		return result;
	}

}
