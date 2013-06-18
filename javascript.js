
function sosu(n) {
  if(n <= 2) return [n]
  var spl = split(n, parseInt(Math.sqrt(n)))
  if(spl == n){
    return [ n ]
  }else{
    return sosu(spl).concat(sosu(n/spl))
  }
}
function split(n, i) {
  if(i < 2) return n
  if(n % i == 0){
    return i
  }else{
    return split(n , i-1)
  }
}
for(var i = 0; i < 10001; i++){
  console.log(i, sosu(i))
}
