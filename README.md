# Proyecto en Java 17 <img alt="java " width="25" src="https://devicon-website.vercel.app/api/java/plain.svg?color=%23EA2D2E" /> con Spring Boot <img alt="springboot" width="25" src="https://cdn.simpleicons.org/springboot/6DB33F" /> practicando Hexagonal Architecture

## HEXAGONAL ARCHITECTURE / PORT & ADAPTERS / CLEAN ARCHITECTURE / INTERFACES & ADAPTERS

**Cumple S.O.L.I.D:**

- **Single Responsibility**: cada una de las capas tiene una responsabilidad unica bien definida, lo cual evita mezclar responsabilidades y facilita el matenimiento del codigo.
- **Open-Closed**: las entidades y casos de uso estan abiertos para su extencion pero cerrados a su modificacion. Si se necesita agregar una nueva funcionalidad lo que podemos hacer es extender los casos de uso creando nuevos adaptadores y modificar el codigo existente.
- **Liskov Subtitution**: los adpatadores y las implementaciones de los puertos deben ser sustituibles sin afectar el comportamiento del sistema. Esto nos permite cambiar facilmente entre diferentes implementaciones de infraestructuras o servicios externos.
- **Interface Segregation**: puertos de entrada y de salida, los cuales definen interfacez pequeñas y especificas para cada funcionalidad, lo cual nos facilita implementacion de apatadores y evita depender de interfaces grandes.
- **Dependency Injection**: Las *capas interiores* **NO** pueden depender de *capas exteriores*.

### Capas de la Hexagonal Architecture / Clean Architecture

**DOMINIO**: donde se *define* la logica de negocio

- Core de la aplicacion y donde se encuetra los componentes y modulos esenciales que ejecutan las funciones principales del software. Esta parte central se encarga de coordinar y gestionar las interaccines entre las diversas capas y elementos del sistema, asegurando la eficiencia, escalabilidad y estabilidad de la aplicacion, facilitando la integacion de nuevas funcionalidades y permitiendo una facil mantenibilidad y actualizaicon del software a lo largo del tiempo.
- Entidades

**APLICACION**: donde de *implementa* la logica de negocio

- Logica de negocios
- Casos de uso

**INFRAESTRUCTURA**: conexion con *servicios externos*

- Base de datos, Frameworks, Librerias
- **Adapter**: comunicacion son un servicio externo a nuestra aplicacion

### Domain-Driven Desing (DDD)

- Metodologia de diseño de software que se enfoca en el desarrollo en torno a un dominio del problema, utlizando un lengauje comun entre desarrolladores y expertos del dominio.
- DDD promueve la creacion de modelos ricos y coherentes, separando el sistema en capas y aplicacion patrones estrategicos y tacticos para facilitar la implementacion, comunicacion y evolucion del software
- Complemento de la *Clean Architecture*
- No es usada en este projecto

### Arquitectura Hexagonal de la aplicacion

![alt text](<Drawing 2024-08-07 08.27.42.excalidraw.png>)
