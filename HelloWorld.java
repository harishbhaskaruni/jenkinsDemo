
public class HelloWorld{
    public static void main(String args[]){
        System.out.println("Hello world");
        for(int i=1; i< 10; i++){
            int j=0;
            for(;j<i;j++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }
        for(int i=0; i< 10; i++){
            int j=10-i;
            for(;j>1;j--){
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
}