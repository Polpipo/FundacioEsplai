'use strict'

// Define un tipo de dato de cada uno de los tipos de datos que hemos visto.
var string = 'Pol';
var number = 10;
var boolean = true;
var Null = null;
var undefined;

var array = ['Papa', 'Mama', 'Hijo', 'Hija'];
var funcion = function(){
    console.log('Soy una función')
}

//1. Declara la variable, y posteriormente inicialízala.
var nombre = 'Pol';

//2. Imprime por consola el valor que tiene la variable por consola
console.log(nombre);

//3. Posteriormente imprime además el tipo de dato que almacena por consola.
console.log(typeof(nombre));


//4. Declara una variable con scope local y global.
let edad = 22;

if(true){
    let edad = 80;
    console.log(edad);
}

console.log(edad);
