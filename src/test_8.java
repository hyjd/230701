public class test_8 {
    public static void main(String[] args) {
        for (int i=0; i<=10000; i++){
            searchEight(i);
        }
        System.out.println("1에서 10,000 사이에 존재하는 8의 개수는? "+count);
    }
    private static int count = 0;
    public static void searchEight(int num){
        if (num%10==8) count++;
        if (num>10) searchEight(num/10);
    }
}