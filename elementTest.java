import java.util.Scanner;

class elementTest{
    public static void main(String[] args) {
        element testElement = new element();
    }
}

class element {
    public int number;
    public String prefix;
    public String suffix;

    public element() {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("give us a number");
        number = scanner. nextInt ();
        System.out.println (number);
        if (number==0){ 
           prefix= "Zero"; 
           suffix= "Zero";
        }
        System.out.println (number);
        System.out.println (prefix);
        System.out.println (suffix);
    }
}