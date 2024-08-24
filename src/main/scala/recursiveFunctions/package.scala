package object Recursion {
  /**
   * Ejercicio 1.1.1
   * máximo común divisor a partir del teorema fundamental de la aritmética.
   */
  def mcdTFA(ln: List[Int], lm: List[Int], primes: List[Int]): Int = {

    def obtainLowerExponent(i: Int, ln: List[Int], lm: List[Int]): Int = {
      if (ln(i) < lm(i)) ln(i) else lm(i)
    }

    def obtenerFactores(exponent: Int, ln: List[Int], lm: List[Int], primes: List[Int]): Int = {
    }
  }
}
