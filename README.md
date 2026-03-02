# Calculadora Básica - Práctica 3

## Descripción
Calculadora en Java con Maven que implementa suma, resta, multiplicación y división (con 3 decimales).

## Estructura
calculadora/
├── pom.xml
└── src/
├── main/java/com/practica3/calculadora/
│ ├── App.java
│ └── operacion/Operacion.java
└── test/java/com/practica3/calculadora/operacion/OperacionTest.java

## Requisitos
- Java 17
- Maven 3.9+

## Comandos
```bash
# Compilar
mvn clean compile

# Ejecutar pruebas
mvn test

# Ejecutar app
mvn exec:java -Dexec.mainClass="com.practica3.calculadora.App"
