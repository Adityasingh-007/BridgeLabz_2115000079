import java.util.Arrays;
import java.util.*;

public class Program11 {
	    public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			String str1=sc.next();
			String str2=sc.next();
			System.out.println( isAnagram(str1,str2));
		}

    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
