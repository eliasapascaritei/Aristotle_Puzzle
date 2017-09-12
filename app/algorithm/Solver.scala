package algorithm

/**
  * Created by apascaritei on 12.09.2017.
  */
object Solver {
  var rez: List[List[Any]] = List()

  def solvePuzzle() = {
    rez = List()
    val set =(1 to 19)toSet

    for (x <- set;
         y <-(set - x);
         z = 38 - y - x;
         dummy <- ((set - x - y) -- (set - x - y - z));
         rest1=(set - x - y - z);
         a <- rest1;
         e = 38 - x - a;
         dummy2 <- ((rest1 - a) -- (rest1 - a - e));
         j <- rest1 - a - e;
         n = 38 - e - j;
         dummy3 <- ((rest1 - a - e - j) -- (rest1 - a - e - j - n));
         b <- rest1 - a - e - n;
         rest2=(rest1 - a - e - j - n - b);
         f = 38 - y - b - j;
         dummy4 <- ((rest2) -- (rest2 - f));
         c <- rest2 - f;
         d = 38 - a - b - c;
         dummy5 <- ((rest2 - f - c) -- (rest2 - f - c - d));
         i = 38 - z - d;
         dummy6 <- ((rest2 - f - c - d) -- (rest2 - f - c - d - i));
         rest3 = rest2 - f - c - d - i;
         g <- rest3;
         h = 38 - e - f - g - i;
         dummy7 <- ((rest3 - g) -- (rest3 - g - h));
         k = 38 - z - c - g - n;
         dummy8 <- ((rest3 - g - h) -- (rest3 - g - h - k));
         o = 38 - a - f - k;
         rest4 = (rest3 - g - h - k - o);
         dummy9 <- ((rest3 - g - h - k) -- rest4);
         m = 38 - y - c - h;
         dummyA <- (rest4 -- (rest4 - m));
         p = 38 - i - m;
         dummyB <- (rest4 - m) -- (rest4 - m - p);
         l = 38 - j - k - m;
         dummyC <- (rest4 - m - p) -- (rest4 - m - p - l);
         buf = List( List(x,y,z), List(a,b,c,d), List(e,f,g,h,i), List(j,k,l,m), List(n,o,p))) {
//      println (buf.map (_.mkString ("", ", ", "")).mkString ("\n"))
      rez = rez ::: List(List(x,y,z,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p))
//      List(x,y,z,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p)
//      println ()
    }

    rez
  }

}