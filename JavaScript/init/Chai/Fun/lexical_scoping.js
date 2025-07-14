function init() {
    let name = "Mozilla";
    function displayName() {
        console.log(name);
    }
    displayName();
}
init();

function outer(){
    let username = "Archit"
    // console.log("outer", secret);
    function inner(){
        let secret = "my123"
        console.log("inner", username);
    }
    function innerTwo(){
        console.log("innerTwo", username);
        // console.log(secret);
    }
    inner()
    innerTwo()

}
outer()
// console.log("outer", username);


function makeFunc() {
    const name = "Mozilla";
    function displayName() {
        console.log(name);
    }
    return displayName;
}

const myFunc = makeFunc();
myFunc();