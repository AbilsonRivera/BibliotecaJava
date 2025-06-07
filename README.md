# Sistema de Gestión de Biblioteca

Este es un proyecto de un sistema de gestión de biblioteca desarrollado en Java, que implementa principios SOLID y un sistema de autenticación de usuarios.

## Descripción

Este sistema permite gestionar una biblioteca con las siguientes funcionalidades:
- Registro e inicio de sesión de usuarios
- Agregar nuevos libros a la biblioteca
- Prestar libros a usuarios
- Registrar la devolución de libros
- Mostrar el catálogo completo de libros

## Estructura del proyecto

El proyecto está organizado siguiendo los principios de la programación orientada a objetos y SOLID:

- **Paquete `models`**: Contiene las clases que representan los objetos del dominio
  - `Libro.java`: Clase que representa un libro con sus propiedades
  - `Usuario.java`: Clase que representa a un usuario del sistema

- **Paquete `interfaces`**: Contiene las interfaces que definen comportamientos
  - `Prestable.java`: Interfaz que define el comportamiento de un objeto que puede ser prestado
  - `Autenticable.java`: Interfaz que define el comportamiento de autenticación

- **Paquete `services`**: Contiene las clases de servicio que implementan la lógica de negocio
  - `ServicioBiblioteca.java`: Clase que gestiona todas las operaciones relacionadas con la biblioteca
  - `ServicioUsuario.java`: Clase que gestiona todas las operaciones relacionadas con los usuarios

- **Paquete `app`**: Contiene la aplicación principal
  - `Main.java`: Clase principal que coordina el flujo de la aplicación
  - **Subpaquete `ui`**:
    - `ConsoleUI.java`: Clase que maneja la interfaz de usuario en consola

## Principios SOLID aplicados

Este proyecto implementa los siguientes principios SOLID:

1. **Principio de Responsabilidad Única (SRP)**: Cada clase tiene una única responsabilidad. Por ejemplo, `ConsoleUI` se encarga solo de la interfaz de usuario.

2. **Principio de Abierto/Cerrado (OCP)**: El sistema está diseñado para ser extendido sin modificar el código existente, mediante el uso de interfaces.

3. **Principio de Sustitución de Liskov (LSP)**: Las clases que implementan interfaces (`Libro` implementa `Prestable`) pueden ser sustituidas por sus interfaces sin alterar el comportamiento.

4. **Principio de Segregación de Interfaces (ISP)**: Las interfaces están definidas de manera específica para cada necesidad (`Prestable` para el comportamiento de préstamo, `Autenticable` para la autenticación).

## Cómo usar

1. Clona este repositorio
2. Abre el proyecto en tu IDE favorito (como IntelliJ IDEA, Eclipse o NetBeans)
3. Ejecuta la clase `Main.java`
4. Primero deberás registrarte como usuario
5. Inicia sesión con tus credenciales
6. Usa el menú para gestionar la biblioteca

## Características implementadas

- Sistema de autenticación de usuarios
- Manejo de colecciones con ArrayList
- Implementación de interfaces
- Programación orientada a objetos
- Aplicación de principios SOLID
- Encapsulamiento de datos
- Interfaz de usuario separada de la lógica de negocio

## Lo que aprendí

Durante este proyecto, aprendí:
- Cómo organizar un proyecto Java en paquetes
- Implementación de interfaces para definir comportamientos
- Aplicación de principios SOLID para mejorar la estructura del código
- Implementación de un sistema de autenticación básico
- Separación de responsabilidades entre interfaz de usuario y lógica de negocio
- Uso de ArrayList para gestionar colecciones de objetos
- Trabajo con métodos y atributos de clase

## Próximas mejoras

Áreas de mejora para futuras versiones:
- Agregar persistencia de datos (guardar en archivos o base de datos)
- Implementar búsquedas más avanzadas
- Mejorar la inversión de dependencias (DIP)
- Permitir diferentes tipos de elementos prestables (revistas, DVDs)
- Implementar roles de usuario (administrador, usuario normal)
- Agregar manejo de excepciones
- Implementar pruebas unitarias

## Autor

Abilson Rivera - desarrollador

---

*Este proyecto implementa principios de diseño de software y patrones de arquitectura para demostrar buenas prácticas de programación.*
