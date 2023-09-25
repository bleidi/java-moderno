```
javac Main.java
jar cfe Main.jar Main Main.class
jpackage --name main --input . --main-jar main.jar
```