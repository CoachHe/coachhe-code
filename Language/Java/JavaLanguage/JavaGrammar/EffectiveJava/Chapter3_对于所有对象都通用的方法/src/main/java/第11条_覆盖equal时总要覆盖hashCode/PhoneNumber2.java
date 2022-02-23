package 第11条_覆盖equal时总要覆盖hashCode;



import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneNumber2 {
    private final short areaCode, prefix, lineNum;

    public PhoneNumber2(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix = rangeCheck(prefix, 999, "prefix");
        this.lineNum = rangeCheck(lineNum, 9999, "line num");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ": " + val);
        }
        return (short) val;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PhoneNumber2)) {
            return false;
        }
        PhoneNumber2 pn = (PhoneNumber2) obj;
        return pn.lineNum == lineNum && pn.prefix == prefix && pn.areaCode == areaCode;
    }

    @Override
    public int hashCode() {
        return 42;
    }

    public static void main(String[] args) {
        Map<PhoneNumber2, String> m = new HashMap<>();
        PhoneNumber2 phoneNumber1 = new PhoneNumber2(707, 867, 5309);
        PhoneNumber2 phoneNumber2 = new PhoneNumber2(707, 867, 5309);
        System.out.println(phoneNumber1.equals(phoneNumber2));
        System.out.println(phoneNumber1.hashCode());
        System.out.println(phoneNumber2.hashCode());
        System.out.println(phoneNumber1 == phoneNumber2);
    }

}
