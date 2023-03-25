package PlayWithString;

public class ReverseString {
    public static void main(String[] args) {
        String str="haoN & yllilE";
        String reversedString="";
        char[] c=str.toCharArray();
        for(int i=c.length-1; i>=0;i--){
            reversedString =reversedString+c[i];
        }
        System.out.println("rev : "+reversedString);
        reversedString =new StringBuilder(str).reverse().toString();
        System.out.println("SpringBuilder :  "+reversedString);
    }
}
