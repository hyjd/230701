import java.util.Scanner;

public class test_baseball{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base1 = (int) (Math.random() * 9 + 1);
        int base2 = (int) (Math.random() * 9 + 1);
        int base3 = (int) (Math.random() * 9 + 1);
        //이상 123은 정답 숫자
        int s = 0;
        int b = 0;
        int homerun = 0;
        int out = 0;

        //3가지 숫자가 겹치지 않게금 해주는 코드
        while (true) {
            while (base1 == base2) {
                base2 = (int) (Math.random() * 9 + 1);
                if (base1 != base2) {
                }
            }
            while (base3 == base1 & base3 == base2) {
                base3 = (int) (Math.random() * 9 + 1);
                if (base3 != base1 & base3 != base2) {
                }
            }
            if (base1 != base2 & base1 != base3 & base2 != base3) {
                break;
            }
        }
        //코드 끝

        exit: while (true) {
            while (out != 3) {
                System.out.println("------------");
                System.out.println("당신의 카운트" + out);
                System.out.println("3이되면 패배합니다.");
                System.out.println("------------");

                System.out.println("첫번째 숫자를 입력하십시오");
                int run1 = sc.nextInt();
                System.out.println("두번째 숫자를 입력하십시오");
                int run2 = sc.nextInt();
                System.out.println("세번째 숫자를 입력하십시오");
                int run3 = sc.nextInt();
                //이상 유저의 입력을 받는 숫자.

                if (run1 == base1) {
                    s = s + 1;
                }
                if (run1 == base2) {
                    b = b + 1;
                }
                if (run1 == base3) {
                    b = b + 1;
                }

                if (run2 == base1) {
                    b = b + 1;
                }
                if (run2 == base2) {
                    s = s + 1;
                }
                if (run2 == base3) {
                    b = b + 1;
                }

                if (run3 == base1) {
                    b = b + 1;
                }
                if (run3 == base2) {
                    b = b + 1;
                }
                if (run3 == base3) {
                    s = s + 1;
                }

                if (s == 3) {
                    System.out.println("홈런");
                    homerun = homerun + 1;
                }
                if (s == 0 & b == 0) {
                    System.out.println("아웃");
                    out = out + 1;
                } else if (s != 3) {
                    System.out.println("스트라이크: " + s);
                    System.out.println("볼: " + b);
                }
                s = 0;
                b = 0;
                if (homerun == 1 | out == 3) {
                    System.out.println("게임종료");
                    if (homerun == 1) {
                        System.out.println("승리하였습니다.");
                        break exit;
                    } else if (out == 3) {
                        System.out.println("패배하였습니다.");
                        break exit;
                    }
                }
            }
        }
    }
}