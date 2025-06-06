# Sistema de Gestión de Biblioteca

Este es un proyecto básico de una biblioteca desarrollado en Java como parte de mi aprendizaje de programación.

## Descripción

Este sistema permite gestionar una biblioteca simple con las siguientes funcionalidades:
- Agregar nuevos libros a la biblioteca
- Prestar libros a usuarios
- Registrar la devolución de libros
- Mostrar el catálogo completo de libros

## Estructura del proyecto

El proyecto está organizado siguiendo los principios de la programación orientada a objetos:

- **Paquete `models`**: Contiene las clases y interfaces que representan los objetos del dominio
  - `Libro.java`: Clase que representa un libro con sus propiedades
  - `Prestable.java`: Interfaz que define el comportamiento de un objeto que puede ser prestado

- **Paquete `services`**: Contiene las clases de servicio que implementan la lógica de negocio
  - `ServicioBiblioteca.java`: Clase que gestiona todas las operaciones relacionadas con la biblioteca

- **Paquete `app`**: Contiene la aplicación principal
  - `Main.java`: Clase principal con el menú de usuario y punto de entrada de la aplicación

## Cómo usar

1. Clona este repositorio
2. Abre el proyecto en tu IDE favorito (como IntelliJ IDEA, Eclipse o NetBeans)
3. Ejecuta la clase `Main.java`
4. Interactúa con el menú para gestionar la biblioteca

## Características implementadas

- Manejo de colecciones con ArrayList
- Implementación de interfaces
- Programación orientada a objetos
- Encapsulamiento de datos
- Manejo de menús con Scanner

## Lo que aprendí

Durante este proyecto, aprendí:
- Cómo organizar un proyecto Java en paquetes
- Implementación de interfaces para definir comportamientos
- Uso de ArrayList para gestionar colecciones de objetos
- Trabajo con métodos y atributos de clase
- Manejo de entrada/salida básica con Scanner

## Próximas mejoras

Como principiante, reconozco que este proyecto puede mejorar en muchos aspectos:
- Agregar persistencia de datos (guardar en archivos o base de datos)
- Implementar búsquedas más avanzadas
- Mejorar la interfaz de usuario
- Agregar manejo de excepciones
- Implementar pruebas unitarias

## Autor

Abilson Rivera - developer principiante

---

*Este proyecto fue creado como ejercicio de aprendizaje y no está destinado a uso en producción.*
