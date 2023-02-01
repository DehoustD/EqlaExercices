@ECHO OFF
REM Je suis un commentaire
javac -cp library\m.jar Exercice%1.java
java -cp library\m.jar Exercice%1.java
pause