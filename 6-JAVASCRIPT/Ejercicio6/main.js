'use strict'

//1. Crea una función pasa 3 números por parámetros súmalos y devuelve el resultado mediante a return. Finalmente muéstralos por pantalla
const suma = (num1, num2, num3) => {
    let resultado = (num1 + num2 + num3);

    return resultado;
};

console.log('El resultado es: ' + suma(1,2,5));

//2. Crea una función y escribe tu nombre completo en 3 parámetros: nombre, apellido1, apellido2 y concaténalos y finalmente muéstralos por pantalla
const nombre = (nom, apellido1, apellido2) => {
    let nombreCompleto = nom + ' ' + apellido1 + ' ' + apellido2;
    return nombreCompleto;
};

console.log('Me llamo ' + nombre('Pol', 'Pipó', 'Coll'));

//3. Crea una función que acepte dos números y devuelva el número mayor
const numeroMayor = (num1, num2) => {
    if(num1 > num2){
        console.log('El número ' + num1 + ' es mayor al número ' + num2);
    }else if(num2>num1){
        console.log('El número ' + num2 + ' es mayor al número ' + num1);
    }else{
        console.log('El número ' + num1 + ' y el número ' + num2 + ' son iguales');
    }
};

numeroMayor(5,3);