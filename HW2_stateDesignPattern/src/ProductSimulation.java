import java.util.ArrayList;

public class ProductSimulation {
	private final int levelMax = 4;
	public static String[] compNames = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"};
	public static String[] partNames = {"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
	
	public int determineRandNumb() {
		int level = 0;///hem product uzunlu�u hem her eleman�n say�s� hem depth i 1-4aras� level max� kullan
		
		return level;
	}
	
	//simdilik void dedim asl� :)
	public void determineProductStructure(){
		int depth = determineRandNumb();
		int x = 0;
		while(x < depth) {
			if(x == depth - 1) {
				//hepsi parts 
			}
			else {
				//en az 1 i comp
			}
			x++;
		}
		
		
	}
	
	public void reducePartInventory(ArrayList<Part> partInventory) {
		
	}
	
	public void reduceCompInventory(ArrayList<Component> componentInventory) {
			
	}
		
	public void addToProductInventory(ArrayList<Product> productInventory) {
		
	}
	
	public int calcTotalRequiredDays() {
		return 0;
	}
	
	public void putUp() {
		
	}
}
