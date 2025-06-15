### Core Java

[Java 核心技术官网](https://horstmann.com/corejava/)

[Java 白皮书](https://www.oracle.com/java/technologies/language-environment.html)

[JavaSE 8 doc](https://docs.oracle.com/javase/8/docs/api/)

[JavaSE 8 doc 中文版](https://www.apiref.com/java8/index.html)

### Content

+ ch01 intro
+ ch02 environment
+ ch03 basic
+ ch04 object and class
+ ch05 extend

### CLASSPARH
windows CMD
```shell
set CLASSPATH=D:\Software\maven_rep;.;.\archives\*
```

windows powershell
```shell
$env:CLASSPATH = "D:\Software\maven_rep;.;.\archives\*"
```

### Java Doc
```shell
javadoc -encoding utf-8 -charset utf-8 -d docDirectory ch04 ch03
```

默认包
```shell
javadoc -encoding utf-8 -charset utf-8 -d docDirectory *.java
```