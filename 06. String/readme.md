## Array and String ##
- Array data structure
- String
- Immutability
- StringBuffer vs StringBuilder

### Array practice problems ###
**Problem-1:** Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note: that you must do this in-place without making a copy of the array.
Example 1:
```
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
```
Example 2:
```
Input: nums = [0]
Output: [0]
```

**Problem-2:** Find Number of Occurrences

Given an integer array nums, find number of occurrences of each color. Colors are represented as an integer.
Example 1:
```
Input: 
Number of colors: 3
nums = [1,2,3,3,1,2,3,1]
Output: 
1 : 3
2 : 2
3 : 3
```
Example 2:
```
Input: 
Number of colors: 1
nums = [1,1]
Output: 
1 : 2
```

**Problem-3:** Find consecutive empty spaces in a row

Given an integer array nums with 1 and 0's. 1 represent occupied and 0 represent empty space.
Find if a given party can take empty spaces.
Example 1:
```
Input: 
Number of people: 3
row status = [1,0,1,0,1,1,0,0,0,1,1]
Output: yes
```
Explanation:
In given row pattern, considering 1 as occupied and 0 as empty space. from 7th position to 10th position is a consecutive empty spaces, So you can allowcate the spaces to 3 people  
Example 2:
```
Input: 
Number of people: 4
row status = [1,0,1,0,1,1,0,0,0,1,1]
Output: no
```
Explanation:
In given row pattern, considering 1 as occupied and 0 as empty space. There is no consecutive 4 spaces. So you can't allowcate the spaces to 4 people.
