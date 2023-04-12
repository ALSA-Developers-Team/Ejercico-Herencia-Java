# Ejercico-Herencia-Java

Problema: Sistema de gestión de inventario para una librería

Objetivo: Crear un programa en Java que permita gestionar el inventario de una librería. La librería maneja diferentes tipos de publicaciones, como libros, revistas, cómics y periódicos. El programa debe permitir agregar publicaciones al inventario, mostrar la información detallada de las publicaciones y calcular el valor total del inventario.

Requerimientos:

    Elemento 'Publicacion' con los siguientes atributos y métodos:
        Atributos:
            título (String)
            autor (String)
            año de publicación (int)
            precio (double)
        Métodos:
            getters y setters para cada atributo
            getInfo(): retorna la información detallada de la publicación en formato String.

    Elemento 'Libro' con los siguientes atributos y métodos:
        Atributos:
            título (String)
            autor (String)
            año de publicación (int)
            precio (double)
            número de páginas (int)
        Métodos:
            getters y setters para cada atributo
            getInfo(): retorna la información detallada del libro en formato String, incluyendo el número de páginas.

    Elemento 'Revista' con los siguientes atributos y métodos:
        Atributos:
            título (String)
            autor (String)
            año de publicación (int)
            precio (double)
            temática (String)
        Métodos:
            getters y setters para cada atributo
            getInfo(): retorna la información detallada de la revista en formato String, incluyendo la temática.

    Elemento 'Comic' con los siguientes atributos y métodos:
        Atributos:
            título (String)
            autor (String)
            año de publicación (int)
            precio (double)
            número de páginas (int)
            ilustrador (String)
        Métodos:
            getters y setters para cada atributo
            getInfo(): retorna la información detallada del cómic en formato String, incluyendo el ilustrador.

    Elemento 'Periodico' con los siguientes atributos y métodos:
        Atributos:
            título (String)
            autor (String)
            año de publicación (int)
            precio (double)
            periodicidad (String)
        Métodos:
            getters y setters para cada atributo
            getInfo(): retorna la información detallada del periódico en formato String, incluyendo la periodicidad.

    Elemento 'Inventario' que permita gestionar el inventario de publicaciones:
        Atributos:
            ArrayList de publicaciones
        Métodos:
            agregarPublicacion(): permite añadir una publicación al inventario.
            mostrarInventario(): muestra la información detallada de todas las publicaciones en el inventario y calcula el valor total del inventario.

Instrucciones para los alumnos:

Desarrollar el programa siguiendo los requerimientos mencionados. Analizar cada clase y determinar si es necesario utilizar herencia para optimizar el código y evitar la duplicación de atributos y métodos

Como se evaluara:

Se implementara un programa principal (Main) que permita agregar publicaciones al inventario y mostrar su información detallada y el valor total del inventario.