# Monty Hall

### Systemkrav
Java 11 <br>
Maven

### Starta applikationen
```bash
mvn clean install
mvn exec:java -Dexec.args=1000
```

Där `-Dexec.args=1000` är antalet simuleringar man vill köra. 
I detta exempel kommer det köras 1000 simuleringar där spelaren har valt att byta låda 
samt 1000 simuleringar där spelaren har valt att stanna i valet av låda. 


### Testning
Använd följande kommando för att köra testerna.

```bash
mvn clean test
```
