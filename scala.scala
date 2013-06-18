import scala.math._

def sosu(n : Int) : List[Int] = {
  if(n <= 2) return List(n)
  val spl = split(n, sqrt(n).toInt)
  if(spl == n){
    return List(n)
  }else{
    return sosu(spl) ::: (sosu(n/spl))
  }
}
def split(n : Int, i : Int) : Int = {
  if(i < 2) return n
  if(n % i == 0){
    return i
  }else{
    return split(n , i-1)
  }
}
(1 until 10000).map({j =>
  println(sosu(j))
})
