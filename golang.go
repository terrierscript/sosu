package main;
import(
  "math"
);

func sosu(num int) []int{
  if num < 2 {
    return []int{ num };
  }
  var max = math.Sqrt(float64(num))
  var result = []int{}
  var isSo = true;
  var split = 0;
  for i := 0; i < int(max); i++ {
    if num % i == 0 {
      isSo = false;
      split = num / i;
      result.add(i);
    }
  }
  return result;
}


func main(){
  var result = sosu(100);
  for _, item := range result{
    println(item)
  }
}
