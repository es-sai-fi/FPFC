

final class pruebas$_ {
def args = pruebas_sc.args$
def scriptPath = """pruebas.sc"""
/*<script>*/
import Recursion._

import Recursion._
//Pruebas mcdTFA
mcdTFA(List(1, 1, 1), List(1, 1, 0), List(2, 3, 5)) //mcd(30, 12)
mcdTFA(List(2, 0, 1), List(2, 1, 0), List(2, 3, 7)) //mcd(28, 12)
mcdTFA(List(3, 1), List(0, 1), List(2, 7)) //mcd(56, 7)
mcdTFA(List(1, 0, 1), List(1, 1, 0), List(3, 5, 19)) //mcd(57, 15)
mcdTFA(List(2, 1), List(3, 0), List(2, 11)) //mcd(44, 8)

//Pruebas mcdEBez
mcdEBez(28, 10)
mcdEBez(35, 15)
mcdEBez(48, 18)
mcdEBez(56, 21)
mcdEBez(84, 30)

//Pruebas fibonacciA
fibonacciA(5)
fibonacciA(10)
fibonacciA(20)
fibonacciA(3)
fibonacciA(19)

//Pruebas fibonacciI
fibonacciI(7)
fibonacciI(9)
fibonacciI(21) 
fibonacciI(17)
fibonacciI(30)
/*</script>*/ /*<generated>*//*</generated>*/
}

object pruebas_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new pruebas$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export pruebas_sc.script as `pruebas`

