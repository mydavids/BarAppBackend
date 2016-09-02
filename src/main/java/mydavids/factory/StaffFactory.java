package mydavids.factory;

import mydavids.domain.Staff;

import java.util.Map;

/**
 * Created by Yusiry on 8/20/2016.
 */
public class StaffFactory {


    public Staff createStaff(Map<String, String> value) {
        Staff staff = new Staff.Builder(value.get("name")).IDnumber(value.get("IDNumber"))
                .surname(value.get("surname")).address("address").phone("phone").build();
				
        return staff;
    }

}
