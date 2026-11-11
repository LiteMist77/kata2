Kata 2 - Procesamiento de Datos mediante Streams en Java

📌 Resumen del Proyecto

El propósito de este desarrollo es poner en práctica el manejo de entradas y salidas de datos utilizando abstracciones nativas de Java como InputStream y OutputStream. El diseño busca separar claramente la infraestructura de lectura/escritura respecto a la lógica interna de transformación y modelado de datos.

⚙️ Compilación y Ejecución

La aplicación está lista para ejecutarse directamente en cualquier entorno Java compatible con Maven o desde un IDE:

Desde IntelliJ IDEA: Localizar la clase Main (en la ruta software.ulpgc.katas) y presionar la combinación de teclas Shift + F10 (o hacer clic en el botón de reproducción verde junto a la clase).

Resultado: Se ejecutará la lectura de los datos, la conversión a objetos de dominio y la salida correspondiente.

🛠️ Especificaciones Técnicas

Lenguaje & JDK: OpenJDK 27

Gestor de Construcción: Apache Maven

Librerías externas: Ninguna. Se empleó exclusivamente la biblioteca estándar del JDK (java.io, java.net, etc.).

📂 Organización del Proyecto

La solución sigue la arquitectura habitual de un proyecto Maven:
'''
kata2/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── software.ulpgc.katas/
│   │   │       ├── Employee.java    # Entidad de dominio
│   │   │       ├── Gender.java      # Tipo enumerado/procesador de género
│   │   │       └── Main.java        # Punto de entrada y orquestador
│   │   └── resources/
│   └── test/
├── .gitignore
├── document.txt
├── pom.xml
└── README.md
'''

Componentes Clave

Main: Encargado de coordinar las fuentes de datos (URL / Streams), invocar el parseo y volcar la salida final.

Employee: Modelo que representa cada registro procesado del dataset.

Gender: Lógica auxiliar para categorizar el género a partir del texto de entrada.

🔀 Estrategia de Control de Versiones

Para organizar el desarrollo se aplicó un esquema basado en Gitflow adaptado:

main: Contiene exclusivamente la versión estable y lista para evaluación.

develop: Servió como rama activa donde se integraron progresivamente los avances y distintas iteraciones del código.

🎥 Demostración en Vídeo

Puedes consultar la explicación detallada y la ejecución en directo del ejercicio en el siguiente enlace:

📺 Ver vídeo explicativo en YouTube
