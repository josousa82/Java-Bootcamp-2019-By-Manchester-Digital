## Set Class
    * Have all flavour of Maps 
    * no repeated keys 
    
    ´´´
    Set<String> names = new HashSet<>();
            names.add("John");
            names.add("April");
            names.add("John");
            names.add("John");
            names.add("John");
            names.add("John");
            names.add("Emalin");
    
            for (String name: names){
                System.out.println("name = " + name);
            }
    ´´´
    
    > Output
    > name = Emalin
    > name = John
    > name = April
    