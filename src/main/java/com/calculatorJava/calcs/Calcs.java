package calcs;

import java.util.Scanner;

public class Calcs {

    private String number;

    private float total;

    public float soma(String numbers[],int operators){
        int cont = 0;
        int x = numbers.length;
        int a[] = new int[x];
        while(cont <= x-1){
            a[cont] = Integer.parseInt(numbers[cont]);
            cont++;
        }
        int soma = 0;
        for(int c = 0; c < a.length; c++){
            soma+= a[c];
        }
        return total;
        
    
    }
 public String numbers(){
        Scanner scan = new Scanner(System.in);
        String numbera = scan.nextLine();
        int operatorPlus = 0;
        int operatorSubtraction = 0;
        int operatorMulti = 0;
        int operatorDivide = 0;
        final char plus = 43;
        final char subtraction = 45;
        final char multi = 42;
        final char divide =47;
        String[] sum = numbera.split(" ");
        String[] onlyNumber = new String[sum.length];
        for(int cont = 0; cont < sum.length; cont++ ){
            if(sum[cont].equals("+") || sum[cont].equals("-") ||
            sum[cont] .equals("*")||
            sum[cont].equals("/")){ 
            }
            else{
                onlyNumber[cont] = sum[cont];
            }
            System.out.println(onlyNumber[cont]);
        }
        for(int c = 0; c <=numbera.length()-1; c++){
            switch(numbera.charAt(c)){
                case plus:
                operatorPlus++;
                break;
            }
            switch(numbera.charAt(c)){
                case subtraction:
                operatorSubtraction++;
                break;
            }
            switch(numbera.charAt(c)){
                case divide:
                operatorDivide++;
                break;
            }
            switch(numbera.charAt(c)){
                case multi:
                operatorMulti++;
                break;
            }
            
        }
        System.out.println(operatorPlus);
        System.out.println(operatorMulti);
        System.out.println(operatorDivide);
        System.out.println(operatorSubtraction); 
    
    
        

        if(numbera.contains("+")){
            soma(sum,operatorPlus);
        }
        return numbera;

    }
    
}
