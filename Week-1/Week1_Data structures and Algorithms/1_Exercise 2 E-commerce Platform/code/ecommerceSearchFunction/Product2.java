package ecommerceSearchFunction;

public class Product2 {
	int productId;
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	String productName;
	String category;
	
	public Product2(int productId,String productName,String category) {
		this.productId = productId;
		this.productName = productName;
		this.category = category;
	}
	
	@Override
	public String toString() {
	    return "Product ID: " + productId + ", Name: " + productName + ", Category: " + category;
	}

}

class SearchAlgorithms{
	public static Product2 linearSearch(int productId ,Product2[] products) {
		// linear search - O(n)
		for(int i=0;i<products.length;i++) {
			if(products[i].productId == productId) {
				return products[i];
			}
		}
		return null;
	}
	public static Product2 binarySearch(int productId ,Product2[] products) {
		// binary search - O(log n)
		int low = 0;
		int high = products.length-1;
		while(low <= high) {
			int mid = low +(high-low)/2;
			
			if(products[mid].getProductId() == productId) {
				return products[mid];
			}else if(products[mid].getProductId() < productId) {
				low  = mid+1;
			}else {
				high = mid-1;
			}
		}
		return null;
	}
}

class Main{
public static void main(String[] args) {
	Product2 p1 = new Product2(1,"Product1" , "Spoon");
	Product2 p2 = new Product2(2,"Product2" , "shoes");
	Product2 p3 = new Product2(3,"Product3" , "Books");
	Product2 p4 = new Product2(4,"Product4" , "Socks");
	
	Product2[] array = {p4, p2, p1, p3};
	Product2[] sortedArray = {p1 , p2 , p3 , p4};
	
	
	Product2 result1 = SearchAlgorithms.linearSearch(2, array);
	if(result1 != null) {
		System.out.println("Element found : "+ result1);
	}else {
		System.out.println("Element is not found");
	}
	
	Product2 result2 = SearchAlgorithms.linearSearch(6, array);
	if(result2 != null) {
		System.out.println("Element found : "+ result2);
	}else 
	{
		System.out.println("Element is not found");
	}
	
	Product2 result3 = SearchAlgorithms.binarySearch(3, sortedArray);
	if (result3 != null) {
		System.out.println("Element found : "+ result3);
	}else
	
	{
		System.out.println("Element is not found");
	}
	
	Product2 result4 = SearchAlgorithms.binarySearch(5, sortedArray);
	if (result4 != null) {
		System.out.println("Element found : "+ result4);
	}else 
	
	{
		System.out.println("Element is not found");
	}
  }	
	
}