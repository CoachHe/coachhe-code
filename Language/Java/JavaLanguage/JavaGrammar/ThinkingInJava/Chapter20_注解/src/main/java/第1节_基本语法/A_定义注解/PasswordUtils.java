package 第1节_基本语法.A_定义注解;

import java.util.List;

public class PasswordUtils {
    @UseCase(id = 47, description = "Password must contain at least one numeric")
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }

    @UseCase(id = 48)
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id = 49, description = "New passwords can't equal previously used one")
    public boolean checkForNewPassword(List<String> prevPasswords, String password) {
        return !prevPasswords.contains(password);
    }

    public static void main(String[] args) {
        PasswordUtils passwordUtils = new PasswordUtils();
        System.out.println(passwordUtils.validatePassword("hello"));
    }
}
