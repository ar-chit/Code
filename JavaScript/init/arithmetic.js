function add(index1, index2) {
    return index1 + index2;
}

function substract(index1, index2) {
    return index1 - index2;
}

function multiply(index1, index2) {
    return index1 * index2;
}

function divide(index1, index2) {
    return index1 / index2;
}

function doArithmetic(firstElement, secondElement, arithmeticFn) {
    return arithmeticFn(firstElement, secondElement);
}

console.log(doArithmetic(3, 3, multiply));