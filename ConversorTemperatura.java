import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
        double celsius = 0;
     
        System.out.println("Informe o valor em Celsius para converter");
        celsius = scanner.nextInt();
        
        double fahrenheit = (celsius * 9/5) + 32;
        
        System.out.println("O valor convertido em Fahrenheit eh " + fahrenheit);
        
        scanner.close();
    }
}
