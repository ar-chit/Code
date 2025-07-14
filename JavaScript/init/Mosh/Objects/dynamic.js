const circle = {
    radius: 1
};

// circle = {};

circle.color = 'yellow';
circle.draw = function(){
    console.log('Drawing a yellow circle with radius', this.radius);
}

console.log(circle);
