package Optional;

import java.util.List;
import java.util.Optional;

public class ComboOptional {
	private String comboName;
	private Optional<List<GiftOptional>> gList;
	
	public ComboOptional(String cbName, Optional<List<GiftOptional>> gList){
		this.comboName = cbName;
		this.gList = gList;
	}
	public String getComboName() {
		return comboName;
	}
	public void setComboName(String comboName) {
		this.comboName = comboName;
	}
	public Optional<List<GiftOptional>> getgList() {
		return gList;
	}
	public void setgList(Optional<List<GiftOptional>> gList) {
		this.gList = gList;
	}
	
	

}
