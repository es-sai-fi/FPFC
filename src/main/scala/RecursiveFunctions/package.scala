package object Recursion {
  /**
   * Ejercicio 1.1.1
   * máximo común divisor a partir del teorema fundamental de la aritmética.
   */
  def mcdTFA(ln: List[Int], lm: List[Int], primes: List[Int]): Int = {
    def obtainLowerExponent(ln: List[Int], lm: List[Int]): Int = {
      if (ln.head <= lm.head) ln.head else lm.head;
    }
    def exponentiation(base: Int, exponent: Int): Int = {
      if (exponent == 0) 1 else{
        base*exponentiation(base, exponent-1);
      }
    }
    if (primes.isEmpty) 1
    else {
      val lowerExponent = obtainLowerExponent(ln, lm)
      exponentiation(primes.head, lowerExponent) * mcdTFA(ln.tail, lm.tail, primes.tail)
    }
  }
}
