
package java_practice;
import java.util.Scanner;
public class getday_using_switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number from 1 to 7");
        n=sc.nextInt();
        switch(n)
        {
            case 1:
                System.out.println("Sat");
                break;
                     
                case 2:
                System.out.println("Sat");break;
                    case 3:
                System.out.println("Sat");break;
                        case 4:
                System.out.println("Sat");break;
                            case 5:
                System.out.println("Sat");break;
                                case 6:
                System.out.println("Sat");break;
                                    case 7:
                System.out.println("Sat");break;
                                        default:
                System.out.println("Invalid");
                                            
        }
    }
    
}
