public enum EnumExample {
  /*  I ("I", 1),
    V ("V", 5),
    X ("X", 10),
    L ("L", 50),
    C ("C", 100),
    D ("D",500 ),
    M  ("M", 1000);*/

    C(100),
    D( 500),
    I( 1),
    L(50),
    M(1000),
    V( 5),
    X(10);

    //String str;

   /* EnumExample(String roman, Integer i) {
        //this.str = roman;
    }*/

   EnumExample(Integer i) {
        //this.str = roman;
    }


}
