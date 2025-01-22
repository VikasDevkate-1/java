import java.util.*;
public class OOps {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // 1st 
        // Pen p1 = new Pen();// Created a pen object called p1
        // p1.setcolor("red");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);
        // p1.color="Black";
        // System.out.println(p1.color);

        // Animal wild = new Animal();
        // wild.setName("Tiger");
        // wild.setColor("yellow and black");
        // wild.setHight(3);
        // wild.setWeight(50);
        // System.out.println(wild.name);
        // System.out.println(wild.color);
        // System.out.println(wild.height);
        // System.out.println(wild.weight);
        // // 2nd 
        // BankAccount c1 = new BankAccount();
        // c1.userName="Nikhil";
        // System.out.println(c1.userName);
        // // c1.password ="devkatenikhil";
        //  3 rd 

        // Pen p1 = new Pen();
        // p1.setTip(5);
        // p1.setcolor("Grean");
        // System.out.println(p1.getColor());
        // System.out.println(p1.getTip());
        // 4 th 
        // Student s1 = new Student();
        // System.out.println( s1.name);
        /* Encapsulation
         * 
         * Encapsulation is defined as the wrapping up of data & methods under a single unit. It also implements data hiding.
         */
        /* Constructor is a special method which is invoked automatically at the time of object creation.
         * - Constructors have the same name as class or structure.
         * - Constructors don't have a return type (Not even void ).
         * - Constructors are only called once, at object creation.
         * - Memory allocation happens when constructor is called.
         */

        // Student s1 =new Student();
        // new Student();
        // s1.name ="NIKHIL";
        // s1.roll = 2323;
        // System.out.println(s1.name);
        // System.out.println(s1.roll);
        /*Types of Constructors 
         * Non - Parameterized
         * Parameterized
         * copy Constructor
         */
        // Student S1 = new Student();
        // Student S2 = new Student("Nikhil");
        // Student S3 = new Student(2323);
        // // Student S4 = new Student("nikhil",3423);
        // Student S1 = new Student();
        // S1.name = "Nikhil";
        // S1.roll = 2323;
        // S1.password = "nikhil@devkate";
        // S1.marks[0]=100;
        // S1.marks[1]=90;
        // S1.marks[2]=80;

        // Student S2 = new Student(S1);
        // S2.password = "xyz";
        // S1.marks[2] =100;
        // for(int i=0;i<3;i++){
        //     System.out.println(S2.marks[i]);
        // }
        
        // Destructors Garbage collector

        /* Inheritance 
         * Inheritance is when properties & methods of base class are passed on to a derived class. 
         * 
         * Types of Inheritance 
         * single level Inheritance base class to derived class.
         * Multi - level Inheritance / Base class -> Derived class -> Derived class. ex :- Animal (property :- eat , breath) -> mammals (legs) -> Dog (Breads).
         * Hierarchial Inheritance / Base class < Derived class 1 and Derived class 2 ,... 
         * Hybrid Inheritance 
         */
        // Fish shark = new Fish();
        // shark.eat();

        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs= 4;
        // System.out.println(dobby.legs);
        // Bird cook = new Bird();
        // cook.breathe();
        // cook.flay();
        // cook.eat();

        /* Method Overloading 
         * Multiple functions with the same name but different parameters.
        //  */
        // Calculator calculator = new Calculator();
        // System.out.println(calculator.sum(1 , 2));
        // System.out.println(calculator.sum(1.222f, 4.54f));
        // System.out.println(calculator.sum(109, 2980, 03636));
        /* Method Overriding 
         * Parent adn child classes both contain the same function with a different definition.
         */
        // Dear d1 = new Dear();
        // d1.eats();
        /* Packages in java 
         * Package is a group of similar types of classes , interfaces and sub - pabckages.
         * types of package in java 1) in built and 2) user defined 
         */
        /* Abstraction 
         * Hiding all the unnecessary details and showing only the important parts to the user . 
         * 
         * 1) Abstract classes                                    2)interfaces
         * 1) Abstract Classes
         * - Cannot create create an instance of abstract class
         * - Can have abstract / non -abstract methods.
         * - Can have constructors 
         * 
         * 2) Interfaces multiple inheritance / total abstraction // Interface is a blueprint of a class
         * - All methods are public, abstract & without implementation
         * - Used to achieve total abstraction 
         * - Variables in the interface are final, public and static
         */
            // Mustng m = new Mustng();
            // Horse h1 = new Horse();
            // // h1.walks();
            // // h1.color();
            // chicken c1 = new chicken();
            // c1.walks();
            // c1.color();
            // System.out.println(c1.color);
            // System.out.println(h1.color);
            // Queen q = new Queen();
            // q.moves();
            // King k = new King();
            // k.moves();
            // Rook r = new Rook();
            // r.moves();
            // Bear b = new Bear();
            // b.eat();
            /*Static Keyword 
             * Static keyword in java is used to share the same variable or method of a given class.
             * -Properties
             * - Function 
             * - Blocks
             * - Nested classes
             */
            // StudenT s1 = new StudenT();
            // s1.schoolName = "R.V.D.H.D";
            

