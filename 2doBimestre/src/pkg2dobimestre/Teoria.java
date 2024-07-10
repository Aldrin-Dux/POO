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
clave y un punto, en caso querer invocar un super mas alto, se pone el nombre de la clase y el punto.
--------------------------------------------------------------------------------------------------------
12/06/2024
el proyecto bimestral se hara con los mismos integrantes, ahora debemos modificarlo demostrando asi que este
tiene implementado en su desarrollo los dos pilares de herencia y polimorfismo

La ultima semana se nos indica una herramienta que mediante el modelado uml nos da de una el codigo

En herencia el ejecutable esta en las hijas, en polimorfismo estaran los ejecutables los el padre y la hija tendran
en herencia se lleva a cabo asi porque al ejecutar las hijas la clase padre igual se ejecuta

herencia=inheritance

Por lo general en una herarquia de herencia no suelen ponerse en diferente paquetes las clases

A la hora de hacer los talleres tener en cuenta las cardianalidades, que son 0 1 *
0 puede que no tenga(cuando una clase tiene de agregacion a la otra, osea independiente de esta)1->0->2
1 debe tener una y solo una 
* puede tener 0, 1, o muchas

Para herencia no hay cardinalidad, todo el segundo bimestre desde ahora tendra herencia

El 5 y el 6 de los ejercicios enviados no se revisara, solo hasta el ejercicio 4 se revisara
---------------------------------------------------------------------------------------------------------
18/06/2024
el proximo martes se revisara los dos criterios faltantes de este dia, hoy es de los uml, el martes que viene
sera la codificacion y los resultados

Poner de forma correspondiente las relaciones que hay entre las clases, los nombres en las clases deben ser
en singular, no es relevante a la hora de codificacion pero es buena practica

Se realiza un ejercicio en clases llamado EstudioCaso2
--------------------------------------------------------------------------------------------------------
Ejercicio:
se desea realizar una aplicacion que permita a un periodista deportivo llevar
las estadisticas de los jugadores de un equipo de futbol para poder salvar su
actuacion en el partido.

Cada jugador se identifica por su nombre, numero de dorsar y Rut.

Los jugadores se han dividido en 3 categorias
1 atacantes
2 defensores
3 porteros

para todos los jugadores se desea contabilizar el numero de goles marcados,
ademas en el caso de los jugadores de campo se contabilizan los pases realizados
con extio el numero de balones recuperados.

en el dcaso de los porteros se contabilizan las atabajdas realizadas.

La valoracion de cada jugador se compone de un valor comun:
valoracion goles= goles*30.

y de una parte diferente segun el tipo de jugador:

1 atacantes 
valoracion goles+pases*2+recuperaciones*3.

2 defensores
valoracion+pases+recuperaciones*4.

3 Porteros
valoraciongoles+paradas*5.
*/