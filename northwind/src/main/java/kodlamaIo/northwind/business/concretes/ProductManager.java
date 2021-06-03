package kodlamaIo.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaIo.northwind.business.abstracts.ProductService;
import kodlamaIo.northwind.core.utilities.results.DataResult;
import kodlamaIo.northwind.core.utilities.results.Result;
import kodlamaIo.northwind.core.utilities.results.SuccessDataResult;
import kodlamaIo.northwind.core.utilities.results.SuccessResult;
import kodlamaIo.northwind.dataAccess.abstracts.ProductDao;
import kodlamaIo.northwind.entities.concretes.Product;


@Service
public class ProductManager implements ProductService {
	private ProductDao productdao;
    @Autowired
	public ProductManager(ProductDao productdao) {
		super();
		this.productdao = productdao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		
		return new SuccessDataResult<List<Product>>(this.productdao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(Product product) {
		this.productdao.save(product);
		return new SuccessResult("Ürün Eklendi");	
		
		
	}

}
