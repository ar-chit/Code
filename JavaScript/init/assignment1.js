//medium 1.1
function isPalindrome(a) {
    var start = 0;
    var end = a.length - 1;
    while (start < end) {
        if (a[start] != a[end]) {
            return false;
        }
        start++;
        end--;
    }
    return true;
}


//medium 1.2
function sum1(n) {
    var ans = 0;
    for (var i = 0; i <= n; i++) {
        ans += i;
    }
    return ans;
}

function sum2(n) {
    var ans = 0;
    for (var i = 0; i <= n; i++) {
        ans += i;
    }
    return ans;
}

function sum3(n) {
    var ans = 0;
    for (var i = 0; i <= n; i++) {
        ans += i;
    }
    return ans;
}

console.time('Time 1');
var ans1 = sum1(100);
console.log(ans1);
console.timeEnd('Time 1');

console.time('Time 2');
var ans2 = sum2(100000);
console.log(ans2);
console.timeEnd('Time 2');

console.time('Time 3');
var ans3 = sum3(1000000000);
console.log(ans3);
console.timeEnd('Time 3');

console.log(isPalindrome('madam'));

//easy 2.1
var count = 0;
function counter(a) {
    console.clear();
    console.log(count);
    count += 1;
}

setInterval(counter, 1000);

//easy 2.2

var count = 0;
function counter(a) {
    console.clear();
    console.log(count);
    count += 1;
}


for (var i = 0; i <= 10; i++) {
    console.clear();
    setTimeout(counter, 1000 * i);
}


