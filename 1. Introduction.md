INTRODUCTION
OOPs stands for:

- **O** – Object  
- **O** – Oriented  
- **P** – Programming  
- **s** – Systems  

It is a **programming paradigm** (a style of writing programs), popularised by **Java**.  
The whole idea is based on **objects** – which represent real-world entities.  

Each **object** has:
- **Entity (State)** → data, variables, attributes  
- **Behavior** → methods, actions, functions  

---

## Pillars of OOPs
There are four main pillars that make up OOP:

1. **Encapsulation** – Binding data and methods together (like a capsule).  
2. **Inheritance** – Reusing code by deriving new classes from existing ones.  
3. **Polymorphism** – Same operation behaves differently in different contexts.  
4. **Abstraction** – Hiding implementation details, showing only essential features.  

---

## Why Do We Use OOPs?

1. **Reusability**  
   - With concepts like **inheritance**, we don’t need to write the same code again and again.  

2. **Flexibility & Extensibility**  
   - New features can be added, and fixes can be made without rewriting everything.  

3. **Better Understanding**  
   - Code is modular → divided into small classes → easy to read and maintain.  

4. **Security**  
   - Through **encapsulation**, sensitive data can be hidden and safely exposed via methods.  

---

## When and Where Do We Use Each Pillar?

### 1. Encapsulation
- **What it is:**  
  Wrapping data (variables) and code (methods) into a single unit, with controlled access.  

- **When/Where to use:**  
  - When you want to hide sensitive information (like password, salary, account balance).  
  - When you want to allow controlled access using getters and setters.  

---

### 2. Inheritance
- **What it is:**  
  Creating new classes from existing ones using the `extends` keyword.  

- **When/Where to use:**  
  - When multiple classes share common properties.  
  - To avoid code duplication.  

---

### 3. Polymorphism
- **What it is:**  
  “Many forms” — the same method behaves differently depending on the object.  

- **Types:**  
  - **Compile-time (Overloading):** Same method name, different parameters.  
  - **Runtime (Overriding):** Child class modifies parent’s method.  

- **When/Where to use:**  
  - When you want different classes to respond differently to the same action.  
  - Example: `sound()` for Dog (bark), Cat (meow), Cow (moo).  

---

### 4. Abstraction
- **What it is:**  
  Hiding implementation details and exposing only the essential functionalities.  
  Achieved using interfaces and abstract classes.  

- **When/Where to use:**  
  - When you want to define rules/contracts but not the full implementation.  
  - Example: A `Payment` interface → implemented by `UPI`, `CreditCard`, `Wallet`.  

---

## Summary Table

| Concept         | Definition | When/Where to Use |
|-----------------|------------|--------------------|
| Encapsulation   | Binding data + methods, using getters/setters | To secure and control access to sensitive data |
| Inheritance     | Reuse code by extending classes | When multiple classes share common behavior |
| Polymorphism    | Same method, different behavior (overloading/overriding) | When different classes must act differently for the same action |
| Abstraction     | Hiding implementation, showing only essentials | To define rules/contracts (APIs, Payment systems) |

---

In short:  
OOP in Java makes programs modular, reusable, secure, and closer to real-world thinking. That’s why it is one of the most popular approaches to building large-scale, maintainable software.  
