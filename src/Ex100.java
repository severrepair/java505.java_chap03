import java.util.Random;
import java.util.Scanner;

public class Ex100 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        
//        교재 121페이지 숨은번호 찾기 게임
        Random r = new Random();
        int k = r.nextInt(100);


        System.out.println("Up & Down 게임입니다. 숨겨진 수를 맞추어 보세요.");
        for (int)






//        끝내기
        System.out.println("다시하시겠습니까(y/n)>>");
        while(true) {
            String text = scanner.nextLine();
            if (text.equals("n"))
                break;
        }


    }//main
}
