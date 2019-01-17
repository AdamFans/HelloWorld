import static java.lang.String.valueOf;

public class Main {

    public static void main(String[] args) {
        String str = "wo ai ni li chen qi";
        //length() 返回字符串的长度，也就是字符串的个数
        int strnum = str.length();
        //返回第一次出现该字符串的位置索引
        int strIndex = str.indexOf('a');
        //截取字符串
        String subStr = str.substring(0);
        Boolean boo = true;
        String booStr  = valueOf(boo);

        String[] strArr = str.split(" ");
        for (String i:strArr
             ) {
            System.out.println(i);
        }
        System.out.println(booStr);
        System.out.println("截取字符串："+subStr);
        System.out.println(strIndex);
        System.out.println(strnum);
        System.out.println("Hello World!");
    }
}
