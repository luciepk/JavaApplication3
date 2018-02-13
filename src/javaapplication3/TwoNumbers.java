package javaapplication3;



public class TwoNumbers {
    private int first;
    private int second;
    
    public TwoNumbers(int num1,int num2){
        first = num1;
        second = num2;
    }
    
    public int first(){
        return first;
    } 
    public int second(){
        return second;
    } 
    
    public int max(){
        if (first < second){
            return second;
        }
        else{
            return first;
        }
    }
    
    public boolean equal(){
      
        if (second == first){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String gcd (){
       String GCD;
       int a = first;
       int b = second;
       
       while (a != b){
           if (a > b){
               a = a - b;
           }   
           else {
               b = b - a;
           }  
       }
       GCD = "The greatest common divisor of "+first+" and "+second+" is "+a+".";
      return GCD;
    }
    public void addNumbers (int num1,int num2){
        first = num1 + first ;
        second = num2 + second ;      
    }
    
    public void addObject( TwoNumbers object2){
       int num1 =object2.first();
       int num2 = object2.second();
        
        this.addNumbers(num1, num2);
    }
    
     public TwoNumbers Sum( TwoNumbers object2){
       TwoNumbers newobject = new TwoNumbers(this.first(),this.second());
       int num1 =object2.first();
       int num2 = object2.second();
       newobject.addNumbers(num1, num2);  
       return newobject;
    }
    

    @Override
    public String toString(){
      String state;
      state = "First number = "+this.first()+"   Second number = "+this.second()+"    Max = "+this.max()+
              "    Equal = "+this.equal()+"    GCD = "+this.gcd();
      return state;
    } 
    
}
