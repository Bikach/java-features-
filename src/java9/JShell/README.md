#  Exploring Java 9's JShell Feature

With the release of Java 9 in September 2017, a highly anticipated feature was introduced: JShell. 
JShell is an interactive command-line interpreter (REPL, for Read-Eval-Print Loop) that allows developers to quickly test and experiment with Java code snippets. 
we will explore the main features of JShell and understand how it works.


## Launching JShell
To start JShell, simply open the command prompt and type "jshell". You should see a new prompt with the "Welcome to JShell" message and a cursor to start entering commands.

```
$ jshell
|  Welcome to JShell -- Version 9
|  For an introduction type: /help intro
jshell>
```

## Basic Usage

JShell allows you to write and execute Java code directly, without needing to define a full class or write a `main()` method. For example, you can perform simple mathematical operations:
```
jshell> 2 + 3
$1 ==> 5
```
You can also declare variables and methods:
```
jshell> String hello = "Hello, JShell!";
hello ==> "Hello, JShell!"

jshell> int add(int a, int b) {
   ...>     return a + b;
   ...> }
|  created method add(int,int)
```
And you can use these variables and methods as you would normally in a Java program:
```
jshell> add(5, 7)
$2 ==> 12
```

## Error Handling

If you make a syntax error, JShell will let you know and give you the opportunity to correct your code:
```
jshell> int x = "wrong type";
|  Error:
|  incompatible types: String cannot be converted to int
|  int x = "wrong type";
|          ^-----------^
```

## JShell Specific Commands
JShell also includes special commands, which start with a "/". Here are some of the most useful commands:

- `/list` : Displays a list of all the entries (variables, methods, etc.) you have defined in the current session.
- `/history` : Displays the history of commands you have entered.
- `/save` : Saves the command history to a file.
- `/open` : Opens a file and executes the commands it contains.
- `/exit` : Exits JShell.

Example:
```
jshell> /list

   1 : String hello = "Hello, JShell!";
   2 : int add(int a, int b) {
           return a + b;
       }
```

### Conclusion
JShell is a powerful and flexible tool that greatly simplifies experimenting and learning the Java language. With the ability to write and execute code in real time, JShell is an invaluable resource for both new and experienced Java developers alike.