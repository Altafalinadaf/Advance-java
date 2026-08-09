package enumExample;


// enum are names constant 
// rather than using string we can use enum 
/*
Why use enum when we already have String?

Because enum is type-safe, avoids invalid values, and is easier to maintain.

Example using String
String status = "PAID";

Someone might accidentally write:

status = "paid";
status = "Paid";
status = "PAIDD";

These are all strings, so the compiler won't catch the mistake.

Example using enum
enum Status {
    PAID, PENDING, CANCELLED
}

Status status = Status.PAID;

Now if someone writes:

status = Status.PAIDD;

❌ Compile-time Error

The compiler prevents invalid values.

Advantages of enum over String
String	Enum
Can store any text	Only predefined constants
Typing mistakes are possible	Compile-time checking
Less readable	More readable
Not type-safe	Type-safe
Harder to maintain	Easier to maintain

Example 1 :
Real-Time Example
Without enum
String day = "Monady";   // Typo

No compile-time error, but your program may behave incorrectly.

With enum
enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}

Day day = Day.MONDAY;

Only valid days can be assigned.
 */
enum Status{
    Running, Failed, Pending, Success
}

public class Demo {
    public static void main(String[] args) {
        Status s=Status.Pending;
        // print the status pending
        System.out.println(s);
        // print the index value, index value start from 0
        System.out.println(s.ordinal());

        // if you want to print whole values
        Status[] s2=Status.values();
        for(Status n :s2){
            System.out.println(n);
        }
        
    }

}
