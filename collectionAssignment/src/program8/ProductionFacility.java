package program8;

import java.time.LocalDate;

public class ProductionFacility {
	int pliid;
	String pro_facility_name;
	String pro_fa_location;
	int totalproduction_perday;
	String itemnames[];
	LocalDate prod_date;
	public ProductionFacility(int pliid, String pro_facility_name, String pro_fa_location, int totalproduction_perday,
			String[] itemnames, LocalDate prod_date) {
		super();
		this.pliid = pliid;
		this.pro_facility_name = pro_facility_name;
		this.pro_fa_location = pro_fa_location;
		this.totalproduction_perday = totalproduction_perday;
		this.itemnames = itemnames;
		this.prod_date = prod_date;
	}
	public ProductionFacility() {
		super();
	}
	

}
