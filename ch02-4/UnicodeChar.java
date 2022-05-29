public class UnicodeChar {
    public static void main(String[] args)
    {
        char ch1 = 'A';
        char ch2 = '한';
        char ch3 = 0x3091;
        char ch4 = 0x3092;

        System.out.println(ch1); // A
        System.out.println(ch2); // 한
        System.out.println(ch3); // ゑ
        System.out.println(ch4); // を
    }    
}
