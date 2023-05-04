# Data Types, Variables, and Arrays

## Java Is a Strongly Typed Language

It is important to state at the outset that Java is a strongly typed language.
Indeed, part of Java’s safety and robustness comes from this fact. Let’s see
what this means. First, every variable has a type, every expression has a type,
and every type is strictly defined. Second, all assignments, whether explicit or
via parameter passing in method calls, are checked for type compatibility.

### The Primitive Types

Java defines eight primitive types of data

- **Integers** This group includes **byte**, **short**, **int**, and **long**, which are for
  whole-valued signed numbers. It takes **32** bits.
- **Floating-point** numbers This group includes **float** and **double**, which
  represent numbers with fractional precision.
- **Characters** This group includes **char**, which represents symbols in a
  character set, like letters and numbers.
- **Boolean** This group includes **boolean**, which is a special type for
  representing true/false values.

## Variables

The variable is the basic unit of storage in a Java program. A variable is
defined by the combination of an identifier, a type, and an optional initializer.
In addition, all variables have a scope, which defines their visibility, and a
lifetime. These elements are examined next.

### Declaration of a variable

In Java, all variables must be declared before they can be used. The basic form
of a variable declaration is shown here:

```java
type identifier [ = value ][, identifier [= value ] …];
```

Example,

```java
int a = 5;
float avg = 10.55;
```

## Java’s Automatic Conversions

When one type of data is assigned to another type of variable, an automatic
type conversion will take place if the following two conditions are met:

- The two types are compatible.
- The destination type is larger than the source type.

### Casting Incompatible Types

To create a conversion between two incompatible types, you must use a cast.
A cast is simply an explicit type conversion. It has this general form:

```java
(target-type) value
```

Example

```java
int a;
byte b;
// …
b = (byte) a;
```

## Arrays

An array is a group of like-typed variables that are referred to by a common
name. Arrays of any type can be created and may have one or more dimensions.
A specific element in an array is accessed by its index. Arrays offer a
convenient means of grouping related information.

### One-Dimensional Arrays

A one-dimensional array is, essentially, a list of like-typed variables. To create
an array, you first must create an array variable of the desired type. The general
form of a one-dimensional array declaration is

```java
type var-name[ ];
```

Arrays are also declared as,

```java
type[] var-name;
```

Example,

```java
int month_days[];
```

Although this declaration establishes the fact that month_days is an array
variable, no array actually exists. To link month_days with an actual, physical
array of integers, you must allocate one using new and assign it to
month_days. new is a special operator that allocates memory

```java
month_days = new int[12];
```

After this statement executes, month_days will refer to an array of 12 integers.
Further, all elements in the array will be initialized to zero

A program on array

```java
// find average of numbers
public class Array {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        double avg = 0.0;
        for (int i = 0; i < nums.length; i++) {
            avg += nums[i];
        }
        System.out.print(avg / nums.length);
    }
}
```

### Multi-Dimensional Array

In Java, multidimensional arrays are implemented as arrays of arrays. To
declare a multidimensional array variable, specify each additional index using
another set of square brackets. For example, the following declares a two dimensional array variable called twoD:

```java
int twoD[][] = new int[4][5];
```
