
package btvn;


public class Baitap1 {

    static int checkSnt(int a){
        if(a<2){
            return 0;
        }
        for (int i = 2; i < a; i++) {
            if(a%i==0){
                return 0;               
            }
        }
        return 1;
    }
    static int checkLe(int b){
        if(b%2==0){
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 2;
        int b = 7;
        if(checkSnt(a)==1){
            System.out.println(a+" là số nguyên tố");
        }else{
            System.out.println(a+ " không phải là số nguyên tố");
        }
        if(checkLe(b)==1){
            System.out.println(b+" là số lẻ");
        }else{
            System.out.println(b+" không phải là số lẻ");
        }
            
            
        
        
    }
    
}
