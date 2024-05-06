let leftoperand=40
let rightoperand=30
let operator= '*';
let answer= 0;
if(operator == "+") {
answer = rightoperand + leftoperand
}
else if(operator == "-") {
answer = rightoperand - leftoperand
}
if(operator== "*"){
answer = rightoperand * leftoperand
}
else if(operator == "/") {
answer = rightoperand / leftoperand
}
else {
answer = NaN
}
console.log("the given answer is \t" + answer);