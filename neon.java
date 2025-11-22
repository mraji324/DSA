public class neon {
    public static void main(String[] args) {
        int num = 135; 
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
            count--;
            sum=sum+exp;
            num /= 10;
        }
        if(sum==temp){
            System.out.println("number is neon");
             }
             else{
                System.out.println("not an neon");
             }
    }
}
