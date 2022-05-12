import java.util.HashSet;
import java.util.Scanner;
public class App56 {
    public static void main (String[] args){
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner scanner = new Scanner (System.in);
        hashSetString.add("Benzenma");
        hashSetString.add("Kroos");
        hashSetString.add("Vinicus");
        hashSetString.add("Mendy");
        hashSetString.add("Rorygo");
        hashSetString.add("Militao");
        System.out.println("Các phần tử trong hashSetString: ");
        System.out.println(hashSetString);
        System.out.println("Nhập phần tử cần xóa: ");
        name = scanner.nextLine();
        if (hashSetString.contains(name)) {
            hashSetString.remove(name);
            System.out.println("Xóa thành công!");
            System.out.println("Các phần tử còn lại trong hashSetString: ");
            System.out.println(hashSetString);
        }else{
            System.out.println("Xóa không thành công!");
        }
    }
    
}
