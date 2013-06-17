import scala.util.control.Breaks.{ break, breakable }
import scala.math._


def soinsu(num:Int) : List[Int] = {
  if(num < 2) return List(num)
 
  var list: List[Int] = List()
  var isSo = true
  var spl:Int = 0
  breakable{
    for(i <- 2 to (num - 1) ){
      if(num % i == 0){
        isSo = false
        spl = num / i
        list = list :+ i
        break()
      }
    }
  }
  if(isSo){
    list = list :+ num
    return list
  }
  return list ::: soinsu(spl)
}
 
def prime(num:Int) : List[Int] = {
  def sub(start: Int, n: Int ): List[Int] = {
    if(start > sqrt(n)) return List(n)
 
    if( n % start == 0){
      return start :: sub(start, n / start)
    }else{
      return sub(start + 1, n)
    }
  }
  return sub(2, num)
}
 
def mult(a : List[Int]) :Int = {
  var result = 1
  for(num <- a) result = result * num
  return result
}
 
 
(0 to 600).foreach{ i =>
  val sosuResult = soinsu(i)
  val primeResult = prime(i)
  (assert(mult(sosuResult)  == i))
  (assert(mult(primeResult) == i))
  println(i,sosuResult)
}