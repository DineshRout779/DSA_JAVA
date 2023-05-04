# Operators

Java provides a rich operator environment. Most of its operators can be divided
into the following four groups: arithmetic, bitwise, relational, and logical. Java
also defines some additional operators that handle certain special situations.
This chapter describes all of Java’s operators except for the type comparison
operator instanceof.

## Arithmetic Operators

| Syntax | Description    |
| ------ | -------------- |
| +      | Addition       |
| -      | Subtraction    |
| \*     | Multiplication |
| /      | Division       |
| %      | Modulus        |
| ++     | Increment      |
| --     | Decrement      |

## The Bitwise Operators

Java defines several bitwise operators that can be applied to the integer types:
long, int, short, char, and byte. These operators act upon the individual bits of
their operands. They are summarized in the following table

| Syntax | Description       |
| ------ | ----------------- |
| ~      | Bitwise Unary NOT |
| &      | Bitwise AND       |
| \|     | Bitwise OR        |
| ^      | Bitwise XOR       |
| >>     | Bitwise right     |
| <<     | Bitwise left      |

## Relational Operators

The relational operators determine the relationship that one operand has to the
other. Specifically, they determine equality and ordering. The relational
operators are shown here

| Syntax | Description              |
| ------ | ------------------------ |
| ==     | Equal to                 |
| !=     | Not equal to             |
| >      | Greater then             |
| <      | Lesser than              |
| >=     | Greater than or equal to |
| <=     | Lesser than or equal to  |

The outcome of these operations is a **boolean** value.

## Boolean Logical Operators

The Boolean logical operators shown here operate only on boolean operands.

| Syntax | Description       |
| ------ | ----------------- |
| &      | AND               |
| \|     | OR                |
| ^      | XOR               |
| \|\|   | Short Circuit OR  |
| &&     | Short Circuit AND |
| !      | Unary NOT         |

## The Assignment Operator

The assignment operator is the single equal sign, =.
The assignment operator works in Java much as it does in any other computer
language. It has this general form

```java
var = expression;
```

## Ternary Operator

Java includes a special ternary (three-way) operator that can replace certain
types of if-then-else statements. This operator is the ?. It can seem somewhat
confusing at first, but the ? can be used very effectively once mastered. The ?
has this general form:

```java
expression1 ? expression2 : expression3
```
