# Port Test

### Linux tools

Normally it can use the linux tools to check it:

```
nmap -p port hostaddress
```
or
```
nc -vz hostaddress port
```

While you can use this java app to check it when the host cannot to install linux shell tools from policy reason...


### compiler to classes
```
javac -source 1.7 -target 1.7 ./com/util/*.java
```

### jar the package
```
jar cvf portest.jar ./com/util/*.class
```

### Server start
```
java -classpath portest.jar com.util.Server port
```


### Client start
```
java -classpath portest.jar com.util.Client serverHost port
```
