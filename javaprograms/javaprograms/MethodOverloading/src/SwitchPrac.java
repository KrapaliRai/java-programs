public class SwitchPrac {

    public static void main(String[] args){



    int switchcheck=3;


        switch (switchcheck) {

            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
                System.out.println("Value is 3");
                break;

                //If we dont use break at last of any statement we are going to get default statement everytime.

            default:
                System.out.println("Value is neither of the given");
                break;




        }


        char newch = 'c';

        switch (newch){
            case 'a':
                System.out.println("letter is a");
                break;
            case 'b':
                System.out.println("Letter is b");
                break;
            case'c':
                System.out.println("Letter is c");
                break;
            case 'd':
                System.out.println("Letter is d");
                break;
            case 'e':
                    System.out.println("Letter is e");
                break;
                default:
                    System.out.println("Letter is neither of above.");
                    break;
        }
    }

    }


