Before delving deep into OOPs, lets understand what is Call By Value or Call By Reference 

1. Java always uses "call by value"

But here’s the twist:

For primitive types (like int, double), the value itself is copied.

For objects, the value of the reference (memory address) is copied.
So the function still points to the same object, but the reference itself is a copy.

2. Call by Value with Primitive
class Demo {
    void changeNumber(int x) {
        x = 100;  // only changes the copy
    }

    public static void main(String[] args) {
        int a = 5;
        new Demo().changeNumber(a);
        System.out.println(a);  // prints 5, original not changed
    }
}


Explanation: a is 5. When passed, Java copies the value 5. Inside the method, x changes, but a is unaffected.

3. Call by Value with Object Reference
class Student {
    String name;
}

class Demo {
    void changeName(Student s) {
        s.name = "Alice";  // changes the actual object
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Bob";
        
        new Demo().changeName(st);
        System.out.println(st.name);  // prints Alice
    }
}


Explanation:

st holds a reference (address) to the object.

Java passes a copy of this reference into changeName().

Both the original and the copy point to the same object in memory.

So when you modify the object (s.name = "Alice"), the change is visible outside.
