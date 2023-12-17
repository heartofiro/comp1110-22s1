# COMP1110/6710 2022 S1 Exam

This repo contains an IntelliJ project for the 2022 S1 exam.

You have **3 hours and 15 mins** to complete the exam. The first 15 minutes
is set aside for "reading time" in which you should look through the questions
and plan out your strategy to complete the exam; however, we will not be
enforcing this so you may start coding at any point.

This exam is open book. This means that you may use books, notes, and any
other such *pre-existing* information as you complete the exam.

You **must not** communicate with any person other than the examiners at any time during
the exam.

Chat, text, email and all other such forms of communications **must**
be turned off prior to the exam and must remain off for the **duration of the
exam**. **The penalties for cheating in an exam at ANU are severe.**

Important notes:

* There are eight (8) questions, each worth different marks.
* The total marks for the exam are 90 (5 + 5 + 5 + 5 + 25 + 20 + 5 + 20).
* The exam will be **entirely auto-graded**, so it is important that your code
  passes the tests, and that you commit and push your work.
* The CI for the multiple choice question will *not* tell you whether your
  answer is correct, it will only tell you if your answer is *formatted correctly*.
* There are two practice questions, **P1** and **P2**. You do not need to
  complete them. They are worth **zero** marks. They are there
  only to help you prepare your environment for the exam.

---

## Q1 [5 Marks] Basic Imperative Programming

Using the incomplete template for `Q1Outside.java`, complete the unimplemented method.

Use the tests provided to test your solution, and then commit and push your changes to GitLab.

## Q2 [5 Marks] Recursion

Using the incomplete template for `Q2ThreeFour.java`, complete the unimplemented method.

Use the tests provided to test your solution, and then commit and push your changes to GitLab.

## Q3 [5 Marks] Search

Using the incomplete template for `Q3Hiking.java`, complete the unimplemented method.

Use the tests provided to test your solution, and then commit and push your changes to GitLab.

## Q4  [5 Marks] File I/O, Imperative Programming

Using the incomplete template for `Q4Occurrences.java`, complete the unimplemented method.

Use the tests provided to test your solution, and then commit and push your changes to GitLab.

## Q5 [25 Marks] Implementation and Testing

### Q5.1 [20 Marks] Software Implementation

Using the incomplete template for `Q5Forum.java`, complete **all** unimplemented methods.

You must complete your solution as a **single file**, `Q5Forum.java`. You are encouraged to
create additional classes as required to solve the problem; any additional classes must be
implemented as **nested classes** within `Q5Forum`.

Use the tests provided to test your solution, and then commit and push your changes to GitLab.

### Q5.2  [5 Marks] Software Testing

Using the incomplete template for `Q5GetMaxPeopleTest.java`, write one or more unit tests for the
`getMaxPeople` method from the `Q5Forum` class. You must complete your solution as a
**single file**, `Q5GetMaxPeopleTest`. When writing the tests, you may assume that the provided
methods in the `Q5Forum` class are correctly implemented.

The specification of the `getMaxPeople` method is provided in the Javadoc comment immediately above
the method. This question is auto-graded; your tests will be run against multiple implementations of
the `getMaxPeople` method, one of which is correct and some incorrect. Your test must be able to
pass the correct implementation. If you cannot pass the correct implementation you will get zero (
regardless of how many incorrect implementations you fail). If you pass the correct implementation,
you will get one mark, and then one additional mark for each incorrect implementation that you fail.

Once you have completed your tests, commit and push your changes to GitLab.

## Q6 [20 Marks] Data Structures

Using the incomplete template for `Q6Escalators.java` complete each of the unimplemented
methods.

Your solution must implement the data structure from first principles (as was done in lectures),
avoiding use of Java's collection classes such as `java.util.List`. *Solutions that ignore this
requirement will be penalized accordingly.*

Use the tests provided to test your solution, and then commit and push your changes to GitLab.

## Q7 [5 Marks] Hash Codes

Using the incomplete template for `Q7BoardGame.java`, complete the overridden methods `hashCode()`
and `equals()` correctly, according to the contract of these methods. Your hash function should be
as uniform as possible. In implementing your hash code, you may not use the default Java
implementations in `Object.hashCode()`, `Objects.hashCode()` or `Objects.hash()`.

