// Factory Function
// camelNotation: oneTwoThreeFour
function createCircle(radius) {
    return {
        radius,
        draw() {
            console.log('draw');
        }
    }
}

const circle1 = createCircle(1);
console.log(circle1);

//Constructor Function
//PascalNotation: OneTwoThreeFour
function Circle(radius) {
    this.radius = radius;
    this.draw = function () { 
        console.log('draw');
    }
}

const circle2 = new Circle(1);
console.log(circle2);

