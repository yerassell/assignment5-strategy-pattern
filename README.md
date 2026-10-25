# assignment5-strategy-pattern

##
- Name: Assel Yermekkyzy
- Group: SE-2524
- Topic: Option B — Calculator
- Repository URL: https://github.com/yerassell/assignment5-strategy-pattern.git
- Last commit: 


## Project purpose
This is an application that calculates operation such as addition, subtraction, multiplication and division by implementing the Strategy design pattern


## Package structure
- `app/` - contains the context and client classes (Calculator.java and Client.java)
- `strategy/` - contains the operation strategy classes (AddStrategy.java, DivideStrategy.java, MultiplyStrategy.java, Strategy.java, SubtractStrategy.java)
- `Assignment5_SE-2524_Yermekkyzy_Assel.pdf` - is the report of the assignment
- `README.md`
  
  
## Build and run instruction
- Run on Intellij IDEA
1. Click green button `Code` and click `Download ZIP`
2. Extract the ZIP 
3. Open in Intellij IDEA or another Java IDE.
4. Run app/Client.java
- Run on terminal
1. Click green button `Code` and click `Download ZIP`
2. Extract the ZIP to any folder on your device
3. Open a terminal
   ```bash
    cd path/to/extracted/folder
    javac -d out app/*.java strategy/*.java
    java -cp out app.Client
   ```

## Expected Output
``` bash
Addition: 8.0
Subtraction: 4.0
Multiplication: 12.0
Division: 3.0
```
