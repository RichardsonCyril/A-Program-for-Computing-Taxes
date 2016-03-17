# Fundamentals-of-Programming-A-Program-for-Computing-Taxes
This programming assignment has five objectives: to teach you to read input from the keyboard, to use Java expressions involving integers and real numbers, to use conditional (if/else) statements in Java, to print formatted output, to see if you can follow a specification exactly! 
Description 
The program allows the user to input some of the information that normally appears on a tax form, then it calculates a tax bill according to the formulas described below. WARNING: Be aware that the tax computation shown here is greatly simplified and should not be used for calculation of your real taxes! 
Instructions  For this assignment, you must follow directions exactly. 
Create a P3 project in Eclipse then write a class P3 with a main method, and put all of the following code into the main method: Instantiate a single Scanner object to read console input. Print the prompt shown below and ask the user for their gross salary. The gross salary represents dollars, which can be entered with or without decimal points. Print the prompt shown below and ask the user for the number of exemptions. The number of exemptions is an integer. Print the prompt shown below and ask the user for their interest income. The interest income represents dollars, which can be entered with or without decimal points. Print the prompt shown below and ask the user for their capital gains income. The capital gains represents dollars, which can be entered with or without decimal points. Perform the calculation of federal total income, as shown in the Formula section. Perform the calculation of the federal adjusted income, as shown in the Formula section. Perform the calculation of the federal total tax, as shown in the Formula section. Perform the calculation of the state income tax, as shown in the Formula section. Print out the total income, adjusted income, total tax, and state tax, with the commas shown.

Formulas

Total Income = Gross Salary + Interest Income + Capital Gains 
Adjusted Income = Total Income - (Number of Exemptions * 1500.00) 
Total Tax computation:
0% on Adjusted Income above $0 and up to $10,000 +
15% on Adjusted Income above $10,000 and up to $28,000 +
25% on Adjusted Income above $28,000 and up to $54,000 +
28% of Adjusted Income above $54,000
For the example above, we compute the Total Tax in the example above as follows: 

15% * (28,000.00-10,000.00) = 2,700.00 
25% * (54,000.00-28,000.00) = 6,500.00 
28% * (62,541.72-54,000.00) = 2,391.68 

Adding up the above we get a Total Tax of $11,591.68 that's a a chunk of change! You can see the results of our other computations in output shown above. 

State Tax = Adjusted Income * 0.05 
