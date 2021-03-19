import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author lenovo
 */
public class AdjEmlements {
    public static String getItems(List<String> left,List<String> right){
        right.removeAll(left);
        StringBuilder sb = new StringBuilder();
        right.forEach(i->{
            sb.append(i);
            sb.append("\n");
        });
        return sb.toString().trim();

    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int len = console.nextInt();
        List<String> left = new ArrayList<>();
        List<String> right = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            left.add(console.next());
        }
        int len2 = console.nextInt();
        for (int i = 0; i < len2; i++) {
            right.add(console.next());
        }
        System.out.println(getItems(left,right));
    }
}
