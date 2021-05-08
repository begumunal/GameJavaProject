package business.abstracts;

import eticaretJavaProject.entities.concretes.Product;

public interface IProductService {

	void register(Product product);
	void login(Product product);
}
