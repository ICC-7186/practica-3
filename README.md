# Práctica 3: Creación y Documentación de clases. 📌

Nombre:

NumCuenta:

En esta práctica se realizará la implementación sencilla de una clase a partir de un problema planteado.

## Autores 😊
* **Salvador López Mendoza** - *Titular* - [Correo](slm@ciencias.unam.mx)
* **Gerardo Emiliano Figueroa Sandoval** - *Teoría* - [Emiliano-Fs](https://github.com/Emiliano-FS)
* **Ramsés Antonio López Soto** - *Laboratorio* - [ramseslopez](https://github.com/ramseslopez)
  
## Objetivos 🚀

- Entender cómo se estructura una clase y comprender cada una de las partes que la componen.
- Comprender los conceptos de asociación como lo son la agregación y la composición.
- Aprender a realizar un diagrma de clases por medio del _Lenguaje Unificado de Modelos (UML)_.
- Comprender el uso de las Enumeraciones como recurso fácil de emplear.

### Pre-requisitos 📋

- Sistema Operativo Linux (Ubuntu, Debian, Fedora, etc.)
- Git versión 2.43.0
- Java versión 21.0.7
- Perfil de GitHub
- Apliacion de creación de dragramas.

### Instalación 🔧

- Git

Para instalar la versión más reciente de Git:

```bash
sudo apt-get install git

```
Una vez finaliado, verifica la versión instalada.

```
git -v
```

- Java
  
Instala Java con el siguiente comando:

```
sudo apt-get install openjdk-21-jre
```

Al finalizar, verifica la versión instalada.

```
java --version
```
y también del compilador:

```
javac --version
``` 


## Recursos 📖

Puedes encontrar más información de los recursos a utilizar en:

- [Creación de clases](https://www.geeksforgeeks.org/java/classes-objects-java/)
- [Enumeraciones](https://www.geeksforgeeks.org/java/enum-in-java/)
- [Asociaciones, composición y agregación](https://www.geeksforgeeks.org/java/association-composition-aggregation-java/)
- [UML](https://www.tutorialspoint.com/uml/index.htm)

## Ejercicio ⌨️

Sigue las instrucciones al pie de la letra:

### Robot 

Lee con mucha atención el siguiente texto:

```
Queremos modelar un robot. 

Un robot puede estar encendido o apagado. El robot conoce por sus sensores su posición actual usando coordenadas cartesianas bidimensionales y tiene una orientación. Nuestro robot sólo puede dar giros de 90° y por lo tanto su orientación sólo puede ser Norte, Sur, Este u Oeste.

Nuestro robot debe indicarnos su estado (si está encendido o apagado) y permitir cambiar de estado. Es capaz de informar de su posición en X y en Y, así como su Orientación. Nuestro robot puede además girar 90° cada vez en sentido horario o anti-horario, y avanzar una distancia determinada en dirección de su orientación.
 
La compañía para la que trabajamos quiere emplear robots en diferentes escenarios de exploración. Cada escenario tiene un nombre y es una construcción rectangular que se define por una esquina superior y una esquina inferior expresada en coordenadas en X y Y. El escenario es capaz de informar su nombre y la información de sus esquinas retornando la pareja de coordenadas de cada una.
 
Para la exploración de escenarios, se usan varios robots, como los que describimos en el tutorial anterior. Cada robot sólo puede recorrer un escenario a la vez. Según se requiera, a un escenario se le pueden asignar robots y un escenario puede informar qué robots se encuentran en él. A su vez, un robot conoce el escenario que está recorriendo.
 
Por otro lado, para la utilización de robots, se pueden definir tareas globales. Las tareas consisten en una descripción y una prioridad entre 1 y 10. Ambos elementos pueden ser informados y modificados para una tarea. Diferentes robots pueden ser asignados con la misma tarea o tener varias tareas al mismo tiempo. Todo robot debe tener al menos una tarea asignada y se le debe poder asignar o eliminar una nueva tarea. Además, debe ser capaz de informar sus tareas. Desde una tarea no podemos obtener información de cuáles robots la están realizando.
 
```

Una vez que hayas comprendido el texto en su totalidad, debes de generar el diagrama de clases correspondiente que muestra una solución al problema antes planteado.

Para realizar el diagrama de clases puede usar herramientas como 

- [Dia](http://dia-installer.de/index.html.es)
- [Drawio](https://www.drawio.com/blog/uml-class-diagrams)
- [Lucidchart](https://www.lucidchart.com/pages/es/tutorial-de-diagrama-de-clases-uml)
- [PlantUML](https://plantuml.com/es/class-diagram)

Debes de tomar en cuenta las resposabilidades de cada una de las clases y enumeraciones para organizarlo en paquetes.

Luego de realizar tu modelo debes de implemetarlo a código, respentando el diseño de tu modelo. Si crees que se necesitan ajustes puedes realizarlos. Además debes de generar la documentación correspondiente a todo lo que hagas con el comando:

```
javadoc -d doc <tu_solución>
```

Puedes consultar el ejemplo de `persona` que se agrega en este respositorio.

Tu modelo conceptual y el código deben de tener el mismo significado. Además debes de agregar un clase `PruebaRobot` que muestre al menos tres objetos de clase `Robot` mostrando su funcionamiento.

Una vez terminada la implementación, debes a agregarla a una carpeta `src`.

La estructura de entrega debe ser la siguiente:

```
practica-3/
    |_ robot/
    |    |_ src/ # aquí debe de ir tu solución.
    |    |_ doc/ # aqui debe de ir la documentación.
    |    |_ modelUML # este debe ser tu modelo UML (png,pdf,jpg)
    |_ persona/
```

## Intrucciones

* La práctica se entrega de forma individual.
* Debes de clonar el este repositorio con el comando `git clone`, agregar tu nombre en la parte de `Nombre: ` y seguido de tu número de cuenta en `NumCuenta: `.
* El código debe ser legible y el nombre varialbes y métodos debe ser adecuado. Debes de seguir las reglas correspondientes.
* Sube la solución de la práctica antes de las 23:59 del día de mañana con los comandos `git add`, `git commit` y `git push`.
* Ningún tipo de copia y/o plagio será tolerado.

## Licencia 📄

Este proyecto está bajo la Licencia MIT - mira el archivo [LICENSE.md](LICENSE.md) para más detalles.