Use the tests provided to test your solution, and then commit and push your changes to GitLab.

## Q8 [20 Marks] Multiple Choice

For each of the following multiple-choice questions, identify the choice that
provides the best answer. Record your choices in the file [q8.csv](q8.csv),
one line per question.

For example, to answer "a" to question Q8.1, "d" to question Q8.2, "a" to
question Q8.4, and leave question Q8.3 unanswered, you would record the following
in `q8.csv`:

 ````
1,a
2,d
4,a
````

Please note that you can only provide **one** answer to any multiple choice
question. Please choose the answer that you think is the best answer. If
you are unsure, leave it out, as in the example above where question 3 is left
out.

Each question that is *correctly* answered **gains you 5 marks**, each question
answered *incorrectly* **loses you 1 mark**, a question left *unanswered*
**neither loses nor gains marks**. The final mark for the question is calculated
by bounding the sum of marks between 0 and 20. For example, if you answered all
questions correctly in the exam you would gain 20. If you answer 1 correctly
and 2 incorrectly you would gain 3/20.

The exam CI will check whether your answer is *correctly formatted*. Note that
the CI won't tell you whether your answer is *correct*. After you finish your
questions you should **commit** your `q8.csv` file and **push** it to the
server. You should check the CI for any error messages relating to `Q8` and
fix them if they exist.  

### Q8.1 [5 marks] Threads

Given the following Java class:

```java
public class Foo implements Runnable {
    private boolean[] values = new boolean[]{true, false, true, true};
    private int nextIndex = 0;
    private int trues = 0;
    private int falses = 0;
    
    private int claimNext() {
        return nextIndex++;
    }
    
    private synchronized void update(boolean truth) {
        if (truth) {
            trues += 1;
        } else {
            falses += 1;
        }
    }

    @Override
    public void run() {
        int i = 0;
        while ((i = claimNext()) < values.length) {
            update(values[i]);
        }
    } 
}
```

If two threads are created with the same instance of `Foo`, which of the following
is *not* a possible outcome after both threads have run to completion:

a) trues = 3; falses = 1

b) trues = 6; falses = 2

c) trues = 3; falses = 2

d) trues = 2; falses = 2

e) trues = 4; falses = 1



### Q8.2 [5 marks] JavaFX

Consider the following section of code for a JavaFX program:

```java
@Override
public void start(Stage stage) throws Exception {
    var root = new Group();
    var scene = new Scene(root, 200, 400);

    var txt = new Text("1");
    txt.setY(200);
    scene.setOnMouseClicked((e) -> txt.setText("2"));
    scene.setOnKeyTyped((e) -> {
        var key = e.getCharacter();
        if (key.equals("2")) {
            txt.setText("3");
        } else if (key.equals("3")) {
            txt.setText("4");
        } else if (key.equals("a")) {
            txt.setText("5");
        } else if (key.equals("b")) {
            txt.setText("6");
        } else {
            txt.setText(key);
        }
    });

    root.getChildren().add(txt);
    stage.setScene(scene);
    txt.setText("9");

    stage.show();
}
```

Which of the following best describes the sequence of text values in the window after running
the program and typing the keys `a`, `b`, `1`:

a) 2, a, b, 1

b) 1, a, b, 1

c) 2, 5, 6

d) 9, 5, 6, 1

e) 9, a, b, 1


### Q8.3 [5 marks] Complexity

Consider the following method:

```java
public static int find(ArrayList<Integer> array, int value) {
    var extra = 0;
    while (extra < array.size()) {
        if (array.contains(value + extra)) {
            return extra;
        }
        extra += 1;
    }
    return extra;
}
```

Which of the following statements is correct, where "n" is the length of the input array:

a) `find` has worst-case time complexity of O(1).

b) `find` has best-case time complexity of O(n).

c) `find` has worst-case time complexity of O(n).

d) `find` has worst-case time complexity of O(n log n).

e) `find` has worst-case time complexity of O(n^2).

