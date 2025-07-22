function time(){
  let i = 0;

  setTimeout(function() {
    console.log(++i);
  }, 1000);
  
  return 2;
}

const t = time();
console.log(t); 