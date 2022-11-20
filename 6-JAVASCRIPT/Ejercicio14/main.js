"use strict";

//1. A partir de la pizza sustituías todos los elemento del array por cervezas:🍔🌯🍣🍕🍜🍱🍙🍘🥩
const arr1 = ['🍔', '🌯', '🍣', '🍕', '🍜', '🍱', '🍙', '🍘', '🥩'];
console.log(arr1.fill('🍺', 4, arr1.length));

//2. Encontrar si existe un elemento en el array que sea una piña. 🍕🍕🍍🍕🍕
const arr2 = ['🍕', '🍕', '🍍', '🍕', '🍕'];
console.log(arr2.includes('🍍'));


//3. Quita la piña del siguiente array. 🍕🍕🍍🍕🍕
arr2.splice(2,1);
console.log(arr2)


// 4. A partir del siguiente array 🍓🍋🍓🍋🍓 convierte todas las fresas en 🍄

const arr3 = ['🍓', '🍋', '🍓', '🍋', '🍓'];

arr3.forEach((element,index)=> {
    if(element=='🍓'){
        arr3.splice(index,1,'🍄');
    };
});

console.log(arr3);



//5. Añade el siguiente icono 🥵 inmediatamente después del cada 🌶️ en el siguiente array: 🌶️🥛🌶️🥛🌶️🥛 !!!!!!!!!!!
const arr4 = ['🌶️', '🥛', '🌶️', '🥛', '🌶️', '🥛'];
const result = [];

arr4.map((element,index)=> {
    if(element=='🌶️'){
        result.push(element);
        result.push('🥵');
    }else{
        result.push(element);
    }
});

console.log(result);


//6. Añade una 🃏 cartas comodín entre medio de dos cartas . Por ejemplo:🎴🃏🎴 En el siguiente array: 🎴🎴🎴🃏🎴🎴🎴
const arr5 = ['🎴', '🎴', '🎴', '🃏', '🎴', '🎴', '🎴'];

const result2 = [];

arr5.map((element,index)=> {
    if(element=='🎴'){
        result2.push(element);
        result2.push('🃏');
    }else{
        result2.push(element);
    }
});
result2.splice(5,2,'🃏');

console.log(result2);