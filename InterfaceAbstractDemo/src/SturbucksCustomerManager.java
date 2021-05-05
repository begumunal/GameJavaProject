
public class SturbucksCustomerManager extends BaseCustomerManager {

	ICustomerCheckService customerCheckService ;
	
	public void StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else{
			System.out.println("Gerçek kimlik deðil");
		}
	}
}
