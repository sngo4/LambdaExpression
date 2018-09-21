package Optional;

import java.util.Optional;

public class Distribution {
	String ditributionName;
	String staffName;
	Optional<ComboOptional> combo;
	public Distribution(String dName, String sName, Optional<ComboOptional> cb){
		this.ditributionName = dName;
		this.staffName = sName;
		this.combo = cb;
	}
	public String getDitributionName() {
		return ditributionName;
	}
	public void setDitributionName(String ditributionName) {
		this.ditributionName = ditributionName;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public Optional<ComboOptional> getCombo() {
		return combo;
	}
	public void setCombo(Optional<ComboOptional> combo) {
		this.combo = combo;
	}
	

}
