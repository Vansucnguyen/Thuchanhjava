import java.util.Scanner;
/*Nhập vào một số ngày và hiển thị trong tuần lễ*/
public class App40{
    public static void main( String [] args) throws Exception {
      int date;
      Scanner scan= new Scanner(System.in) ;
      System.out.print("Nhap vao so ngay:");
      date= scan.nextInt();

      switch(date){
      case 1:System.out.print("Sunday");
        break;
      case 2: System.out.print("Monday");
        break;
      case 3:System.out.print("Tuesday");
        break;
      case 4:System.out.print("Wednesday");
        break;
      case 5:System.out.print("thursday");
        break;
      case 6:System.out.print("Friday");
        break;
      case 7:System.out.print("Saturday");
        break;
      default:System.out.print("So ngay trong tuan sai");
      }
    }
}