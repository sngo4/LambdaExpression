import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ramdom {
	private static Random random = new Random();
	
	public static void main(String[] args) {
		List<Gift> listCombo = getGift();
		
		System.out.println("ROUND 1");
		luckySpin(listCombo);
		
		System.out.println("ROUND 2");
		luckySpin(listCombo);
		
		System.out.println("ROUND 3");
		luckySpin(listCombo);
		
		System.out.println("ROUND 4");
		luckySpin(listCombo);
		
		System.out.println("ROUND 5");
		luckySpin(listCombo);
		
		System.out.println("ROUND 6");
		luckySpin(listCombo);
		
		System.out.println("ROUND 7");
		luckySpin(listCombo);
		
		System.out.println("ROUND 8");
		luckySpin(listCombo);
		
		System.out.println("ROUND 9");
		luckySpin(listCombo);
		
		System.out.println("ROUND 10");
		luckySpin(listCombo);
		
		System.out.println("ROUND 11");
		luckySpin(listCombo);
	}
		
	private static void luckySpin(List<Gift> listCombo) {
		if (listCombo.size()>0) {
		int index = random.nextInt(listCombo.size());
		Gift tempChoose = listCombo.get(index);
			System.out.println("Congratulations! your gift is: " + tempChoose.getName());
			Gift AfterChoose = new Gift(tempChoose.getName(), tempChoose.getQuantity() - 1);
			System.out.println("AfterChoose Quantity: " + AfterChoose.getQuantity());
			listCombo.remove(index);
			if (AfterChoose.getQuantity() > 0) {
				listCombo.add(AfterChoose);
			}
		} else {
			System.out.println("Please check!");
		}
	}
	private static List<Gift> getGift() {

		List<Gift> listCombo = new ArrayList<Gift>();

		listCombo.add(new Gift("John", 1));
		listCombo.add(new Gift("Kate", 2));
		listCombo.add(new Gift("Jason", 3));
		listCombo.add(new Gift("Iris", 4));

		return listCombo;

	}
	
}
