package 第10条_覆盖equals时请遵守通用约定;

import java.util.Objects;

public final class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    //Broken - violates symmetry!


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CaseInsensitiveString) {
//            return s.equalsIgnoreCase((CaseInsensitiveString) obj).s);
        }
        if (obj instanceof String) {
            return s.equalsIgnoreCase((String) obj);
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
