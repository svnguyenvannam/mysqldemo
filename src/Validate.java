public class Validate {

    public static boolean isName(String str) {
        String expression = "^[a-zA-Z\\s]{5,50}";
        return str.matches(expression);
    }

    public static boolean isBirthday(String str) {
        String expression = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$";
        return str.matches(expression);
    }

    public static boolean isPhone(String str) {
        String expression = "^([0-9]{10}$)";
        return str.matches(expression);
    }

    public static boolean isEmail(String str) {
        String expression = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";
        return str.matches(expression);
    }

    public static boolean isAddress(String str) {
        String expression = "[\\S\\s]+[\\S]+ ";
        return str.matches(expression);
    }

    public static boolean isGender(String str) {
        if(!str.equals("nam") & !str.equals("nu") & !str.equals("khac")) return false;
        return true;
    }

    public static boolean isGrade(String str) {

        int a = Integer.parseInt(str);
        if (a> 12 || a < 10) return false;
        return true;
    }


}


