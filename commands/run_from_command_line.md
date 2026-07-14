## 1. java -jar :  
$ cd Docmunets/...(directory of the project)  
$ ./mvnw package (for linux, without ./ for windows)  
$ cd Documents/.../target (where the JAR files are created)  
$ ls *.jar (dir *.jar for windows)  
$ java -jar mycoolap...(name of the project, seen after running the previous command)  

<b>App is now running</b> 
  
## 2. Spring boot Maven plugin  
$ cd Docmunets/...(directory of the project)   
$ ./mvnw spring-boot:run (without ./ for windows)  

<b>App is now running</b>
