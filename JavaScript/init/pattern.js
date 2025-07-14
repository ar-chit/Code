function halfPyramid(a) {
    for (var i = 0; i < a; i++){
        for (var j = 0; j < i+1; j++) {
            process.stdout.write('*');
        }
        console.log()

    }
}
function pyramid(a) {
    for (var i = 0; i < a; i++){
        process.stdout.write(' ');
    }
    process.stdout.write('*');
    console.log();
    var b = 2;
    for (var i = 1; i < a; i++) {
        for (var j = 0; j < a - i; j++) {
            process.stdout.write(' ');
        }
        for (var j = 0; j < i + b; j++){
            process.stdout.write('*');

        }
        b++;
            console.log();
    }
}

function hollowRectangle(a) {
    for (var i = 0; i < a; i++) {
        process.stdout.write('*');
    }
    console.log();
    for (var i = 0; i < a-2; i++){
        for (var j = 0; j < a; j++){
            if (j == 0 || j == a - 1) {
                process.stdout.write('*');
            } else {
                process.stdout.write(' ');
            }
        }
        console.log();
    }
    for (var i = 0; i < a; i++) {
        process.stdout.write('*');
    }

}

// halfPyramid(5);
// pyramid(5);
hollowRectangle(25); 
