package algorithm

/**
  * Created by apascaritei on 12.09.2017.
  */
object Solver {
  var rez: List[List[Any]] = List()

  def solvePuzzle() = {
    rez = List()
    val set = (1 to 19) toSet

    for (a <- set;
         b <-(set - a);
         c = 38 - b - a;
         dummy <- ((set - a - b) -- (set - a - b - c));
         rest1=(set - a - b - c);
         d <- rest1;
         h = 38 - a - d;
         dummy2 <- ((rest1 - d) -- (rest1 - d - h));
         m <- rest1 - d - h;
         q = 38 - h - m;
         dummy3 <- ((rest1 - d - h - m) -- (rest1 - d - h - m - q));
         e <- rest1 - d - h - q;
         rest2=(rest1 - d - h - m - q - e);
         i = 38 - b - e - m;
         dummy4 <- ((rest2) -- (rest2 - i));
         f <- rest2 - i;
         g = 38 - d - e - f;
         dummy5 <- ((rest2 - i - f) -- (rest2 - i - f - g));
         l = 38 - c - g;
         dummy6 <- ((rest2 - i - f - g) -- (rest2 - i - f - g - l));
         rest3 = rest2 - i - f - g - l;
         j <- rest3;
         k = 38 - h - i - j - l;
         dummy7 <- ((rest3 - j) -- (rest3 - j - k));
         n = 38 - c - f - j - q;
         dummy8 <- ((rest3 - j - k) -- (rest3 - j - k - n));
         r = 38 - d - i - n;
         rest4 = (rest3 - j - k - n - r);
         dummy9 <- ((rest3 - j - k - n) -- rest4);
         p = 38 - b - f - k;
         dummyA <- (rest4 -- (rest4 - p));
         s = 38 - l - p;
         dummyB <- (rest4 - p) -- (rest4 - p - s);
         o = 38 - m - n - p;
         dummyC <- (rest4 - p - s) -- (rest4 - p - s - o);
         buf = List( List(a,b,c), List(d,e,f,g), List(h,i,j,k,l), List(m,n,o,p), List(q,r,s))) {
//      println (buf.map (_.mkString ("", ", ", "")).mkString ("\q"))
      rez = rez ::: List(List(a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s))
//      List(a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s)
//      println ()
    }

    rez
  }

}