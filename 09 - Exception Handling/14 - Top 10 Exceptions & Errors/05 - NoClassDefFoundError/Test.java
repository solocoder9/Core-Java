class Demo {

}
public class Test {
    public static void main(String[] args) {
        Demo d1 = new Demo();
    }
}

/* 
"After compiling (javac Test.java), the Demo.class file is generated along with Test.class. 
If the Demo.class file is then deleted and you attempt to run java Test, a NoClassDefFoundError occurs."

Exception in thread "main" java.lang.NoClassDefFoundError: Demo
        at Test.main(Test.java:5)
Caused by: java.lang.ClassNotFoundException: Demo
        at java.net.URLClassLoader.findClass(URLClassLoader.java:382)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
        at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:349)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
        ... 1 more

 
- It is an error in Java occurs when the Java Virtual Machine (JVM) or a classloader 
  tries to load a class but cannot find the definition of the class at runtime. 
- This error typically occurs when the class was available during compile time but is 
  missing during runtime, often due to issues with the classpath or the absence of the
  required JAR files.
- Hierarchy:-

    Throwable
        └── Error
            └── NoClassDefFoundError


*/