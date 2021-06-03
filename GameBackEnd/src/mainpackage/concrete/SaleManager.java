package mainpackage.concrete;

import mainpackage.abstracts.SaleService;
import mainpackage.entity.Sale;

public class SaleManager implements SaleService {

	@Override
	public void add(Sale sale) {
		System.out.println(sale.getGameId()+" kodlu oyun satılmıştır");
	}

	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getGameId()+" kodlu oyun sepetten silinmiştir");
	}

	@Override
	public void update(Sale sale) {
	
		System.out.println(sale.getGameId()+" kodlu oyun güncellenmiştir");
	}
	
}
