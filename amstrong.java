public class amstrong {
    public static void main(String[] args) {
        int num = 153; 
        int temp=num;
        int count=0;

        while (num != 0) {
            int digit = num % 10;
            count++; 
            num /= 10;                     
        }
        num=temp;
        int sum=0;
        while (num != 0) {
            int digit = num % 10;
            int exp=1;
            for(int i=1;i<=count;i++){
                exp=exp*digit;
            }
            sum=sum+exp;
            num /= 10;
        }
        if(sum==temp){
            System.out.println("number is amstrong");
             }
             else{
                System.out.println("not an amstrong");
             }
    }
}
