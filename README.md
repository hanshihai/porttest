# Port Test

### compiler to classes
```
javac -source 1.7 -target 1.7 .\com\util\*.java
```

### jar the package
```
jar.exe cvf portest.jar ./com/util/*.class
```

### Server start
```
java -classpath portest.jar com.util.Server port
```


### Client start
```
java -classpath portest.jar com.util.Client serverHost port
```