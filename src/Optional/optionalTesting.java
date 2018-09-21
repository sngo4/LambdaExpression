package Optional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class optionalTesting {

	public static void main(String[] args) {
		GiftOptional gift1 = new GiftOptional("gift1", 3);
		GiftOptional gift2 = new GiftOptional("gift2", 6);
		GiftOptional gift3 = new GiftOptional();// warning null value
		GiftOptional gift4 = new GiftOptional(7);//warning null value

		List<GiftOptional> giftList = new ArrayList<>();
		giftList.add(gift1);
		giftList.add(gift2);
		giftList.add(gift3);
		giftList.add(gift4);
		
		ComboOptional combo = new ComboOptional("VIP Combo", Optional.of(giftList));
		Distribution distribution = new Distribution("Round 1", "Family Mart", Optional.of(combo));
		
		distributionService dService = new distributionService();
		List<String> displayList = dService.getGiftNameByDistribution(Optional.of(distribution));
		
		displayList.forEach(System.out::println);
		
		//remove null
		System.out.println("After remove null value");
		displayList.removeAll(Collections.singleton(null));
		displayList.forEach(System.out::println);
		
	}

}
