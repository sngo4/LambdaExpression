package Optional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class distributionService {
	public List<String> getGiftNameByDistribution(Optional<Distribution> d){
		
		return d.flatMap(Distribution::getCombo)//covert Optional<Distribution> to Optional<Combo>
				.flatMap(ComboOptional::getgList)//convert Optional<Combo> to Optional<List<GiftOptional>>
				
				.get()//convert Optional<List<GiftOptional>> to List<GiftOptional>
				.stream().map(s -> s.getGiftName())//convert List<GiftOptional> to Stream<String>
				.collect(Collectors.toList());//Convert Stream<String> to List<String>
	}

}
