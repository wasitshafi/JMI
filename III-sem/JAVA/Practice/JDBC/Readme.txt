                    Instruction For windows
                    MYSQL
Step 1 : Download MYSQL Connector for java(.jar file).
step 2 : Put that file in C:\Program Files\Java\jdk-12.0.1\lib\
setp 3 : Append 'C:\Program Files\Java\jdk-12.0.1\lib\mysql-connector-java-8.0.19.jar;' to CLASSPATH Variable
step 4 : Instead of using 'com.mysql.jdbc.Driver' use this Driver 'com.mysql.cj.jdbc.Driver'

Error Message while using 'com.mysql.jdbc.Driver' as Driver:
    "Loading class `com.mysql.jdbc.Driver'. This is deprecated.The new driver class is 'com.mysql.cj.jdbc.Driver'. 
     The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary."

                   ORACLE
1) Download odjbc14.jar
2) Set ClassPath to C:\Program Files\Java\jdk-12.0.1\lib\ojdbc14.jar


                            Set Temporary class path(Each time When openning dos)
step 1 : set CLASSPATH = <FULL PATH TO JAR FILE>
            eg 'set CLASSPATH=C:\Program Files\Java\jdk-12.0.1\lib\mysql-connector-java-8.0.19.jar;'
STEP 2 : Now compile the java file...
                    Instruction For LINUX
