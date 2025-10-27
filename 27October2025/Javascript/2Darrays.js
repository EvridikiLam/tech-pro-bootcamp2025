//3x3 table

const table = [
[1, 2, 3],
[4, 5, 6],
[7, 8, 9]
];

//Access elements
console.log(table[0][0]); //1
console.log(table[1][2]); //6

//Iterate
for (let row of table) {
    for (let value of row){
        console.log(value + " ");
    }
}