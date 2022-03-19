package exercises.northwind.core.utilities.results;

public class DataResult<T> extends Result {
	
	private T data;
	public DataResult( T data, boolean success, String message) {
		super(success, message);
		this.data=data;
	//super ise base sınıfın constructorunu çalıştırmaya yarıyor.
		
	}
	
	public DataResult( T data, boolean success) {
		super(success);
		this.data=data;
	//super ise base sınıfın constructorunu çalıştırmaya yarıyor.
		
	}
	
	public T getData() {
		return this.data;
	}
	
	

	

}
