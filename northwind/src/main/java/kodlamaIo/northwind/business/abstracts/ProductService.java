package kodlamaIo.northwind.business.abstracts;

import java.util.List;

import kodlamaIo.northwind.core.utilities.results.DataResult;
import kodlamaIo.northwind.core.utilities.results.Result;
import kodlamaIo.northwind.entities.concretes.Product;

public interface ProductService {
DataResult<List<Product>> getAll();

Result add(Product product);



} 
