import business.abstracts.IProductService;
/*import business.concretes.ProductManager;
import core.concretes.EmailManager;
import core.concretes.ValidatorManager;
import dataAccess.concretes.HibernateProductDao;*/
import eticaretJavaProject.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		/*
		 * Product product1=new Product(1,"Begüm", "Ünal", "bgm.unl00@gamil.com",
		 * "begum123"); IProductService userService=new ProductManager(new
		 * EmailManager(new ValidatorManager(),new HibernateProductDao()),new
		 * ValidatorManager(),new HibernateProductDao());
		 * userService.register(product1);
		 */

		IProductService productService = null;
		Product product2=new Product();
		product2.setEmail("bgm.unl00@gmail.com");
		product2.setPassword("begum123");
		productService.login(product2);

	}

}
