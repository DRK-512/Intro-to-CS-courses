//Darek Konopka; CS-101
//Write a class named Product with the following members.

public class Product { 

     // Two fields 
     public String name;        
     public double price;
     
     // Two constuctors 
     // Defult contructor
     public Product() {
       name = "";
       price = 0.0; 

    }
    
    // Overloaded constructor:
    // allows client to set beginning values
    public Product( String startName, double startPrice)   {
       name = startName; 
       price = startPrice; 
    }
    
     // Accessor Method:
    // returns current value of name
    public String getName( ) {
       return name;
    }
    // Accessor Method:
    // returns current value of number
    public double getPrice( ) {
       return price;
    }
    
     // Mutator Method:
    // allows client to set model
    public Product setName( String newName )   {
        this.name = newName;
        return this;
    }
    // Mutator Method:
    // allows client to set model
    public Product setPrice( double newPrice )   {
        this.price = newPrice;
        return this;
    }
    
     // toString: returns a String of instance variable values
    @Override
    public String toString( )   {
       
       return ("Name: " + name + "\nPrice: " + price); 

    }



}

    