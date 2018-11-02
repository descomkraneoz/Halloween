# Halloween
ejercicios de programación
-------------------------
Rellenar con los programas y exportar a pdf para entregarlo. Entregar algo, aunque esté mal.

Crea una aplicación que dibuje una pirámide invertida de asteriscos. Nosotros le pasamos la altura de la pirámide por teclado. Este es un ejemplo:

*********
 *******
  *****
   ***	
    *

Crea una aplicación que dibuje una escalera de números, siendo cada línea números empezando en uno y acabando en el número de la línea. Este es un ejemplo, si introducimos un 5 como altura:
1
12
123
1234
12345

Ejercicio muy típico:
Secuencia de collatz
Tome cualquier número natural n.

Si n es par, divídelo por 2 para obtener n / 2.
Si n es impar, multiplíquelo por 3 y agregue 1 para obtener 3n + 1.
Repita el proceso indefinidamente.
En 1937, Lothar Collatz propuso que no importa con qué número comience, la secuencia finalmente llega a 1. Se cree que esto es cierto, pero nunca se ha demostrado formalmente.

Escriba un programa que ingrese un número del usuario y luego muestre la secuencia de Collatz a partir de ese número. Pare cuando llegue a 1


Una letra a la vez
¿Sabía que utilizando un bucle, puede examinar una cadena de una letra a la vez? Los dos métodos de cadena incorporados clave son length () y charAt ().

length () devuelve un int que representa el número total de caracteres en la cadena (incluidos la puntuación y el espacio en blanco). Por ejemplo, si la variable str contiene la cadena "hello", entonces str.length () devolverá 5.
charAt (int n) devuelve el enésimo carácter (char) en la cadena. Las posiciones de los caracteres se basan en cero, por lo que si la variable str contiene la "ligadura" de String, entonces str.charAt (0) devolverá 'l', y str.charAt (4) devolverá 't'.

Hacer un programa que obtenga la siguiente salida (Lo que va en negrita es lo que introduce el usuario):
What is your message? A man, a plan, a canal: Panama!

Your message is 31 characters long.
The first character is at position 0 and is 'A'.
The last character is at position 30 and is '!'.

Here are all the characters, one at a time:

	0 - 'A'
	1 - ' '
	2 - 'm'
	3 - 'a'
	4 - 'n'
	5 - ','
	6 - ' '
	7 - 'a'
	8 - ' '
	9 - 'p'
	10 - 'l'
	11 - 'a'
	12 - 'n'
	13 - ','
	14 - ' '
	15 - 'a'
	16 - ' '
	17 - 'c'
	18 - 'a'
	19 - 'n'
	20 - 'a'
	21 - 'l'
	22 - ':'
	23 - ' '
	24 - 'P'
	25 - 'a'
	26 - 'n'
	27 - 'a'
	28 - 'm'
	29 - 'a'
	30 - '!'

Your message contains the letter 'a' 10 times. Isn't that interesting?



