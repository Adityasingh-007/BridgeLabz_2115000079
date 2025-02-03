import java.util.*;

public class Program12 {
public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			String str1=sc.nextLine();
			String str2=sc.next();
			String str3=sc.next();

			System.out.println( replaceWord(str1,str2,str3));
		}
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }
}
