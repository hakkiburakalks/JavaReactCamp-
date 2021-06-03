package mainpackage.Adapter;

import java.rmi.RemoteException;

import mainpackage.abstracts.UserCheckService;
import mainpackage.entity.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {



	@Override
	public boolean checkIfRealUser(User user) {
KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		
		boolean result = false;
		try{
			result = soapClient.TCKimlikNoDogrula(
					Long.parseLong(user.getUserNationalId()), 
					user.getUserName(), 
					user.getUserSurname(), 
					user.getDateOfBirth());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
}
