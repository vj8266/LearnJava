public class Application {
    public static void main(String[] args) {
        
        int value = 0;
    
        while(value < 10)
        {
            System.out.println("Hello " + value);
            
            value = value + 1;
        }
        for(int i=0; i < 5; i++) {
            System.out.printf("The value of i is: %dn ", i);
        }
    }
}