## Programming Basics ##
###  Data types, Operators and Variables ###
- A variable is a data container that saves the data values during Java program execution.
	- Variable declaration: 
		- syntax: Datatype variableName;
		- E.g: int classSize; double myBankBalance;
	- Variable Initialization:
		- syntax: Datatype variableName = value;
		- E.g: int classSize = 100; double myBankBalance = 100.00;

-  A data type is define the type of values which are stored in a variable. They are mainly classified into 2 different categories 
	1. Primitive data types: predefined in Java and those are the “basic” data values. There are eight types
		i. boolean -- used for true and false values
		ii. char -- used for single character
		iii. whole number type : four different kinds of integer values
			byte - 1 byte 	(range : -128 to 127), 
			short - 2 bytes (range : -32,768 to 32,767),
			int - 4 bytes 	(range : -2,147,483,648 to 2,147,483,647),
			long - 8 bytes 	(range : -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807),
		iv. Decimal data types: two different kinds of decimal number(numbers with a decimal point) values
			float - 4 bytes,  8 digits of accuracy,  (range : 3.4e-0.38.. 3.4e+0.38),
			double - 8 bytes, 15 digits of accuracy (range : 1.7e-308.. 1.7e+308),
	2. Reference data types: “advanced” data values that contain address/reference of complex data(i.e objects)
		Further in the next tutorial, you'll find more details.

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
- Arithmetic operations - Perform arithmetic operations such as addition, subtraction, multiplication, division and modulus.
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
- Relational operators - It defines some kind of relation between two entities. the result is boolean value.
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
- Equality and inequality - It defines whether two entities are equal or not equal. the result is boolean value.
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
	1. && (and) : True if both the operands is true

	| 	   a  	 | 	   b  	  |     a && b 	  |
	| ---------- | ---------- | ------------- |
	| 	 true	 | 	  true	  |  	 true	  |
	| 	 true	 | 	  false	  |  	 false	  |
	| 	 false	 | 	  false	  |  	 false	  |
	| 	 false	 | 	  false	  |  	 false	  |
	
	2. || (or)	: True if either of the operands is true

	| 	   a  	 | 	   b  	  |     a || b 	  |
	| ---------- | ---------- | ------------- |
	| 	 true	 | 	  true	  |  	 true	  |
	| 	 true	 | 	  false	  |  	 true	  |
	| 	 false	 | 	  false	  |  	 true	  |
	| 	 false	 | 	  false	  |  	 false	  |
	
	3. ! (not)	: True if an operand is false

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
> Logical Operations are evaluated left to right. && has higher precedence than ||. 

> during && execution, it need to evaluate both (left and right) sides of &&.

> during || execution, if left side operation is true then it doesn't need to evaluate the right side of ||.

- Unary operators - Unary operators are the one that needs a single operand 
	1. ++ used to increment a value by 1.
		a++ is post-increment operator
		++a ia pre-increment operator
	2. -- used to decrement a value by 1.
		a-- is post-increment operator
		--a ia pre-increment operator
	3. Operator Order of precedence

- Assignment Operators - used to assign a new value to a variable
	1. = Assigns values from right side operands to left side operand
	2. += adds right operand to the left operand and assigns the result to left operand
	3. -= subtracts right operand from the left operand and assigns the result to left operand
	4. \*= multiplies right operand with the left operand and assigns the result to left operand
	5. /= divides left operand with the right operand and assigns the result to left operand
	6. %= modulus using two operands and assigns the result to left operand.

- Control statements
	1. If else
	2. While
	3. do-while
	4. for
	5. Switch
