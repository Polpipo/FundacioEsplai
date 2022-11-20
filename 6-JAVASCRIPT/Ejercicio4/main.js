'use strict'

//1. Crea una función arrow function que retorne tu nombre y tus apellidos e imprímelos por pantalla desde fuera de la función
const saludar = (nombre, apellidos)=>{
    return nombre + ' ' + apellidos;
}

console.log('Hola ' + saludar('Pol', 'Pipó Coll'));

//2. Crea una función con nombre y sin return. Pásale un tipo de dato boolean y dentro de la función imprime el valor que hemos pasado por los parámetros.
function boolean (parametro){
    console.log(parametro);
}

boolean(true);

//3. Crea una función que reciba parámetros infinitos, haz la llamada con los valores 1,2,3,4,5 y muestra dichos mediante un forEach.
const parametros = function(...values){
    values.forEach(element => {
        console.log(element);
    });
}

parametros(1,2,3,4,5,6);