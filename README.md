# 🏆 Ranking de Personajes - Black Clover

## 📌 Introducción

¡Hola Adri! Ya terminé la práctica de GitHub y aquí te dejo la explicación del proyecto. Aunque tengo algunos problemas con el código (la lista de personajes no se quiere mostrar), este README resume cómo está estructurado el programa y qué hace cada parte.

---

## 👥 Personajes

Para que el ranking tenga sentido, primero hay que definir **los personajes**.

- Cada personaje tiene atributos como **nombre, magia, reino, rango, personalidad y puntuación**.
- La clase `Personaje` los modela utilizando **variables, un constructor, getters y setters**.
- Hay un **método `toString()` con un override**, que intenta poner el nombre de cierto personaje en rojo. No sé si funciona bien porque no se muestra en pantalla, pero ahí está la idea. 😆

---

## 🛠️ Gestor de Personajes

Como no basta con solo tener los personajes, es necesario gestionarlos. Aquí entra la clase `GestorPersonajes`, que se encarga de:

- **Añadir personajes** a la lista, asegurando que no se dupliquen.
- **Editar personajes**, permitiendo actualizar sus atributos.
- **Eliminar personajes** si ya no son necesarios.
- **Mostrar el ranking**, ordenando por puntuación de mayor a menor.

Importa varias utilidades, entre ellas **JOptionPane**, para crear cuadros de diálogo interactivos que hacen que el programa sea más visual y atractivo.

---

## ⚙️ Utils: La Caja de Herramientas

El código necesitaba una manera **más eficiente** de manejar entradas y errores, por lo que se creó `Utils`.

📌 **Funciones clave:**

- **`pedirTexto()`** → Solicita texto, evitando que el usuario deje el campo vacío.
- **`pedirNumero()`** → Pide un número dentro de un rango, manejando errores de entrada.
- **`mostrarError()`** → Muestra mensajes de error con `JOptionPane` para ayudar al usuario a corregir errores.

🎯 **¿Por qué es útil?**  
✔ Evita que el programa falle por errores básicos.  
✔ Mejora la experiencia del usuario con ventanas emergentes interactivas.  
✔ Separa la lógica del programa de la interacción con el usuario.

---

## 📲 Main.java - El Punto de Inicio

El archivo `Main.java` funciona como el **lanzador** de la aplicación.

📌 **¿Qué hace?**

- Es el **entry point** principal en el proyecto.
- Llama a `Main` para arrancar la interfaz con `JOptionPane`.
- Puede servir de **punto de control** si en el futuro queremos expandir el proyecto.

---

## 🔧 Problemas y mejoras

Actualmente, el código tiene algunos fallos que hay que solucionar:

- **La lista no se muestra**, así que hay que ver si es un problema de la vista o la lógica, no obstante, el creador del código está cansado jefe

Cuando logre arreglar estos errores, el proyecto funcionará correctamente y permitirá gestionar el ranking de personajes de _Black Clover_ sin problema. Aunque ya estaré suspendido cuando llegué esa ocasión.

---

## Estructura del Proyecto

`Personajes` → Contiene la clase `Personaje`.  
`Personajes` → Contiene `GestorPersonajes`, que maneja la lista.  
`main/` → La clase `Main`, donde está el menú interactivo, se debería llamar App, pero le cambié el nombre sin querer y así se quedó.  
`Personajes` → Métodos de ayuda para obtener datos y mostrar errores.

---

## Conclusión

Aunque lo tenga mal el código, no se si apruebo la verdad, estoy explotado y solo quiero dormir y llorar. 😃  
Y si te preguntas que cuando te salga el código, te de permiso para abrir algo de java, no te estoy hackeando, eso es por el JOptionPane.
