public class Main {

    public static void main(String[] args){

//        for (int i = 8; i >1 ; i--) {
//            System.out.println("Interest for rate "+ i +" is " + String.format("%.2f",calculateInterest(10000,i)));
//
//        }

        System.out.println(isPrime(100));


    }


    public static double calculateInterest(double amount,double rate){
        return (amount*(rate/100));

    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;
                    }

        for (int j = 2; j <100 ; j++) {
            if(n%j==0) {

                return false;
            }
            else{
                System.out.println("j");
                return true;

            }

            }

        return true;

    }

}
