
# Multiple Checker Program

This is a simple Java program that checks if a given number is a multiple of 5, a multiple of 10, or neither. It takes user input and uses conditional statements to determine the result.

## Features

- Accepts a number as input from the user.
- Checks if the number is a multiple of 5 or 10.
- Displays the appropriate message based on the input.

## Requirements

- Java Development Kit (JDK) 8 or above
- An IDE or command-line interface for compiling and running Java programs

## Installation & Running the Program

1. **Clone the repository** (if applicable):
   ```bash
   git clone https://github.com/your-username/multiple-checker.git
   ```

2. **Navigate to the project directory**:
   ```bash
   cd multiple-checker
   ```

3. **Compile the Java file**:
   ```bash
   javac Main.java
   ```

4. **Run the program**:
   ```bash
   java Main
   ```

## Usage

1. When prompted, enter a number.
2. The program will check the number using the following conditions:
   - If the number is divisible by 5, it will print: `X is a multiple of five.`
   - If the number is divisible by 10, it will print: `X is a multiple of ten.`
   - If the number is neither divisible by 5 nor 10, it will print: `out out bound`.

## Example Output

```
Enter a number: 15
15 is a multiple of five.

Enter a number: 20
20 is a multiple of five.

Enter a number: 13
out out bound
```

## Code Explanation

- The program uses a `Scanner` object to accept user input.
- It reads an integer from the user and checks if it is divisible by 5 or 10 using the modulus operator (`%`).
- Based on the conditions:
    - If the number is divisible by 5 (`number % 5 == 0`), the program prints that it is a multiple of 5.
    - If the number is divisible by 10 (`number % 10 == 0`), it prints that it is a multiple of 10.
    - If neither condition is met, it prints an "out out bound" message.

## License

This project is open-source and available under the MIT License. Feel free to use and modify the code as needed.

## Contact Information

For any questions or suggestions, please contact:

- **Name**: Yusuf Sani
- **Email**: yusufabdulazizsani@gmail.com
