## Programming Basics ##
###  Data types, Operators and Variables ###
- A variable is a data container that saves the data values during Java program execution.
	- Variable declaration: 
		- syntax: Datatype variableName;
		- E.g: int classSize; double myBankBalance;
	- Variable Initialization:
		- syntax: Datatype variableName = value;
		- E.g: int classSize = 100; double myBankBalance = 100.30;

-  A data type defines the type of values stored in a variable. They are mainly classified into two different categories 
	- Primitive data types: predefined in Java, and those are the "basic" data values. There are eight types
		- boolean -- used for true and false values
		- char -- used for a single character
		- whole number type: four different kinds of integer values
			- byte - 1 byte 	(range: -128 to 127), 
			- short - 2 bytes (range: -32,768 to 32,767),
			- int - 4 bytes 	(range: -2,147,483,648 to 2,147,483,647),
			- long - 8 bytes 	(range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
		- Decimal data types: two different kinds of decimal number (numbers with a decimal point) values
			- float - 4 bytes size and eight digits of accuracy,  (range: 3.4e-0.38.. 3.4e+0.38),
			- double - 8 bytes size and 15 digits of accuracy (range: 1.7e-308.. 1.7e+308),
	- Reference data types: "advanced" data values that contain the address/reference of complex data(i.e. objects)
> Further in the next tutorial(Object-oriented programming), you'll find more details.

### Data Type Example ###
```
public static void main(String[] args) {
	boolean booleanVariable = true;
	char charVariable = 'a';
	byte byteVariable = 32;
	short shortVariable = 23456;
	int intVariable = 56789;
	long longVariable = 123456789l;
	float floatVariable = 123456.78f;
	double doubleVariable = 123456.78;		
	System.out.println("Boolean :" +booleanVariable);
	System.out.println("Character :" +charVariable);
	System.out.println("Byte :" +byteVariable);
	System.out.println("Short :" +shortVariable);
	System.out.println("Integer :" +intVariable);
	System.out.println("Long :" +longVariable);
	System.out.println("Float :" +floatVariable);
	System.out.println("Double :" +doubleVariable);
}
```
- Arithmetic operations - Perform arithmetic operations such as addition, subtraction, multiplication, division, and modulus.
	1. \+ for addition
	2. \- for subtraction
	3. \* for multiplication (Old computers did not have the x character)
	4. / for division
	5. % for remainder
    ```
	public static void main(String[] args) {
		int a = 5, b = 3;
		int additionResult = a+b; 
		System.out.println("Sum :" + additionResult);
		int subtractionResult = a-b;
		System.out.println("Subtraction :" + subtractionResult);
		int multiplicationResult = a*b;
		System.out.println("Multiplication :" + multiplicationResult);
		int divisionResult = a/b;
		System.out.println("Division :" + divisionResult );
		int remainderResult = a%b;
		System.out.println("Mod :" + remainderResult);
	}
    ```
- Sign operators (change the sign of the value)
	1. \+ for positive number
	2. \- for negative number
	```
	public static void main(String[] args) {
		int a = +5, b = -3;
		System.out.println("a value :" + a);
		System.out.println("b value :" + b);
	}
    ```
- Relational operators - It defines some kind of relation between two entities. The result is a boolean value.
	1. <    Less than 					(var1 < var2)
	2. <=   Less than or equal to  		(var1 <= var2)
	3. \>	Greater than 				(var1 > var2)
	4. \>=  Greater than or equal to 	(var1 >= var2)
	```
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("is 10 less than 20 :" + (a<b));
		System.out.println("is 10 less than or Equals 20 :" + (a<=b));
		System.out.println("is 10 greater than 20 :" + (a>b));
		System.out.println("is 10 greater than or Equals 20 :" + (a>=b));
	}
    ```
- Equality and inequality - It defines whether two entities are equal or not equal. The result is a boolean value.
	1. == 	Test if equal
	2. != 	Test if not equal
	```
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("is 10 Equals 20 :" + (a==b));
		System.out.println("is 10 not Equals 20 :" + (a!=b));
	}
    ```
- Logical Operations/short circuit Operations
	- && (and)
		- True if both the operands are true

	| 	   a  	 | 	   b  	  |     a && b 	  |
	| ---------- | ---------- | ------------- |
	| 	 true	 | 	  true	  |  	 true	  |
	| 	 true	 | 	  false	  |  	 false	  |
	| 	 false	 | 	  false	  |  	 false	  |
	| 	 false	 | 	  false	  |  	 false	  |

	- \|| (or)
		- True if either of the operands is true
  
	| 	   a  	 | 	   b  	  |     a &#124;&#124; b|
	| ---------- | ---------- | ------------- |
	| 	 true	 | 	  true	  |  	 true	  |
	| 	 true	 | 	  false	  |  	 true	  |
	| 	 false	 | 	  false	  |  	 true	  |
	| 	 false	 | 	  false	  |  	 false	  |


	- ! (not)
		- True if an operand is false

	| 	   a  	 | 	   !a  	  |
	| ---------- | ---------- |
	| 	 true	 | 	  false	  |
	| 	 false	 | 	  true	  |

	```
	public static void main(String[] args) {
		// basic example
		boolean a = true, b = true, c = false;
		System.out.println(" && results : " + (a && b)); 
		System.out.println(" || results : " + (b || c));
		System.out.println(" ! results : " + !b);
		// complex example
		int x = 10, y = 20, z = 30;
		System.out.println(" && results : " + (x<y && y<z));// both x<y and y<z are true 
		System.out.println(" || results : " + (x>y || y<z));// x>y is false but y<z is true
		System.out.println(" ! results : " + !(x>y)); //x>y is false and ! will convert to true
	}
    ```
> Logical Operations are evaluated from left to right. && has higher precedence than ||. 

> During && execution, it needs to evaluate both (left and right) sides of &&.

> During || execution, if the left side operation is true, it doesn't need to evaluate the right side of ||.

- Unary operators - Unary operators are the one that needs a single operand 
	- ++ is used to increment a value by 1.
		- a++ is post-increment operator
		- ++a is pre-increment operator
	```
	public static void main(String[] args) {
		int a = 10;
		int b = a++; // post increment => assign a(10) value to b and increse a value by 1
        System.out.println(b);  //returns 10
        System.out.println(a);  //returns 11
        a = 10;
		b = ++a; // pre increment => increse a value by 1 and assign a(11) value to b
        System.out.println(b);  //returns 11
        System.out.println(a);  //returns 11
    }
	```
	- -- is used to decrement a value by 1.
		- a-- is post-decrement operator
		- --a is pre-decrements operator
		> Practice below problem and check the a and b values
	```
	public static void main(String[] args) {
		int a = 10;
		int b = a--; // post-decrement 
        System.out.println(b);  //what is b value??
        System.out.println(a);  //what is a value??
        a = 10;
		b = ++a; // pre-decrement 
        System.out.println(b);  //what is b value??
        System.out.println(a);  //what is a value??
    }
	```

	- Operator Order of precedence
		- \(\) Brackets are used for separation and prioritizing operations
		- Multiplication, division, and modulo operations precede addition and subtraction operations.
			- e.g: (2 + 3) * 4 is 20
			- e.g:  24 / (3 * (10 - 6)) => 24 / (3 * 4) => 24 / 12 is 2

- Assignment Operators - used to assign a new value to a variable
	1. = Assigns values from right-side operands to left-side operands
	2. += adds the right operand to the left operand and assigns the result to the left operand
	3. -= subtracts the right operand from the left operand and assigns the result to the left operand
	4. \*= multiplies the right operand with the left operand and assigns the result to the left operand
	5. /= divides the left operand from the right operand and assigns the result to the left operand
	6. %= modulus using two operands and assigns the result to the left operand.

- Control statements
	1. If else
	2. Ternary Operator
	2. While
	3. do-while
	4. for
	5. Switch
