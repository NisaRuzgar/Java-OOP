import java.util.ArrayList;

public class Component extends Product {
	private ArrayList<Product> productList;
	
	public Component(String name) {
		productList = new ArrayList<Product>();
		super.setProductName(name);
	}
	
//	public boolean addComponent(Product p);
	public ArrayList<Product> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}
	
	
}
