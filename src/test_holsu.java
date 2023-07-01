public class test_holsu {
    public static void main(String[] args) {
        int[] a = {3,4,5,6,7};
        int 홀수count = 0;
        int 짝수count = 0;
        for(int i = 0 ; i < a.length; i++) {
            if(a[i]%2==0) {
                짝수count++;
            }else {
                홀수count++;
            }
        }System.out.println("짝수 개: "+짝수count+" 홀수 개: "+홀수count);
    }
}
