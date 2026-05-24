# Java Scanner & User Input Tasks ☕

## Task 1 — Import Scanner
Add the Scanner import statement to your program.

```java
import java.util.Scanner;
```

---

## Task 2 — Create a Scanner Object
Create a Scanner object called `input`.

```java
Scanner input = new Scanner(System.in);
```

---

## Task 3 — Ask For A Name
Ask the user to enter their name.

Example:

```java
System.out.println("Enter your name:");
```

---

## Task 4 — Store A Name
Create a String variable that stores the user's name.

Example:

```java
String name = input.nextLine();
```

Display the result back to the user.

---

## Task 5 — Ask For An Age
Ask the user to enter their age.

Store the value inside an integer variable.

Example:

```java
int age = input.nextInt();
```

Print the age back to the console.

---

## Task 6 — Ask For Height
Ask the user to enter their height.

Store the value inside a double variable.

Example:

```java
double height = input.nextDouble();
```

Display the height back to the user.

---

## Task 7 — Ask For A Grade
Ask the user to enter a grade such as:

```text
A
B
C
```

Store the first character inside a char variable.

Example:

```java
char grade = input.next().charAt(0);
```

Print the result.

---

## Task 8 — Create A Personal Profile
Ask the user for:

- Name
- Age
- Height
- Grade

Store the values in variables and display a profile.

Example:

```text
Name: Lewis
Age: 21
Height: 1.80
Grade: A
```

---

## Task 9 — Experiment With Different Questions
Create your own questions such as:

- Favourite game
- Favourite movie
- Favourite food
- Dream job

Store the answers and display them back to the user.

---

## Task 10 — Interactive Program 🚀
Create a small interactive Java program using Scanner.

Ideas:

- Favourite things survey
- Student profile creator
- Simple questionnaire
- About me generator

Use at least:

- 1 String
- 1 int
- 1 double
- 1 char

and display all results at the end.