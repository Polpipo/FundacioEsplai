"use strict";

//1. A partir de la pizza sustituΓ­as todos los elemento del array por cervezas:ππ―π£πππ±πππ₯©
const arr1 = ['π', 'π―', 'π£', 'π', 'π', 'π±', 'π', 'π', 'π₯©'];
console.log(arr1.fill('πΊ', 4, arr1.length));

//2. Encontrar si existe un elemento en el array que sea una piΓ±a. πππππ
const arr2 = ['π', 'π', 'π', 'π', 'π'];
console.log(arr2.includes('π'));


//3. Quita la piΓ±a del siguiente array. πππππ
arr2.splice(2,1);
console.log(arr2)


// 4. A partir del siguiente array πππππ convierte todas las fresas en π

const arr3 = ['π', 'π', 'π', 'π', 'π'];

arr3.forEach((element,index)=> {
    if(element=='π'){
        arr3.splice(index,1,'π');
    };
});

console.log(arr3);



//5. AΓ±ade el siguiente icono π₯΅ inmediatamente despuΓ©s del cada πΆοΈ en el siguiente array: πΆοΈπ₯πΆοΈπ₯πΆοΈπ₯ !!!!!!!!!!!
const arr4 = ['πΆοΈ', 'π₯', 'πΆοΈ', 'π₯', 'πΆοΈ', 'π₯'];
const result = [];

arr4.map((element,index)=> {
    if(element=='πΆοΈ'){
        result.push(element);
        result.push('π₯΅');
    }else{
        result.push(element);
    }
});

console.log(result);


//6. AΓ±ade una π cartas comodΓ­n entre medio de dos cartas . Por ejemplo:π΄ππ΄ En el siguiente array: π΄π΄π΄ππ΄π΄π΄
const arr5 = ['π΄', 'π΄', 'π΄', 'π', 'π΄', 'π΄', 'π΄'];

const result2 = [];

arr5.map((element,index)=> {
    if(element=='π΄'){
        result2.push(element);
        result2.push('π');
    }else{
        result2.push(element);
    }
});
result2.splice(5,2,'π');

console.log(result2);