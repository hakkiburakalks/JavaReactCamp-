package kodlamaIo.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import lombok.Data;

@Data
@Entity
@Table(name="products")
public class Product {
   
	public Product() {
    	
    }
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //bir artırma işlemi için
	@Column(name="product_id")
	private int id;

	//@Column(name="category_id")
	//private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name = "units_in_stock")
	private short unitsInStock;
    
	@Column(name="quantity_per_unit")
	private String quantityPerUnit; // Bu birim örnek olarak bir koli kolanın içinde kaç tane kola olduğunu söyleyebiliyor
	
	@ManyToOne()
	@JoinColumn(name="category_id")
	private Category category;
}
