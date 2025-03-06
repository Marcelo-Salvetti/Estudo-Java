/* Prof. Robson Martins
   TADS - Anhanguera
   Web/JS - Estruturas Condicionais
   
   02. Crie um código que recebe uma nota e exibe conceitos: 
   "A" (90+), "B" (80+), "C" (70+), "D" (60+), "F" (<60).
*/

let nota = 85;
if (nota >= 90) {
    console.log("A");
} else if (nota >= 80) {
    console.log("B");
} else if (nota >= 70) {
    console.log("C");
} else if (nota >= 60) {
    console.log("D");
} else {
    console.log("F");
}
