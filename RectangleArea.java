class Rectangle 
 { 
       double length; 
       double breadth; 
       
       void setData(double l, double b) 
       {  
         length =l; 

         breadth=b; 
       } 
        
       double area() 
       { 
         double rectArea; 
         rectArea = length * breadth; 
         return rectArea; 
       } 
 } 
  
 class RectangleArea  
 { 
          public static void main(String[] args) 
      { 
            
            Rectangle firstRect = new Rectangle(); 
	    firstRect.setData(12.48,13.0);
  	    double len=firstRect.length;
	    System.out.println("length= "+ len); 
	    double bre=firstRect.breadth;
	    System.out.println("breadth= "+ bre); 
            double result = firstRect.area(); 
            System.out.println("Area of Rectangle = "+ result); 
      } 
 } 
