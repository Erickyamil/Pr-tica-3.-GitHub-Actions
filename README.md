# Calculadora Básica - Práctica 3

## Descripción
Proyecto básico realizado en relación a las indicaciones de la práctica 3 de la materia de Despliegue de Software.
Calculadora en Java con Maven que implementa suma, resta, multiplicación y división (con 3 decimales).

## Estructura
<img width="479" height="143" alt="image" src="https://github.com/user-attachments/assets/5bdfb0a1-5010-4313-b3ec-5e22a62fc8d3" />

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
