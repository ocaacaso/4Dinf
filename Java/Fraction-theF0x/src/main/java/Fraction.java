public class Fraction {
  boolean sign;
  int numerator;
  int denominator;

  public Fraction (boolean sign, int numerator, int denominator) {
    this.sign = sign;
    this.numerator = Math.abs(numerator);
    this.denominator = Math.abs(denominator);

    if (denominator == 0) {
      throw new RuntimeException("Il denominatore non può essere uguale a 0");
    }

    if ((numerator * denominator) > 0) {
      if (this.sign == true){
        this.sign = true;
      }
      else {
        this.sign = false;
      }
    }
    else {
      if (this.sign == true){
        this.sign = false;
      }
      else {
        this.sign = true;
      }
    }
  }

  public Fraction(int numerator, int denominator) {
    this(true, numerator, denominator);
  }

  public Fraction(boolean sign, int numerator) {
    this(sign, numerator, 1);
  }

  public Fraction(int numerator) {
    this(true, numerator, 1);
  }
  

  public void simplify() {
    int t = gcd(numerator, denominator);
    numerator = numerator / t;
    denominator = denominator / t;
  }

  public String toString() {
    String s = "";
    if (this.sign == false) {
      s += "-";
    }
    s += this.numerator;

    if (this.denominator > 1) {
      s += "/" + this.denominator;
    }

    return s;
  }


  //funzioni degli operatori

  public void add (Fraction f1) {
    int t = lcm(this.denominator, f1.denominator);

    this.numerator = (t/this.denominator) * this.numerator;
    f1.numerator = (t/f1.denominator) * f1.numerator;
    this.denominator = t;
    this.numerator += f1.numerator;
  }

  public void subtract (Fraction f1) {
    int t = lcm(this.denominator, f1.denominator);

    this.numerator = (t/this.denominator) * this.numerator;
    f1.numerator = (t/f1.denominator) * f1.numerator;
    this.denominator = t;
    this.numerator -= f1.numerator;
  }

  public void multiply (Fraction f1) {
    if (this.sign == f1.sign) {
      this.sign = true;
    }
    else {
      this.sign = false;
    }
    this.numerator *= f1.numerator;
    this.denominator *= f1.denominator;
    this.simplify();
  }

  public void divide (Fraction f1) {
    if (this.sign == f1.sign) {
      this.sign = true;
    }
    else {
      this.sign = false;
    }
    this.numerator *= f1.denominator;
    this.denominator *= f1.numerator;
    this.simplify();
  }


  //funzioni date
  
  public int gcd(int a, int b) {
    if (b == 0) {
      return a;
    } else {
      return gcd(b, a % b);
    }
  }

  public int lcm(int a, int b) {
    return Math.abs(a * b) / gcd(a, b);
  }
}