            // StudenT s2 = new StudenT();
            // System.out.println(s2.schoolName);

            // StudenT s3 = new StudenT();
            // s3.schoolName = "S.R.V.M";
            // System.out.println(s3.schoolName);
            /*Super Keyword
             * super keyword is used to refer immediate parent class object
             * - to access parent's properties
             * - to access parent's function
             * - to access parent's constructor 
             *///error
            // Horse ho = new Horse();
            // ho.Horse();
            // constructor chaining google
            
        sc.close();
    }
}
class Animal{
    Animal(){
        System.out.println("Animal constructor called");
    }
}
class Horse extends Animal{
    Horse(){
        super();
        System.out.println("Horse constructor called ................");
    }
}
// class StudenT{
//     String name;
//     int roll ;

//     static String schoolName;
    
//     void setName(String name){
//         this.name = name;
//     }
//     String getName(){
//         return this.name;
//     }
// }
// interface Herbivore{
//     void eat();
// }
// interface Carnivore{
//     void eat();
// }
// class Bear implements Herbivore,Carnivore{
//     public void eat(){
//         System.out.println("grass and meats ");
//     }
// }
// interface ChessPlayer{
//     void moves();
// }
// class Queen implements ChessPlayer{
//     public void moves(){
//         System.out.println("Up ,Dwon , Left , Right , Diagonal (int all four directions )");
//     }
// }
// class Rook implements ChessPlayer{
//     public void moves(){
//         System.out.println("Up , Dawn , Left , Right ");
//     }
// }
// class King implements ChessPlayer{
//     public void moves(){
//         System.out.println("Up , Dawn , Right , Left , Diagonal - (by 1 step )");
//     }
// }
// abstract class AnimaL {
//     AnimaL(){
//         System.out.println("AnimaL constructor called ");
//     }
//     String color ;
//     // AnimaL(){
//     //     color = "Dark Broun";
//     // }
//     void eat(){
//         System.out.println("animals eats ");
//     }
//     abstract void walks();
// }
// class Horse extends AnimaL{
//     Horse (){
//         System.out.println("Horse Constructor called .....");
//     }
//     void color(){
//         color = "Dark broun";
//     }
//     void walks(){
//         System.out.println("Walks on 4 lages ");
//     }
// }
// class Mustng extends Horse{
//     Mustng(){
//         System.out.println("Mustang called...............");
//     }
// }
// class chicken extends AnimaL{
//     chicken(){
//         System.out.println("chicken constructor called...........");
//     }
//     void color(){
//         color = "yello";
//     }
//     void walks(){
//         System.out.println("walks on 2 lages");
//     }
// }
// class Calculator {
//     int sum(int a , int b ){
//         return a + b; 
//     }
//     float sum(float a , float b){
//         return a + b ; 
//     }
//     int sum (int a , int b , int c ){
//         return a + b + c ; 
//     }
// }
// class Student {
//     String name ;
//     int roll; 
//     String password ;
//     int marks[];

//     // Shallow Copy Constructor
//     // Student (Student S1){
//     //     marks = new int[3];
//     //     this.name = S1.name;
//     //     this.roll = S1.roll;
//     //     this.marks = S1.marks;
//     // }
//     // deep copy Constructor
//     Student(Student S1){
//         marks = new int[3];
//         this.name = S1.name;
//         this.roll = S1.roll;
//         for(int i=0; i<marks.length; i++){
//             this.marks[i]=S1.marks[i];
//         }
//     }
//     // Lazy copy // google read
//     Student(){
//         marks = new int[3];
//         System.out.println("Constructor is called .....");
//     }
//     Student(String name){
//         marks = new int[3];
//         this.name = name;
//     }
//     Student(int roll){
//         marks = new int[3];
//         this.roll = roll;
//     }
    
// }
// // class Student {
// //     String name ;
// //     int roll ;
    
// //     Student(){
// //         System.out.println("hello i  am nikhil ");
// //     }
// //     Student(String name){
// //         this.name = name;
// //     }
// // }
// class BankAccount{
//     public String userName;
//     private String password;
//     void setUserName(String newUserName){
//         userName = newUserName;
//     }
//     void setpassword(String newPassword){
//         password = newPassword;
//     }

// }
// class Pen {
//     private String color;
//     private int tip;
//     String getColor(){
//         return this.color;
//     }
//     int getTip(){
//         return this.tip;
//     }
//     void setcolor(String newColor){
//         color = newColor;
//     }
//     void setTip(int newTip){
//         tip = newTip;
//     }
// }
// // Base class
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("eats any things");
//     }
//     void breathe(){
//         System.out.println("Breathes");
//     }    
// }
// class Dear extends Animal {
//     void eats (){
//         System.out.println("eats grass ");
//     }
// }
// class Mammals extends Animal{
//     void wlak(){
//         System.out.println("walks ");
//     }
// }
// class Fist extends Animal{
//     void Swim(){
//         System.out.println("Swim");
//     }
// }
// class Bird extends Animal {
//     void flay(){
//         System.out.println("Flay");
//     }
// }
// class Dog extends Mammals{
//     String Breads;
// }
// // Derived class / subclass
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Swing in water");
//     }
// }

