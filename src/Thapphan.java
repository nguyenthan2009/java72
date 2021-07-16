import java.util.Scanner;
import java.util.Stack;

public class Thapphan {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bạn muốn chuyển sang hệ nhị phân");
        int Number = sc.nextInt();
        int index=0;
        while(Number>0){
            stack.push(Number%2);
            Number = Number/2;
       }
        int n= stack.size();
        String ch = "";
        for(int i=stack.size();i>0;i--){
            ch += (stack.pop()).toString();
        }
        System.out.println("chuỗi số thập phân vừa qui đổi là"+ch);
    }


}
