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
      val lowerExponent = obtainLowerExponent(ln, lm);
      exponentiation(primes.head, lowerExponent) * mcdTFA(ln.tail, lm.tail, primes.tail);
    }
  }
  def mcdEBez(n: Int, m: Int): (Int, Int, Int) = {
    def aux(n: Int, m: Int, qs: List[Int]): (Int, List[Int]) = {
      if (m == 0) (n, qs)
      else {
        val q = n / m
        aux(m, n % m, q +: qs)
      }
    }

    val (d, qs) = aux(n, m, List())

    def getBezoutCoefficients(qs: List[Int], x: Int, y: Int): (Int, Int) = {
      if (qs.isEmpty) (x, y)
      else {
        val newX = y
        val newY = x - qs.head * y
        getBezoutCoefficients(qs.tail, newX, newY)
      }
    }

    val (x, y) = getBezoutCoefficients(qs, 1, 0)

    (d, x, y)
  }
}
