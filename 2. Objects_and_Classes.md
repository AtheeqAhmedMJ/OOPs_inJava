

# Classes & Objects in Java 

Before we dive deeper into OOP, let’s first understand the **building blocks**:
**Classes** and **Objects**

---

## What is a Class?

* A **class** is like a **blueprint** or **template**.
* It defines **how objects will look and behave**.
* For example: The design of a **Car** → it tells us cars have color, speed, and the ability to drive.

---

## What is an Object?

* An **object** is a **real-world instance** created from the class.
* If the class is the **Car design**, then `car1`, `car2`, `car3` are **actual cars**.
* Each object has:

  * **State (Data/Attributes)** → like color, model, speed.
  * **Behavior (Methods/Actions)** → like drive, stop, honk.

---

## Syntax Rules for Classes

1. A class is defined using the `class` keyword.
2. The **name** of the class:

   * Should start with a **capital letter**.
   * Cannot have spaces or special characters (except `_`).
   * Example: `Student`, `BankAccount`, `Car`.
3. The **whole program** (variables + methods + logic) goes **inside the class**.
4. By convention, file name should match the class name.

---

## Syntax Rules for Objects

1. Objects are created using the **`new` keyword**.
2. General syntax:

   ```
   ClassName objectName = new ClassName();
   ```
3. Each object has its **own copy** of the class’s variables.
4. You can create **many objects** from one class.
5. Objects live in the **heap memory**, and variables (like `car1`, `car2`) just **reference** them.

---

## Constructors in Java

Now, how do we actually **create and initialize** objects?
👉 That’s where **constructors** come in.

---

### What is a Constructor?

* A **constructor** is a **special method** inside a class.
* It is called **automatically** when an object is created.
* Its main job: **initialize object values**.

---

### Rules of Constructors

1. The constructor name **must be the same** as the class name.
2. A constructor does **not have a return type** (not even `void`).
3. It is called automatically when you use the **`new` keyword**.
4. If you don’t define a constructor, Java provides a **default constructor** (with no parameters).
5. You can have **multiple constructors** → this is called **Constructor Overloading**.

---

### Types of Constructors

#### 1. Default Constructor

* Has **no parameters**.
* Sets default values for the object.
* If you don’t create one, Java gives you one automatically.

#### 2. Parameterized Constructor

* Takes **parameters** to assign values when the object is created.
* Gives flexibility to initialize objects differently.

---
now next we will write a simple program with the concepts we have leanrt
