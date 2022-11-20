"use strict";

//1. Realiza un switch case que muestre el mes del año cuando lo introduzcamos en formato numérico (1 al 12)
let mes = parseInt(prompt("Introduce un número del 1-12"));

switch (mes) {
  case 1:
    alert("Has introducido el mes de ENERO");
    break;
  case 2:
    alert("Has introducido el mes de FEBRERO");
    break;
  case 3:
    alert("Has introducido el mes de MARZO");
    break;
  case 4:
    alert("Has introducido el mes de ABRIL");
    break;
  case 5:
    alert("Has introducido el mes de MAYO");
    break;
  case 6:
    alert("Has introducido el mes de JUNIO");
    break;
  case 7:
    alert("Has introducido el mes de JULIO");
    break;
  case 8:
    alert("Has introducido el mes de AGOSTO");
    break;
  case 9:
    alert("Has introducido el mes de SEPTIEMBRE");
    break;
  case 10:
    alert("Has introducido el mes de OCTUBRE");
    break;
  case 11:
    alert("Has introducido el mes de NOVIEMBRE");
    break;
  case 12:
    alert("Has introducido el mes de DICIEMBRE");
    break;
  default:
    alert("Has introducido un valor incorrecto");
    break;
}

//2. Realiza un switch case en el que puedas introducir un número del uno al cinco en un string y lo transforme a un número
let numero = prompt("Escribe un número del 1-5");

switch (numero) {
  case 'uno': case 'Uno':
    alert('Has introducido el: ' + 1);
    break;
  case 'dos': case 'Dos':
    alert('Has introducido el: ' + 2);
    break;
  case 'tres': case 'Tres':
    alert('Has introducido el: ' + 3);
    break;
  case 'cuatro': case 'Cuatro':
    alert('Has introducido el: ' + 4);
    break;
  case 'cinco': case 'Cinco':
    alert('Has introducido el: ' + 5);
    break;
  default:
    alert("Has introducido un valor incorrecto");
    break;
}