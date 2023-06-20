## Environment Setup ##
1. JDK installation
    - [Windows](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/readme.md#windows)
    - [Mac OS](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/readme.md#mac-os)
2. [The <span style="color:yellow">Hello World</span> Program using Notepad](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/readme.md#running-a-sample-java-program)
3. [Eclipse IDE installation](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/readme.md#eclipse-ide-installation-and-running-basic-java-project)
4. The <span style="color:yellow">Hello World</span> Program using Eclipse IDE
5. [Intellij Idea IDE installation - Optional](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/readme.md#intellij-idea-ide-installation-and-running-basic-java-project)
6. The <span style="color:yellow">Hello World</span> Program using Intellij Idea IDE
7. [Java program execution flow](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/readme.md#java-program-execution-flow)
8. ["Hello World!" Program explanation](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/readme.md#hello-world-program-explanation)
### Windows ###
- JDK v1.8 installation process for Windows
    1. Go to [java v1.8](https://www.oracle.com/java/technologies/downloads/#java8). Click on JDK Download for Java download JDK 8.
    ![java v1.8 download](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/windows_jdk_v1.8_download.png)
    2. Accept License Agreement.
    3. Download Java 8 JDK for your version 32 bit or 64 bit depending on your System. You can find the your system details in system properties in Control panel

    4. click on the Installation link. Click on I reviewed and accept the Oracle Technology Network License Agreement for Oracle Java SE development kit and you will be redirected to the login page. If you don’t have an oracle account you can easily sign up by adding basics details of yours.
    NOTE: You will be required to create an Oracle Account to start Java 8 download of the file.
    5. Once the Java JDK 8 download is complete, run the exe for install JDK. Click Next.
    ![java v1.8 installation_1](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/windows_jdk_installation_1.png)
    6. Select the PATH to install Java in Windows… You can leave it Default. Click next.
    ![java v1.8 installation_2](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/windows_jdk_installation_2.png)
    7. Once you install Java in windows, click Close.
    ![java v1.8 installation_3](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/windows_jdk_installation_3.png)
- How to set Path/Classpath Environment Variable.
    Note: The PATH variable gives the location of executables like javac, java etc. It is possible to run a program without specifying the PATH but you will need to give full path of executable to compile or run the class files like C:\Program Files\Java\jdk_version\bin\javac A.java instead of simple javac A.java
    1. Open the Start menu and search for environment variables.
    2. Select the Edit the system environment variables result.
    ![windows_enviroment variable setting](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/windows_enviroment%20variable%20setting.png)
    3. In the System Properties window, under the Advanced tab, click Environment Variables.
    ![windows_enviroment variable setting_1](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/windows_enviroment%20variable%20setting_1.png)
    4. Under the System variables category, select the Path variable and click Edit:
    ![windows_enviroment variable setting_2](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/windows_enviroment%20variable%20setting_2.png)
    ![windows_enviroment variable setting_3](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/windows_enviroment%20variable%20setting_3.png)
    5. Click the New button and enter the path to the Java bin directory and click ok to save the changes and exit the variable editing window.
    ![windows_enviroment variable setting_4](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/windows_enviroment%20variable%20setting_4.png)
    ![windows_enviroment variable setting_5](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/windows_enviroment%20variable%20setting_5.png)
- How to set JAVA_HOME Environment Variable.
    1. In the Environment Variables window, under the System variables category, click the New… button to create a new variable.
    ![windows_enviroment variable setting_1](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/windows_enviroment%20variable%20setting_1.png)
    2. Name the variable as JAVA_HOME.
    3. In the variable value field, paste the path to your Java jdk directory and click OK.
    ![windows_enviroment variable setting_6](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/windows_enviroment%20variable%20setting_6.png)
    4. Confirm the changes by clicking OK in the Environment Variables and System properties windows.

### Mac OS ###
- JDK v1.8 installation process for Mac OS
    1. Go to [java v1.8](https://www.oracle.com/java/technologies/downloads/#java8). Click on JDK Download for Java download JDK 8.
    ![java v1.8 download](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/jdk_v1.8_download.png)
    2. Accept License Agreement.
    3. Download Java 8 JDK for your version 32 bit or JDK download 64 bit depending on your System.
    4. click on the Installation link. Click on I reviewed and accept the Oracle Technology Network License Agreement for Oracle Java SE development kit and you will be redirected to the login page. If you don’t have an oracle account you can easily sign up by adding basics details of yours.
    NOTE: You will be required to create an Oracle Account to start Java 8 download of the file.
    5. Once the Java JDK 8 download is complete, run the exe for install JDK. Click Next.
    ![java v1.8 installation_1](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/jdk_installation_1.png)
    6. Once you install Java in mac, click Close.
    ![java v1.8 installation_2](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/jdk_installation_2.png)
    7. Validate JDK and JRE version. Open Terminal app in mac and run `javac -version` and `java -version`
    ![jdk verison validation using terminal](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/terminal_jdk_jre_version_check.png)

### Running a Sample Java Program ###
- The <span style="color:yellow">Hello World</span> Program using Notepad
    1. Open any text editor like notepad or sublime text
    2. Enter following code and save the file name as `Sample.java`
    ```
    public class Sample {
        public static void main(String[] args) {
            System.out.println("Hello world!");
        }
    }
    ```
    3. Open command prompt(in windows) or Terminal(in macos)
    4. go to the file location using cd command
    5. use javac command to compile the Sample.java file - `$javac Sample.java`
    6. use java commant to run the Sample.java file - `$java Sample`
    ![java run a code](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/java_code_run.png)

### "Hello World!" Program explanation ###
> This section is a brief explanation of the above program. As of now, you have studied only the introduction. Further in the tutorial, you'll find more details. Please skip it if you don't understand it.
- public class Sample { .. }
    1. In Java, every application begins with a class definition. In the above program, Sample is the name of the class.
    2. the class definition syntax:
    ```
    class <Class_Name> {
        ...
    }
    ``` 
    3. public keyword is a access modifier. public class means that it is accessible from outside(globally available) of the current class/file/folder. (Here Java Virtual Machine/Run time can access the sample class from outside.)

- public static void main(String[] args) { ... }
    1. The Java compiler/Java Virtual Machine starts executing the code from the main method. Every application in Java must contain the main method.
    2. The signature of the main method needs to be in a specific way(public static void main(String[] ..)) for the JVM to recognize that method as its entry point.
    3. "public" keyword is a access modifier. public method means that it is accessible from outside(globally available) of the current class/file/folder. (Here Java Virtual Machine/Run time can access the main method from outside.)
    4. "static" making it a class-related method. Think like static is like a glue whereever the class move in the memory the static method also move. The main() method is static so that JVM can invoke it without instantiating the class, by simply using class name and dot(.) operator.
    5. "void" is a keyword and is used to specify that a method doesn’t return anything
    6. "main" is the name of the Java main method.

- System.out.println("Hello World!");
    1. It a method to print the String/text provide in the brackets () to standard output (console or cmd).

### Eclipse IDE installation and Running Basic java project ###
- The <span style="color:yellow">Hello World</span> Program using Eclipse
    1. Download Eclipse [Installer](http://www.eclipse.org/downloads)
    2. Start the Eclipse Installer executable
    3. Select the Eclipse IDE for java EE Developer package to install
    4. Launch Eclipse and select a work space folder and click launch
    ![eclipse_launch](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/eclipse_launch.png)
    5. Close welcome screen and create a java project from file menu -> new -> project -> java project
    ![eclipse_new_java_project](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/eclipse_new_java_project.png)
    6. click next and give project name - "Sample", Use an execution environment  and unselect create module-info.java file check box.
    ![eclipse_java_project_name](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/eclipse_java_project_name.png)
    7. click next for project structure(source files in src folder and class files in bin folder) and click finish
    ![eclipse_java_project_strcture](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/eclipse_java_project_strcture.png)
    8. Expand sample project and create a Sample.java file in src folder. right click on src folder and select class option from new menu.
    ![eclipse_new_java_file](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/eclipse_new_java_file.png)
    9. privide java class name as `Sample` and check public static void main(String[] args) option and click finish. This will bootstrap the java file with main method.
    ![eclipse_new_java_project_name](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/eclipse_new_java_project_name.png)
    10. Add `System.out.println("Hello World!");` code inside main method
    ![eclipse_java_code](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/eclipse_java_code.png)
    11. Run the project using the green button and check the results at console window.
    ![eclipse_java_code_run](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/eclipse_java_code_run.png)

### Intellij Idea IDE installation and Running Basic java project ###
- **If you have already installed Eclipse, there is no need to install IntelliJ Idea IDE. It is an optional step included for informational purposes only.**
- The <span style="color:yellow">Hello World</span> Program using Intellij Idea
    1. Download [Intellij Idea](https://www.jetbrains.com/idea/download/#section=mac) setup and follow normal installation steps.
    2. Open Intellij Idea IDE and select new project on welcome screen
    3. Provide project name and JDK configuration path and click create button
    ![intellij_new_project](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/intellij_new_project.png)
    4. Expand sample project and create a Sample.java file in src folder. right click on src folder and select class option from new menu.
    ![intellij_new_java_file](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/intellij_new_java_file.png)
    5. Add `System.out.println("Hello World!");` code inside main method
    ![intellij_java_code](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/intellij_java_code.png)
    6. Run the project using the Run menu from the top bar and check the results at Run window.
    ![intellij_java_code_run](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/intellij_java_code_run.png)


### Java program execution flow ###
- Java program execution flow
    1. First, the source `.java` file is passed through the compiler, which then encodes the source code into a machine-independent encoding, known as Bytecode. The content of each class contained in the source file is stored in a separate `.class` file and `.class` files are run on top of JRE.
    ![java_execution_flow](https://github.com/yetanothermasterylearning/Core-Java/blob/main/02.%20Environment%20Setup/Pictures/java_execution_flow.png)


