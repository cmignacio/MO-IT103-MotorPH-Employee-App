package motorph;

import java.util.Map;

/**
 * Represents a regular employee with fixed salary.
 */
public class RegularEmployee extends Employee {

    public RegularEmployee() {
        super();
    }

    public RegularEmployee(Map<String, String> data) {
        super(data);
    }

    @Override
    public double computePay() {
        return getBasicSalary()
                + getRiceSubsidy()
                + getPhoneAllowance()
                + getClothingAllowance();
    }
}
