/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.codeCoach;

import java.awt.List;
import java.util.Arrays;

/**
 *
 * @author JoycePC
 */
public class keyWords {  
    
    String[][] list = {{"abstract","The abstract keyword is used to declare a class or a method as abstract. An abstract class can have abstract methods which have to be implemented by its sub classes. An abstract method does not have concrete implementation or body, and must ends with a semicolon."},
        {"assert","The assert keyword is used in assert statement which is a feature of the Java programming language since Java 1.4. Assertion enables developers to test assumptions in their programs as a way to defect and fix bugs."},
        {"boolean","The boolean keyword is used to declare a variable as a boolean type, which represents only either true or false"},
        {"break","The break keyword stops execution of for loop, while loop and switch-case construct. The execution goes to next statement after the construct is broken."},
        {"byte","The byte keyword is used to declared a variable as a numeric type. A byte value can hold an 8-bit integer number which ranges from -128 to 127."},
        {"case","The switch-case construct is a flow control structure that tests value of a variable against a list of values."},
        {"catch","To handle error/exceptions which may occur during execution of a particular code, Java introduces try-catch-finally construct."},
        {"char","The char keyword is used to declared a variable as a character type. A char variable represents a single character."},
        {"class","The class keyword is used to declare a class"},
        {"const","Unused"},
        {"continue","The continue keyword is used to stop execution of a current iteration in a for loop or a while loop, then advance to the next iteration. The statements after the continue keyword won’t be executed."},
        {"default","The switch-case construct is a flow control structure that tests value of a variable against a list of values."},
        {"do","The do-while construct is a loop structure which repeatedly executes one or some statements until a condition becomes false. In other words, it repeats the statements while the condition is still true"},
        {"double","The double keyword is used to declared a variable as a numeric type. A double value can hold a 64-bit floating-point number."},
        {"else","The if-else construct is used to check if a condition is met then do something, otherwise do something else. "},
        {"enum","The enum keyword is used to declare a new enumeration type."},
        {"extends","When declaring a class as a subclass of another class, the extends keyword is used.\n The extends keyword is also used to make an interface extends another interface."},
        {"false","boolean value for 0"},
        {"final","The final keyword can be applied to declaration of classes, methods and variables. \n Final method: when a method is final, that means it cannot be overriden, neither by methods in the same class or in sub class.\n Final class: if a class is marked as final, it cannot be subclassed/inherited by another class.\n Final variable: if a variable is marked as final, its reference cannot be changed to refer to another object, once initialized."},
        {"finally","To handle error/exceptions which may occur during execution of a particular code, Java introduces try-catch-finally construct. "},
        {"float","The float keyword is used to declared a variable as a numeric type. A float value can hold a 32-bit floating-point number. \n The float keyword can be used to declared return type of a method as well"},
        {"for","The for keyword is used to iterate over a range of values, items of an array or a collection. The code that uses for keyword is called as for loop.\n In Java, there are two types of for loop: classic for loop and enhanced for loop (for-each)."},            
        {"goto","Unused"},
        {"if","The if-else construct is used to check if a condition is met then do something, otherwise do something else."},
        {"implements","The implements keyword is used to make a class adheres to contract defined by an interface. The implemented class must provide concrete implementation for the methods defined by the interface. If not, the class must be abstract."},
        {"import","The import keyword is used to make classes and interfaces available and accessible to the current source code, without specifying fully qualified package names."},
        {"instanceof","The instanceof keyword is used to check whether an object is an instance of a particular class or interface."},
        {"int","The int keyword is used to declared a variable as a numeric type. An int value can hold a 32-bit integer number which ranges from -2^31 to 2^31 - 1."},
        {"interface","Interface is a programming construct that defines a contract which must be adhered by implementing classes. The methods defined in an interface must have no body and end with a semicolon.\n The implementing classes will provide concrete implementation for the methods."},
        {"long","The long keyword is used to declared a variable as a numeric type. A long value can hold a 64-bit integer number which ranges from -2^63 to 2^63 - 1."},
        {"native","he native keyword is used to declare a method which is implemented in platform-dependent code such as C or C++. When a method is marked as native, it cannot have a body and must ends with a semicolon instead. The Java Native Interface (JNI)specification governs rules and guidelines for implementing native methods, such as data type conversion between Java and the native application."},
        {"new","The new keyword is used to create a new instance (object) of a class.\n"},
        {"null","Means a reference to null pointer"},
        {"package","The package keyword is used to specify a directory structure to which the current source file must belong."},
        {"private","The private keyword is an access modifier that can be applied to method, member variable and inner class"},
        {"protected","The protected keyword is an access modifier for method and variable of a class."},
        {"public","is the access modifier that has least restriction on the object it modifies."},
        {"return","The return keyword is used to stop execution of a method and return a value for the caller. "},
        {"short","The short keyword is used to declared a variable as a numeric type. A short value can hold a 16-bit integer number which ranges from -32,768 to 32,767."},
        {"static",", the static keyword can be applied for inner classes, methods and variables."},
        {"strictfp","The strictfp keyword is used to force the precision of floating point calculations (float or double) in Java conform to IEEE’s 754 standard, explicitly. Without using strictfp keyword, the floating point precision depends on target platform’s hardware, i.e. CPU’s floating point processing capability. In other words, using strictfp ensures result of floating point computations is always same on all platforms.\n" +
"\n" +
"The strictfp keyword can be applied for classes, interfaces and methods."},
        {"super","The super keyword is used to access variables and methods of a super class from a sub class"},
        {"switch","The switch-case construct is a flow control structure that tests value of a variable against a list of values."},
        {"synchronized","The synchronized keyword is used for code blocks and methods where thread-safe matters and for multi-threaded (concurrent) programming. A synchronized method or a synchronized statement can be executed by only one thread at a time."},
        {"this","the this keyword is used to refer to the current instance of a class"},
        {"throw","he throw keyword is used to throw an exception from within a method. When a throw statement is encountered and executed, execution of the current method is stopped and returned to the caller."},
        {"throws","the throws keyword is used to declare that a method may throw one or some exceptions. The caller has to catch the exceptions (catching is optional if the exceptions are of type unchecked exceptions)."},
        {"transient","he transient keyword is used to mark a member variable (field) not a part of the persistent state of an object, i.e. the field will not be persisted when its parent object is serialized."},
        {"true","bolean value for 1"},
        {"try","o handle error/exceptions which may occur during execution of a particular code, Java introduces try-catch-finally construct. "},
        {"void","he void keyword is used to indicate a method that does not return any value"},
        {"volatile","The volatile keyword can be applied for only member variables (fields). When a volatile variable is accessed concurrently by threads, its value is updated consistently among threads. In some cases, using volatile can be an alternative to using synchronized code."},
        {"while","The do-while construct is a loop structure which repeatedly executes one or some statements until a condition becomes false. In other words, it repeats the statements while the condition is still true."}
    }; 
    
    public String verificarKW(String keyWord){
        int i=0,j=0;
        String Description="";
        while(i<list.length){
            if(keyWord.equals(list[i][0])){
                Description=list[i][1];
                break;
            }else i++;
        }   
        return "Description: "+ "\n"+ Description;
    }
}
