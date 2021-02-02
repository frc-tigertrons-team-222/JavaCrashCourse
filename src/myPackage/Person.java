package myPackage;

public class Person {

    private String name; // private = restricted access
    public String lifeQuote;
    private int age;

    public Person(String name, int age, String lifeQuote){
        this.name = name;
        this.age = age;
        this.lifeQuote = "!!! " + lifeQuote + " !!!";
    }

//  MODIFYING OR GETTING private variables
    // Getter
    public String getName() {
      return name;
    }
  
    // Setter
    public void setName(String newName) {
      this.name = newName;
    }


    // Private METHOD
    private String formatName(){
        return "Hi my name is" + this.name + " and I am " + this.age + " years old etc";
    }
    public void sayHelllo() {
        System.out.println( formatName() ); // the only place where method formatName can be called is this class (because its privs)
    }


}