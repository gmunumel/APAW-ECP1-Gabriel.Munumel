# Práctica Patrones de Diseño

**Autor:** Gabriel Muñumel

---

# Explicación Patrón de Diseño Strategy

El patrón de diseño _Strategy_ es un patrón de comportamiento que permite seleccionar un algoritmo 
en tiempo de ejecución. Su intención es facilitar el *intercambio* de un algoritmo dependiendo del tipo
de datos, su origen o otro criterio. 

A continuación se da un resumen de su composición:
* **Algoritmos** (estrategias) que son seleccionadas en tiempo de ejecución.
* Una **Estrategia** es dinámicamente seleccionada por el cliente (un usuario o 
un programa que lo consuma), o su contexto. 
* La clase controlador es llamada usualmente **Contexto**.
* El **Contexto** está al tanto de los **Algoritmos** y cada **Algoritmo** es considerado una **Estrategia**. 
* El **Contexto** es responsable por manejar los datos durante la interacción con el cliente.

El diagrama UML para el caso práctico es:
![alt text](strategy-uml.png "Patrón de Diseño Strategy")


Fuentes:
* [https://alvinalexander.com/java/java-strategy-design-pattern-in-java](https://alvinalexander.com/java/java-strategy-design-pattern-in-java)
* [http://www.java67.com/2014/12/strategy-pattern-in-java-with-example.html](http://www.java67.com/2014/12/strategy-pattern-in-java-with-example.html)
* [https://en.wikipedia.org/wiki/Strategy_pattern](https://en.wikipedia.org/wiki/Strategy_pattern)





