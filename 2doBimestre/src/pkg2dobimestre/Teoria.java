/*
Definición: La herencia es un concepto clave en la programación orientada a 
objetos que permite la creación de nuevas clases basadas en clases ya existentes. 
La nueva clase hereda atributos y métodos de la clase base, lo que promueve la 
reutilización de código y la organización jerárquica de las clases.

Clase Base y Clase Derivada: En la herencia, la clase existente de la cual se 
deriva otra clase se conoce como clase base, superclase o clase padre. La nueva 
clase que hereda de la clase base se llama clase derivada, subclase o clase hija.

Sintaxis: En muchos lenguajes de programación orientados a objetos, la sintaxis 
para definir una clase derivada implica utilizar la palabra clave extends o 
similar, seguida del nombre de la clase base. Por ejemplo, en Java: class SubClase extends ClaseBase {...}.

Acceso a miembros: Los miembros (atributos y métodos) de la clase base pueden 
ser heredados por la clase derivada, dependiendo de su nivel de acceso. En 
general, los miembros públicos y protegidos de la clase base son heredados y 
pueden ser accedidos directamente desde la clase derivada.

Sobreescritura de métodos: Una clase derivada puede proporcionar una implementación 
específica para un método heredado de la clase base. Esto se conoce como sobreescritura 
de métodos y permite que las clases hijas personalicen el comportamiento de los métodos heredados.

Métodos y Atributos Privados: Los miembros privados de una clase base no son 
heredados por la clase derivada. Sin embargo, pueden ser accedidos indirectamente
a través de métodos públicos o protegidos definidos en la clase base.

Herencia Múltiple y Herencia en Profundidad: Algunos lenguajes de programación 
permiten la herencia múltiple, donde una clase derivada puede heredar de múltiples 
clases base. La herencia en profundidad ocurre cuando una clase derivada a su vez 
sirve como clase base para otra clase.

Jerarquía de Clases: La herencia conduce a la formación de una jerarquía de clases, 
donde las clases se organizan en niveles según su relación de herencia. Esto proporciona
una estructura lógica y coherente para el diseño de programas orientados a objetos.

Polimorfismo: La herencia facilita el polimorfismo, que es la capacidad de tratar objetos 
de una clase derivada como objetos de su clase base. Esto permite escribir código que 
puede trabajar con objetos de diferentes tipos, siempre que pertenezcan a la misma jerarquía de clases.

Principio de Sustitución de Liskov: Este principio establece que los objetos de una 
clase derivada deben poder sustituir sin problemas a los objetos de su clase base sin 
alterar la corrección del programa. La herencia mal utilizada puede violar este principio
y causar problemas de diseño.

------------------------------------------------------------------------------------------------------
11/06/2024
dos tipos de relaciones, la primera estudiada en el primer bimestre, asosiacion, de esta habiendo dos,
una fuerte(composicion"tiene") y debil(agregacion), ahora se unira una nueva llamada extension/extension,
la conoceremos como herencia"es un"(para el modelado del proyecto tener mucho en cuenta este).

La herencia es la reutilizacion, este es el pilar principal pues la herenencia permite la reutilizacion
a traves de la creacion de subclases y superclases, si puede haber super sin sub pero no sub sin sup, donde
la sup es la que reutiliza de la sup, ejemplo si la sup tiene 1000 lineas de codigo, la sup las tiene aunque
este vacia, directa es cuando hay un padre y un hijo, pero indirecta es cuando hay un padre y una sup pero 
encima hay un padre superior

Si es S1->S2 es una herencia de la directa, pero S1->S2->S3 es una indirecta de parte del S3 al S1
el S2 es tanto hijo como padre. 

Para invocar un metodo de una clase superior se hace de un modo diferente, se antepone la palabra clave 
super y un punto+el nombre del metodo

Todo lo heredado es implicito e invisible, cuando se quiere invocar un metodo de la sup se pone la palabra
clave y un punto, en caso querer invocar un super mas alto, se pone el nombre de la clase y el punto
*/