## Miscellaneous ##

- Managemen multiple Java versions in Mac OS without external tools
    1. Find Installed Java Versions
    use the command to verify installed java versions. It gives the information about the installed java version number and the home directory of each java version.
    ```
    /usr/libexec/java_home -V
    ```
    ![JavaVersions](https://github.com/yetanothermasterylearning/Core-Java/blob/main/Miscellaneous/Pictures/java%20all%20versions.png)
    2. We can also check the home directory of specific java version by issuing the following command:
    ```
    /usr/libexec/java_home -v 1.8
    ```
    3. go to home directory by using follpowing command
    ```
    cd ~
	```
    4. add alias commands in .bash_profile in such a way that we can easily change java version using single command.
    ```
    export JAVA_8_HOME="/Library/Java/JavaVirtualMachines/jdk-1.8.jdk/Contents/Home"
    export JAVA_17_HOME="/Library/Java/JavaVirtualMachines/jdk-17.0.4.1.jdk/Contents/Home"
    alias java8='export JAVA_HOME=$JAVA_8_HOME'
    alias java17='export JAVA_HOME=$JAVA_17_HOME'
    ```
    ![bash_script](https://github.com/yetanothermasterylearning/Core-Java/blob/main/Miscellaneous/Pictures/bash_script.png)
    5. Close and reopen the terminal or source the bash_profile using following command
    ```
    source ~/.bash_profile
    ```
    6. Java version should be changed by issuing those aliases command
    ```
    java8
    ```
    ![java_results](https://github.com/yetanothermasterylearning/Core-Java/blob/main/Miscellaneous/Pictures/results.png)
- Uninstall JDK from Mac OS
	``` 
	sudo rm -rf /Library/Java/*
	sudo rm -rf /Library/PreferencePanes/Java*
	sudo rm -rf /Library/Internet\ Plug-Ins/Java*
	```