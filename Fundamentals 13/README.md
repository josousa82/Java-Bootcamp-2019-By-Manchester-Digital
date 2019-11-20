# Fundamentals 13

Try all of these challenges using TDD.


ISBN - International Standard Book Number
---------------------------------------------
There are two ISBN standards: ISBN-10 and ISBN-13.
Support for ISBN-13 is essential, whereas support
for ISBN-10 is optional.
Here are some valid examples of each:

|Format| Examples|
|---|---:|
|ISBN-10|    0471958697|
||0 471 60695 2|
||0-470-84525-2|
||0-321-14653-0|
|--|--|
|ISBN-13|    9780470059029|
||978 0 471 48648 0|
||978-0596809485|
||978-0-13-149505-0|
||978-0-262-13472-9|

ISBN-10 is made up of 9 digits plus a check digit (which
may be 'X') and ISBN-13 is made up of 12 digits plus a
check digit. Spaces and hyphens may be included in a code,
but are not significant. This means that 9780471486480 is
equivalent to 978-0-471-48648-0 and 978 0 471 48648 0.

The check digit for ISBN-10 is calculated by multiplying
each digit by its position (i.e., 1 x 1st digit, 2 x 2nd
digit, etc.), summing these products together, doing a 
modulo of 11 and then taking that result and subtracting 
it from modulo 11 (with 'X' being used if the result
is 10).

The check digit for ISBN-13 is calculated by multiplying
each digit alternately by 1 or 3 (i.e., 1 x 1st digit,
3 x 2nd digit, 1 x 3rd digit, 3 x 4th digit, etc.), summing
these products together, taking modulo 10 of the result
and subtracting this value from 10, and then taking the
modulo 10 of the result again to produce a single digit.

## Challenge 1:

Create a solution that takes a string and returns true
if that is a valid ISBN-13 and false otherwise.

## Challenge 2:

Also validate ISBN-10 in another method.

---

## Congestion Charge

### Description

In order to provide a restriction of vehicles passing through the city centre, Manchester council would like to introduce a congestion fee.

### Requirements

Given a vehicle

- If the vehicle has CO emissions below 2.5g then no charge is applied.
- If the vehicle is diesel and has a Particulate Matter (PM) level over 0.15, then a further charge is
applied.
- If the vehicle has CO emissions above 2.5g, a charge is applied.

CO Charges are applied as:

| Vehicle Type| Charge|
|---|---| 
|Car|500|
|Van|600|
|HGV|800|

Particulate Matter (PM) Charge: 20% extra applied.

- If the vehicle is marked as a delivery vehicle then it is excluded provided it is a registered as a delivery vehicle.

#### Additional requirement:

- If the vehicle has been deemed illegal then it is fined 1000. Illegal means that the vehicle’s road tax has expired.
- Emergency vehicles are exempt from the scheme.

**All penalties must be applied to the registered keeper of the vehicle. **

Challenge:

Your challenge is to derive a solution that can take in various vehicles and check their emissions and their legality and if required, print a fine.

---


## Musify

### Description

Musify is a new start up and would like to introduce a new service where people can share music amongst their friends and create shared music playlists.

To allow this to happen, the business would like a way of allowing users to be managed on the service.

### Requirements

Given a user ...

- When a user provides a first name, last name, email address and password, then user should be created.
- When a user provides an email address and password then user will be authenticated

### Extras:
- When a user provides an email address and password and they choose to use a third party authenticator then authentication performed.

Authentication must use the following sponsor authentication mechanisms:

|Sponsor|
|--|
|Facebook|
|Google|
|Instagram|

---

## Alone 

We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it. Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.

notAlone([1, 2, 3], 2) → [1, 3, 3]

notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]

notAlone([3, 4], 3) → [3, 4]

---


## String Expression

Write a program such that when given a string parameter, which will perform a mathematical operation and return the result, in words.

Numbers 0-9 and the symbols "plus" and "minus" are the only inputs allowed in the single parameter the program recieves.

For example:

stringExpression( "onezeropluseight" ) -> "oneeight"

stringExpression( "oneminusoneone" ) -> "negativeonezero"

---

## Word Splitter

When given a method with two arguments, the second is a comma separated list. The first is a whole word.

If the second contains words that make up the "whole word" then each word is split.

For example:

“Baseball”, “a,all,b,ball,bas,base,cat,code,d,e,quit,z”

Should return “base,ball”

---


## Scrambler

Given two strings, when passed a scrambled string, if passed a second one the method will return true if the second word contains all letters in the first.

Such as

scrambler(“cdoer”, “coder”) -> true 

scrambler(“hello”, “hkllo”) -> false

---


## Power Set

The input for this problem will be an array of numbers representing a set, which only contains unique numbers, and your goal is to print every possible set combination, otherwise known as the power set. For example:

input set = [1, 2, 3]

power set = [[], [1], [2], [3], [1, 2], [2, 3], [1, 3] [1, 2, 3]] 

Example:

powerSet([1, 2, 3]) -> [[], [1], [2], [3], [1, 2], [2, 3], [1, 3] [1, 2, 3]] 

---


Array Sum

Given an array of several arrays that each contain integers and your goal is to write a function that will sum up all the numbers in all the arrays.

For example, if the input is [[3, 2], [1], [4, 12]] 

then your program should output 22 because 3 + 2 + 1 + 4 + 12 = 22. 

---

