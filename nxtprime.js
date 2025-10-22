
let input = 55;

function isPrime(num) {
  if (num <= 1) return false;
  if (num === 2) return true;
  for (let i = 2; i < num; i++) {
    if (num % i === 0) return false;
  }
  return true;
}

function nextPrime(n) {
  let next = n + 1;
  while (!isPrime(next)) {
    next++;
  }
  return next;
}

let result = nextPrime(input);
console.log(`The next prime number after ${input} is ${result}.`);
