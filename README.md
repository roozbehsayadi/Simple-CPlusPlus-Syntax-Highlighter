# compiler course phase1 project: CPP syntax highlighter

## rules
+ use jflex for build scanner
+ save output (highligthed) to html output
+ more info about color and etc in Project.pdf

## how to run
+ this project is based on maven (and of course java)
+ to compile : execute `mvn clean package` on terminal
+ and to run : `java -jar target/*.jar yourCPPfile.cpp`
+ output html is created in root dir of project with name `yourCPPfile.html`

