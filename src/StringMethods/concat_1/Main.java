package StringMethods.concat_1;

public class Main {
    public static void main(String[] args) {
//        Phương thức này concat() nối một chuỗi ký tự vào cuối chuỗi đã chỉ định.
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str3); // HelloWorld
    }
}
