package business.concretes;

import business.abstracts.IProductService;
import core.abstracts.IEmailService;
import core.abstracts.IValidatorService;
import dataAccess.abstracts.IProductDao;
import eticaretJavaProject.entities.concretes.Product;

public class ProductManager implements IProductService {
	
	private IEmailService emailService;
	private IValidatorService validatorService;
	private IProductDao productDao;
	
	
	public ProductManager(IEmailService emailService, IValidatorService validatorService, IProductDao productDao) {
		super();
		this.emailService = emailService;
		this.validatorService = validatorService;
		this.productDao = productDao;
	}

	@Override
	public void register(Product product) {
		
		if(!emailService.isValid(product)) {
			System.out.println("hesap oluþturulamadý");
		}else {
			validatorService.sendVerifyMail(product);
			
			if(validatorService.checkUserVerified(product)){
				System.out.println("email adresiniz doðrulandý");
				System.out.println("hesabýnýz oluþturuldu sayýn "+product.getFirstName()+" "+product.getLastName());
				productDao.addProduct(product);
			} else {
				System.out.println("email adresiniz doðrulanamadý. hesabýnýz oluþturulamadý");
			}
		}
		
		
	}

	@Override
	public void login(Product product) {
		if(productDao.checkUserAuth(product)==true) {
			System.out.println("hoþgeldiniz ");
		}else {
			System.out.println("hatalý email");
		}
		
	}

}
