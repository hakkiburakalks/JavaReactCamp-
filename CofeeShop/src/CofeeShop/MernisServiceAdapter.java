package CofeeShop;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{
	
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy= new KPSPublicSoapProxy();
		boolean result=false;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
										Long.parseLong(customer.getNationalityId()), 
										customer.getFirstName().toUpperCase(), 
										customer.getSurname().toUpperCase(), 
										customer.getDateOfBirth().getYear());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return result;
		
	}

	
	
}