### Q8.4 [5 marks] Grammars

This question relates to sentences (statements) in a language defined by a simple EBNF grammar. For
reference, some symbols of EBNF are as follows:

```
= defines a production rule
, concatenation
| alternation / choice
[...] optional - zero or one
{...} optional - zero or more
(...) grouping
- exception
; terminates a production rule.
```

Consider the following EBNF grammar:

```
wilderness = (forrest | river) , {" " , (forrest | river)};
river_animal = "trout" | "bear";
forrest_animal = "bear" | "rabbit";
mushroom = "m";
shrub = "s";
flora = mushroom | shrub;
river = "~" , [river_animal , {" ", river_animal}] , "~";
forrest = "^" , [flora, {" " , (forrest_animal | river | flora)}] , "^";
```

Identify which of the following strings cannot be produced by the grammar:

a) `~bear~ ^m rabbit bear^ ~~ ^^ ^^`

b) `^m bear rabbit m^ ~trout~ ^s ~~ ~~^ ^s bear m ~~^`

c) `~bear trout bear~ ^s ~trout~ m^`

d) `~trout trout~ ^rabbit m ~bear~^`

e) `^s ~~ s^ ^s ~~ s^ ~trout trout~ ^s rabbit m ~bear~^`


---

*This is the end of the exam. Instructions for the practice questions follow.*

---

## Practice Questions

These are instructions for what to do **before** the exam.

You should do the two practice questions below, and ensure that they work in
your environment.   You should check:
 
1. that the provided test for P1 works correctly in IntelliJ,
2. that you can successfully pass the test for P1,
3. that you can fill in the answers for P2,
4. that you can commit and push your work,
5. that the CI says that you have passed P1 and that P2 has been checked.

Note that the CI will not tell you whether the multiple choice question P2 is
correct or incorrect, it will only tell you whether it was correctly formatted.

Remember, the questions below are **practice** questions which you should attempt
during the practice *before* the exam. The practice questions are here *only*
to help you check that your environment is working correctly.  **The practice
questions are not worth any marks.**
  
The first is an example of a programming question.

### P1 [0 Marks] Hello World

Using the incomplete template for `P1HelloWorld.java`, complete the unimplemented method.

Use the tests provided to test your solution, and then commit and push your changes to GitLab.

### P2 [0 Marks] Sample Multiple Choice

For each of the following multiple-choice questions, identify the choice that
provides the best answer. Then, record your choice in the file
[p2.csv](p2.csv), one line per question.

For example, to answer "a" to practice question P2.1, "d" to P2.2, "a" to P2.4,
and leave P2.3 blank, you would record the following in `p2.csv`:

 ````
1,a
2,d
4,a
````

These *practice* questions are worth **zero** marks. In the actual exam, there
will be four multiple-choice questions. Each correct answer gains you 5 marks;
each incorrect answer loses you 1 mark; a question left unanswered neither
loses nor gains marks. The final mark for the question in the exam is
calculated by bounding the sum of marks between 0 and 20. For example, if you
answered all questions correctly in the exam, you would gain 20. If you answer
1 correctly and 2 incorrectly, you would gain 3/20.

Once you have answered the questions, you should **commit** your `p2.csv` file
and **push** it. You should **check the exam CI** to see whether it passed the
formatting check. If it did not, you should read the error messages and fix up
any formatting problems with your answer. *Note that the CI won't tell you
whether your answers are correct, only whether they are correctly formatted.*

### P2.1 [0 Marks] Sky

Which of the following colours best represents the colour of the sky?

a) blue

b) green

c) pink

d) purple

e) yellow

### P2.2 [0 Marks] Maths

Which of the following numbers best represents the result of the
addition `2 + 2`?

a) 3

b) 2

c) 4

d) 5

e) 1

### P2.3 [0 Marks] Animals

Which of the following animals is most closely associated with Australia?

a) tiger

b) elephant

c) kangaroo

d) lion

e) bear

### P2.4 [0 Marks] Cars

Which of the following brands is best known as a car manufacturer?

a) Microsoft

b) Qantas

c) Toyota

d) Coca Cola

e) Facebook
