import java.util.Scanner;

public class MolecularMass {
    //String userInput;
    static Scanner kb = new Scanner(System.in);
    static String mass;
    static IntStack newStack = new IntStack();
    static int sumNumber = 0;

    public static void main(String args[]){
       System.out.print("Enter the molecule: ");
        mass = kb.next();
        mass();
        System.out.println("The Molecular Mass of " + mass + " is " + add());
    }

    public static int mass(){
        for(int i = 0; i < mass.length(); i++){
            char character = mass.charAt(i);
            if(character == '('){
                newStack.push(0);
                //System.out.println("O");
            }
            if(character == 'H'){
                newStack.push(1);
                //System.out.println("PUSH 1");
            }
            if(character == 'C'){
                newStack.push(12);
                //System.out.println("PUSH 12");
            }
            if(character == 'O'){
                newStack.push(16);
                //System.out.println("PUSH 16");
            }
            if(character == ')'){
                newStack.push(condition());    
            }
            if(character == '2' || character == '3' || character == '4' || character == '5' || 
            character == '6' || character == '7' || character == '8' || character == '9'){
                newStack.push(multiply(character));       
            }
        } 
        return sumNumber;
    }
    public static int add(){
        int add = 0;
        int sum = 0;
        while(add != -1){
            add = newStack.pop();
            if(add == -1){
                break;
            }
            sum = sum + add;
           
        }
        return sum;
    }
    public static int multiply(char character){
        int number = 0;
        if(character == '2'){
            number = 2;
        }
        else if(character == '3'){
            number = 3;
        }
        else if(character == '4'){
            number = 4;
        }
        else if(character == '5'){
            number = 5;
        }
        else if(character == '6'){
            number = 6;
        }
        else if(character == '7'){
            number = 7;
        }
        else if(character == '8'){
            number = 8;
        }
        else if(character == '9'){
            number = 9;
        }
        return (number *= newStack.pop());
    }
    public static int condition(){
        int value = -1;
        int temp = 0;
        while(value != 0){
            value = newStack.pop();
            temp += value;
            //System.out.println("add" + value);
        }
        //System.out.println("push" + value);
        return temp;
    }
}
