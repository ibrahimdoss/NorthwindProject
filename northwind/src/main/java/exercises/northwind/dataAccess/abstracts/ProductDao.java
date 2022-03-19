package exercises.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import exercises.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer> {
	
	
	 Product getByProductName(String productName);
	  
	  Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	  
	  List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	  
	  List<Product> getByCategoryIn(List<Integer> categories);
	  
	  List<Product> getByProductNameContains(String productName);
	  
	  List<Product> getByProductNameStartsWith(String productName);
	
	@Query("From Product where productName=: productName and category.categoryId=:categoryId")
	List<Product> getByNameAndCategory(String productName, int categoryId);
	//yukarıdaki query işleminde veritabanına değil entitylere göre yazıyoruz yani whereden sonraki productName
	//entitydeki productnameden geliyor. : nokta sonrasındaki değer ise parametremiz oluyor yani parantez içindeki
	//string productname parametresi oluyor. aynısı category içinde geçerli. : nokta sonrasına hep parantez içindeki
	//parametreyi veriyoruz.
	
}
//parametreyi iki nokta ile veriyoruz.
//? @ gibi de olabilir.
// query yazarken veritabanına göre yazmayız. entitye göre yazarız.
// select* from products where product_name=bisey  and category_ıd=bisey 