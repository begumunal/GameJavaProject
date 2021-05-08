package business.abstracts;

import eticaretJavaProject.entities.concretes.Product;

public interface IProductValidatorService {

	boolean validateUser(Product product);
}
