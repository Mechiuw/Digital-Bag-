import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class ToDo3 {
	public static void main(String[]args) {
		
		// welcoming and declaration
		Scanner name = new Scanner(System.in);
		System.out.println("This is your digital Bag");
		System.out.println("Choose your brand");
		String brand = name.next();
		System.out.println(brand + " bag added");
		
		// control functions : 
		String choice;
		String bag[] = new String[15];
		String pockets[] = new String[5];
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println(brand + " bag inventory ");
			System.out.println("1. store an item in bag");
			System.out.println("2. take out an item in bag");
			System.out.println("3. replace an item in bag");
			System.out.println("4. check all items in bag");
			System.out.println("5. sort items in bag");
			System.out.println("6. count size of the bag");
			System.out.println("7. search an item inside the bag");
			System.out.println("8. remove all items from bag");
			
			System.out.println("9. store an item to pockets");
			System.out.println("10. take out an item inside pockets");
			System.out.println("11. replace an item inside pockets");
			System.out.println("12. check all items inside pockets");
			System.out.println("13. sort items in pockets");
			System.out.println("14. count size of pockets");
			System.out.println("15. search an item in pockets");
			System.out.println("16. remove all items from pockets");
			
			System.out.println("type 'zip' to zip bag");
			System.out.println("choose actions from above");
			choice = scan.nextLine();
			
			switch(choice) {
			case "1" :
				System.out.println("what do you want to store inside? ");
				String itemStore = scan.nextLine();
				for( int i = 0; i < bag.length; i++) {
					if( bag[i] == null ) {
						bag[i] = itemStore;
						System.out.println("adde to inventory!");
						break;
					}
				}
				break;
			case "2" :
				System.out.println("What do you want to take? ");
				String putOut = scan.nextLine();
				for( int i = 0; i < bag.length; i++) {
					if( bag[i] != null && bag[i].equals(putOut)) {
						bag[i] = null;
						System.out.println("you took " + putOut + "from the bag!");
						break;
					}
				}
				break;
			case "3" :
				System.out.println("what do you want to remove or replace? ");
				String oldItem = scan.nextLine();
				System.out.println("what do you want to replace it with");
				String newItem = scan.nextLine();
				
				for( int i = 0; i < bag.length; i++) {
					if( bag[i] != null && bag[i].equals(oldItem)) {
						bag[i] = newItem;
						System.out.println("Successfully replaced!");
						break;
					}
				}
				break;
			case "4" :
				System.out.println("This all you have : ");
				for( String list : bag ) {
					if ( list != null ) {
						System.out.println(list);
						
					}
				}
				break;
			case "5" :
				System.out.println("Sorted based on Alphabets : ");
				Arrays.sort(bag,Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER));
					for ( String sortedBag : bag ) {
						if( sortedBag != null) {
							System.out.print(sortedBag + ", " );
							
						}
					}
						break;
			case "6" :
				System.out.println("Counted total : ");
				int total = bag.length;
				System.out.println(total);
						break;
			case "7" :
				System.out.println("What are you looking for?");
				String lookingFor = scan.nextLine();
				boolean found = false;
				
				for(int i = 0; i < bag.length; i++) {
					if( bag[i] != null && bag[i].equals(lookingFor)) {
						lookingFor = bag[i];
						System.out.println(lookingFor);
						found = true;
						break;
					} 
				}
				if (!found){
					System.out.println("not found any of that inside.");
				}
				break;
			case "8" : 
				for(int i = 0; i < bag.length; i++) {
					if( bag[i] != null ) {
						bag[i] = null;						
					}
				}
				System.out.println("all items dropped.");
				break;
			case "9" :
				System.out.println("what item do you want to store in your Pockets? ");
				String itemTP = scan.nextLine();
				boolean pocketFull = true;
				
				for(int j = 0; j < pockets.length; j++) {
					if(pockets[j] == null) {
						pockets[j] = itemTP;
						System.out.println( itemTP +" added to inventory");
						pocketFull = false;
						break;
						} 
					}
					if (pocketFull) {
						System.out.println("Full inventory, remove one or else your last input will be rejected. \n");
						break;
				}
					break;
			case "10" :
				System.out.println("what item that you want to pull out? ");
				String pullIP = scan.nextLine();
				
				for(int j = 0; j < pockets.length; j++) {
					if(pockets[j] != null && pockets[j].equals(pullIP)) {
						pockets[j] = null;
						System.out.println(pullIP + " pulled");
						break;
					}
				}
				break;
			case "11" :
				System.out.println("what item you want to replace from pockets?");
				String repIP1 = scan.nextLine();
				System.out.println("what's the replacement?");
				String repIP2 = scan.nextLine();
				
				for(int j = 0; j < pockets.length; j++) {
					if(pockets[j] != null && pockets[j].equals(repIP1)) {
						pockets[j] = repIP2;
						System.out.println("item replaced!");
						break;
					}
				}
				break;
			case "12" :
				System.out.println("all things inside your pockets ");
				for( int j = 0; j < pockets.length ; j++ ) {
					if( pockets[j] != null ) {
						System.out.println(pockets[j]);
						
					}
				}
				break;
			case "13" :
				System.out.println("sorted items inside your pockets");
				Arrays.sort(pockets,Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER)); 
				for( String sortedPockets : pockets ) {
					if( sortedPockets != null ) {
						System.out.print(sortedPockets + ", ");
					}
				}
				break;
			case "14" :
				System.out.println("Total counted items ");
				int countIP = pockets.length;
				System.out.println(countIP);
				break;
			case "15" :
				System.out.println("What are you looking for? ");
				String lookIP = scan.nextLine();
				boolean foundIP = false;
				
				for(int j = 0; j < pockets.length; j++) {
					if( pockets[j] != null && pockets[j].equals(lookIP)){
						pockets[j] = lookIP;
						System.out.println(lookIP);
						foundIP = true;
						break;
					} 
				}
				if (!foundIP){
					System.out.print("nope,not found any of such items bud.");
				}
				break;
			case "16" :
				for(int j = 0; j < pockets.length; j++) {
					if( pockets[j] != null ) {
						pockets[j] = null;
					}
				}
				System.out.println("all items pulled out");
				break;
			case "zip" :
				System.out.println("Zipped off and ready to go.");
				break;
				default :
					System.out.println("can't find such instructions");
			}
		} while(!choice.equals("zip"));
		name.close();
		scan.close();
	}
}
