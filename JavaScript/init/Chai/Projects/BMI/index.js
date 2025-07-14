const form = document.querySelector('form');

form.addEventListener('submit', (e) => {
    e.preventDefault();
    const height = parseInt(document.querySelector('#height').value);
    const weight = parseInt(document.querySelector('#weight').value);
    const results = document.querySelector('#results');

    if (height === '' || height <= 0 || isNaN(height)) {
        alert("Please enter a valid Height");
    } else if (weight === '' || weight <= 0 || isNaN(weight)) {
        alert("Please enter a valid Weight");
    } else {
        const BMI = (weight / ((height * height) / 10000)).toFixed(2);
        // result
        results.innerHTML = `<span>${BMI}</span>`;
    }

});